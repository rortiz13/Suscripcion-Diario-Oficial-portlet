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

import la.netco.generated.model.model.Suscripcion;

import java.io.Serializable;

/**
 * The cache model class for representing Suscripcion in entity cache.
 *
 * @author smontanez
 * @see Suscripcion
 * @generated
 */
public class SuscripcionCacheModel implements CacheModel<Suscripcion>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id_suscripcion=");
		sb.append(id_suscripcion);
		sb.append(", nombres=");
		sb.append(nombres);
		sb.append(", id_tipo_doc=");
		sb.append(id_tipo_doc);
		sb.append(", num_documento=");
		sb.append(num_documento);
		sb.append(", email=");
		sb.append(email);
		sb.append(", direccion=");
		sb.append(direccion);
		sb.append(", telefono=");
		sb.append(telefono);
		sb.append(", id_ciudad=");
		sb.append(id_ciudad);
		sb.append(", nombres_contacto=");
		sb.append(nombres_contacto);
		sb.append(", telefono_contacto=");
		sb.append(telefono_contacto);
		sb.append(", medio=");
		sb.append(medio);
		sb.append(", tipo=");
		sb.append(tipo);
		sb.append(", estado_pago=");
		sb.append(estado_pago);
		sb.append(", valor_pagado=");
		sb.append(valor_pagado);
		sb.append(", tipo_persona=");
		sb.append(tipo_persona);
		sb.append("}");

		return sb.toString();
	}

	public Suscripcion toEntityModel() {
		SuscripcionImpl suscripcionImpl = new SuscripcionImpl();

		suscripcionImpl.setId_suscripcion(id_suscripcion);

		if (nombres == null) {
			suscripcionImpl.setNombres(StringPool.BLANK);
		}
		else {
			suscripcionImpl.setNombres(nombres);
		}

		suscripcionImpl.setId_tipo_doc(id_tipo_doc);

		if (num_documento == null) {
			suscripcionImpl.setNum_documento(StringPool.BLANK);
		}
		else {
			suscripcionImpl.setNum_documento(num_documento);
		}

		if (email == null) {
			suscripcionImpl.setEmail(StringPool.BLANK);
		}
		else {
			suscripcionImpl.setEmail(email);
		}

		if (direccion == null) {
			suscripcionImpl.setDireccion(StringPool.BLANK);
		}
		else {
			suscripcionImpl.setDireccion(direccion);
		}

		if (telefono == null) {
			suscripcionImpl.setTelefono(StringPool.BLANK);
		}
		else {
			suscripcionImpl.setTelefono(telefono);
		}

		suscripcionImpl.setId_ciudad(id_ciudad);

		if (nombres_contacto == null) {
			suscripcionImpl.setNombres_contacto(StringPool.BLANK);
		}
		else {
			suscripcionImpl.setNombres_contacto(nombres_contacto);
		}

		if (telefono_contacto == null) {
			suscripcionImpl.setTelefono_contacto(StringPool.BLANK);
		}
		else {
			suscripcionImpl.setTelefono_contacto(telefono_contacto);
		}

		if (medio == null) {
			suscripcionImpl.setMedio(StringPool.BLANK);
		}
		else {
			suscripcionImpl.setMedio(medio);
		}

		if (tipo == null) {
			suscripcionImpl.setTipo(StringPool.BLANK);
		}
		else {
			suscripcionImpl.setTipo(tipo);
		}

		if (estado_pago == null) {
			suscripcionImpl.setEstado_pago(StringPool.BLANK);
		}
		else {
			suscripcionImpl.setEstado_pago(estado_pago);
		}

		if (valor_pagado == null) {
			suscripcionImpl.setValor_pagado(StringPool.BLANK);
		}
		else {
			suscripcionImpl.setValor_pagado(valor_pagado);
		}

		suscripcionImpl.setTipo_persona(tipo_persona);

		suscripcionImpl.resetOriginalValues();

		return suscripcionImpl;
	}

	public int id_suscripcion;
	public String nombres;
	public int id_tipo_doc;
	public String num_documento;
	public String email;
	public String direccion;
	public String telefono;
	public int id_ciudad;
	public String nombres_contacto;
	public String telefono_contacto;
	public String medio;
	public String tipo;
	public String estado_pago;
	public String valor_pagado;
	public int tipo_persona;
}