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

package la.netco.generated.model.service.impl;

import la.netco.generated.model.NoSuchSuscripcionException;
import la.netco.generated.model.model.Suscripcion;
import la.netco.generated.model.service.base.SuscripcionLocalServiceBaseImpl;
import la.netco.generated.model.service.persistence.SuscripcionUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the suscripcion local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link la.netco.generated.model.service.SuscripcionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author smontanez
 * @see la.netco.generated.model.service.base.SuscripcionLocalServiceBaseImpl
 * @see la.netco.generated.model.service.SuscripcionLocalServiceUtil
 */
public class SuscripcionLocalServiceImpl extends SuscripcionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link la.netco.generated.model.service.SuscripcionLocalServiceUtil} to access the suscripcion local service.
	 */
	
	public Suscripcion findBydepartamento(String num_documento) throws SystemException, NoSuchSuscripcionException {
		return SuscripcionUtil.findByDocumento(num_documento);
	}
}