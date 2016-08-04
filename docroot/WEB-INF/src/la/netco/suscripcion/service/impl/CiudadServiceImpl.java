package la.netco.suscripcion.service.impl;

import java.util.ArrayList;
import java.util.List;

import la.netco.generated.model.model.Ciudad;
import la.netco.generated.model.model.Departamento;
import la.netco.generated.model.model.Pais;
import la.netco.generated.model.service.CiudadLocalServiceUtil;
import la.netco.generated.model.service.DepartamentoLocalServiceUtil;
import la.netco.generated.model.service.PaisLocalServiceUtil;
import la.netco.suscripcion.dto.CiudadTO;
import la.netco.suscripcion.dto.DepartamentoTO;
import la.netco.suscripcion.dto.PaisTO;
import la.netco.suscripcion.exceptions.PersistenceException;
import la.netco.suscripcion.service.CiudadService;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

@Service("ciudadService")
public class CiudadServiceImpl implements CiudadService {

	@Autowired
	private Mapper mapper;

	public List<PaisTO> obtenerPaises() throws PersistenceException {
		List<Pais> paises;
		List<PaisTO> resourceList = new ArrayList<PaisTO>();
		try {
			paises = PaisLocalServiceUtil.getPaises(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			for (Pais pais : paises) {
				resourceList.add(mapper.map(pais, PaisTO.class));
			}
		} catch (SystemException e) {
			e.printStackTrace();
			throw new PersistenceException(e.getMessage(), e.getCause());
		}
		return resourceList;
	}
	
	
	public List<DepartamentoTO> obtenerDepartamentos(int idPais) throws PersistenceException {
		List<Departamento> departamentos;
		List<DepartamentoTO> resourceList = new ArrayList<DepartamentoTO>();
		try {
			departamentos = DepartamentoLocalServiceUtil.findBydepartamento(idPais);
			for (Departamento dept : departamentos) {
				resourceList.add(mapper.map(dept, DepartamentoTO.class));
			}
		} catch (SystemException e) {
			e.printStackTrace();
			throw new PersistenceException(e.getMessage(), e.getCause());
		}
		return resourceList;
	}
	
	public List<CiudadTO> obtenerCiudades(int idDept) throws PersistenceException {
		List<Ciudad> ciudades;
		List<CiudadTO> resourceList = new ArrayList<CiudadTO>();
		try {
			ciudades = CiudadLocalServiceUtil.findBydepartamento(idDept);
			for (Ciudad ciudad : ciudades) {
				resourceList.add(mapper.map(ciudad, CiudadTO.class));
			}
		} catch (SystemException e) {
			e.printStackTrace();
			throw new PersistenceException(e.getMessage(), e.getCause());
		}
		return resourceList;
	}
	
	public CiudadTO obtenerCiudad(int id_ciudad) throws PersistenceException {
		CiudadTO datoTO = null;
		try {
			Ciudad dato = CiudadLocalServiceUtil.getCiudad(id_ciudad);
			datoTO =  mapper.map(dato, CiudadTO.class);
		} catch (SystemException e) {
			e.printStackTrace();
			throw new PersistenceException(e.getMessage(), e.getCause());
		} catch (PortalException e) {
			e.printStackTrace();
			throw new PersistenceException(e.getMessage(), e.getCause());
		}
		return datoTO;

	}
	
	public DepartamentoTO obtenerDeparamento(int id_dept) throws PersistenceException {
		DepartamentoTO datoTO = null;
		try {
			Departamento dato = DepartamentoLocalServiceUtil.getDepartamento(id_dept);
			datoTO =  mapper.map(dato, DepartamentoTO.class);
		} catch (SystemException e) {
			e.printStackTrace();
			throw new PersistenceException(e.getMessage(), e.getCause());
		} catch (PortalException e) {
			e.printStackTrace();
			throw new PersistenceException(e.getMessage(), e.getCause());
		}
		return datoTO;
	}
	
	public PaisTO obtenerPais(int id_pais) throws PersistenceException {
		PaisTO datoTO = null;
		try {
			Pais dato = PaisLocalServiceUtil.getPais(id_pais);
			datoTO =  mapper.map(dato, PaisTO.class);
		} catch (SystemException e) {
			e.printStackTrace();
			throw new PersistenceException(e.getMessage(), e.getCause());
		} catch (PortalException e) {
			e.printStackTrace();
			throw new PersistenceException(e.getMessage(), e.getCause());
		}
		return datoTO;
	}
}
