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
public class PaisSoap implements Serializable {
	public static PaisSoap toSoapModel(Pais model) {
		PaisSoap soapModel = new PaisSoap();

		soapModel.setId_pais(model.getId_pais());
		soapModel.setNombre(model.getNombre());

		return soapModel;
	}

	public static PaisSoap[] toSoapModels(Pais[] models) {
		PaisSoap[] soapModels = new PaisSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PaisSoap[][] toSoapModels(Pais[][] models) {
		PaisSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PaisSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PaisSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PaisSoap[] toSoapModels(List<Pais> models) {
		List<PaisSoap> soapModels = new ArrayList<PaisSoap>(models.size());

		for (Pais model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PaisSoap[soapModels.size()]);
	}

	public PaisSoap() {
	}

	public int getPrimaryKey() {
		return _id_pais;
	}

	public void setPrimaryKey(int pk) {
		setId_pais(pk);
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

	private int _id_pais;
	private String _nombre;
}