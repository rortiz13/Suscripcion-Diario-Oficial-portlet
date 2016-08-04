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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import la.netco.generated.model.service.SuscripcionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author smontanez
 */
public class SuscripcionClp extends BaseModelImpl<Suscripcion>
	implements Suscripcion {
	public SuscripcionClp() {
	}

	public Class<?> getModelClass() {
		return Suscripcion.class;
	}

	public String getModelClassName() {
		return Suscripcion.class.getName();
	}

	public int getPrimaryKey() {
		return _id_suscripcion;
	}

	public void setPrimaryKey(int primaryKey) {
		setId_suscripcion(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_id_suscripcion);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
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

	@Override
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

	public int getId_suscripcion() {
		return _id_suscripcion;
	}

	public void setId_suscripcion(int id_suscripcion) {
		_id_suscripcion = id_suscripcion;
	}

	public String getNombres() {
		return _nombres;
	}

	public void setNombres(String nombres) {
		_nombres = nombres;
	}

	public int getId_tipo_doc() {
		return _id_tipo_doc;
	}

	public void setId_tipo_doc(int id_tipo_doc) {
		_id_tipo_doc = id_tipo_doc;
	}

	public String getNum_documento() {
		return _num_documento;
	}

	public void setNum_documento(String num_documento) {
		_num_documento = num_documento;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getDireccion() {
		return _direccion;
	}

	public void setDireccion(String direccion) {
		_direccion = direccion;
	}

	public String getTelefono() {
		return _telefono;
	}

	public void setTelefono(String telefono) {
		_telefono = telefono;
	}

	public int getId_ciudad() {
		return _id_ciudad;
	}

	public void setId_ciudad(int id_ciudad) {
		_id_ciudad = id_ciudad;
	}

	public String getNombres_contacto() {
		return _nombres_contacto;
	}

	public void setNombres_contacto(String nombres_contacto) {
		_nombres_contacto = nombres_contacto;
	}

	public String getTelefono_contacto() {
		return _telefono_contacto;
	}

	public void setTelefono_contacto(String telefono_contacto) {
		_telefono_contacto = telefono_contacto;
	}

	public String getMedio() {
		return _medio;
	}

	public void setMedio(String medio) {
		_medio = medio;
	}

	public String getTipo() {
		return _tipo;
	}

	public void setTipo(String tipo) {
		_tipo = tipo;
	}

	public String getEstado_pago() {
		return _estado_pago;
	}

	public void setEstado_pago(String estado_pago) {
		_estado_pago = estado_pago;
	}

	public String getValor_pagado() {
		return _valor_pagado;
	}

	public void setValor_pagado(String valor_pagado) {
		_valor_pagado = valor_pagado;
	}

	public int getTipo_persona() {
		return _tipo_persona;
	}

	public void setTipo_persona(int tipo_persona) {
		_tipo_persona = tipo_persona;
	}

	public BaseModel<?> getSuscripcionRemoteModel() {
		return _suscripcionRemoteModel;
	}

	public void setSuscripcionRemoteModel(BaseModel<?> suscripcionRemoteModel) {
		_suscripcionRemoteModel = suscripcionRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			SuscripcionLocalServiceUtil.addSuscripcion(this);
		}
		else {
			SuscripcionLocalServiceUtil.updateSuscripcion(this);
		}
	}

	@Override
	public Suscripcion toEscapedModel() {
		return (Suscripcion)Proxy.newProxyInstance(Suscripcion.class.getClassLoader(),
			new Class[] { Suscripcion.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SuscripcionClp clone = new SuscripcionClp();

		clone.setId_suscripcion(getId_suscripcion());
		clone.setNombres(getNombres());
		clone.setId_tipo_doc(getId_tipo_doc());
		clone.setNum_documento(getNum_documento());
		clone.setEmail(getEmail());
		clone.setDireccion(getDireccion());
		clone.setTelefono(getTelefono());
		clone.setId_ciudad(getId_ciudad());
		clone.setNombres_contacto(getNombres_contacto());
		clone.setTelefono_contacto(getTelefono_contacto());
		clone.setMedio(getMedio());
		clone.setTipo(getTipo());
		clone.setEstado_pago(getEstado_pago());
		clone.setValor_pagado(getValor_pagado());
		clone.setTipo_persona(getTipo_persona());

		return clone;
	}

	public int compareTo(Suscripcion suscripcion) {
		int primaryKey = suscripcion.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		SuscripcionClp suscripcion = null;

		try {
			suscripcion = (SuscripcionClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = suscripcion.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id_suscripcion=");
		sb.append(getId_suscripcion());
		sb.append(", nombres=");
		sb.append(getNombres());
		sb.append(", id_tipo_doc=");
		sb.append(getId_tipo_doc());
		sb.append(", num_documento=");
		sb.append(getNum_documento());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", direccion=");
		sb.append(getDireccion());
		sb.append(", telefono=");
		sb.append(getTelefono());
		sb.append(", id_ciudad=");
		sb.append(getId_ciudad());
		sb.append(", nombres_contacto=");
		sb.append(getNombres_contacto());
		sb.append(", telefono_contacto=");
		sb.append(getTelefono_contacto());
		sb.append(", medio=");
		sb.append(getMedio());
		sb.append(", tipo=");
		sb.append(getTipo());
		sb.append(", estado_pago=");
		sb.append(getEstado_pago());
		sb.append(", valor_pagado=");
		sb.append(getValor_pagado());
		sb.append(", tipo_persona=");
		sb.append(getTipo_persona());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("la.netco.generated.model.model.Suscripcion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id_suscripcion</column-name><column-value><![CDATA[");
		sb.append(getId_suscripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombres</column-name><column-value><![CDATA[");
		sb.append(getNombres());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id_tipo_doc</column-name><column-value><![CDATA[");
		sb.append(getId_tipo_doc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>num_documento</column-name><column-value><![CDATA[");
		sb.append(getNum_documento());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>direccion</column-name><column-value><![CDATA[");
		sb.append(getDireccion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>telefono</column-name><column-value><![CDATA[");
		sb.append(getTelefono());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id_ciudad</column-name><column-value><![CDATA[");
		sb.append(getId_ciudad());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombres_contacto</column-name><column-value><![CDATA[");
		sb.append(getNombres_contacto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>telefono_contacto</column-name><column-value><![CDATA[");
		sb.append(getTelefono_contacto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>medio</column-name><column-value><![CDATA[");
		sb.append(getMedio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipo</column-name><column-value><![CDATA[");
		sb.append(getTipo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estado_pago</column-name><column-value><![CDATA[");
		sb.append(getEstado_pago());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>valor_pagado</column-name><column-value><![CDATA[");
		sb.append(getValor_pagado());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipo_persona</column-name><column-value><![CDATA[");
		sb.append(getTipo_persona());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id_suscripcion;
	private String _nombres;
	private int _id_tipo_doc;
	private String _num_documento;
	private String _email;
	private String _direccion;
	private String _telefono;
	private int _id_ciudad;
	private String _nombres_contacto;
	private String _telefono_contacto;
	private String _medio;
	private String _tipo;
	private String _estado_pago;
	private String _valor_pagado;
	private int _tipo_persona;
	private BaseModel<?> _suscripcionRemoteModel;
}