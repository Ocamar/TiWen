package com.surwing.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BedLocalService}.
 *
 * @author zhaiyz
 * @see BedLocalService
 * @generated
 */
public class BedLocalServiceWrapper implements BedLocalService,
    ServiceWrapper<BedLocalService> {
    private BedLocalService _bedLocalService;

    public BedLocalServiceWrapper(BedLocalService bedLocalService) {
        _bedLocalService = bedLocalService;
    }

    /**
    * Adds the bed to the database. Also notifies the appropriate model listeners.
    *
    * @param bed the bed
    * @return the bed that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Bed addBed(com.surwing.model.Bed bed)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.addBed(bed);
    }

    /**
    * Creates a new bed with the primary key. Does not add the bed to the database.
    *
    * @param bedId the primary key for the new bed
    * @return the new bed
    */
    @Override
    public com.surwing.model.Bed createBed(long bedId) {
        return _bedLocalService.createBed(bedId);
    }

    /**
    * Deletes the bed with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bedId the primary key of the bed
    * @return the bed that was removed
    * @throws PortalException if a bed with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Bed deleteBed(long bedId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.deleteBed(bedId);
    }

    /**
    * Deletes the bed from the database. Also notifies the appropriate model listeners.
    *
    * @param bed the bed
    * @return the bed that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Bed deleteBed(com.surwing.model.Bed bed)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.deleteBed(bed);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _bedLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.dynamicQuery(dynamicQuery);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.dynamicQuery(dynamicQuery, start, end);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.surwing.model.Bed fetchBed(long bedId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.fetchBed(bedId);
    }

    /**
    * Returns the bed with the primary key.
    *
    * @param bedId the primary key of the bed
    * @return the bed
    * @throws PortalException if a bed with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Bed getBed(long bedId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.getBed(bedId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<com.surwing.model.Bed> getBeds(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.getBeds(start, end);
    }

    /**
    * Returns the number of beds.
    *
    * @return the number of beds
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getBedsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.getBedsCount();
    }

    /**
    * Updates the bed in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param bed the bed
    * @return the bed that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Bed updateBed(com.surwing.model.Bed bed)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.updateBed(bed);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _bedLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _bedLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _bedLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public void addBeds(java.lang.String fromNo, int count, long areaId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _bedLocalService.addBeds(fromNo, count, areaId, serviceContext);
    }

    @Override
    public java.util.List<com.surwing.model.Bed> findByDisplayTerms(
        com.surwing.search.BedDisplayTerms displayTerms,
        com.liferay.portal.kernel.util.OrderByComparator obc, int start,
        int end, com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.findByDisplayTerms(displayTerms, obc, start,
            end, serviceContext);
    }

    @Override
    public int countByDisplayTerms(
        com.surwing.search.BedDisplayTerms displayTerms,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.countByDisplayTerms(displayTerms, serviceContext);
    }

    @Override
    public java.util.List<com.surwing.model.Bed> findByLocationId(
        long locationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.findByLocationId(locationId);
    }

    @Override
    public int countByLocationId(long locationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.countByLocationId(locationId);
    }

    @Override
    public void bindPatient(long bedId, long patientId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _bedLocalService.bindPatient(bedId, patientId);
    }

    @Override
    public void unbindPatient(long bedId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _bedLocalService.unbindPatient(bedId);
    }

    @Override
    public java.util.List<com.surwing.model.Bed> findUsableBeds(long locationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.findUsableBeds(locationId);
    }

    @Override
    public com.surwing.model.Bed getByBedAlias(long locationId,
        java.lang.String bedAlias)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bedLocalService.getByBedAlias(locationId, bedAlias);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BedLocalService getWrappedBedLocalService() {
        return _bedLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBedLocalService(BedLocalService bedLocalService) {
        _bedLocalService = bedLocalService;
    }

    @Override
    public BedLocalService getWrappedService() {
        return _bedLocalService;
    }

    @Override
    public void setWrappedService(BedLocalService bedLocalService) {
        _bedLocalService = bedLocalService;
    }
}
