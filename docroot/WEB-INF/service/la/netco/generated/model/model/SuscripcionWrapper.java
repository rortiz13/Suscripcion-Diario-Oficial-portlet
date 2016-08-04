/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package la.netco.generated.model.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Suscripcion}.
 * </p>
 *
 * @author    smontanez
 * @see       Suscripcion
 * @generated
 */
public class SuscripcionWrapper implements Suscripcion,
	ModelWrapper<Suscripcion> {
	public SuscripcionWrapper(Suscripcion suscripcion) {
		_suscripcion = suscripcion;
	}

	public Class<?> getModelClass() {
		return Suscripcion.class;
	}

	public String getModelClassName() {
		return Suscripcion.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id_suscripcion", getId_suscripcion());
		attributes.put("nombres", getNombres());
		attributes.put("id_tipo_doc", getId_tipo_doc());
		attributes.put("num_documento", getNum_documento());
		attributes.put("email", getEmail());
		attributes.put("direccion", getDireccion());
		attributes.put("telefono", getTelefono());
		attributes.put("id_ciudad", getId_ciudad());
		attributes.put("nombres_contacto", getNombres_contacto());
		attributes.put("telefono_contacto", getTelefono_contacto());
		attributes.put("medio", getMedio());
		attributes.put("tipo", getTipo());
		attributes.put("estado_pago", getEstado_pago());
		attributes.put("valor_pagado", getValor_pagado());
		attributes.put("tipo_persona", getTipo_persona());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id_suscripcion = (Integer)attributes.get("id_suscripcion");

		if (id_suscripcion != null) {
			setId_suscripcion(id_suscripcion);
		}

		String nombres = (String)attributes.get("nombres");

		if (nombres != null) {
			setNombres(nombres);
		}

		Integer id_tipo_doc = (Integer)attributes.get("id_tipo_doc");

		if (id_tipo_doc != null) {
			setId_tipo_doc(id_tipo_doc);
		}

		String num_documento = (String)attributes.get("num_documento");

		if (num_documento != null) {
			setNum_documento(num_documento);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String direccion = (String)attributes.get("direccion");

		if (direccion != null) {
			setDireccion(direccion);
		}

		String telefono = (String)attributes.get("telefono");

		if (telefono != null) {
			setTelefono(telefono);
		}

		Integer id_ciudad = (Integer)attributes.get("id_ciudad");

		if (id_ciudad != null) {
			setId_ciudad(id_ciudad);
		}

		String nombres_contacto = (String)attributes.get("nombres_contacto");

		if (nombres_contacto != null) {
			setNombres_contacto(nombres_contacto);
		}

		String telefono_contacto = (String)attributes.get("telefono_contacto");

		if (telefono_contacto != null) {
			setTelefono_contacto(telefono_contacto);
		}

		String medio = (String)attributes.get("medio");

		if (medio != null) {
			setMedio(medio);
		}

		String tipo = (String)attributes.get("tipo");

		if (tipo != null) {
			setTipo(tipo);
		}

		String estado_pago = (String)attributes.get("estado_pago");

		if (estado_pago != null) {
			setEstado_pago(estado_pago);
		}

		String valor_pagado = (String)attributes.get("valor_pagado");

		if (valor_pagado != null) {
			setValor_pagado(valor_pagado);
		}

		Integer tipo_persona = (Integer)attributes.get("tipo_persona");

		if (tipo_persona != null) {
			setTipo_persona(tipo_persona);
		}
	}

	/**
	* Returns the primary key of this suscripcion.
	*
	* @return the primary key of this suscripcion
	*/
	public int getPrimaryKey() {
		return _suscripcion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this suscripcion.
	*
	* @param primaryKey the primary key of this suscripcion
	*/
	public void setPrimaryKey(int primaryKey) {
		_suscripcion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the id_suscripcion of this suscripcion.
	*
	* @return the id_suscripcion of this suscripcion
	*/
	public int getId_suscripcion() {
		return _suscripcion.getId_suscripcion();
	}

	/**
	* Sets the id_suscripcion of this suscripcion.
	*
	* @param id_suscripcion the id_suscripcion of this suscripcion
	*/
	public void setId_suscripcion(int id_suscripcion) {
		_suscripcion.setId_suscripcion(id_suscripcion);
	}

	/**
	* Returns the nombres of this suscripcion.
	*
	* @return the nombres of this suscripcion
	*/
	public java.lang.String getNombres() {
		return _suscripcion.getNombres();
	}

	/**
	* Sets the nombres of this suscripcion.
	*
	* @param nombres the nombres of this suscripcion
	*/
	public void setNombres(java.lang.String nombres) {
		_suscripcion.setNombres(nombres);
	}

	/**
	* Returns the id_tipo_doc of this suscripcion.
	*
	* @return the id_tipo_doc of this suscripcion
	*/
	public int getId_tipo_doc() {
		return _suscripcion.getId_tipo_doc();
	}

	/**
	* Sets the id_tipo_doc of this suscripcion.
	*
	* @param id_tipo_doc the id_tipo_doc of this suscripcion
	*/
	public void setId_tipo_doc(int id_tipo_doc) {
		_suscripcion.setId_tipo_doc(id_tipo_doc);
	}

	/**
	* Returns the num_documento of this suscripcion.
	*
	* @return the num_documento of this suscripcion
	*/
	public java.lang.String getNum_documento() {
		return _suscripcion.getNum_documento();
	}

	/**
	* Sets the num_documento of this suscripcion.
	*
	* @param num_documento the num_documento of this suscripcion
	*/
	public void setNum_documento(java.lang.String num_documento) {
		_suscripcion.setNum_documento(num_documento);
	}

	/**
	* Returns the email of this suscripcion.
	*
	* @return the email of this suscripcion
	*/
	public java.lang.String getEmail() {
		return _suscripcion.getEmail();
	}

	/**
	* Sets the email of this suscripcion.
	*
	* @param email the email of this suscripcion
	*/
	public void setEmail(java.lang.String email) {
		_suscripcion.setEmail(email);
	}

	/**
	* Returns the direccion of this suscripcion.
	*
	* @return the direccion of this suscripcion
	*/
	public java.lang.String getDireccion() {
		return _suscripcion.getDireccion();
	}

	/**
	* Sets the direccion of this suscripcion.
	*
	* @param direccion the direccion of this suscripcion
	*/
	public void setDireccion(java.lang.String direccion) {
		_suscripcion.setDireccion(direccion);
	}

	/**
	* Returns the telefono of this suscripcion.
	*
	* @return the telefono of this suscripcion
	*/
	public java.lang.String getTelefono() {
		return _suscripcion.getTelefono();
	}

	/**
	* Sets the telefono of this suscripcion.
	*
	* @param telefono the telefono of this suscripcion
	*/
	public void setTelefono(java.lang.String telefono) {
		_suscripcion.setTelefono(telefono);
	}

	/**
	* Returns the id_ciudad of this suscripcion.
	*
	* @return the id_ciudad of this suscripcion
	*/
	public int getId_ciudad() {
		return _suscripcion.getId_ciudad();
	}

	/**
	* Sets the id_ciudad of this suscripcion.
	*
	* @param id_ciudad the id_ciudad of this suscripcion
	*/
	public void setId_ciudad(int id_ciudad) {
		_suscripcion.setId_ciudad(id_ciudad);
	}

	/**
	* Returns the nombres_contacto of this suscripcion.
	*
	* @return the nombres_contacto of this suscripcion
	*/
	public java.lang.String getNombres_contacto() {
		return _suscripcion.getNombres_contacto();
	}

	/**
	* Sets the nombres_contacto of this suscripcion.
	*
	* @param nombres_contacto the nombres_contacto of this suscripcion
	*/
	public void setNombres_contacto(java.lang.String nombres_contacto) {
		_suscripcion.setNombres_contacto(nombres_contacto);
	}

	/**
	* Returns the telefono_contacto of this suscripcion.
	*
	* @return the telefono_contacto of this suscripcion
	*/
	public java.lang.String getTelefono_contacto() {
		return _suscripcion.getTelefono_contacto();
	}

	/**
	* Sets the telefono_contacto of this suscripcion.
	*
	* @param telefono_contacto the telefono_contacto of this suscripcion
	*/
	public void setTelefono_contacto(java.lang.String telefono_contacto) {
		_suscripcion.setTelefono_contacto(telefono_contacto);
	}

	/**
	* Returns the medio of this suscripcion.
	*
	* @return the medio of this suscripcion
	*/
	public java.lang.String getMedio() {
		return _suscripcion.getMedio();
	}

	/**
	* Sets the medio of this suscripcion.
	*
	* @param medio the medio of this suscripcion
	*/
	public void setMedio(java.lang.String medio) {
		_suscripcion.setMedio(medio);
	}

	/**
	* Returns the tipo of this suscripcion.
	*
	* @return the tipo of this suscripcion
	*/
	public java.lang.String getTipo() {
		return _suscripcion.getTipo();
	}

	/**
	* Sets the tipo of this suscripcion.
	*
	* @param tipo the tipo of this suscripcion
	*/
	public void setTipo(java.lang.String tipo) {
		_suscripcion.setTipo(tipo);
	}

	/**
	* Returns the estado_pago of this suscripcion.
	*
	* @return the estado_pago of this suscripcion
	*/
	public java.lang.String getEstado_pago() {
		return _suscripcion.getEstado_pago();
	}

	/**
	* Sets the estado_pago of this suscripcion.
	*
	* @param estado_pago the estado_pago of this suscripcion
	*/
	public void setEstado_pago(java.lang.String estado_pago) {
		_suscripcion.setEstado_pago(estado_pago);
	}

	/**
	* Returns the valor_pagado of this suscripcion.
	*
	* @return the valor_pagado of this suscripcion
	*/
	public java.lang.String getValor_pagado() {
		return _suscripcion.getValor_pagado();
	}

	/**
	* Sets the valor_pagado of this suscripcion.
	*
	* @param valor_pagado the valor_pagado of this suscripcion
	*/
	public void setValor_pagado(java.lang.String valor_pagado) {
		_suscripcion.setValor_pagado(valor_pagado);
	}

	/**
	* Returns the tipo_persona of this suscripcion.
	*
	* @return the tipo_persona of this suscripcion
	*/
	public int getTipo_persona() {
		return _suscripcion.getTipo_persona();
	}

	/**
	* Sets the tipo_persona of this suscripcion.
	*
	* @param tipo_persona the tipo_persona of this suscripcion
	*/
	public void setTipo_persona(int tipo_persona) {
		_suscripcion.setTipo_persona(tipo_persona);
	}

	public boolean isNew() {
		return _suscripcion.isNew();
	}

	public void setNew(boolean n) {
		_suscripcion.setNew(n);
	}

	public boolean isCachedModel() {
		return _suscripcion.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_suscripcion.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _suscripcion.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _suscripcion.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_suscripcion.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _suscripcion.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_suscripcion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SuscripcionWrapper((Suscripcion)_suscripcion.clone());
	}

	public int compareTo(la.netco.generated.model.model.Suscripcion suscripcion) {
		return _suscripcion.compareTo(suscripcion);
	}

	@Override
	public int hashCode() {
		return _suscripcion.hashCode();
	}

	public com.liferay.portal.model.CacheModel<la.netco.generated.model.model.Suscripcion> toCacheModel() {
		return _suscripcion.toCacheModel();
	}

	public la.netco.generated.model.model.Suscripcion toEscapedModel() {
		return new SuscripcionWrapper(_suscripcion.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _suscripcion.toString();
	}

	public java.lang.String toXmlString() {
		return _suscripcion.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_suscripcion.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Suscripcion getWrappedSuscripcion() {
		return _suscripcion;
	}

	public Suscripcion getWrappedModel() {
		return _suscripcion;
	}

	public void resetOriginalValues() {
		_suscripcion.resetOriginalValues();
	}

	private Suscripcion _suscripcion;
}