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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import la.netco.generated.model.model.Suscripcion;

import java.util.List;

/**
 * The persistence utility for the suscripcion service. This utility wraps {@link SuscripcionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author smontanez
 * @see SuscripcionPersistence
 * @see SuscripcionPersistenceImpl
 * @generated
 */
public class SuscripcionUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Suscripcion suscripcion) {
		getPersistence().clearCache(suscripcion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Suscripcion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Suscripcion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Suscripcion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Suscripcion update(Suscripcion suscripcion, boolean merge)
		throws SystemException {
		return getPersistence().update(suscripcion, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Suscripcion update(Suscripcion suscripcion, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(suscripcion, merge, serviceContext);
	}

	/**
	* Caches the suscripcion in the entity cache if it is enabled.
	*
	* @param suscripcion the suscripcion
	*/
	public static void cacheResult(
		la.netco.generated.model.model.Suscripcion suscripcion) {
		getPersistence().cacheResult(suscripcion);
	}

	/**
	* Caches the suscripcions in the entity cache if it is enabled.
	*
	* @param suscripcions the suscripcions
	*/
	public static void cacheResult(
		java.util.List<la.netco.generated.model.model.Suscripcion> suscripcions) {
		getPersistence().cacheResult(suscripcions);
	}

	/**
	* Creates a new suscripcion with the primary key. Does not add the suscripcion to the database.
	*
	* @param id_suscripcion the primary key for the new suscripcion
	* @return the new suscripcion
	*/
	public static la.netco.generated.model.model.Suscripcion create(
		int id_suscripcion) {
		return getPersistence().create(id_suscripcion);
	}

	/**
	* Removes the suscripcion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_suscripcion the primary key of the suscripcion
	* @return the suscripcion that was removed
	* @throws la.netco.generated.model.NoSuchSuscripcionException if a suscripcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.generated.model.model.Suscripcion remove(
		int id_suscripcion)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.generated.model.NoSuchSuscripcionException {
		return getPersistence().remove(id_suscripcion);
	}

	public static la.netco.generated.model.model.Suscripcion updateImpl(
		la.netco.generated.model.model.Suscripcion suscripcion, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(suscripcion, merge);
	}

	/**
	* Returns the suscripcion with the primary key or throws a {@link la.netco.generated.model.NoSuchSuscripcionException} if it could not be found.
	*
	* @param id_suscripcion the primary key of the suscripcion
	* @return the suscripcion
	* @throws la.netco.generated.model.NoSuchSuscripcionException if a suscripcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.generated.model.model.Suscripcion findByPrimaryKey(
		int id_suscripcion)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.generated.model.NoSuchSuscripcionException {
		return getPersistence().findByPrimaryKey(id_suscripcion);
	}

	/**
	* Returns the suscripcion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_suscripcion the primary key of the suscripcion
	* @return the suscripcion, or <code>null</code> if a suscripcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.generated.model.model.Suscripcion fetchByPrimaryKey(
		int id_suscripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id_suscripcion);
	}

	/**
	* Returns the suscripcion where num_documento = &#63; or throws a {@link la.netco.generated.model.NoSuchSuscripcionException} if it could not be found.
	*
	* @param num_documento the num_documento
	* @return the matching suscripcion
	* @throws la.netco.generated.model.NoSuchSuscripcionException if a matching suscripcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.generated.model.model.Suscripcion findByDocumento(
		java.lang.String num_documento)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.generated.model.NoSuchSuscripcionException {
		return getPersistence().findByDocumento(num_documento);
	}

	/**
	* Returns the suscripcion where num_documento = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param num_documento the num_documento
	* @return the matching suscripcion, or <code>null</code> if a matching suscripcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.generated.model.model.Suscripcion fetchByDocumento(
		java.lang.String num_documento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByDocumento(num_documento);
	}

	/**
	* Returns the suscripcion where num_documento = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param num_documento the num_documento
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching suscripcion, or <code>null</code> if a matching suscripcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.generated.model.model.Suscripcion fetchByDocumento(
		java.lang.String num_documento, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumento(num_documento, retrieveFromCache);
	}

	/**
	* Returns all the suscripcions.
	*
	* @return the suscripcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<la.netco.generated.model.model.Suscripcion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<la.netco.generated.model.model.Suscripcion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<la.netco.generated.model.model.Suscripcion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the suscripcion where num_documento = &#63; from the database.
	*
	* @param num_documento the num_documento
	* @return the suscripcion that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.generated.model.model.Suscripcion removeByDocumento(
		java.lang.String num_documento)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.generated.model.NoSuchSuscripcionException {
		return getPersistence().removeByDocumento(num_documento);
	}

	/**
	* Removes all the suscripcions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of suscripcions where num_documento = &#63;.
	*
	* @param num_documento the num_documento
	* @return the number of matching suscripcions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumento(java.lang.String num_documento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDocumento(num_documento);
	}

	/**
	* Returns the number of suscripcions.
	*
	* @return the number of suscripcions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SuscripcionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SuscripcionPersistence)PortletBeanLocatorUtil.locate(la.netco.generated.model.service.ClpSerializer.getServletContextName(),
					SuscripcionPersistence.class.getName());

			ReferenceRegistry.registerReference(SuscripcionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(SuscripcionPersistence persistence) {
	}

	private static SuscripcionPersistence _persistence;
}