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

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import la.netco.generated.model.NoSuchSuscripcionException;
import la.netco.generated.model.model.Suscripcion;
import la.netco.generated.model.model.impl.SuscripcionImpl;
import la.netco.generated.model.model.impl.SuscripcionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the suscripcion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author smontanez
 * @see SuscripcionPersistence
 * @see SuscripcionUtil
 * @generated
 */
public class SuscripcionPersistenceImpl extends BasePersistenceImpl<Suscripcion>
	implements SuscripcionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SuscripcionUtil} to access the suscripcion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SuscripcionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_DOCUMENTO = new FinderPath(SuscripcionModelImpl.ENTITY_CACHE_ENABLED,
			SuscripcionModelImpl.FINDER_CACHE_ENABLED, SuscripcionImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByDocumento",
			new String[] { String.class.getName() },
			SuscripcionModelImpl.NUM_DOCUMENTO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTO = new FinderPath(SuscripcionModelImpl.ENTITY_CACHE_ENABLED,
			SuscripcionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDocumento",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SuscripcionModelImpl.ENTITY_CACHE_ENABLED,
			SuscripcionModelImpl.FINDER_CACHE_ENABLED, SuscripcionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SuscripcionModelImpl.ENTITY_CACHE_ENABLED,
			SuscripcionModelImpl.FINDER_CACHE_ENABLED, SuscripcionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SuscripcionModelImpl.ENTITY_CACHE_ENABLED,
			SuscripcionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the suscripcion in the entity cache if it is enabled.
	 *
	 * @param suscripcion the suscripcion
	 */
	public void cacheResult(Suscripcion suscripcion) {
		EntityCacheUtil.putResult(SuscripcionModelImpl.ENTITY_CACHE_ENABLED,
			SuscripcionImpl.class, suscripcion.getPrimaryKey(), suscripcion);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTO,
			new Object[] { suscripcion.getNum_documento() }, suscripcion);

		suscripcion.resetOriginalValues();
	}

	/**
	 * Caches the suscripcions in the entity cache if it is enabled.
	 *
	 * @param suscripcions the suscripcions
	 */
	public void cacheResult(List<Suscripcion> suscripcions) {
		for (Suscripcion suscripcion : suscripcions) {
			if (EntityCacheUtil.getResult(
						SuscripcionModelImpl.ENTITY_CACHE_ENABLED,
						SuscripcionImpl.class, suscripcion.getPrimaryKey()) == null) {
				cacheResult(suscripcion);
			}
			else {
				suscripcion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all suscripcions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SuscripcionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SuscripcionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the suscripcion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Suscripcion suscripcion) {
		EntityCacheUtil.removeResult(SuscripcionModelImpl.ENTITY_CACHE_ENABLED,
			SuscripcionImpl.class, suscripcion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(suscripcion);
	}

	@Override
	public void clearCache(List<Suscripcion> suscripcions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Suscripcion suscripcion : suscripcions) {
			EntityCacheUtil.removeResult(SuscripcionModelImpl.ENTITY_CACHE_ENABLED,
				SuscripcionImpl.class, suscripcion.getPrimaryKey());

			clearUniqueFindersCache(suscripcion);
		}
	}

	protected void clearUniqueFindersCache(Suscripcion suscripcion) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTO,
			new Object[] { suscripcion.getNum_documento() });
	}

	/**
	 * Creates a new suscripcion with the primary key. Does not add the suscripcion to the database.
	 *
	 * @param id_suscripcion the primary key for the new suscripcion
	 * @return the new suscripcion
	 */
	public Suscripcion create(int id_suscripcion) {
		Suscripcion suscripcion = new SuscripcionImpl();

		suscripcion.setNew(true);
		suscripcion.setPrimaryKey(id_suscripcion);

		return suscripcion;
	}

	/**
	 * Removes the suscripcion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id_suscripcion the primary key of the suscripcion
	 * @return the suscripcion that was removed
	 * @throws la.netco.generated.model.NoSuchSuscripcionException if a suscripcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Suscripcion remove(int id_suscripcion)
		throws NoSuchSuscripcionException, SystemException {
		return remove(Integer.valueOf(id_suscripcion));
	}

	/**
	 * Removes the suscripcion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the suscripcion
	 * @return the suscripcion that was removed
	 * @throws la.netco.generated.model.NoSuchSuscripcionException if a suscripcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Suscripcion remove(Serializable primaryKey)
		throws NoSuchSuscripcionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Suscripcion suscripcion = (Suscripcion)session.get(SuscripcionImpl.class,
					primaryKey);

			if (suscripcion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSuscripcionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(suscripcion);
		}
		catch (NoSuchSuscripcionException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Suscripcion removeImpl(Suscripcion suscripcion)
		throws SystemException {
		suscripcion = toUnwrappedModel(suscripcion);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, suscripcion);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(suscripcion);

		return suscripcion;
	}

	@Override
	public Suscripcion updateImpl(
		la.netco.generated.model.model.Suscripcion suscripcion, boolean merge)
		throws SystemException {
		suscripcion = toUnwrappedModel(suscripcion);

		boolean isNew = suscripcion.isNew();

		SuscripcionModelImpl suscripcionModelImpl = (SuscripcionModelImpl)suscripcion;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, suscripcion, merge);

			suscripcion.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SuscripcionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(SuscripcionModelImpl.ENTITY_CACHE_ENABLED,
			SuscripcionImpl.class, suscripcion.getPrimaryKey(), suscripcion);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTO,
				new Object[] { suscripcion.getNum_documento() }, suscripcion);
		}
		else {
			if ((suscripcionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DOCUMENTO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						suscripcionModelImpl.getOriginalNum_documento()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTO,
					args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTO,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTO,
					new Object[] { suscripcion.getNum_documento() }, suscripcion);
			}
		}

		return suscripcion;
	}

	protected Suscripcion toUnwrappedModel(Suscripcion suscripcion) {
		if (suscripcion instanceof SuscripcionImpl) {
			return suscripcion;
		}

		SuscripcionImpl suscripcionImpl = new SuscripcionImpl();

		suscripcionImpl.setNew(suscripcion.isNew());
		suscripcionImpl.setPrimaryKey(suscripcion.getPrimaryKey());

		suscripcionImpl.setId_suscripcion(suscripcion.getId_suscripcion());
		suscripcionImpl.setNombres(suscripcion.getNombres());
		suscripcionImpl.setId_tipo_doc(suscripcion.getId_tipo_doc());
		suscripcionImpl.setNum_documento(suscripcion.getNum_documento());
		suscripcionImpl.setEmail(suscripcion.getEmail());
		suscripcionImpl.setDireccion(suscripcion.getDireccion());
		suscripcionImpl.setTelefono(suscripcion.getTelefono());
		suscripcionImpl.setId_ciudad(suscripcion.getId_ciudad());
		suscripcionImpl.setNombres_contacto(suscripcion.getNombres_contacto());
		suscripcionImpl.setTelefono_contacto(suscripcion.getTelefono_contacto());
		suscripcionImpl.setMedio(suscripcion.getMedio());
		suscripcionImpl.setTipo(suscripcion.getTipo());
		suscripcionImpl.setEstado_pago(suscripcion.getEstado_pago());
		suscripcionImpl.setValor_pagado(suscripcion.getValor_pagado());
		suscripcionImpl.setTipo_persona(suscripcion.getTipo_persona());

		return suscripcionImpl;
	}

	/**
	 * Returns the suscripcion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the suscripcion
	 * @return the suscripcion
	 * @throws com.liferay.portal.NoSuchModelException if a suscripcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Suscripcion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the suscripcion with the primary key or throws a {@link la.netco.generated.model.NoSuchSuscripcionException} if it could not be found.
	 *
	 * @param id_suscripcion the primary key of the suscripcion
	 * @return the suscripcion
	 * @throws la.netco.generated.model.NoSuchSuscripcionException if a suscripcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Suscripcion findByPrimaryKey(int id_suscripcion)
		throws NoSuchSuscripcionException, SystemException {
		Suscripcion suscripcion = fetchByPrimaryKey(id_suscripcion);

		if (suscripcion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id_suscripcion);
			}

			throw new NoSuchSuscripcionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id_suscripcion);
		}

		return suscripcion;
	}

	/**
	 * Returns the suscripcion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the suscripcion
	 * @return the suscripcion, or <code>null</code> if a suscripcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Suscripcion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the suscripcion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id_suscripcion the primary key of the suscripcion
	 * @return the suscripcion, or <code>null</code> if a suscripcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Suscripcion fetchByPrimaryKey(int id_suscripcion)
		throws SystemException {
		Suscripcion suscripcion = (Suscripcion)EntityCacheUtil.getResult(SuscripcionModelImpl.ENTITY_CACHE_ENABLED,
				SuscripcionImpl.class, id_suscripcion);

		if (suscripcion == _nullSuscripcion) {
			return null;
		}

		if (suscripcion == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				suscripcion = (Suscripcion)session.get(SuscripcionImpl.class,
						Integer.valueOf(id_suscripcion));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (suscripcion != null) {
					cacheResult(suscripcion);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(SuscripcionModelImpl.ENTITY_CACHE_ENABLED,
						SuscripcionImpl.class, id_suscripcion, _nullSuscripcion);
				}

				closeSession(session);
			}
		}

		return suscripcion;
	}

	/**
	 * Returns the suscripcion where num_documento = &#63; or throws a {@link la.netco.generated.model.NoSuchSuscripcionException} if it could not be found.
	 *
	 * @param num_documento the num_documento
	 * @return the matching suscripcion
	 * @throws la.netco.generated.model.NoSuchSuscripcionException if a matching suscripcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Suscripcion findByDocumento(String num_documento)
		throws NoSuchSuscripcionException, SystemException {
		Suscripcion suscripcion = fetchByDocumento(num_documento);

		if (suscripcion == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("num_documento=");
			msg.append(num_documento);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchSuscripcionException(msg.toString());
		}

		return suscripcion;
	}

	/**
	 * Returns the suscripcion where num_documento = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param num_documento the num_documento
	 * @return the matching suscripcion, or <code>null</code> if a matching suscripcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Suscripcion fetchByDocumento(String num_documento)
		throws SystemException {
		return fetchByDocumento(num_documento, true);
	}

	/**
	 * Returns the suscripcion where num_documento = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param num_documento the num_documento
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching suscripcion, or <code>null</code> if a matching suscripcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Suscripcion fetchByDocumento(String num_documento,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { num_documento };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DOCUMENTO,
					finderArgs, this);
		}

		if (result instanceof Suscripcion) {
			Suscripcion suscripcion = (Suscripcion)result;

			if (!Validator.equals(num_documento, suscripcion.getNum_documento())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_SELECT_SUSCRIPCION_WHERE);

			if (num_documento == null) {
				query.append(_FINDER_COLUMN_DOCUMENTO_NUM_DOCUMENTO_1);
			}
			else {
				if (num_documento.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTO_NUM_DOCUMENTO_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTO_NUM_DOCUMENTO_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (num_documento != null) {
					qPos.add(num_documento);
				}

				List<Suscripcion> list = q.list();

				result = list;

				Suscripcion suscripcion = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTO,
						finderArgs, list);
				}
				else {
					suscripcion = list.get(0);

					cacheResult(suscripcion);

					if ((suscripcion.getNum_documento() == null) ||
							!suscripcion.getNum_documento().equals(num_documento)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTO,
							finderArgs, suscripcion);
					}
				}

				return suscripcion;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTO,
						finderArgs);
				}

				closeSession(session);
			}
		}
		else {
			if (result instanceof List<?>) {
				return null;
			}
			else {
				return (Suscripcion)result;
			}
		}
	}

	/**
	 * Returns all the suscripcions.
	 *
	 * @return the suscripcions
	 * @throws SystemException if a system exception occurred
	 */
	public List<Suscripcion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Suscripcion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	public List<Suscripcion> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Suscripcion> list = (List<Suscripcion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SUSCRIPCION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SUSCRIPCION;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Suscripcion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Suscripcion>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes the suscripcion where num_documento = &#63; from the database.
	 *
	 * @param num_documento the num_documento
	 * @return the suscripcion that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public Suscripcion removeByDocumento(String num_documento)
		throws NoSuchSuscripcionException, SystemException {
		Suscripcion suscripcion = findByDocumento(num_documento);

		return remove(suscripcion);
	}

	/**
	 * Removes all the suscripcions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Suscripcion suscripcion : findAll()) {
			remove(suscripcion);
		}
	}

	/**
	 * Returns the number of suscripcions where num_documento = &#63;.
	 *
	 * @param num_documento the num_documento
	 * @return the number of matching suscripcions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumento(String num_documento) throws SystemException {
		Object[] finderArgs = new Object[] { num_documento };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTO,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SUSCRIPCION_WHERE);

			if (num_documento == null) {
				query.append(_FINDER_COLUMN_DOCUMENTO_NUM_DOCUMENTO_1);
			}
			else {
				if (num_documento.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTO_NUM_DOCUMENTO_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTO_NUM_DOCUMENTO_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (num_documento != null) {
					qPos.add(num_documento);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTO,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of suscripcions.
	 *
	 * @return the number of suscripcions
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SUSCRIPCION);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the suscripcion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.la.netco.generated.model.model.Suscripcion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Suscripcion>> listenersList = new ArrayList<ModelListener<Suscripcion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Suscripcion>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(SuscripcionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = CiudadPersistence.class)
	protected CiudadPersistence ciudadPersistence;
	@BeanReference(type = DepartamentoPersistence.class)
	protected DepartamentoPersistence departamentoPersistence;
	@BeanReference(type = PaisPersistence.class)
	protected PaisPersistence paisPersistence;
	@BeanReference(type = SuscripcionPersistence.class)
	protected SuscripcionPersistence suscripcionPersistence;
	@BeanReference(type = TipoDocumentoPersistence.class)
	protected TipoDocumentoPersistence tipoDocumentoPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_SUSCRIPCION = "SELECT suscripcion FROM Suscripcion suscripcion";
	private static final String _SQL_SELECT_SUSCRIPCION_WHERE = "SELECT suscripcion FROM Suscripcion suscripcion WHERE ";
	private static final String _SQL_COUNT_SUSCRIPCION = "SELECT COUNT(suscripcion) FROM Suscripcion suscripcion";
	private static final String _SQL_COUNT_SUSCRIPCION_WHERE = "SELECT COUNT(suscripcion) FROM Suscripcion suscripcion WHERE ";
	private static final String _FINDER_COLUMN_DOCUMENTO_NUM_DOCUMENTO_1 = "suscripcion.num_documento IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTO_NUM_DOCUMENTO_2 = "suscripcion.num_documento = ?";
	private static final String _FINDER_COLUMN_DOCUMENTO_NUM_DOCUMENTO_3 = "(suscripcion.num_documento IS NULL OR suscripcion.num_documento = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "suscripcion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Suscripcion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Suscripcion exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SuscripcionPersistenceImpl.class);
	private static Suscripcion _nullSuscripcion = new SuscripcionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Suscripcion> toCacheModel() {
				return _nullSuscripcionCacheModel;
			}
		};

	private static CacheModel<Suscripcion> _nullSuscripcionCacheModel = new CacheModel<Suscripcion>() {
			public Suscripcion toEntityModel() {
				return _nullSuscripcion;
			}
		};
}