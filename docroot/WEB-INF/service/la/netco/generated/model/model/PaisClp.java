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

import la.netco.generated.model.service.PaisLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author smontanez
 */
public class PaisClp extends BaseModelImpl<Pais> implements Pais {
	public PaisClp() {
	}

	public Class<?> getModelClass() {
		return Pais.class;
	}

	public String getModelClassName() {
		return Pais.class.getName();
	}

	public int getPrimaryKey() {
		return _id_pais;
	}

	public void setPrimaryKey(int primaryKey) {
		setId_pais(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_id_pais);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id_pais", getId_pais());
		attributes.put("nombre", getNombre());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id_pais = (Integer)attributes.get("id_pais");

		if (id_pais != null) {
			setId_pais(id_pais);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}
	}

	public int getId_pais() {
		return _id_pais;
	}

	public void setId_pais(int id_pais) {
		_id_pais = id_pais;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public BaseModel<?> getPaisRemoteModel() {
		return _paisRemoteModel;
	}

	public void setPaisRemoteModel(BaseModel<?> paisRemoteModel) {
		_paisRemoteModel = paisRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			PaisLocalServiceUtil.addPais(this);
		}
		else {
			PaisLocalServiceUtil.updatePais(this);
		}
	}

	@Override
	public Pais toEscapedModel() {
		return (Pais)Proxy.newProxyInstance(Pais.class.getClassLoader(),
			new Class[] { Pais.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PaisClp clone = new PaisClp();

		clone.setId_pais(getId_pais());
		clone.setNombre(getNombre());

		return clone;
	}

	public int compareTo(Pais pais) {
		int value = 0;

		value = getNombre().compareTo(pais.getNombre());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		PaisClp pais = null;

		try {
			pais = (PaisClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = pais.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{id_pais=");
		sb.append(getId_pais());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("la.netco.generated.model.model.Pais");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id_pais</column-name><column-value><![CDATA[");
		sb.append(getId_pais());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id_pais;
	private String _nombre;
	private BaseModel<?> _paisRemoteModel;
}