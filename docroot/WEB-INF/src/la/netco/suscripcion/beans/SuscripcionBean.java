package la.netco.suscripcion.beans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.model.SelectItem;
import javax.portlet.PortletSession;

import la.netco.suscripcion.dto.CiudadTO;
import la.netco.suscripcion.dto.DepartamentoTO;
import la.netco.suscripcion.dto.PaisTO;
import la.netco.suscripcion.dto.SuscripcionTO;
import la.netco.suscripcion.dto.TipoDocumentoTO;
import la.netco.suscripcion.exceptions.PersistenceException;
import la.netco.suscripcion.service.CiudadService;
import la.netco.suscripcion.service.SuscripcionService;
import la.netco.suscripcion.service.TipoDocumentoService;
import la.netco.suscripcion.validator.FacesUtils;

import org.primefaces.event.FlowEvent;

import com.liferay.util.bridges.jsf.common.FacesMessageUtil;

@ManagedBean
@ViewScoped
public class SuscripcionBean {

	@ManagedProperty(value = "#{ciudadService}")
	private CiudadService ciudadService;

	@ManagedProperty(value = "#{tipoDocumentoService}")
	private TipoDocumentoService tipoDocumentoService;

	@ManagedProperty(value = "#{suscripcionService}")
	private SuscripcionService suscripcionService;

	private List<SelectItem> paisesItems;
	private List<SelectItem> ciudadesItems;
	private List<SelectItem> departametosItems;
	private List<SelectItem> tipoDocumentoItems;

	private Integer id_pais;
	private Integer id_departamento;

	private SuscripcionTO suscripcion;

	private String valueCaptcha;
	private Integer valorSuscripcion;

	public SuscripcionBean() {
		suscripcion = new SuscripcionTO();
	}

	public String procesoFlujo(FlowEvent evento) {
		
		if(suscripcionService.existeSuscripcionDocumento(suscripcion.getNum_documento())){
			
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ErrorsList.ERROR_EXISTE_DOCUMENTO);
			return evento.getOldStep();
		}
			
		
		calcularSuscripcion();
		return evento.getNewStep();
	}

	public void calcularSuscripcion() {
		// TODO: Cambiar la condición de ciudad para determinar si es bogotá
		if (suscripcion.getMedio() == "electronico" || suscripcion.getId_ciudad() == 1) {
			// TODO:Obtener por parametros el valor
			valorSuscripcion = 185000;
		} else {
			valorSuscripcion = 412500;
		}
	}

	public void validateEmail(ComponentSystemEvent event) {

		FacesContext fc = FacesContext.getCurrentInstance();

		UIComponent components = event.getComponent();

		UIInput uiInputEmail = (UIInput) components.findComponent("email");
		String email = uiInputEmail.getLocalValue() == null ? "" : uiInputEmail.getLocalValue().toString();
		String emailId = uiInputEmail.getClientId();

		UIInput uiInputConfirmEmail = (UIInput) components.findComponent("confirmEmail");
		String confirmEmail = uiInputConfirmEmail.getLocalValue() == null ? "" : uiInputConfirmEmail.getLocalValue().toString();

		if (email.isEmpty() || confirmEmail.isEmpty()) {
			return;
		}

		if (!email.equals(confirmEmail)) {
			String msg = FacesUtils.getMessage("msg_correo_confirmacion", FacesContext.getCurrentInstance());
			FacesMessage msgFaces = new FacesMessage(msg);
			msgFaces.setSeverity(FacesMessage.SEVERITY_ERROR);
			fc.addMessage(emailId, msgFaces);
			fc.renderResponse();
		}

	}

	public TipoDocumentoTO getTipoDocumento(int id_tipo_doc) {
		try {
			return getTipoDocumentoService().obtenerTipoDocumento(id_tipo_doc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public PaisTO getPais(int id_pais) {
		try {
			return ciudadService.obtenerPais(id_pais);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public DepartamentoTO getDeparatamento(int id_dept) {
		try {
			return ciudadService.obtenerDeparamento(id_dept);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public CiudadTO getCiudad(int id_ciudad) {
		try {
			return ciudadService.obtenerCiudad(id_ciudad);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void enviarPago() {
		try {
			suscripcion.setValor_pagado(valorSuscripcion.toString());
			SuscripcionTO suscripcionTO = suscripcionService.guardarSuscripcion(suscripcion);

			FacesContext facesContext = FacesContext.getCurrentInstance();
			PortletSession portletSession = (PortletSession) facesContext.getExternalContext().getSession(true);
			
			portletSession.setAttribute("paymentValue", suscripcionTO.getValor_pagado(),PortletSession.APPLICATION_SCOPE);
			portletSession.setAttribute("clientDocumentNumber", suscripcionTO.getNum_documento(),PortletSession.APPLICATION_SCOPE);
			portletSession.setAttribute("clientDocumentType", suscripcionTO.getId_tipo_doc(),PortletSession.APPLICATION_SCOPE);
			portletSession.setAttribute("clientUserType", suscripcionTO.getTipo_persona(),PortletSession.APPLICATION_SCOPE);
			portletSession.setAttribute("ticketId", suscripcionTO.getId_suscripcion(),PortletSession.APPLICATION_SCOPE);

			//TODO: Cambiar ruta quemada			
			FacesContext.getCurrentInstance().getExternalContext().redirect("/pago-en-linea?javax.portlet.faces.DirectLink=true");
		} catch (PersistenceException e) {
			e.printStackTrace();
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ErrorsList.ERROR_GUARDAR_SUSCRIPCION);
		} catch (IOException e) {
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ErrorsList.ERROR_GUARDAR_SUSCRIPCION);
			e.printStackTrace();
		}
	}

	public List<SelectItem> getPaisesItems() {
		if (paisesItems == null) {
			try {
				List<PaisTO> datos = ciudadService.obtenerPaises();
				paisesItems = new ArrayList<SelectItem>();
				for (PaisTO dato : datos) {
					paisesItems.add(new SelectItem(dato.getId_pais(), dato.getNombre()));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return paisesItems;
	}

	public void setPaisesItems(List<SelectItem> paisesItems) {
		this.paisesItems = paisesItems;
	}

	public List<SelectItem> getCiudadesItems() {
		if (id_departamento != null) {
			try {
				List<CiudadTO> datos = ciudadService.obtenerCiudades(id_departamento);
				ciudadesItems = new ArrayList<SelectItem>();
				for (CiudadTO dato : datos) {
					ciudadesItems.add(new SelectItem(dato.getId_ciudad(), dato.getNombre()));
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return ciudadesItems;
	}

	public void setCiudadesItems(List<SelectItem> ciudadesItems) {
		this.ciudadesItems = ciudadesItems;
	}

	public List<SelectItem> getDepartametosItems() {
		if (id_pais != null) {
			try {
				List<DepartamentoTO> datos = ciudadService.obtenerDepartamentos(id_pais);
				departametosItems = new ArrayList<SelectItem>();
				for (DepartamentoTO dato : datos) {
					departametosItems.add(new SelectItem(dato.getId_departamento(), dato.getNombre()));
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return departametosItems;
	}

	public void setDepartametosItems(List<SelectItem> departametosItems) {
		this.departametosItems = departametosItems;
	}

	public CiudadService getCiudadService() {
		return ciudadService;
	}

	public void setCiudadService(CiudadService ciudadService) {
		this.ciudadService = ciudadService;
	}

	public Integer getId_pais() {
		return id_pais;
	}

	public void setId_pais(Integer id_pais) {
		this.id_pais = id_pais;
	}

	public Integer getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(Integer id_departamento) {
		this.id_departamento = id_departamento;
	}

	public List<SelectItem> getTipoDocumentoItems() {
		if (tipoDocumentoItems == null) {
			try {
				List<TipoDocumentoTO> datos = getTipoDocumentoService().obtenerTipoDocumentos();
				tipoDocumentoItems = new ArrayList<SelectItem>();
				for (TipoDocumentoTO dato : datos) {
					tipoDocumentoItems.add(new SelectItem(dato.getId_tipo_doc(), dato.getNombre()));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return tipoDocumentoItems;
	}

	public void setTipoDocumentoItems(List<SelectItem> tipoDocumentoItems) {
		this.tipoDocumentoItems = tipoDocumentoItems;
	}

	public SuscripcionTO getSuscripcion() {
		return suscripcion;
	}

	public void setSuscripcion(SuscripcionTO suscripcion) {
		this.suscripcion = suscripcion;
	}

	public String getValueCaptcha() {
		return valueCaptcha;
	}

	public void setValueCaptcha(String valueCaptcha) {
		this.valueCaptcha = valueCaptcha;
	}

	public Integer getValorSuscripcion() {
		return valorSuscripcion;
	}

	public void setValorSuscripcion(Integer valorSuscripcion) {
		this.valorSuscripcion = valorSuscripcion;
	}

	public SuscripcionService getSuscripcionService() {
		return suscripcionService;
	}

	public void setSuscripcionService(SuscripcionService suscripcionService) {
		this.suscripcionService = suscripcionService;
	}

	public TipoDocumentoService getTipoDocumentoService() {
		return tipoDocumentoService;
	}

	public void setTipoDocumentoService(TipoDocumentoService tipoDocumentoService) {
		this.tipoDocumentoService = tipoDocumentoService;
	}

}
