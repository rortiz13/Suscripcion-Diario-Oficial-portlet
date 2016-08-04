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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the suscripcion local service. This utility wraps {@link la.netco.generated.model.service.impl.SuscripcionLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author smontanez
 * @see SuscripcionLocalService
 * @see la.netco.generated.model.service.base.SuscripcionLocalServiceBaseImpl
 * @see la.netco.generated.model.service.impl.SuscripcionLocalServiceImpl
 * @generated
 */
public class SuscripcionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link la.netco.generated.model.service.impl.SuscripcionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the suscripcion to the database. Also notifies the appropriate model listeners.
	*
	* @param suscripcion the suscripcion
	* @return the suscripcion that was added
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.generated.model.model.Suscripcion addSuscripcion(
		la.netco.generated.model.model.Suscripcion suscripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSuscripcion(suscripcion);
	}

	/**
	* Creates a new suscripcion with the primary key. Does not add the suscripcion to the database.
	*
	* @param id_suscripcion the primary key for the new suscripcion
	* @return the new suscripcion
	*/
	public static la.netco.generated.model.model.Suscripcion createSuscripcion(
		int id_suscripcion) {
		return getService().createSuscripcion(id_suscripcion);
	}

	/**
	* Deletes the suscripcion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_suscripcion the primary key of the suscripcion
	* @return the suscripcion that was removed
	* @throws PortalException if a suscripcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.generated.model.model.Suscripcion deleteSuscripcion(
		int id_suscripcion)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSuscripcion(id_suscripcion);
	}

	/**
	* Deletes the suscripcion from the database. Also notifies the appropriate model listeners.
	*
	* @param suscripcion the suscripcion
	* @return the suscripcion that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.generated.model.model.Suscripcion deleteSuscripcion(
		la.netco.generated.model.model.Suscripcion suscripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSuscripcion(suscripcion);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static la.netco.generated.model.model.Suscripcion fetchSuscripcion(
		int id_suscripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchSuscripcion(id_suscripcion);
	}

	/**
	* Returns the suscripcion with the primary key.
	*
	* @param id_suscripcion the primary key of the suscripcion
	* @return the suscripcion
	* @throws PortalException if a suscripcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.generated.model.model.Suscripcion getSuscripcion(
		int id_suscripcion)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSuscripcion(id_suscripcion);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<la.netco.generated.model.model.Suscripcion> getSuscripcions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSuscripcions(start, end);
	}

	/**
	* Returns the number of suscripcions.
	*
	* @return the number of suscripcions
	* @throws SystemException if a system exception occurred
	*/
	public static int getSuscripcionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSuscripcionsCount();
	}

	/**
	* Updates the suscripcion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param suscripcion the suscripcion
	* @return the suscripcion that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.generated.model.model.Suscripcion updateSuscripcion(
		la.netco.generated.model.model.Suscripcion suscripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSuscripcion(suscripcion);
	}

	/**
	* Updates the suscripcion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param suscripcion the suscripcion
	* @param merge whether to merge the suscripcion with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the suscripcion that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.generated.model.model.Suscripcion updateSuscripcion(
		la.netco.generated.model.model.Suscripcion suscripcion, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSuscripcion(suscripcion, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static la.netco.generated.model.model.Suscripcion findBydepartamento(
		java.lang.String num_documento)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.generated.model.NoSuchSuscripcionException {
		return getService().findBydepartamento(num_documento);
	}

	public static void clearService() {
		_service = null;
	}

	public static SuscripcionLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SuscripcionLocalService.class.getName());

			if (invokableLocalService instanceof SuscripcionLocalService) {
				_service = (SuscripcionLocalService)invokableLocalService;
			}
			else {
				_service = new SuscripcionLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(SuscripcionLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(SuscripcionLocalService service) {
	}

	private static SuscripcionLocalService _service;
}