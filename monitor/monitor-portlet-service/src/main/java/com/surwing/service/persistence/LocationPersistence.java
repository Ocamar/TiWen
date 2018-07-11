package com.surwing.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.surwing.model.Location;

/**
 * The persistence interface for the location service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see LocationPersistenceImpl
 * @see LocationUtil
 * @generated
 */
public interface LocationPersistence extends BasePersistence<Location> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LocationUtil} to access the location persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the locations where companyId = &#63; and groupId = &#63;.
    *
    * @param companyId the company ID
    * @param groupId the group ID
    * @return the matching locations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.surwing.model.Location> findByC_G(
        long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.surwing.model.Location> findByC_G(
        long companyId, long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.surwing.model.Location> findByC_G(
        long companyId, long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.surwing.model.Location findByC_G_First(long companyId,
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchLocationException;

    /**
    * Returns the first location in the ordered set where companyId = &#63; and groupId = &#63;.
    *
    * @param companyId the company ID
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching location, or <code>null</code> if a matching location could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Location fetchByC_G_First(long companyId,
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.surwing.model.Location findByC_G_Last(long companyId,
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchLocationException;

    /**
    * Returns the last location in the ordered set where companyId = &#63; and groupId = &#63;.
    *
    * @param companyId the company ID
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching location, or <code>null</code> if a matching location could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Location fetchByC_G_Last(long companyId,
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.surwing.model.Location[] findByC_G_PrevAndNext(long locationId,
        long companyId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchLocationException;

    /**
    * Removes all the locations where companyId = &#63; and groupId = &#63; from the database.
    *
    * @param companyId the company ID
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByC_G(long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of locations where companyId = &#63; and groupId = &#63;.
    *
    * @param companyId the company ID
    * @param groupId the group ID
    * @return the number of matching locations
    * @throws SystemException if a system exception occurred
    */
    public int countByC_G(long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.surwing.model.Location findByLocationNo_C_G(
        java.lang.String locationNo, long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchLocationException;

    /**
    * Returns the location where locationNo = &#63; and companyId = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param locationNo the location no
    * @param companyId the company ID
    * @param groupId the group ID
    * @return the matching location, or <code>null</code> if a matching location could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Location fetchByLocationNo_C_G(
        java.lang.String locationNo, long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.surwing.model.Location fetchByLocationNo_C_G(
        java.lang.String locationNo, long companyId, long groupId,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the location where locationNo = &#63; and companyId = &#63; and groupId = &#63; from the database.
    *
    * @param locationNo the location no
    * @param companyId the company ID
    * @param groupId the group ID
    * @return the location that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Location removeByLocationNo_C_G(
        java.lang.String locationNo, long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchLocationException;

    /**
    * Returns the number of locations where locationNo = &#63; and companyId = &#63; and groupId = &#63;.
    *
    * @param locationNo the location no
    * @param companyId the company ID
    * @param groupId the group ID
    * @return the number of matching locations
    * @throws SystemException if a system exception occurred
    */
    public int countByLocationNo_C_G(java.lang.String locationNo,
        long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the location in the entity cache if it is enabled.
    *
    * @param location the location
    */
    public void cacheResult(com.surwing.model.Location location);

    /**
    * Caches the locations in the entity cache if it is enabled.
    *
    * @param locations the locations
    */
    public void cacheResult(
        java.util.List<com.surwing.model.Location> locations);

    /**
    * Creates a new location with the primary key. Does not add the location to the database.
    *
    * @param locationId the primary key for the new location
    * @return the new location
    */
    public com.surwing.model.Location create(long locationId);

    /**
    * Removes the location with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param locationId the primary key of the location
    * @return the location that was removed
    * @throws com.surwing.NoSuchLocationException if a location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Location remove(long locationId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchLocationException;

    public com.surwing.model.Location updateImpl(
        com.surwing.model.Location location)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the location with the primary key or throws a {@link com.surwing.NoSuchLocationException} if it could not be found.
    *
    * @param locationId the primary key of the location
    * @return the location
    * @throws com.surwing.NoSuchLocationException if a location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Location findByPrimaryKey(long locationId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchLocationException;

    /**
    * Returns the location with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param locationId the primary key of the location
    * @return the location, or <code>null</code> if a location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Location fetchByPrimaryKey(long locationId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the locations.
    *
    * @return the locations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.surwing.model.Location> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.surwing.model.Location> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.surwing.model.Location> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the locations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of locations.
    *
    * @return the number of locations
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
