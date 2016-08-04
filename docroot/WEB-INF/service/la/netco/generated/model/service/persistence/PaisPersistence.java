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

import la.netco.generated.model.model.Pais;

/**
 * The persistence interface for the pais service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author smontanez
 * @see PaisPersistenceImpl
 * @see PaisUtil
 * @generated
 */
public interface PaisPersistence extends BasePersistence<Pais> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PaisUtil} to access the pais persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the pais in the entity cache if it is enabled.
	*
	* @param pais the pais
	*/
	public void cacheResult(la.netco.generated.model.model.Pais pais);

	/**
	* Caches the paises in the entity cache if it is enabled.
	*
	* @param paises the paises
	*/
	public void cacheResult(
		java.util.List<la.netco.generated.model.model.Pais> paises);

	/**
	* Creates a new pais with the primary key. Does not add the pais to the database.
	*
	* @param id_pais the primary key for the new pais
	* @return the new pais
	*/
	public la.netco.generated.model.model.Pais create(int id_pais);

	/**
	* Removes the pais with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_pais the primary key of the pais
	* @return the pais that was removed
	* @throws la.netco.generated.model.NoSuchPaisException if a pais with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.Pais remove(int id_pais)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.generated.model.NoSuchPaisException;

	public la.netco.generated.model.model.Pais updateImpl(
		la.netco.generated.model.model.Pais pais, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pais with the primary key or throws a {@link la.netco.generated.model.NoSuchPaisException} if it could not be found.
	*
	* @param id_pais the primary key of the pais
	* @return the pais
	* @throws la.netco.generated.model.NoSuchPaisException if a pais with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.Pais findByPrimaryKey(int id_pais)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.generated.model.NoSuchPaisException;

	/**
	* Returns the pais with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_pais the primary key of the pais
	* @return the pais, or <code>null</code> if a pais with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.Pais fetchByPrimaryKey(int id_pais)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the paises.
	*
	* @return the paises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<la.netco.generated.model.model.Pais> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<la.netco.generated.model.model.Pais> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<la.netco.generated.model.model.Pais> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the paises from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of paises.
	*
	* @return the number of paises
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}