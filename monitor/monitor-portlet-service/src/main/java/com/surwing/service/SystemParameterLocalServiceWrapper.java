package com.surwing.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SystemParameterLocalService}.
 *
 * @author zhaiyz
 * @see SystemParameterLocalService
 * @generated
 */
public class SystemParameterLocalServiceWrapper
    implements SystemParameterLocalService,
        ServiceWrapper<SystemParameterLocalService> {
    private SystemParameterLocalService _systemParameterLocalService;

    public SystemParameterLocalServiceWrapper(
        SystemParameterLocalService systemParameterLocalService) {
        _systemParameterLocalService = systemParameterLocalService;
    }

    /**
    * Adds the system parameter to the database. Also notifies the appropriate model listeners.
    *
    * @param systemParameter the system parameter
    * @return the system parameter that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.SystemParameter addSystemParameter(
        com.surwing.model.SystemParameter systemParameter)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _systemParameterLocalService.addSystemParameter(systemParameter);
    }

    /**
    * Creates a new system parameter with the primary key. Does not add the system parameter to the database.
    *
    * @param systemParameterId the primary key for the new system parameter
    * @return the new system parameter
    */
    @Override
    public com.surwing.model.SystemParameter createSystemParameter(
        long systemParameterId) {
        return _systemParameterLocalService.createSystemParameter(systemParameterId);
    }

    /**
    * Deletes the system parameter with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param systemParameterId the primary key of the system parameter
    * @return the system parameter that was removed
    * @throws PortalException if a system parameter with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.SystemParameter deleteSystemParameter(
        long systemParameterId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _systemParameterLocalService.deleteSystemParameter(systemParameterId);
    }

    /**
    * Deletes the system parameter from the database. Also notifies the appropriate model listeners.
    *
    * @param systemParameter the system parameter
    * @return the system parameter that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.SystemParameter deleteSystemParameter(
        com.surwing.model.SystemParameter systemParameter)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _systemParameterLocalService.deleteSystemParameter(systemParameter);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _systemParameterLocalService.dynamicQuery();
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
        return _systemParameterLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.SystemParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _systemParameterLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.SystemParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _systemParameterLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
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
        return _systemParameterLocalService.dynamicQueryCount(dynamicQuery);
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
        return _systemParameterLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.surwing.model.SystemParameter fetchSystemParameter(
        long systemParameterId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _systemParameterLocalService.fetchSystemParameter(systemParameterId);
    }

    /**
    * Returns the system parameter with the primary key.
    *
    * @param systemParameterId the primary key of the system parameter
    * @return the system parameter
    * @throws PortalException if a system parameter with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.SystemParameter getSystemParameter(
        long systemParameterId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _systemParameterLocalService.getSystemParameter(systemParameterId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _systemParameterLocalService.getPersistedModel(primaryKeyObj);
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
    public java.util.List<com.surwing.model.SystemParameter> getSystemParameters(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _systemParameterLocalService.getSystemParameters(start, end);
    }

    /**
    * Returns the number of system parameters.
    *
    * @return the number of system parameters
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getSystemParametersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _systemParameterLocalService.getSystemParametersCount();
    }

    /**
    * Updates the system parameter in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param systemParameter the system parameter
    * @return the system parameter that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.SystemParameter updateSystemParameter(
        com.surwing.model.SystemParameter systemParameter)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _systemParameterLocalService.updateSystemParameter(systemParameter);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _systemParameterLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _systemParameterLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _systemParameterLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.lang.String getByLocationIdAndKey(long locationId,
        java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _systemParameterLocalService.getByLocationIdAndKey(locationId,
            key);
    }

    @Override
    public com.surwing.model.SystemParameter addOrUpdateSystemParameter(
        long locationId, java.lang.String key, java.lang.String value)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _systemParameterLocalService.addOrUpdateSystemParameter(locationId,
            key, value);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SystemParameterLocalService getWrappedSystemParameterLocalService() {
        return _systemParameterLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSystemParameterLocalService(
        SystemParameterLocalService systemParameterLocalService) {
        _systemParameterLocalService = systemParameterLocalService;
    }

    @Override
    public SystemParameterLocalService getWrappedService() {
        return _systemParameterLocalService;
    }

    @Override
    public void setWrappedService(
        SystemParameterLocalService systemParameterLocalService) {
        _systemParameterLocalService = systemParameterLocalService;
    }
}
