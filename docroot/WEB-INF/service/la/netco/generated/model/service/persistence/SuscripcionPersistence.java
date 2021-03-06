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

package la.netco.generated.model.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import la.netco.generated.model.model.Suscripcion;

/**
 * The persistence interface for the suscripcion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author smontanez
 * @see SuscripcionPersistenceImpl
 * @see SuscripcionUtil
 * @generated
 */
public interface SuscripcionPersistence extends BasePersistence<Suscripcion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SuscripcionUtil} to access the suscripcion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the suscripcion in the entity cache if it is enabled.
	*
	* @param suscripcion the suscripcion
	*/
	public void cacheResult(
		la.netco.generated.model.model.Suscripcion suscripcion);

	/**
	* Caches the suscripcions in the entity cache if it is enabled.
	*
	* @param suscripcions the suscripcions
	*/
	public void cacheResult(
		java.util.List<la.netco.generated.model.model.Suscripcion> suscripcions);

	/**
	* Creates a new suscripcion with the primary key. Does not add the suscripcion to the database.
	*
	* @param id_suscripcion the primary key for the new suscripcion
	* @return the new suscripcion
	*/
	public la.netco.generated.model.model.Suscripcion create(int id_suscripcion);

	/**
	* Removes the suscripcion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_suscripcion the primary key of the suscripcion
	* @return the suscripcion that was removed
	* @throws la.netco.generated.model.NoSuchSuscripcionException if a suscripcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.Suscripcion remove(int id_suscripcion)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.generated.model.NoSuchSuscripcionException;

	public la.netco.generated.model.model.Suscripcion updateImpl(
		la.netco.generated.model.model.Suscripcion suscripcion, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the suscripcion with the primary key or throws a {@link la.netco.generated.model.NoSuchSuscripcionException} if it could not be found.
	*
	* @param id_suscripcion the primary key of the suscripcion
	* @return the suscripcion
	* @throws la.netco.generated.model.NoSuchSuscripcionException if a suscripcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.Suscripcion findByPrimaryKey(
		int id_suscripcion)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.generated.model.NoSuchSuscripcionException;

	/**
	* Returns the suscripcion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_suscripcion the primary key of the suscripcion
	* @return the suscripcion, or <code>null</code> if a suscripcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.Suscripcion fetchByPrimaryKey(
		int id_suscripcion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the suscripcion where num_documento = &#63; or throws a {@link la.netco.generated.model.NoSuchSuscripcionException} if it could not be found.
	*
	* @param num_documento the num_documento
	* @return the matching suscripcion
	* @throws la.netco.generated.model.NoSuchSuscripcionException if a matching suscripcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.Suscripcion findByDocumento(
		java.lang.String num_documento)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.generated.model.NoSuchSuscripcionException;

	/**
	* Returns the suscripcion where num_documento = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param num_documento the num_documento
	* @return the matching suscripcion, or <code>null</code> if a matching suscripcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.Suscripcion fetchByDocumento(
		java.lang.String num_documento)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the suscripcion where num_documento = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param num_documento the num_documento
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching suscripcion, or <code>null</code> if a matching suscripcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.Suscripcion fetchByDocumento(
		java.lang.String num_documento, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the suscripcions.
	*
	* @return the suscripcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<la.netco.generated.model.model.Suscripcion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the suscripcions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of suscripcions
	* @param end the upper bound of the range of suscripcions (not inclusive)
	* @return the range of suscripcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<la.netco.generated.model.model.Suscripcion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the suscripcions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of suscripcions
	* @param end the upper bound of the range of suscripcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of suscripcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<la.netco.generated.model.model.Suscripcion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the suscripcion where num_documento = &#63; from the database.
	*
	* @param num_documento the num_documento
	* @return the suscripcion that was removed
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.Suscripcion removeByDocumento(
		java.lang.String num_documento)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.generated.model.NoSuchSuscripcionException;

	/**
	* Removes all the suscripcions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of suscripcions where num_documento = &#63;.
	*
	* @param num_documento the num_documento
	* @return the number of matching suscripcions
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumento(java.lang.String num_documento)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of suscripcions.
	*
	* @return the number of suscripcions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}