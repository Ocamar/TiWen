package com.surwing.service.persistence;

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
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.surwing.NoSuchTemperatureException;

import com.surwing.model.Temperature;
import com.surwing.model.impl.TemperatureImpl;
import com.surwing.model.impl.TemperatureModelImpl;

import com.surwing.service.persistence.TemperaturePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the temperature service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see TemperaturePersistence
 * @see TemperatureUtil
 * @generated
 */
public class TemperaturePersistenceImpl extends BasePersistenceImpl<Temperature>
    implements TemperaturePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link TemperatureUtil} to access the temperature persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = TemperatureImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
            TemperatureModelImpl.FINDER_CACHE_ENABLED, TemperatureImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
            TemperatureModelImpl.FINDER_CACHE_ENABLED, TemperatureImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
            TemperatureModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_TEMPERATURE = "SELECT temperature FROM Temperature temperature";
    private static final String _SQL_COUNT_TEMPERATURE = "SELECT COUNT(temperature) FROM Temperature temperature";
    private static final String _ORDER_BY_ENTITY_ALIAS = "temperature.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Temperature exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(TemperaturePersistenceImpl.class);
    private static Temperature _nullTemperature = new TemperatureImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Temperature> toCacheModel() {
                return _nullTemperatureCacheModel;
            }
        };

    private static CacheModel<Temperature> _nullTemperatureCacheModel = new CacheModel<Temperature>() {
            @Override
            public Temperature toEntityModel() {
                return _nullTemperature;
            }
        };

    public TemperaturePersistenceImpl() {
        setModelClass(Temperature.class);
    }

    /**
     * Caches the temperature in the entity cache if it is enabled.
     *
     * @param temperature the temperature
     */
    @Override
    public void cacheResult(Temperature temperature) {
        EntityCacheUtil.putResult(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
            TemperatureImpl.class, temperature.getPrimaryKey(), temperature);

        temperature.resetOriginalValues();
    }

    /**
     * Caches the temperatures in the entity cache if it is enabled.
     *
     * @param temperatures the temperatures
     */
    @Override
    public void cacheResult(List<Temperature> temperatures) {
        for (Temperature temperature : temperatures) {
            if (EntityCacheUtil.getResult(
                        TemperatureModelImpl.ENTITY_CACHE_ENABLED,
                        TemperatureImpl.class, temperature.getPrimaryKey()) == null) {
                cacheResult(temperature);
            } else {
                temperature.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all temperatures.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(TemperatureImpl.class.getName());
        }

        EntityCacheUtil.clearCache(TemperatureImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the temperature.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Temperature temperature) {
        EntityCacheUtil.removeResult(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
            TemperatureImpl.class, temperature.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Temperature> temperatures) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Temperature temperature : temperatures) {
            EntityCacheUtil.removeResult(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
                TemperatureImpl.class, temperature.getPrimaryKey());
        }
    }

    /**
     * Creates a new temperature with the primary key. Does not add the temperature to the database.
     *
     * @param temperatureId the primary key for the new temperature
     * @return the new temperature
     */
    @Override
    public Temperature create(long temperatureId) {
        Temperature temperature = new TemperatureImpl();

        temperature.setNew(true);
        temperature.setPrimaryKey(temperatureId);

        return temperature;
    }

    /**
     * Removes the temperature with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param temperatureId the primary key of the temperature
     * @return the temperature that was removed
     * @throws com.surwing.NoSuchTemperatureException if a temperature with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Temperature remove(long temperatureId)
        throws NoSuchTemperatureException, SystemException {
        return remove((Serializable) temperatureId);
    }

    /**
     * Removes the temperature with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the temperature
     * @return the temperature that was removed
     * @throws com.surwing.NoSuchTemperatureException if a temperature with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Temperature remove(Serializable primaryKey)
        throws NoSuchTemperatureException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Temperature temperature = (Temperature) session.get(TemperatureImpl.class,
                    primaryKey);

            if (temperature == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTemperatureException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(temperature);
        } catch (NoSuchTemperatureException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Temperature removeImpl(Temperature temperature)
        throws SystemException {
        temperature = toUnwrappedModel(temperature);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(temperature)) {
                temperature = (Temperature) session.get(TemperatureImpl.class,
                        temperature.getPrimaryKeyObj());
            }

            if (temperature != null) {
                session.delete(temperature);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (temperature != null) {
            clearCache(temperature);
        }

        return temperature;
    }

    @Override
    public Temperature updateImpl(com.surwing.model.Temperature temperature)
        throws SystemException {
        temperature = toUnwrappedModel(temperature);

        boolean isNew = temperature.isNew();

        Session session = null;

        try {
            session = openSession();

            if (temperature.isNew()) {
                session.save(temperature);

                temperature.setNew(false);
            } else {
                session.merge(temperature);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
            TemperatureImpl.class, temperature.getPrimaryKey(), temperature);

        return temperature;
    }

    protected Temperature toUnwrappedModel(Temperature temperature) {
        if (temperature instanceof TemperatureImpl) {
            return temperature;
        }

        TemperatureImpl temperatureImpl = new TemperatureImpl();

        temperatureImpl.setNew(temperature.isNew());
        temperatureImpl.setPrimaryKey(temperature.getPrimaryKey());

        temperatureImpl.setTemperatureId(temperature.getTemperatureId());
        temperatureImpl.setPatientId(temperature.getPatientId());
        temperatureImpl.setTemperature(temperature.getTemperature());
        temperatureImpl.setCreateDate(temperature.getCreateDate());

        return temperatureImpl;
    }

    /**
     * Returns the temperature with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the temperature
     * @return the temperature
     * @throws com.surwing.NoSuchTemperatureException if a temperature with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Temperature findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTemperatureException, SystemException {
        Temperature temperature = fetchByPrimaryKey(primaryKey);

        if (temperature == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTemperatureException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return temperature;
    }

    /**
     * Returns the temperature with the primary key or throws a {@link com.surwing.NoSuchTemperatureException} if it could not be found.
     *
     * @param temperatureId the primary key of the temperature
     * @return the temperature
     * @throws com.surwing.NoSuchTemperatureException if a temperature with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Temperature findByPrimaryKey(long temperatureId)
        throws NoSuchTemperatureException, SystemException {
        return findByPrimaryKey((Serializable) temperatureId);
    }

    /**
     * Returns the temperature with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the temperature
     * @return the temperature, or <code>null</code> if a temperature with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Temperature fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Temperature temperature = (Temperature) EntityCacheUtil.getResult(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
                TemperatureImpl.class, primaryKey);

        if (temperature == _nullTemperature) {
            return null;
        }

        if (temperature == null) {
            Session session = null;

            try {
                session = openSession();

                temperature = (Temperature) session.get(TemperatureImpl.class,
                        primaryKey);

                if (temperature != null) {
                    cacheResult(temperature);
                } else {
                    EntityCacheUtil.putResult(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
                        TemperatureImpl.class, primaryKey, _nullTemperature);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
                    TemperatureImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return temperature;
    }

    /**
     * Returns the temperature with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param temperatureId the primary key of the temperature
     * @return the temperature, or <code>null</code> if a temperature with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Temperature fetchByPrimaryKey(long temperatureId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) temperatureId);
    }

    /**
     * Returns all the temperatures.
     *
     * @return the temperatures
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Temperature> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the temperatures.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of temperatures
     * @param end the upper bound of the range of temperatures (not inclusive)
     * @return the range of temperatures
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Temperature> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the temperatures.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of temperatures
     * @param end the upper bound of the range of temperatures (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of temperatures
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Temperature> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Temperature> list = (List<Temperature>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_TEMPERATURE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_TEMPERATURE;

                if (pagination) {
                    sql = sql.concat(TemperatureModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Temperature>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Temperature>(list);
                } else {
                    list = (List<Temperature>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the temperatures from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Temperature temperature : findAll()) {
            remove(temperature);
        }
    }

    /**
     * Returns the number of temperatures.
     *
     * @return the number of temperatures
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_TEMPERATURE);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the temperature persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.surwing.model.Temperature")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Temperature>> listenersList = new ArrayList<ModelListener<Temperature>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Temperature>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(TemperatureImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
