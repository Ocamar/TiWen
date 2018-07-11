package com.surwing.service.persistence;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.surwing.NoSuchSystemParameterException;

import com.surwing.model.SystemParameter;
import com.surwing.model.impl.SystemParameterImpl;
import com.surwing.model.impl.SystemParameterModelImpl;

import com.surwing.service.persistence.SystemParameterPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the system parameter service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see SystemParameterPersistence
 * @see SystemParameterUtil
 * @generated
 */
public class SystemParameterPersistenceImpl extends BasePersistenceImpl<SystemParameter>
    implements SystemParameterPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SystemParameterUtil} to access the system parameter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SystemParameterImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SystemParameterModelImpl.ENTITY_CACHE_ENABLED,
            SystemParameterModelImpl.FINDER_CACHE_ENABLED,
            SystemParameterImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SystemParameterModelImpl.ENTITY_CACHE_ENABLED,
            SystemParameterModelImpl.FINDER_CACHE_ENABLED,
            SystemParameterImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SystemParameterModelImpl.ENTITY_CACHE_ENABLED,
            SystemParameterModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_LOCATIONIDANDKEY = new FinderPath(SystemParameterModelImpl.ENTITY_CACHE_ENABLED,
            SystemParameterModelImpl.FINDER_CACHE_ENABLED,
            SystemParameterImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByLocationIdAndKey",
            new String[] { Long.class.getName(), String.class.getName() },
            SystemParameterModelImpl.LOCATIONID_COLUMN_BITMASK |
            SystemParameterModelImpl.KEY_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_LOCATIONIDANDKEY = new FinderPath(SystemParameterModelImpl.ENTITY_CACHE_ENABLED,
            SystemParameterModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByLocationIdAndKey",
            new String[] { Long.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_LOCATIONIDANDKEY_LOCATIONID_2 = "systemParameter.locationId = ? AND ";
    private static final String _FINDER_COLUMN_LOCATIONIDANDKEY_KEY_1 = "systemParameter.key IS NULL";
    private static final String _FINDER_COLUMN_LOCATIONIDANDKEY_KEY_2 = "systemParameter.key = ?";
    private static final String _FINDER_COLUMN_LOCATIONIDANDKEY_KEY_3 = "(systemParameter.key IS NULL OR systemParameter.key = '')";
    private static final String _SQL_SELECT_SYSTEMPARAMETER = "SELECT systemParameter FROM SystemParameter systemParameter";
    private static final String _SQL_SELECT_SYSTEMPARAMETER_WHERE = "SELECT systemParameter FROM SystemParameter systemParameter WHERE ";
    private static final String _SQL_COUNT_SYSTEMPARAMETER = "SELECT COUNT(systemParameter) FROM SystemParameter systemParameter";
    private static final String _SQL_COUNT_SYSTEMPARAMETER_WHERE = "SELECT COUNT(systemParameter) FROM SystemParameter systemParameter WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "systemParameter.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SystemParameter exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SystemParameter exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(SystemParameterPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "key"
            });
    private static SystemParameter _nullSystemParameter = new SystemParameterImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<SystemParameter> toCacheModel() {
                return _nullSystemParameterCacheModel;
            }
        };

    private static CacheModel<SystemParameter> _nullSystemParameterCacheModel = new CacheModel<SystemParameter>() {
            @Override
            public SystemParameter toEntityModel() {
                return _nullSystemParameter;
            }
        };

    public SystemParameterPersistenceImpl() {
        setModelClass(SystemParameter.class);
    }

    /**
     * Returns the system parameter where locationId = &#63; and key = &#63; or throws a {@link com.surwing.NoSuchSystemParameterException} if it could not be found.
     *
     * @param locationId the location ID
     * @param key the key
     * @return the matching system parameter
     * @throws com.surwing.NoSuchSystemParameterException if a matching system parameter could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemParameter findByLocationIdAndKey(long locationId, String key)
        throws NoSuchSystemParameterException, SystemException {
        SystemParameter systemParameter = fetchByLocationIdAndKey(locationId,
                key);

        if (systemParameter == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("locationId=");
            msg.append(locationId);

            msg.append(", key=");
            msg.append(key);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchSystemParameterException(msg.toString());
        }

        return systemParameter;
    }

    /**
     * Returns the system parameter where locationId = &#63; and key = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param locationId the location ID
     * @param key the key
     * @return the matching system parameter, or <code>null</code> if a matching system parameter could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemParameter fetchByLocationIdAndKey(long locationId, String key)
        throws SystemException {
        return fetchByLocationIdAndKey(locationId, key, true);
    }

    /**
     * Returns the system parameter where locationId = &#63; and key = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param locationId the location ID
     * @param key the key
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching system parameter, or <code>null</code> if a matching system parameter could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemParameter fetchByLocationIdAndKey(long locationId, String key,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { locationId, key };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_LOCATIONIDANDKEY,
                    finderArgs, this);
        }

        if (result instanceof SystemParameter) {
            SystemParameter systemParameter = (SystemParameter) result;

            if ((locationId != systemParameter.getLocationId()) ||
                    !Validator.equals(key, systemParameter.getKey())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_SYSTEMPARAMETER_WHERE);

            query.append(_FINDER_COLUMN_LOCATIONIDANDKEY_LOCATIONID_2);

            boolean bindKey = false;

            if (key == null) {
                query.append(_FINDER_COLUMN_LOCATIONIDANDKEY_KEY_1);
            } else if (key.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_LOCATIONIDANDKEY_KEY_3);
            } else {
                bindKey = true;

                query.append(_FINDER_COLUMN_LOCATIONIDANDKEY_KEY_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(locationId);

                if (bindKey) {
                    qPos.add(key);
                }

                List<SystemParameter> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LOCATIONIDANDKEY,
                        finderArgs, list);
                } else {
                    SystemParameter systemParameter = list.get(0);

                    result = systemParameter;

                    cacheResult(systemParameter);

                    if ((systemParameter.getLocationId() != locationId) ||
                            (systemParameter.getKey() == null) ||
                            !systemParameter.getKey().equals(key)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LOCATIONIDANDKEY,
                            finderArgs, systemParameter);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_LOCATIONIDANDKEY,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (SystemParameter) result;
        }
    }

    /**
     * Removes the system parameter where locationId = &#63; and key = &#63; from the database.
     *
     * @param locationId the location ID
     * @param key the key
     * @return the system parameter that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemParameter removeByLocationIdAndKey(long locationId, String key)
        throws NoSuchSystemParameterException, SystemException {
        SystemParameter systemParameter = findByLocationIdAndKey(locationId, key);

        return remove(systemParameter);
    }

    /**
     * Returns the number of system parameters where locationId = &#63; and key = &#63;.
     *
     * @param locationId the location ID
     * @param key the key
     * @return the number of matching system parameters
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByLocationIdAndKey(long locationId, String key)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_LOCATIONIDANDKEY;

        Object[] finderArgs = new Object[] { locationId, key };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_SYSTEMPARAMETER_WHERE);

            query.append(_FINDER_COLUMN_LOCATIONIDANDKEY_LOCATIONID_2);

            boolean bindKey = false;

            if (key == null) {
                query.append(_FINDER_COLUMN_LOCATIONIDANDKEY_KEY_1);
            } else if (key.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_LOCATIONIDANDKEY_KEY_3);
            } else {
                bindKey = true;

                query.append(_FINDER_COLUMN_LOCATIONIDANDKEY_KEY_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(locationId);

                if (bindKey) {
                    qPos.add(key);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the system parameter in the entity cache if it is enabled.
     *
     * @param systemParameter the system parameter
     */
    @Override
    public void cacheResult(SystemParameter systemParameter) {
        EntityCacheUtil.putResult(SystemParameterModelImpl.ENTITY_CACHE_ENABLED,
            SystemParameterImpl.class, systemParameter.getPrimaryKey(),
            systemParameter);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LOCATIONIDANDKEY,
            new Object[] {
                systemParameter.getLocationId(), systemParameter.getKey()
            }, systemParameter);

        systemParameter.resetOriginalValues();
    }

    /**
     * Caches the system parameters in the entity cache if it is enabled.
     *
     * @param systemParameters the system parameters
     */
    @Override
    public void cacheResult(List<SystemParameter> systemParameters) {
        for (SystemParameter systemParameter : systemParameters) {
            if (EntityCacheUtil.getResult(
                        SystemParameterModelImpl.ENTITY_CACHE_ENABLED,
                        SystemParameterImpl.class,
                        systemParameter.getPrimaryKey()) == null) {
                cacheResult(systemParameter);
            } else {
                systemParameter.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all system parameters.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SystemParameterImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SystemParameterImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the system parameter.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(SystemParameter systemParameter) {
        EntityCacheUtil.removeResult(SystemParameterModelImpl.ENTITY_CACHE_ENABLED,
            SystemParameterImpl.class, systemParameter.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(systemParameter);
    }

    @Override
    public void clearCache(List<SystemParameter> systemParameters) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (SystemParameter systemParameter : systemParameters) {
            EntityCacheUtil.removeResult(SystemParameterModelImpl.ENTITY_CACHE_ENABLED,
                SystemParameterImpl.class, systemParameter.getPrimaryKey());

            clearUniqueFindersCache(systemParameter);
        }
    }

    protected void cacheUniqueFindersCache(SystemParameter systemParameter) {
        if (systemParameter.isNew()) {
            Object[] args = new Object[] {
                    systemParameter.getLocationId(), systemParameter.getKey()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_LOCATIONIDANDKEY,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LOCATIONIDANDKEY,
                args, systemParameter);
        } else {
            SystemParameterModelImpl systemParameterModelImpl = (SystemParameterModelImpl) systemParameter;

            if ((systemParameterModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_LOCATIONIDANDKEY.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        systemParameter.getLocationId(),
                        systemParameter.getKey()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_LOCATIONIDANDKEY,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LOCATIONIDANDKEY,
                    args, systemParameter);
            }
        }
    }

    protected void clearUniqueFindersCache(SystemParameter systemParameter) {
        SystemParameterModelImpl systemParameterModelImpl = (SystemParameterModelImpl) systemParameter;

        Object[] args = new Object[] {
                systemParameter.getLocationId(), systemParameter.getKey()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCATIONIDANDKEY, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_LOCATIONIDANDKEY, args);

        if ((systemParameterModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_LOCATIONIDANDKEY.getColumnBitmask()) != 0) {
            args = new Object[] {
                    systemParameterModelImpl.getOriginalLocationId(),
                    systemParameterModelImpl.getOriginalKey()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCATIONIDANDKEY,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_LOCATIONIDANDKEY,
                args);
        }
    }

    /**
     * Creates a new system parameter with the primary key. Does not add the system parameter to the database.
     *
     * @param systemParameterId the primary key for the new system parameter
     * @return the new system parameter
     */
    @Override
    public SystemParameter create(long systemParameterId) {
        SystemParameter systemParameter = new SystemParameterImpl();

        systemParameter.setNew(true);
        systemParameter.setPrimaryKey(systemParameterId);

        return systemParameter;
    }

    /**
     * Removes the system parameter with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param systemParameterId the primary key of the system parameter
     * @return the system parameter that was removed
     * @throws com.surwing.NoSuchSystemParameterException if a system parameter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemParameter remove(long systemParameterId)
        throws NoSuchSystemParameterException, SystemException {
        return remove((Serializable) systemParameterId);
    }

    /**
     * Removes the system parameter with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the system parameter
     * @return the system parameter that was removed
     * @throws com.surwing.NoSuchSystemParameterException if a system parameter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemParameter remove(Serializable primaryKey)
        throws NoSuchSystemParameterException, SystemException {
        Session session = null;

        try {
            session = openSession();

            SystemParameter systemParameter = (SystemParameter) session.get(SystemParameterImpl.class,
                    primaryKey);

            if (systemParameter == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchSystemParameterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(systemParameter);
        } catch (NoSuchSystemParameterException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected SystemParameter removeImpl(SystemParameter systemParameter)
        throws SystemException {
        systemParameter = toUnwrappedModel(systemParameter);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(systemParameter)) {
                systemParameter = (SystemParameter) session.get(SystemParameterImpl.class,
                        systemParameter.getPrimaryKeyObj());
            }

            if (systemParameter != null) {
                session.delete(systemParameter);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (systemParameter != null) {
            clearCache(systemParameter);
        }

        return systemParameter;
    }

    @Override
    public SystemParameter updateImpl(
        com.surwing.model.SystemParameter systemParameter)
        throws SystemException {
        systemParameter = toUnwrappedModel(systemParameter);

        boolean isNew = systemParameter.isNew();

        Session session = null;

        try {
            session = openSession();

            if (systemParameter.isNew()) {
                session.save(systemParameter);

                systemParameter.setNew(false);
            } else {
                session.merge(systemParameter);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !SystemParameterModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(SystemParameterModelImpl.ENTITY_CACHE_ENABLED,
            SystemParameterImpl.class, systemParameter.getPrimaryKey(),
            systemParameter);

        clearUniqueFindersCache(systemParameter);
        cacheUniqueFindersCache(systemParameter);

        return systemParameter;
    }

    protected SystemParameter toUnwrappedModel(SystemParameter systemParameter) {
        if (systemParameter instanceof SystemParameterImpl) {
            return systemParameter;
        }

        SystemParameterImpl systemParameterImpl = new SystemParameterImpl();

        systemParameterImpl.setNew(systemParameter.isNew());
        systemParameterImpl.setPrimaryKey(systemParameter.getPrimaryKey());

        systemParameterImpl.setSystemParameterId(systemParameter.getSystemParameterId());
        systemParameterImpl.setLocationId(systemParameter.getLocationId());
        systemParameterImpl.setKey(systemParameter.getKey());
        systemParameterImpl.setValue(systemParameter.getValue());

        return systemParameterImpl;
    }

    /**
     * Returns the system parameter with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the system parameter
     * @return the system parameter
     * @throws com.surwing.NoSuchSystemParameterException if a system parameter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemParameter findByPrimaryKey(Serializable primaryKey)
        throws NoSuchSystemParameterException, SystemException {
        SystemParameter systemParameter = fetchByPrimaryKey(primaryKey);

        if (systemParameter == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchSystemParameterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return systemParameter;
    }

    /**
     * Returns the system parameter with the primary key or throws a {@link com.surwing.NoSuchSystemParameterException} if it could not be found.
     *
     * @param systemParameterId the primary key of the system parameter
     * @return the system parameter
     * @throws com.surwing.NoSuchSystemParameterException if a system parameter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemParameter findByPrimaryKey(long systemParameterId)
        throws NoSuchSystemParameterException, SystemException {
        return findByPrimaryKey((Serializable) systemParameterId);
    }

    /**
     * Returns the system parameter with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the system parameter
     * @return the system parameter, or <code>null</code> if a system parameter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemParameter fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        SystemParameter systemParameter = (SystemParameter) EntityCacheUtil.getResult(SystemParameterModelImpl.ENTITY_CACHE_ENABLED,
                SystemParameterImpl.class, primaryKey);

        if (systemParameter == _nullSystemParameter) {
            return null;
        }

        if (systemParameter == null) {
            Session session = null;

            try {
                session = openSession();

                systemParameter = (SystemParameter) session.get(SystemParameterImpl.class,
                        primaryKey);

                if (systemParameter != null) {
                    cacheResult(systemParameter);
                } else {
                    EntityCacheUtil.putResult(SystemParameterModelImpl.ENTITY_CACHE_ENABLED,
                        SystemParameterImpl.class, primaryKey,
                        _nullSystemParameter);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SystemParameterModelImpl.ENTITY_CACHE_ENABLED,
                    SystemParameterImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return systemParameter;
    }

    /**
     * Returns the system parameter with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param systemParameterId the primary key of the system parameter
     * @return the system parameter, or <code>null</code> if a system parameter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemParameter fetchByPrimaryKey(long systemParameterId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) systemParameterId);
    }

    /**
     * Returns all the system parameters.
     *
     * @return the system parameters
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SystemParameter> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the system parameters.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.SystemParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of system parameters
     * @param end the upper bound of the range of system parameters (not inclusive)
     * @return the range of system parameters
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SystemParameter> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the system parameters.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.SystemParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of system parameters
     * @param end the upper bound of the range of system parameters (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of system parameters
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SystemParameter> findAll(int start, int end,
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

        List<SystemParameter> list = (List<SystemParameter>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SYSTEMPARAMETER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SYSTEMPARAMETER;

                if (pagination) {
                    sql = sql.concat(SystemParameterModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<SystemParameter>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SystemParameter>(list);
                } else {
                    list = (List<SystemParameter>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Removes all the system parameters from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (SystemParameter systemParameter : findAll()) {
            remove(systemParameter);
        }
    }

    /**
     * Returns the number of system parameters.
     *
     * @return the number of system parameters
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

                Query q = session.createQuery(_SQL_COUNT_SYSTEMPARAMETER);

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

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the system parameter persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.surwing.model.SystemParameter")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<SystemParameter>> listenersList = new ArrayList<ModelListener<SystemParameter>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<SystemParameter>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SystemParameterImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
