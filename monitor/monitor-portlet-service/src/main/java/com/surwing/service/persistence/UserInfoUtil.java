package com.surwing.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.surwing.model.UserInfo;

import java.util.List;

/**
 * The persistence utility for the user info service. This utility wraps {@link UserInfoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see UserInfoPersistence
 * @see UserInfoPersistenceImpl
 * @generated
 */
public class UserInfoUtil {
    private static UserInfoPersistence _persistence;

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
    public static void clearCache(UserInfo userInfo) {
        getPersistence().clearCache(userInfo);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<UserInfo> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<UserInfo> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<UserInfo> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static UserInfo update(UserInfo userInfo) throws SystemException {
        return getPersistence().update(userInfo);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static UserInfo update(UserInfo userInfo,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(userInfo, serviceContext);
    }

    /**
    * Caches the user info in the entity cache if it is enabled.
    *
    * @param userInfo the user info
    */
    public static void cacheResult(com.surwing.model.UserInfo userInfo) {
        getPersistence().cacheResult(userInfo);
    }

    /**
    * Caches the user infos in the entity cache if it is enabled.
    *
    * @param userInfos the user infos
    */
    public static void cacheResult(
        java.util.List<com.surwing.model.UserInfo> userInfos) {
        getPersistence().cacheResult(userInfos);
    }

    /**
    * Creates a new user info with the primary key. Does not add the user info to the database.
    *
    * @param userId the primary key for the new user info
    * @return the new user info
    */
    public static com.surwing.model.UserInfo create(long userId) {
        return getPersistence().create(userId);
    }

    /**
    * Removes the user info with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the user info
    * @return the user info that was removed
    * @throws com.surwing.NoSuchUserInfoException if a user info with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.UserInfo remove(long userId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchUserInfoException {
        return getPersistence().remove(userId);
    }

    public static com.surwing.model.UserInfo updateImpl(
        com.surwing.model.UserInfo userInfo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(userInfo);
    }

    /**
    * Returns the user info with the primary key or throws a {@link com.surwing.NoSuchUserInfoException} if it could not be found.
    *
    * @param userId the primary key of the user info
    * @return the user info
    * @throws com.surwing.NoSuchUserInfoException if a user info with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.UserInfo findByPrimaryKey(long userId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchUserInfoException {
        return getPersistence().findByPrimaryKey(userId);
    }

    /**
    * Returns the user info with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param userId the primary key of the user info
    * @return the user info, or <code>null</code> if a user info with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.UserInfo fetchByPrimaryKey(long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(userId);
    }

    /**
    * Returns all the user infos.
    *
    * @return the user infos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.UserInfo> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.surwing.model.UserInfo> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<com.surwing.model.UserInfo> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the user infos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of user infos.
    *
    * @return the number of user infos
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static UserInfoPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (UserInfoPersistence) PortletBeanLocatorUtil.locate(com.surwing.service.ClpSerializer.getServletContextName(),
                    UserInfoPersistence.class.getName());

            ReferenceRegistry.registerReference(UserInfoUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(UserInfoPersistence persistence) {
    }
}
