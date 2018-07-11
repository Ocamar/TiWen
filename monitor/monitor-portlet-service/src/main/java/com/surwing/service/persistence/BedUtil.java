package com.surwing.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.surwing.model.Bed;

import java.util.List;

/**
 * The persistence utility for the bed service. This utility wraps {@link BedPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see BedPersistence
 * @see BedPersistenceImpl
 * @generated
 */
public class BedUtil {
    private static BedPersistence _persistence;

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
    public static void clearCache(Bed bed) {
        getPersistence().clearCache(bed);
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
    public static List<Bed> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Bed> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Bed> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Bed update(Bed bed) throws SystemException {
        return getPersistence().update(bed);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Bed update(Bed bed, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(bed, serviceContext);
    }

    /**
    * Returns all the beds where locationId = &#63;.
    *
    * @param locationId the location ID
    * @return the matching beds
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Bed> findByLocationId(
        long locationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByLocationId(locationId);
    }

    /**
    * Returns a range of all the beds where locationId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.BedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param locationId the location ID
    * @param start the lower bound of the range of beds
    * @param end the upper bound of the range of beds (not inclusive)
    * @return the range of matching beds
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Bed> findByLocationId(
        long locationId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByLocationId(locationId, start, end);
    }

    /**
    * Returns an ordered range of all the beds where locationId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.BedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param locationId the location ID
    * @param start the lower bound of the range of beds
    * @param end the upper bound of the range of beds (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching beds
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Bed> findByLocationId(
        long locationId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByLocationId(locationId, start, end, orderByComparator);
    }

    /**
    * Returns the first bed in the ordered set where locationId = &#63;.
    *
    * @param locationId the location ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bed
    * @throws com.surwing.NoSuchBedException if a matching bed could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Bed findByLocationId_First(
        long locationId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchBedException {
        return getPersistence()
                   .findByLocationId_First(locationId, orderByComparator);
    }

    /**
    * Returns the first bed in the ordered set where locationId = &#63;.
    *
    * @param locationId the location ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bed, or <code>null</code> if a matching bed could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Bed fetchByLocationId_First(
        long locationId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByLocationId_First(locationId, orderByComparator);
    }

    /**
    * Returns the last bed in the ordered set where locationId = &#63;.
    *
    * @param locationId the location ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bed
    * @throws com.surwing.NoSuchBedException if a matching bed could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Bed findByLocationId_Last(long locationId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchBedException {
        return getPersistence()
                   .findByLocationId_Last(locationId, orderByComparator);
    }

    /**
    * Returns the last bed in the ordered set where locationId = &#63;.
    *
    * @param locationId the location ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bed, or <code>null</code> if a matching bed could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Bed fetchByLocationId_Last(
        long locationId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByLocationId_Last(locationId, orderByComparator);
    }

    /**
    * Returns the beds before and after the current bed in the ordered set where locationId = &#63;.
    *
    * @param bedId the primary key of the current bed
    * @param locationId the location ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bed
    * @throws com.surwing.NoSuchBedException if a bed with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Bed[] findByLocationId_PrevAndNext(
        long bedId, long locationId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchBedException {
        return getPersistence()
                   .findByLocationId_PrevAndNext(bedId, locationId,
            orderByComparator);
    }

    /**
    * Removes all the beds where locationId = &#63; from the database.
    *
    * @param locationId the location ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByLocationId(long locationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByLocationId(locationId);
    }

    /**
    * Returns the number of beds where locationId = &#63;.
    *
    * @param locationId the location ID
    * @return the number of matching beds
    * @throws SystemException if a system exception occurred
    */
    public static int countByLocationId(long locationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByLocationId(locationId);
    }

    /**
    * Returns the bed where locationId = &#63; and bedNo = &#63; or throws a {@link com.surwing.NoSuchBedException} if it could not be found.
    *
    * @param locationId the location ID
    * @param bedNo the bed no
    * @return the matching bed
    * @throws com.surwing.NoSuchBedException if a matching bed could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Bed findByLocationIdAndBedNo(
        long locationId, java.lang.String bedNo)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchBedException {
        return getPersistence().findByLocationIdAndBedNo(locationId, bedNo);
    }

    /**
    * Returns the bed where locationId = &#63; and bedNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param locationId the location ID
    * @param bedNo the bed no
    * @return the matching bed, or <code>null</code> if a matching bed could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Bed fetchByLocationIdAndBedNo(
        long locationId, java.lang.String bedNo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByLocationIdAndBedNo(locationId, bedNo);
    }

    /**
    * Returns the bed where locationId = &#63; and bedNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param locationId the location ID
    * @param bedNo the bed no
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching bed, or <code>null</code> if a matching bed could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Bed fetchByLocationIdAndBedNo(
        long locationId, java.lang.String bedNo, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByLocationIdAndBedNo(locationId, bedNo,
            retrieveFromCache);
    }

    /**
    * Removes the bed where locationId = &#63; and bedNo = &#63; from the database.
    *
    * @param locationId the location ID
    * @param bedNo the bed no
    * @return the bed that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Bed removeByLocationIdAndBedNo(
        long locationId, java.lang.String bedNo)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchBedException {
        return getPersistence().removeByLocationIdAndBedNo(locationId, bedNo);
    }

    /**
    * Returns the number of beds where locationId = &#63; and bedNo = &#63;.
    *
    * @param locationId the location ID
    * @param bedNo the bed no
    * @return the number of matching beds
    * @throws SystemException if a system exception occurred
    */
    public static int countByLocationIdAndBedNo(long locationId,
        java.lang.String bedNo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByLocationIdAndBedNo(locationId, bedNo);
    }

    /**
    * Caches the bed in the entity cache if it is enabled.
    *
    * @param bed the bed
    */
    public static void cacheResult(com.surwing.model.Bed bed) {
        getPersistence().cacheResult(bed);
    }

    /**
    * Caches the beds in the entity cache if it is enabled.
    *
    * @param beds the beds
    */
    public static void cacheResult(java.util.List<com.surwing.model.Bed> beds) {
        getPersistence().cacheResult(beds);
    }

    /**
    * Creates a new bed with the primary key. Does not add the bed to the database.
    *
    * @param bedId the primary key for the new bed
    * @return the new bed
    */
    public static com.surwing.model.Bed create(long bedId) {
        return getPersistence().create(bedId);
    }

    /**
    * Removes the bed with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bedId the primary key of the bed
    * @return the bed that was removed
    * @throws com.surwing.NoSuchBedException if a bed with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Bed remove(long bedId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchBedException {
        return getPersistence().remove(bedId);
    }

    public static com.surwing.model.Bed updateImpl(com.surwing.model.Bed bed)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(bed);
    }

    /**
    * Returns the bed with the primary key or throws a {@link com.surwing.NoSuchBedException} if it could not be found.
    *
    * @param bedId the primary key of the bed
    * @return the bed
    * @throws com.surwing.NoSuchBedException if a bed with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Bed findByPrimaryKey(long bedId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchBedException {
        return getPersistence().findByPrimaryKey(bedId);
    }

    /**
    * Returns the bed with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param bedId the primary key of the bed
    * @return the bed, or <code>null</code> if a bed with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Bed fetchByPrimaryKey(long bedId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(bedId);
    }

    /**
    * Returns all the beds.
    *
    * @return the beds
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Bed> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the beds.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.BedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of beds
    * @param end the upper bound of the range of beds (not inclusive)
    * @return the range of beds
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Bed> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the beds.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.BedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of beds
    * @param end the upper bound of the range of beds (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of beds
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Bed> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the beds from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of beds.
    *
    * @return the number of beds
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static BedPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (BedPersistence) PortletBeanLocatorUtil.locate(com.surwing.service.ClpSerializer.getServletContextName(),
                    BedPersistence.class.getName());

            ReferenceRegistry.registerReference(BedUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(BedPersistence persistence) {
    }
}
