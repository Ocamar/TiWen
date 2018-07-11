package com.surwing.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Location. This utility wraps
 * {@link com.surwing.service.impl.LocationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author zhaiyz
 * @see LocationLocalService
 * @see com.surwing.service.base.LocationLocalServiceBaseImpl
 * @see com.surwing.service.impl.LocationLocalServiceImpl
 * @generated
 */
public class LocationLocalServiceUtil {
    private static LocationLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.surwing.service.impl.LocationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the location to the database. Also notifies the appropriate model listeners.
    *
    * @param location the location
    * @return the location that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Location addLocation(
        com.surwing.model.Location location)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addLocation(location);
    }

    /**
    * Creates a new location with the primary key. Does not add the location to the database.
    *
    * @param locationId the primary key for the new location
    * @return the new location
    */
    public static com.surwing.model.Location createLocation(long locationId) {
        return getService().createLocation(locationId);
    }

    /**
    * Deletes the location with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param locationId the primary key of the location
    * @return the location that was removed
    * @throws PortalException if a location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Location deleteLocation(long locationId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLocation(locationId);
    }

    /**
    * Deletes the location from the database. Also notifies the appropriate model listeners.
    *
    * @param location the location
    * @return the location that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Location deleteLocation(
        com.surwing.model.Location location)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLocation(location);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.surwing.model.Location fetchLocation(long locationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchLocation(locationId);
    }

    /**
    * Returns the location with the primary key.
    *
    * @param locationId the primary key of the location
    * @return the location
    * @throws PortalException if a location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Location getLocation(long locationId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getLocation(locationId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.surwing.model.Location> getLocations(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLocations(start, end);
    }

    /**
    * Returns the number of locations.
    *
    * @return the number of locations
    * @throws SystemException if a system exception occurred
    */
    public static int getLocationsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLocationsCount();
    }

    /**
    * Updates the location in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param location the location
    * @return the location that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Location updateLocation(
        com.surwing.model.Location location)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateLocation(location);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * 添加病区
    *
    * @param locationNo   病区编号
    * @param locationName 病区名称
    * @param companyId    companyId
    * @param groupId      groupId
    * @return 新添加的病区
    * @throws SystemException if a system exception occurred
    * @throws PortalException 病区编号已存在时
    */
    public static com.surwing.model.Location addLocation(
        java.lang.String locationNo, java.lang.String locationName,
        boolean esbEnabled, long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addLocation(locationNo, locationName, esbEnabled,
            companyId, groupId);
    }

    /**
    * 取得指定company和group的病区数量
    *
    * @param companyId companyId
    * @param groupId   groupId
    * @return 病区数量
    * @throws SystemException if a system exception occurred
    */
    public static int getLocationsCountByC_G(long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLocationsCountByC_G(companyId, groupId);
    }

    /**
    * 取得指定company和group的病区列表
    *
    * @param companyId companyId
    * @param groupId   groupId
    * @param start     start
    * @param end       end
    * @return 病区列表
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Location> getLocationsByC_G(
        long companyId, long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLocationsByC_G(companyId, groupId, start, end);
    }

    public static com.surwing.model.Location updateLocationInfo(
        com.surwing.model.Location location)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.MonitorException {
        return getService().updateLocationInfo(location);
    }

    public static java.util.List<com.surwing.model.Location> findByDisplayTerms(
        com.surwing.search.LocationDisplayTerms displayTerms,
        com.liferay.portal.kernel.util.OrderByComparator obc, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findByDisplayTerms(displayTerms, obc, start, end);
    }

    public static int countByDisplayTerms(
        com.surwing.search.LocationDisplayTerms displayTerms)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().countByDisplayTerms(displayTerms);
    }

    public static java.util.List<com.surwing.model.Location> getEsbEnabledLocations()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEsbEnabledLocations();
    }

    public static void clearService() {
        _service = null;
    }

    public static LocationLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    LocationLocalService.class.getName());

            if (invokableLocalService instanceof LocationLocalService) {
                _service = (LocationLocalService) invokableLocalService;
            } else {
                _service = new LocationLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(LocationLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(LocationLocalService service) {
    }
}
