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
 * This class is a wrapper for {@link TipoDocumentoLocalService}.
 * </p>
 *
 * @author    smontanez
 * @see       TipoDocumentoLocalService
 * @generated
 */
public class TipoDocumentoLocalServiceWrapper
	implements TipoDocumentoLocalService,
		ServiceWrapper<TipoDocumentoLocalService> {
	public TipoDocumentoLocalServiceWrapper(
		TipoDocumentoLocalService tipoDocumentoLocalService) {
		_tipoDocumentoLocalService = tipoDocumentoLocalService;
	}

	/**
	* Adds the tipo documento to the database. Also notifies the appropriate model listeners.
	*
	* @param tipoDocumento the tipo documento
	* @return the tipo documento that was added
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.TipoDocumento addTipoDocumento(
		la.netco.generated.model.model.TipoDocumento tipoDocumento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDocumentoLocalService.addTipoDocumento(tipoDocumento);
	}

	/**
	* Creates a new tipo documento with the primary key. Does not add the tipo documento to the database.
	*
	* @param id_tipo_doc the primary key for the new tipo documento
	* @return the new tipo documento
	*/
	public la.netco.generated.model.model.TipoDocumento createTipoDocumento(
		int id_tipo_doc) {
		return _tipoDocumentoLocalService.createTipoDocumento(id_tipo_doc);
	}

	/**
	* Deletes the tipo documento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_tipo_doc the primary key of the tipo documento
	* @return the tipo documento that was removed
	* @throws PortalException if a tipo documento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.TipoDocumento deleteTipoDocumento(
		int id_tipo_doc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tipoDocumentoLocalService.deleteTipoDocumento(id_tipo_doc);
	}

	/**
	* Deletes the tipo documento from the database. Also notifies the appropriate model listeners.
	*
	* @param tipoDocumento the tipo documento
	* @return the tipo documento that was removed
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.TipoDocumento deleteTipoDocumento(
		la.netco.generated.model.model.TipoDocumento tipoDocumento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDocumentoLocalService.deleteTipoDocumento(tipoDocumento);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tipoDocumentoLocalService.dynamicQuery();
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
		return _tipoDocumentoLocalService.dynamicQuery(dynamicQuery);
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
		return _tipoDocumentoLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _tipoDocumentoLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _tipoDocumentoLocalService.dynamicQueryCount(dynamicQuery);
	}

	public la.netco.generated.model.model.TipoDocumento fetchTipoDocumento(
		int id_tipo_doc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDocumentoLocalService.fetchTipoDocumento(id_tipo_doc);
	}

	/**
	* Returns the tipo documento with the primary key.
	*
	* @param id_tipo_doc the primary key of the tipo documento
	* @return the tipo documento
	* @throws PortalException if a tipo documento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.TipoDocumento getTipoDocumento(
		int id_tipo_doc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tipoDocumentoLocalService.getTipoDocumento(id_tipo_doc);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tipoDocumentoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tipo documentos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of tipo documentos
	* @param end the upper bound of the range of tipo documentos (not inclusive)
	* @return the range of tipo documentos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<la.netco.generated.model.model.TipoDocumento> getTipoDocumentos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDocumentoLocalService.getTipoDocumentos(start, end);
	}

	/**
	* Returns the number of tipo documentos.
	*
	* @return the number of tipo documentos
	* @throws SystemException if a system exception occurred
	*/
	public int getTipoDocumentosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDocumentoLocalService.getTipoDocumentosCount();
	}

	/**
	* Updates the tipo documento in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tipoDocumento the tipo documento
	* @return the tipo documento that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.TipoDocumento updateTipoDocumento(
		la.netco.generated.model.model.TipoDocumento tipoDocumento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDocumentoLocalService.updateTipoDocumento(tipoDocumento);
	}

	/**
	* Updates the tipo documento in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tipoDocumento the tipo documento
	* @param merge whether to merge the tipo documento with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the tipo documento that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.generated.model.model.TipoDocumento updateTipoDocumento(
		la.netco.generated.model.model.TipoDocumento tipoDocumento,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDocumentoLocalService.updateTipoDocumento(tipoDocumento,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _tipoDocumentoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tipoDocumentoLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tipoDocumentoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TipoDocumentoLocalService getWrappedTipoDocumentoLocalService() {
		return _tipoDocumentoLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTipoDocumentoLocalService(
		TipoDocumentoLocalService tipoDocumentoLocalService) {
		_tipoDocumentoLocalService = tipoDocumentoLocalService;
	}

	public TipoDocumentoLocalService getWrappedService() {
		return _tipoDocumentoLocalService;
	}

	public void setWrappedService(
		TipoDocumentoLocalService tipoDocumentoLocalService) {
		_tipoDocumentoLocalService = tipoDocumentoLocalService;
	}

	private TipoDocumentoLocalService _tipoDocumentoLocalService;
}