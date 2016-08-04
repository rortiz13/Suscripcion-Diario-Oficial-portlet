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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    smontanez
 * @generated
 */
public class SuscripcionSoap implements Serializable {
	public static SuscripcionSoap toSoapModel(Suscripcion model) {
		SuscripcionSoap soapModel = new SuscripcionSoap();

		soapModel.setId_suscripcion(model.getId_suscripcion());
		soapModel.setNombres(model.getNombres());
		soapModel.setId_tipo_doc(model.getId_tipo_doc());
		soapModel.setNum_documento(model.getNum_documento());
		soapModel.setEmail(model.getEmail());
		soapModel.setDireccion(model.getDireccion());
		soapModel.setTelefono(model.getTelefono());
		soapModel.setId_ciudad(model.getId_ciudad());
		soapModel.setNombres_contacto(model.getNombres_contacto());
		soapModel.setTelefono_contacto(model.getTelefono_contacto());
		soapModel.setMedio(model.getMedio());
		soapModel.setTipo(model.getTipo());
		soapModel.setEstado_pago(model.getEstado_pago());
		soapModel.setValor_pagado(model.getValor_pagado());
		soapModel.setTipo_persona(model.getTipo_persona());

		return soapModel;
	}

	public static SuscripcionSoap[] toSoapModels(Suscripcion[] models) {
		SuscripcionSoap[] soapModels = new SuscripcionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SuscripcionSoap[][] toSoapModels(Suscripcion[][] models) {
		SuscripcionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SuscripcionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SuscripcionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SuscripcionSoap[] toSoapModels(List<Suscripcion> models) {
		List<SuscripcionSoap> soapModels = new ArrayList<SuscripcionSoap>(models.size());

		for (Suscripcion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SuscripcionSoap[soapModels.size()]);
	}

	public SuscripcionSoap() {
	}

	public int getPrimaryKey() {
		return _id_suscripcion;
	}

	public void setPrimaryKey(int pk) {
		setId_suscripcion(pk);
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
}