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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import la.netco.generated.model.NoSuchPaisException;
import la.netco.generated.model.model.Pais;
import la.netco.generated.model.model.impl.PaisImpl;
import la.netco.generated.model.model.impl.PaisModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the pais service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author smontanez
 * @see PaisPersistence
 * @see PaisUtil
 * @generated
 */
public class PaisPersistenceImpl extends BasePersistenceImpl<Pais>
	implements PaisPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PaisUtil} to access the pais persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PaisImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaisModelImpl.ENTITY_CACHE_ENABLED,
			PaisModelImpl.FINDER_CACHE_ENABLED, PaisImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaisModelImpl.ENTITY_CACHE_ENABLED,
			PaisModelImpl.FINDER_CACHE_ENABLED, PaisImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaisModelImpl.ENTITY_CACHE_ENABLED,
			PaisModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the pais in the entity cache if it is enabled.
	 *
	 * @param pais the pais
	 */
	public void cacheResult(Pais pais) {
		EntityCacheUtil.putResult(PaisModelImpl.ENTITY_CACHE_ENABLED,
			PaisImpl.class, pais.getPrimaryKey(), pais);

		pais.resetOriginalValues();
	}

	/**
	 * Caches the paises in the entity cache if it is enabled.
	 *
	 * @param paises the paises
	 */
	public void cacheResult(List<Pais> paises) {
		for (Pais pais : paises) {
			if (EntityCacheUtil.getResult(PaisModelImpl.ENTITY_CACHE_ENABLED,
						PaisImpl.class, pais.getPrimaryKey()) == null) {
				cacheResult(pais);
			}
			else {
				pais.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all paises.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PaisImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PaisImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the pais.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Pais pais) {
		EntityCacheUtil.removeResult(PaisModelImpl.ENTITY_CACHE_ENABLED,
			PaisImpl.class, pais.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Pais> paises) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Pais pais : paises) {
			EntityCacheUtil.removeResult(PaisModelImpl.ENTITY_CACHE_ENABLED,
				PaisImpl.class, pais.getPrimaryKey());
		}
	}

	/**
	 * Creates a new pais with the primary key. Does not add the pais to the database.
	 *
	 * @param id_pais the primary key for the new pais
	 * @return the new pais
	 */
	public Pais create(int id_pais) {
		Pais pais = new PaisImpl();

		pais.setNew(true);
		pais.setPrimaryKey(id_pais);

		return pais;
	}

	/**
	 * Removes the pais with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id_pais the primary key of the pais
	 * @return the pais that was removed
	 * @throws la.netco.generated.model.NoSuchPaisException if a pais with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Pais remove(int id_pais) throws NoSuchPaisException, SystemException {
		return remove(Integer.valueOf(id_pais));
	}

	/**
	 * Removes the pais with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pais
	 * @return the pais that was removed
	 * @throws la.netco.generated.model.NoSuchPaisException if a pais with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pais remove(Serializable primaryKey)
		throws NoSuchPaisException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Pais pais = (Pais)session.get(PaisImpl.class, primaryKey);

			if (pais == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPaisException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(pais);
		}
		catch (NoSuchPaisException nsee) {
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
	protected Pais removeImpl(Pais pais) throws SystemException {
		pais = toUnwrappedModel(pais);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, pais);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(pais);

		return pais;
	}

	@Override
	public Pais updateImpl(la.netco.generated.model.model.Pais pais,
		boolean merge) throws SystemException {
		pais = toUnwrappedModel(pais);

		boolean isNew = pais.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, pais, merge);

			pais.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(PaisModelImpl.ENTITY_CACHE_ENABLED,
			PaisImpl.class, pais.getPrimaryKey(), pais);

		return pais;
	}

	protected Pais toUnwrappedModel(Pais pais) {
		if (pais instanceof PaisImpl) {
			return pais;
		}

		PaisImpl paisImpl = new PaisImpl();

		paisImpl.setNew(pais.isNew());
		paisImpl.setPrimaryKey(pais.getPrimaryKey());

		paisImpl.setId_pais(pais.getId_pais());
		paisImpl.setNombre(pais.getNombre());

		return paisImpl;
	}

	/**
	 * Returns the pais with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the pais
	 * @return the pais
	 * @throws com.liferay.portal.NoSuchModelException if a pais with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pais findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the pais with the primary key or throws a {@link la.netco.generated.model.NoSuchPaisException} if it could not be found.
	 *
	 * @param id_pais the primary key of the pais
	 * @return the pais
	 * @throws la.netco.generated.model.NoSuchPaisException if a pais with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Pais findByPrimaryKey(int id_pais)
		throws NoSuchPaisException, SystemException {
		Pais pais = fetchByPrimaryKey(id_pais);

		if (pais == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id_pais);
			}

			throw new NoSuchPaisException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id_pais);
		}

		return pais;
	}

	/**
	 * Returns the pais with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pais
	 * @return the pais, or <code>null</code> if a pais with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pais fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the pais with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id_pais the primary key of the pais
	 * @return the pais, or <code>null</code> if a pais with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Pais fetchByPrimaryKey(int id_pais) throws SystemException {
		Pais pais = (Pais)EntityCacheUtil.getResult(PaisModelImpl.ENTITY_CACHE_ENABLED,
				PaisImpl.class, id_pais);

		if (pais == _nullPais) {
			return null;
		}

		if (pais == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				pais = (Pais)session.get(PaisImpl.class,
						Integer.valueOf(id_pais));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (pais != null) {
					cacheResult(pais);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(PaisModelImpl.ENTITY_CACHE_ENABLED,
						PaisImpl.class, id_pais, _nullPais);
				}

				closeSession(session);
			}
		}

		return pais;
	}

	/**
	 * Returns all the paises.
	 *
	 * @return the paises
	 * @throws SystemException if a system exception occurred
	 */
	public List<Pais> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Pais> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	public List<Pais> findAll(int start, int end,
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

		List<Pais> list = (List<Pais>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PAIS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PAIS.concat(PaisModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Pais>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Pais>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the paises from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Pais pais : findAll()) {
			remove(pais);
		}
	}

	/**
	 * Returns the number of paises.
	 *
	 * @return the number of paises
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PAIS);

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
	 * Initializes the pais persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.la.netco.generated.model.model.Pais")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Pais>> listenersList = new ArrayList<ModelListener<Pais>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Pais>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PaisImpl.class.getName());
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
	private static final String _SQL_SELECT_PAIS = "SELECT pais FROM Pais pais";
	private static final String _SQL_COUNT_PAIS = "SELECT COUNT(pais) FROM Pais pais";
	private static final String _ORDER_BY_ENTITY_ALIAS = "pais.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Pais exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PaisPersistenceImpl.class);
	private static Pais _nullPais = new PaisImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Pais> toCacheModel() {
				return _nullPaisCacheModel;
			}
		};

	private static CacheModel<Pais> _nullPaisCacheModel = new CacheModel<Pais>() {
			public Pais toEntityModel() {
				return _nullPais;
			}
		};
}