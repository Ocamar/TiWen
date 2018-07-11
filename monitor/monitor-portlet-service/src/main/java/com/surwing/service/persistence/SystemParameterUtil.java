package com.surwing.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.surwing.model.SystemParameter;

import java.util.List;

/**
 * The persistence utility for the system parameter service. This utility wraps {@link SystemParameterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see SystemParameterPersistence
 * @see SystemParameterPersistenceImpl
 * @generated
 */
public class SystemParameterUtil {
    private static SystemParameterPersistence _persistence;

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
    public static void clearCache(SystemParameter systemParameter) {
        getPersistence().clearCache(systemParameter);
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
    public static List<SystemParameter> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<SystemParameter> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<SystemParameter> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static SystemParameter update(SystemParameter systemParameter)
        throws SystemException {
        return getPersistence().update(systemParameter);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static SystemParameter update(SystemParameter systemParameter,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(systemParameter, serviceContext);
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
    public static com.surwing.model.SystemParameter findByLocationIdAndKey(
        long locationId, java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchSystemParameterException {
        return getPersistence().findByLocationIdAndKey(locationId, key);
    }

    /**
    * Returns the system parameter where locationId = &#63; and key = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param locationId the location ID
    * @param key the key
    * @return the matching system parameter, or <code>null</code> if a matching system parameter could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.SystemParameter fetchByLocationIdAndKey(
        long locationId, java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByLocationIdAndKey(locationId, key);
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
    public static com.surwing.model.SystemParameter fetchByLocationIdAndKey(
        long locationId, java.lang.String key, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByLocationIdAndKey(locationId, key, retrieveFromCache);
    }

    /**
    * Removes the system parameter where locationId = &#63; and key = &#63; from the database.
    *
    * @param locationId the location ID
    * @param key the key
    * @return the system parameter that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.SystemParameter removeByLocationIdAndKey(
        long locationId, java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchSystemParameterException {
        return getPersistence().removeByLocationIdAndKey(locationId, key);
    }

    /**
    * Returns the number of system parameters where locationId = &#63; and key = &#63;.
    *
    * @param locationId the location ID
    * @param key the key
    * @return the number of matching system parameters
    * @throws SystemException if a system exception occurred
    */
    public static int countByLocationIdAndKey(long locationId,
        java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByLocationIdAndKey(locationId, key);
    }

    /**
    * Caches the system parameter in the entity cache if it is enabled.
    *
    * @param systemParameter the system parameter
    */
    public static void cacheResult(
        com.surwing.model.SystemParameter systemParameter) {
        getPersistence().cacheResult(systemParameter);
    }

    /**
    * Caches the system parameters in the entity cache if it is enabled.
    *
    * @param systemParameters the system parameters
    */
    public static void cacheResult(
        java.util.List<com.surwing.model.SystemParameter> systemParameters) {
        getPersistence().cacheResult(systemParameters);
    }

    /**
    * Creates a new system parameter with the primary key. Does not add the system parameter to the database.
    *
    * @param systemParameterId the primary key for the new system parameter
    * @return the new system parameter
    */
    public static com.surwing.model.SystemParameter create(
        long systemParameterId) {
        return getPersistence().create(systemParameterId);
    }

    /**
    * Removes the system parameter with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param systemParameterId the primary key of the system parameter
    * @return the system parameter that was removed
    * @throws com.surwing.NoSuchSystemParameterException if a system parameter with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.SystemParameter remove(
        long systemParameterId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchSystemParameterException {
        return getPersistence().remove(systemParameterId);
    }

    public static com.surwing.model.SystemParameter updateImpl(
        com.surwing.model.SystemParameter systemParameter)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(systemParameter);
    }

    /**
    * Returns the system parameter with the primary key or throws a {@link com.surwing.NoSuchSystemParameterException} if it could not be found.
    *
    * @param systemParameterId the primary key of the system parameter
    * @return the system parameter
    * @throws com.surwing.NoSuchSystemParameterException if a system parameter with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.SystemParameter findByPrimaryKey(
        long systemParameterId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchSystemParameterException {
        return getPersistence().findByPrimaryKey(systemParameterId);
    }

    /**
    * Returns the system parameter with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param systemParameterId the primary key of the system parameter
    * @return the system parameter, or <code>null</code> if a system parameter with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.SystemParameter fetchByPrimaryKey(
        long systemParameterId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(systemParameterId);
    }

    /**
    * Returns all the system parameters.
    *
    * @return the system parameters
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.SystemParameter> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.surwing.model.SystemParameter> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<com.surwing.model.SystemParameter> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the system parameters from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of system parameters.
    *
    * @return the number of system parameters
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static SystemParameterPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (SystemParameterPersistence) PortletBeanLocatorUtil.locate(com.surwing.service.ClpSerializer.getServletContextName(),
                    SystemParameterPersistence.class.getName());

            ReferenceRegistry.registerReference(SystemParameterUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(SystemParameterPersistence persistence) {
    }
}
