package com.surwing.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Bed. This utility wraps
 * {@link com.surwing.service.impl.BedLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author zhaiyz
 * @see BedLocalService
 * @see com.surwing.service.base.BedLocalServiceBaseImpl
 * @see com.surwing.service.impl.BedLocalServiceImpl
 * @generated
 */
public class BedLocalServiceUtil {
    private static BedLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.surwing.service.impl.BedLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the bed to the database. Also notifies the appropriate model listeners.
    *
    * @param bed the bed
    * @return the bed that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Bed addBed(com.surwing.model.Bed bed)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addBed(bed);
    }

    /**
    * Creates a new bed with the primary key. Does not add the bed to the database.
    *
    * @param bedId the primary key for the new bed
    * @return the new bed
    */
    public static com.surwing.model.Bed createBed(long bedId) {
        return getService().createBed(bedId);
    }

    /**
    * Deletes the bed with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bedId the primary key of the bed
    * @return the bed that was removed
    * @throws PortalException if a bed with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Bed deleteBed(long bedId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBed(bedId);
    }

    /**
    * Deletes the bed from the database. Also notifies the appropriate model listeners.
    *
    * @param bed the bed
    * @return the bed that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Bed deleteBed(com.surwing.model.Bed bed)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBed(bed);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.BedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.BedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.surwing.model.Bed fetchBed(long bedId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchBed(bedId);
    }

    /**
    * Returns the bed with the primary key.
    *
    * @param bedId the primary key of the bed
    * @return the bed
    * @throws PortalException if a bed with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Bed getBed(long bedId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getBed(bedId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.surwing.model.Bed> getBeds(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBeds(start, end);
    }

    /**
    * Returns the number of beds.
    *
    * @return the number of beds
    * @throws SystemException if a system exception occurred
    */
    public static int getBedsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBedsCount();
    }

    /**
    * Updates the bed in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param bed the bed
    * @return the bed that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Bed updateBed(com.surwing.model.Bed bed)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateBed(bed);
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

    public static void addBeds(java.lang.String fromNo, int count, long areaId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().addBeds(fromNo, count, areaId, serviceContext);
    }

    public static java.util.List<com.surwing.model.Bed> findByDisplayTerms(
        com.surwing.search.BedDisplayTerms displayTerms,
        com.liferay.portal.kernel.util.OrderByComparator obc, int start,
        int end, com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .findByDisplayTerms(displayTerms, obc, start, end,
            serviceContext);
    }

    public static int countByDisplayTerms(
        com.surwing.search.BedDisplayTerms displayTerms,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().countByDisplayTerms(displayTerms, serviceContext);
    }

    public static java.util.List<com.surwing.model.Bed> findByLocationId(
        long locationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findByLocationId(locationId);
    }

    public static int countByLocationId(long locationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().countByLocationId(locationId);
    }

    public static void bindPatient(long bedId, long patientId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().bindPatient(bedId, patientId);
    }

    public static void unbindPatient(long bedId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().unbindPatient(bedId);
    }

    public static java.util.List<com.surwing.model.Bed> findUsableBeds(
        long locationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findUsableBeds(locationId);
    }

    public static com.surwing.model.Bed getByBedAlias(long locationId,
        java.lang.String bedAlias)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByBedAlias(locationId, bedAlias);
    }

    public static void clearService() {
        _service = null;
    }

    public static BedLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    BedLocalService.class.getName());

            if (invokableLocalService instanceof BedLocalService) {
                _service = (BedLocalService) invokableLocalService;
            } else {
                _service = new BedLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(BedLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(BedLocalService service) {
    }
}
