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

import la.netco.generated.model.model.Pais;

import java.util.List;

/**
 * The persistence utility for the pais service. This utility wraps {@link PaisPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author smontanez
 * @see PaisPersistence
 * @see PaisPersistenceImpl
 * @generated
 */
public class PaisUtil {
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
	public static void clearCache(Pais pais) {
		getPersistence().clearCache(pais);
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
	public static List<Pais> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Pais> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Pais> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Pais update(Pais pais, boolean merge)
		throws SystemException {
		return getPersistence().update(pais, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Pais update(Pais pais, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(pais, merge, serviceContext);
	}

	/**
	* Caches the pais in the entity cache if it is enabled.
	*
	* @param pais the pais
	*/
	public static void cacheResult(la.netco.generated.model.model.Pais pais) {
		getPersistence().cacheResult(pais);
	}

	/**
	* Caches the paises in the entity cache if it is enabled.
	*
	* @param paises the paises
	*/
	public static void cacheResult(
		java.util.List<la.netco.generated.model.model.Pais> paises) {
		getPersistence().cacheResult(paises);
	}

	/**
	* Creates a new pais with the primary key. Does not add the pais to the database.
	*
	* @param id_pais the primary key for the new pais
	* @return the new pais
	*/
	public static la.netco.generated.model.model.Pais create(int id_pais) {
		return getPersistence().create(id_pais);
	}

	/**
	* Removes the pais with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_pais the primary key of the pais
	* @return the pais that was removed
	* @throws la.netco.generated.model.NoSuchPaisException if a pais with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.generated.model.model.Pais remove(int id_pais)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.generated.model.NoSuchPaisException {
		return getPersistence().remove(id_pais);
	}

	public static la.netco.generated.model.model.Pais updateImpl(
		la.netco.generated.model.model.Pais pais, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(pais, merge);
	}

	/**
	* Returns the pais with the primary key or throws a {@link la.netco.generated.model.NoSuchPaisException} if it could not be found.
	*
	* @param id_pais the primary key of the pais
	* @return the pais
	* @throws la.netco.generated.model.NoSuchPaisException if a pais with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.generated.model.model.Pais findByPrimaryKey(
		int id_pais)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.generated.model.NoSuchPaisException {
		return getPersistence().findByPrimaryKey(id_pais);
	}

	/**
	* Returns the pais with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_pais the primary key of the pais
	* @return the pais, or <code>null</code> if a pais with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.generated.model.model.Pais fetchByPrimaryKey(
		int id_pais) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id_pais);
	}

	/**
	* Returns all the paises.
	*
	* @return the paises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<la.netco.generated.model.model.Pais> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the paises.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of paises
	* @param end the upper bound of the range of paises (not inclusive)
	* @return the range of paises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<la.netco.generated.model.model.Pais> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the paises.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of paises
	* @param end the upper bound of the range of paises (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of paises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<la.netco.generated.model.model.Pais> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the paises from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of paises.
	*
	* @return the number of paises
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PaisPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PaisPersistence)PortletBeanLocatorUtil.locate(la.netco.generated.model.service.ClpSerializer.getServletContextName(),
					PaisPersistence.class.getName());

			ReferenceRegistry.registerReference(PaisUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(PaisPersistence persistence) {
	}

	private static PaisPersistence _persistence;
}