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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import la.netco.generated.model.model.Pais;

import java.io.Serializable;

/**
 * The cache model class for representing Pais in entity cache.
 *
 * @author smontanez
 * @see Pais
 * @generated
 */
public class PaisCacheModel implements CacheModel<Pais>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{id_pais=");
		sb.append(id_pais);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append("}");

		return sb.toString();
	}

	public Pais toEntityModel() {
		PaisImpl paisImpl = new PaisImpl();

		paisImpl.setId_pais(id_pais);

		if (nombre == null) {
			paisImpl.setNombre(StringPool.BLANK);
		}
		else {
			paisImpl.setNombre(nombre);
		}

		paisImpl.resetOriginalValues();

		return paisImpl;
	}

	public int id_pais;
	public String nombre;
}