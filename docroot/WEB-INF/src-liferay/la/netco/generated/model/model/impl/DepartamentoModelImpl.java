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

package la.netco.generated.model.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import la.netco.generated.model.model.Departamento;
import la.netco.generated.model.model.DepartamentoModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Departamento service. Represents a row in the &quot;GEO_DEPARTAMENTO&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link la.netco.generated.model.model.DepartamentoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DepartamentoImpl}.
 * </p>
 *
 * @author smontanez
 * @see DepartamentoImpl
 * @see la.netco.generated.model.model.Departamento
 * @see la.netco.generated.model.model.DepartamentoModel
 * @generated
 */
public class DepartamentoModelImpl extends BaseModelImpl<Departamento>
	implements DepartamentoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a departamento model instance should use the {@link la.netco.generated.model.model.Departamento} interface instead.
	 */
	public static final String TABLE_NAME = "GEO_DEPARTAMENTO";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_departamento", Types.INTEGER },
			{ "nombre", Types.VARCHAR },
			{ "id_pais", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table GEO_DEPARTAMENTO (id_departamento INTEGER not null primary key IDENTITY,nombre VARCHAR(75) null,id_pais INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table GEO_DEPARTAMENTO";
	public static final String ORDER_BY_JPQL = " ORDER BY departamento.nombre ASC";
	public static final String ORDER_BY_SQL = " ORDER BY GEO_DEPARTAMENTO.nombre ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.la.netco.generated.model.model.Departamento"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.la.netco.generated.model.model.Departamento"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.la.netco.generated.model.model.Departamento"),
			true);
	public static long ID_PAIS_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.la.netco.generated.model.model.Departamento"));

	public DepartamentoModelImpl() {
	}

	public int getPrimaryKey() {
		return _id_departamento;
	}

	public void setPrimaryKey(int primaryKey) {
		setId_departamento(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_id_departamento);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	public Class<?> getModelClass() {
		return Departamento.class;
	}

	public String getModelClassName() {
		return Departamento.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id_departamento", getId_departamento());
		attributes.put("nombre", getNombre());
		attributes.put("id_pais", getId_pais());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id_departamento = (Integer)attributes.get("id_departamento");

		if (id_departamento != null) {
			setId_departamento(id_departamento);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		Integer id_pais = (Integer)attributes.get("id_pais");

		if (id_pais != null) {
			setId_pais(id_pais);
		}
	}

	public int getId_departamento() {
		return _id_departamento;
	}

	public void setId_departamento(int id_departamento) {
		_id_departamento = id_departamento;
	}

	public String getNombre() {
		if (_nombre == null) {
			return StringPool.BLANK;
		}
		else {
			return _nombre;
		}
	}

	public void setNombre(String nombre) {
		_columnBitmask = -1L;

		_nombre = nombre;
	}

	public int getId_pais() {
		return _id_pais;
	}

	public void setId_pais(int id_pais) {
		_columnBitmask |= ID_PAIS_COLUMN_BITMASK;

		if (!_setOriginalId_pais) {
			_setOriginalId_pais = true;

			_originalId_pais = _id_pais;
		}

		_id_pais = id_pais;
	}

	public int getOriginalId_pais() {
		return _originalId_pais;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public Departamento toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Departamento)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		DepartamentoImpl departamentoImpl = new DepartamentoImpl();

		departamentoImpl.setId_departamento(getId_departamento());
		departamentoImpl.setNombre(getNombre());
		departamentoImpl.setId_pais(getId_pais());

		departamentoImpl.resetOriginalValues();

		return departamentoImpl;
	}

	public int compareTo(Departamento departamento) {
		int value = 0;

		value = getNombre().compareTo(departamento.getNombre());

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

		Departamento departamento = null;

		try {
			departamento = (Departamento)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = departamento.getPrimaryKey();

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
	public void resetOriginalValues() {
		DepartamentoModelImpl departamentoModelImpl = this;

		departamentoModelImpl._originalId_pais = departamentoModelImpl._id_pais;

		departamentoModelImpl._setOriginalId_pais = false;

		departamentoModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Departamento> toCacheModel() {
		DepartamentoCacheModel departamentoCacheModel = new DepartamentoCacheModel();

		departamentoCacheModel.id_departamento = getId_departamento();

		departamentoCacheModel.nombre = getNombre();

		String nombre = departamentoCacheModel.nombre;

		if ((nombre != null) && (nombre.length() == 0)) {
			departamentoCacheModel.nombre = null;
		}

		departamentoCacheModel.id_pais = getId_pais();

		return departamentoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id_departamento=");
		sb.append(getId_departamento());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append(", id_pais=");
		sb.append(getId_pais());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("la.netco.generated.model.model.Departamento");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id_departamento</column-name><column-value><![CDATA[");
		sb.append(getId_departamento());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id_pais</column-name><column-value><![CDATA[");
		sb.append(getId_pais());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Departamento.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Departamento.class
		};
	private int _id_departamento;
	private String _nombre;
	private int _id_pais;
	private int _originalId_pais;
	private boolean _setOriginalId_pais;
	private long _columnBitmask;
	private Departamento _escapedModelProxy;
}