package com.surwing.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.surwing.model.Location;

import java.util.List;

/**
 * The persistence utility for the location service. This utility wraps {@link LocationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see LocationPersistence
 * @see LocationPersistenceImpl
 * @generated
 */
public class LocationUtil {
    private static LocationPersistence _persistence;

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
    public static void clearCache(Location location) {
        getPersistence().clearCache(location);
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
    public static List<Location> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Location> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Location> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Location update(Location location) throws SystemException {
        return getPersistence().update(location);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Location update(Location location,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(location, serviceContext);
    }

    /**
    * Returns all the locations where companyId = &#63; and groupId = &#63;.
    *
    * @param companyId the company ID
    * @param groupId the group ID
    * @return the matching locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Location> findByC_G(
        long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByC_G(companyId, groupId);
    }

    /**
    * Returns a range of all the locations where companyId = &#63; and groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param companyId the company ID
    * @param groupId the group ID
    * @param start the lower bound of the range of locations
    * @param end the upper bound of the range of locations (not inclusive)
    * @return the range of matching locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Location> findByC_G(
        long companyId, long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByC_G(companyId, groupId, start, end);
    }

    /**
    * Returns an ordered range of all the locations where companyId = &#63; and groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param companyId the company ID
    * @param groupId the group ID
    * @param start the lower bound of the range of locations
    * @param end the upper bound of the range of locations (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Location> findByC_G(
        long companyId, long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByC_G(companyId, groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first location in the ordered set where companyId = &#63; and groupId = &#63;.
    *
    * @param companyId the company ID
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching location
    * @throws com.surwing.NoSuchLocationException if a matching location could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Location findByC_G_First(long companyId,
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchLocationException {
        return getPersistence()
                   .findByC_G_First(companyId, groupId, orderByComparator);
    }

    /**
    * Returns the first location in the ordered set where companyId = &#63; and groupId = &#63;.
    *
    * @param companyId the company ID
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching location, or <code>null</code> if a matching location could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Location fetchByC_G_First(long companyId,
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByC_G_First(companyId, groupId, orderByComparator);
    }

    /**
    * Returns the last location in the ordered set where companyId = &#63; and groupId = &#63;.
    *
    * @param companyId the company ID
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching location
    * @throws com.surwing.NoSuchLocationException if a matching location could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Location findByC_G_Last(long companyId,
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchLocationException {
        return getPersistence()
                   .findByC_G_Last(companyId, groupId, orderByComparator);
    }

    /**
    * Returns the last location in the ordered set where companyId = &#63; and groupId = &#63;.
    *
    * @param companyId the company ID
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching location, or <code>null</code> if a matching location could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Location fetchByC_G_Last(long companyId,
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByC_G_Last(companyId, groupId, orderByComparator);
    }

    /**
    * Returns the locations before and after the current location in the ordered set where companyId = &#63; and groupId = &#63;.
    *
    * @param locationId the primary key of the current location
    * @param companyId the company ID
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next location
    * @throws com.surwing.NoSuchLocationException if a location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Location[] findByC_G_PrevAndNext(
        long locationId, long companyId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchLocationException {
        return getPersistence()
                   .findByC_G_PrevAndNext(locationId, companyId, groupId,
            orderByComparator);
    }

    /**
    * Removes all the locations where companyId = &#63; and groupId = &#63; from the database.
    *
    * @param companyId the company ID
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByC_G(long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByC_G(companyId, groupId);
    }

    /**
    * Returns the number of locations where companyId = &#63; and groupId = &#63;.
    *
    * @param companyId the company ID
    * @param groupId the group ID
    * @return the number of matching locations
    * @throws SystemException if a system exception occurred
    */
    public static int countByC_G(long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByC_G(companyId, groupId);
    }

    /**
    * Returns the location where locationNo = &#63; and companyId = &#63; and groupId = &#63; or throws a {@link com.surwing.NoSuchLocationException} if it could not be found.
    *
    * @param locationNo the location no
    * @param companyId the company ID
    * @param groupId the group ID
    * @return the matching location
    * @throws com.surwing.NoSuchLocationException if a matching location could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Location findByLocationNo_C_G(
        java.lang.String locationNo, long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchLocationException {
        return getPersistence()
                   .findByLocationNo_C_G(locationNo, companyId, groupId);
    }

    /**
    * Returns the location where locationNo = &#63; and companyId = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param locationNo the location no
    * @param companyId the company ID
    * @param groupId the group ID
    * @return the matching location, or <code>null</code> if a matching location could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Location fetchByLocationNo_C_G(
        java.lang.String locationNo, long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByLocationNo_C_G(locationNo, companyId, groupId);
    }

    /**
    * Returns the location where locationNo = &#63; and companyId = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param locationNo the location no
    * @param companyId the company ID
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching location, or <code>null</code> if a matching location could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Location fetchByLocationNo_C_G(
        java.lang.String locationNo, long companyId, long groupId,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByLocationNo_C_G(locationNo, companyId, groupId,
            retrieveFromCache);
    }

    /**
    * Removes the location where locationNo = &#63; and companyId = &#63; and groupId = &#63; from the database.
    *
    * @param locationNo the location no
    * @param companyId the company ID
    * @param groupId the group ID
    * @return the location that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Location removeByLocationNo_C_G(
        java.lang.String locationNo, long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchLocationException {
        return getPersistence()
                   .removeByLocationNo_C_G(locationNo, companyId, groupId);
    }

    /**
    * Returns the number of locations where locationNo = &#63; and companyId = &#63; and groupId = &#63;.
    *
    * @param locationNo the location no
    * @param companyId the company ID
    * @param groupId the group ID
    * @return the number of matching locations
    * @throws SystemException if a system exception occurred
    */
    public static int countByLocationNo_C_G(java.lang.String locationNo,
        long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByLocationNo_C_G(locationNo, companyId, groupId);
    }

    /**
    * Caches the location in the entity cache if it is enabled.
    *
    * @param location the location
    */
    public static void cacheResult(com.surwing.model.Location location) {
        getPersistence().cacheResult(location);
    }

    /**
    * Caches the locations in the entity cache if it is enabled.
    *
    * @param locations the locations
    */
    public static void cacheResult(
        java.util.List<com.surwing.model.Location> locations) {
        getPersistence().cacheResult(locations);
    }

    /**
    * Creates a new location with the primary key. Does not add the location to the database.
    *
    * @param locationId the primary key for the new location
    * @return the new location
    */
    public static com.surwing.model.Location create(long locationId) {
        return getPersistence().create(locationId);
    }

    /**
    * Removes the location with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param locationId the primary key of the location
    * @return the location that was removed
    * @throws com.surwing.NoSuchLocationException if a location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Location remove(long locationId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchLocationException {
        return getPersistence().remove(locationId);
    }

    public static com.surwing.model.Location updateImpl(
        com.surwing.model.Location location)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(location);
    }

    /**
    * Returns the location with the primary key or throws a {@link com.surwing.NoSuchLocationException} if it could not be found.
    *
    * @param locationId the primary key of the location
    * @return the location
    * @throws com.surwing.NoSuchLocationException if a location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Location findByPrimaryKey(long locationId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchLocationException {
        return getPersistence().findByPrimaryKey(locationId);
    }

    /**
    * Returns the location with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param locationId the primary key of the location
    * @return the location, or <code>null</code> if a location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Location fetchByPrimaryKey(long locationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(locationId);
    }

    /**
    * Returns all the locations.
    *
    * @return the locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Location> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the locations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of locations
    * @param end the upper bound of the range of locations (not inclusive)
    * @return the range of locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Location> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the locations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of locations
    * @param end the upper bound of the range of locations (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Location> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the locations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of locations.
    *
    * @return the number of locations
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static LocationPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (LocationPersistence) PortletBeanLocatorUtil.locate(com.surwing.service.ClpSerializer.getServletContextName(),
                    LocationPersistence.class.getName());

            ReferenceRegistry.registerReference(LocationUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(LocationPersistence persistence) {
    }
}
