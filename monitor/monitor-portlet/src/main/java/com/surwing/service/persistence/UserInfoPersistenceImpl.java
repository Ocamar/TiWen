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

import com.surwing.NoSuchUserInfoException;

import com.surwing.model.UserInfo;
import com.surwing.model.impl.UserInfoImpl;
import com.surwing.model.impl.UserInfoModelImpl;

import com.surwing.service.persistence.UserInfoPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the user info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see UserInfoPersistence
 * @see UserInfoUtil
 * @generated
 */
public class UserInfoPersistenceImpl extends BasePersistenceImpl<UserInfo>
    implements UserInfoPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link UserInfoUtil} to access the user info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = UserInfoImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserInfoModelImpl.ENTITY_CACHE_ENABLED,
            UserInfoModelImpl.FINDER_CACHE_ENABLED, UserInfoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserInfoModelImpl.ENTITY_CACHE_ENABLED,
            UserInfoModelImpl.FINDER_CACHE_ENABLED, UserInfoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserInfoModelImpl.ENTITY_CACHE_ENABLED,
            UserInfoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_USERINFO = "SELECT userInfo FROM UserInfo userInfo";
    private static final String _SQL_COUNT_USERINFO = "SELECT COUNT(userInfo) FROM UserInfo userInfo";
    private static final String _ORDER_BY_ENTITY_ALIAS = "userInfo.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserInfo exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(UserInfoPersistenceImpl.class);
    private static UserInfo _nullUserInfo = new UserInfoImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<UserInfo> toCacheModel() {
                return _nullUserInfoCacheModel;
            }
        };

    private static CacheModel<UserInfo> _nullUserInfoCacheModel = new CacheModel<UserInfo>() {
            @Override
            public UserInfo toEntityModel() {
                return _nullUserInfo;
            }
        };

    public UserInfoPersistenceImpl() {
        setModelClass(UserInfo.class);
    }

    /**
     * Caches the user info in the entity cache if it is enabled.
     *
     * @param userInfo the user info
     */
    @Override
    public void cacheResult(UserInfo userInfo) {
        EntityCacheUtil.putResult(UserInfoModelImpl.ENTITY_CACHE_ENABLED,
            UserInfoImpl.class, userInfo.getPrimaryKey(), userInfo);

        userInfo.resetOriginalValues();
    }

    /**
     * Caches the user infos in the entity cache if it is enabled.
     *
     * @param userInfos the user infos
     */
    @Override
    public void cacheResult(List<UserInfo> userInfos) {
        for (UserInfo userInfo : userInfos) {
            if (EntityCacheUtil.getResult(
                        UserInfoModelImpl.ENTITY_CACHE_ENABLED,
                        UserInfoImpl.class, userInfo.getPrimaryKey()) == null) {
                cacheResult(userInfo);
            } else {
                userInfo.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all user infos.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(UserInfoImpl.class.getName());
        }

        EntityCacheUtil.clearCache(UserInfoImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the user info.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(UserInfo userInfo) {
        EntityCacheUtil.removeResult(UserInfoModelImpl.ENTITY_CACHE_ENABLED,
            UserInfoImpl.class, userInfo.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<UserInfo> userInfos) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (UserInfo userInfo : userInfos) {
            EntityCacheUtil.removeResult(UserInfoModelImpl.ENTITY_CACHE_ENABLED,
                UserInfoImpl.class, userInfo.getPrimaryKey());
        }
    }

    /**
     * Creates a new user info with the primary key. Does not add the user info to the database.
     *
     * @param userId the primary key for the new user info
     * @return the new user info
     */
    @Override
    public UserInfo create(long userId) {
        UserInfo userInfo = new UserInfoImpl();

        userInfo.setNew(true);
        userInfo.setPrimaryKey(userId);

        return userInfo;
    }

    /**
     * Removes the user info with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param userId the primary key of the user info
     * @return the user info that was removed
     * @throws com.surwing.NoSuchUserInfoException if a user info with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserInfo remove(long userId)
        throws NoSuchUserInfoException, SystemException {
        return remove((Serializable) userId);
    }

    /**
     * Removes the user info with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the user info
     * @return the user info that was removed
     * @throws com.surwing.NoSuchUserInfoException if a user info with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserInfo remove(Serializable primaryKey)
        throws NoSuchUserInfoException, SystemException {
        Session session = null;

        try {
            session = openSession();

            UserInfo userInfo = (UserInfo) session.get(UserInfoImpl.class,
                    primaryKey);

            if (userInfo == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchUserInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(userInfo);
        } catch (NoSuchUserInfoException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected UserInfo removeImpl(UserInfo userInfo) throws SystemException {
        userInfo = toUnwrappedModel(userInfo);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(userInfo)) {
                userInfo = (UserInfo) session.get(UserInfoImpl.class,
                        userInfo.getPrimaryKeyObj());
            }

            if (userInfo != null) {
                session.delete(userInfo);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (userInfo != null) {
            clearCache(userInfo);
        }

        return userInfo;
    }

    @Override
    public UserInfo updateImpl(com.surwing.model.UserInfo userInfo)
        throws SystemException {
        userInfo = toUnwrappedModel(userInfo);

        boolean isNew = userInfo.isNew();

        Session session = null;

        try {
            session = openSession();

            if (userInfo.isNew()) {
                session.save(userInfo);

                userInfo.setNew(false);
            } else {
                session.merge(userInfo);
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

        EntityCacheUtil.putResult(UserInfoModelImpl.ENTITY_CACHE_ENABLED,
            UserInfoImpl.class, userInfo.getPrimaryKey(), userInfo);

        return userInfo;
    }

    protected UserInfo toUnwrappedModel(UserInfo userInfo) {
        if (userInfo instanceof UserInfoImpl) {
            return userInfo;
        }

        UserInfoImpl userInfoImpl = new UserInfoImpl();

        userInfoImpl.setNew(userInfo.isNew());
        userInfoImpl.setPrimaryKey(userInfo.getPrimaryKey());

        userInfoImpl.setUserId(userInfo.getUserId());
        userInfoImpl.setLocationId(userInfo.getLocationId());

        return userInfoImpl;
    }

    /**
     * Returns the user info with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the user info
     * @return the user info
     * @throws com.surwing.NoSuchUserInfoException if a user info with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserInfo findByPrimaryKey(Serializable primaryKey)
        throws NoSuchUserInfoException, SystemException {
        UserInfo userInfo = fetchByPrimaryKey(primaryKey);

        if (userInfo == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchUserInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return userInfo;
    }

    /**
     * Returns the user info with the primary key or throws a {@link com.surwing.NoSuchUserInfoException} if it could not be found.
     *
     * @param userId the primary key of the user info
     * @return the user info
     * @throws com.surwing.NoSuchUserInfoException if a user info with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserInfo findByPrimaryKey(long userId)
        throws NoSuchUserInfoException, SystemException {
        return findByPrimaryKey((Serializable) userId);
    }

    /**
     * Returns the user info with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the user info
     * @return the user info, or <code>null</code> if a user info with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserInfo fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        UserInfo userInfo = (UserInfo) EntityCacheUtil.getResult(UserInfoModelImpl.ENTITY_CACHE_ENABLED,
                UserInfoImpl.class, primaryKey);

        if (userInfo == _nullUserInfo) {
            return null;
        }

        if (userInfo == null) {
            Session session = null;

            try {
                session = openSession();

                userInfo = (UserInfo) session.get(UserInfoImpl.class, primaryKey);

                if (userInfo != null) {
                    cacheResult(userInfo);
                } else {
                    EntityCacheUtil.putResult(UserInfoModelImpl.ENTITY_CACHE_ENABLED,
                        UserInfoImpl.class, primaryKey, _nullUserInfo);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(UserInfoModelImpl.ENTITY_CACHE_ENABLED,
                    UserInfoImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return userInfo;
    }

    /**
     * Returns the user info with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param userId the primary key of the user info
     * @return the user info, or <code>null</code> if a user info with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserInfo fetchByPrimaryKey(long userId) throws SystemException {
        return fetchByPrimaryKey((Serializable) userId);
    }

    /**
     * Returns all the user infos.
     *
     * @return the user infos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserInfo> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the user infos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.UserInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of user infos
     * @param end the upper bound of the range of user infos (not inclusive)
     * @return the range of user infos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserInfo> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the user infos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.UserInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of user infos
     * @param end the upper bound of the range of user infos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of user infos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserInfo> findAll(int start, int end,
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

        List<UserInfo> list = (List<UserInfo>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_USERINFO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_USERINFO;

                if (pagination) {
                    sql = sql.concat(UserInfoModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<UserInfo>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UserInfo>(list);
                } else {
                    list = (List<UserInfo>) QueryUtil.list(q, getDialect(),
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
     * Removes all the user infos from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (UserInfo userInfo : findAll()) {
            remove(userInfo);
        }
    }

    /**
     * Returns the number of user infos.
     *
     * @return the number of user infos
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

                Query q = session.createQuery(_SQL_COUNT_USERINFO);

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
     * Initializes the user info persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.surwing.model.UserInfo")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<UserInfo>> listenersList = new ArrayList<ModelListener<UserInfo>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<UserInfo>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(UserInfoImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
