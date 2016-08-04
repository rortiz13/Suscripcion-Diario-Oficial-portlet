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

package la.netco.generated.model.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link SuscripcionLocalService}.
 * </p>
 *
 * @author    smontanez
 * @see       SuscripcionLocalService
 * @generated
 */
public class SuscripcionLocalServiceWrapper implements SuscripcionLocalService,
	ServiceWrapper<SuscripcionLocalService> {
	public SuscripcionLocalServiceWrapper(
		SuscripcionLocalService suscripcionLocalService) {
		_suscripcionLocalService = suscripcionLocalService;
	}

	/**
	* Adds the suscripcion to the database. Also notifies the appropriate model listeners.
	*
	* @param suscripcion the suscripcion
	* @return the suscripcion that was added
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.Suscripcion addSuscripcion(
		la.netco.generated.model.model.Suscripcion suscripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suscripcionLocalService.addSuscripcion(suscripcion);
	}

	/**
	* Creates a new suscripcion with the primary key. Does not add the suscripcion to the database.
	*
	* @param id_suscripcion the primary key for the new suscripcion
	* @return the new suscripcion
	*/
	public la.netco.generated.model.model.Suscripcion createSuscripcion(
		int id_suscripcion) {
		return _suscripcionLocalService.createSuscripcion(id_suscripcion);
	}

	/**
	* Deletes the suscripcion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_suscripcion the primary key of the suscripcion
	* @return the suscripcion that was removed
	* @throws PortalException if a suscripcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.Suscripcion deleteSuscripcion(
		int id_suscripcion)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _suscripcionLocalService.deleteSuscripcion(id_suscripcion);
	}

	/**
	* Deletes the suscripcion from the database. Also notifies the appropriate model listeners.
	*
	* @param suscripcion the suscripcion
	* @return the suscripcion that was removed
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.Suscripcion deleteSuscripcion(
		la.netco.generated.model.model.Suscripcion suscripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suscripcionLocalService.deleteSuscripcion(suscripcion);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _suscripcionLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suscripcionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _suscripcionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suscripcionLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suscripcionLocalService.dynamicQueryCount(dynamicQuery);
	}

	public la.netco.generated.model.model.Suscripcion fetchSuscripcion(
		int id_suscripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suscripcionLocalService.fetchSuscripcion(id_suscripcion);
	}

	/**
	* Returns the suscripcion with the primary key.
	*
	* @param id_suscripcion the primary key of the suscripcion
	* @return the suscripcion
	* @throws PortalException if a suscripcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.Suscripcion getSuscripcion(
		int id_suscripcion)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _suscripcionLocalService.getSuscripcion(id_suscripcion);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _suscripcionLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<la.netco.generated.model.model.Suscripcion> getSuscripcions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suscripcionLocalService.getSuscripcions(start, end);
	}

	/**
	* Returns the number of suscripcions.
	*
	* @return the number of suscripcions
	* @throws SystemException if a system exception occurred
	*/
	public int getSuscripcionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suscripcionLocalService.getSuscripcionsCount();
	}

	/**
	* Updates the suscripcion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param suscripcion the suscripcion
	* @return the suscripcion that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.Suscripcion updateSuscripcion(
		la.netco.generated.model.model.Suscripcion suscripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suscripcionLocalService.updateSuscripcion(suscripcion);
	}

	/**
	* Updates the suscripcion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param suscripcion the suscripcion
	* @param merge whether to merge the suscripcion with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the suscripcion that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.Suscripcion updateSuscripcion(
		la.netco.generated.model.model.Suscripcion suscripcion, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suscripcionLocalService.updateSuscripcion(suscripcion, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _suscripcionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_suscripcionLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _suscripcionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public la.netco.generated.model.model.Suscripcion findBydepartamento(
		java.lang.String num_documento)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.generated.model.NoSuchSuscripcionException {
		return _suscripcionLocalService.findBydepartamento(num_documento);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SuscripcionLocalService getWrappedSuscripcionLocalService() {
		return _suscripcionLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSuscripcionLocalService(
		SuscripcionLocalService suscripcionLocalService) {
		_suscripcionLocalService = suscripcionLocalService;
	}

	public SuscripcionLocalService getWrappedService() {
		return _suscripcionLocalService;
	}

	public void setWrappedService(
		SuscripcionLocalService suscripcionLocalService) {
		_suscripcionLocalService = suscripcionLocalService;
	}

	private SuscripcionLocalService _suscripcionLocalService;
}