package com.surwing.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PatientLocalService}.
 *
 * @author zhaiyz
 * @see PatientLocalService
 * @generated
 */
public class PatientLocalServiceWrapper implements PatientLocalService,
    ServiceWrapper<PatientLocalService> {
    private PatientLocalService _patientLocalService;

    public PatientLocalServiceWrapper(PatientLocalService patientLocalService) {
        _patientLocalService = patientLocalService;
    }

    /**
    * Adds the patient to the database. Also notifies the appropriate model listeners.
    *
    * @param patient the patient
    * @return the patient that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Patient addPatient(
        com.surwing.model.Patient patient)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _patientLocalService.addPatient(patient);
    }

    /**
    * Creates a new patient with the primary key. Does not add the patient to the database.
    *
    * @param patientId the primary key for the new patient
    * @return the new patient
    */
    @Override
    public com.surwing.model.Patient createPatient(long patientId) {
        return _patientLocalService.createPatient(patientId);
    }

    /**
    * Deletes the patient with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param patientId the primary key of the patient
    * @return the patient that was removed
    * @throws PortalException if a patient with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Patient deletePatient(long patientId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _patientLocalService.deletePatient(patientId);
    }

    /**
    * Deletes the patient from the database. Also notifies the appropriate model listeners.
    *
    * @param patient the patient
    * @return the patient that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Patient deletePatient(
        com.surwing.model.Patient patient)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _patientLocalService.deletePatient(patient);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _patientLocalService.dynamicQuery();
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
        return _patientLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _patientLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _patientLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _patientLocalService.dynamicQueryCount(dynamicQuery);
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
        return _patientLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.surwing.model.Patient fetchPatient(long patientId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _patientLocalService.fetchPatient(patientId);
    }

    /**
    * Returns the patient with the primary key.
    *
    * @param patientId the primary key of the patient
    * @return the patient
    * @throws PortalException if a patient with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Patient getPatient(long patientId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _patientLocalService.getPatient(patientId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _patientLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the patients.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of patients
    * @param end the upper bound of the range of patients (not inclusive)
    * @return the range of patients
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.surwing.model.Patient> getPatients(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _patientLocalService.getPatients(start, end);
    }

    /**
    * Returns the number of patients.
    *
    * @return the number of patients
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPatientsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _patientLocalService.getPatientsCount();
    }

    /**
    * Updates the patient in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param patient the patient
    * @return the patient that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Patient updatePatient(
        com.surwing.model.Patient patient)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _patientLocalService.updatePatient(patient);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _patientLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _patientLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _patientLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public com.surwing.model.Patient addPatient(java.lang.String mrn,
        java.lang.String name, long locationId, long bedId, int gender,
        java.lang.String birthday, java.math.BigDecimal minTemperature,
        java.math.BigDecimal maxTemperature, java.lang.String tagNo,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            java.text.ParseException {
        return _patientLocalService.addPatient(mrn, name, locationId, bedId,
            gender, birthday, minTemperature, maxTemperature, tagNo,
            serviceContext);
    }

    @Override
    public com.surwing.model.Patient fetchByMrn(java.lang.String mrn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _patientLocalService.fetchByMrn(mrn);
    }

    @Override
    public java.util.List<com.surwing.model.Patient> findByDisplayTerms(
        com.surwing.search.PatientDisplayTerms displayTerms,
        com.liferay.portal.kernel.util.OrderByComparator obc, int start,
        int end, com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _patientLocalService.findByDisplayTerms(displayTerms, obc,
            start, end, serviceContext);
    }

    @Override
    public int countByDisplayTerms(
        com.surwing.search.PatientDisplayTerms displayTerms,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _patientLocalService.countByDisplayTerms(displayTerms,
            serviceContext);
    }

    @Override
    public void updatePatientStatus(long patientId,
        java.math.BigDecimal temperature)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _patientLocalService.updatePatientStatus(patientId, temperature);
    }

    @Override
    public java.util.List<com.surwing.model.Patient> findPatientStatusByDisplayTerms(
        com.surwing.search.PatientStatusDisplayTerms displayTerms,
        com.liferay.portal.kernel.util.OrderByComparator obc, int start,
        int end, com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _patientLocalService.findPatientStatusByDisplayTerms(displayTerms,
            obc, start, end, serviceContext);
    }

    @Override
    public int countPatientStatusByDisplayTerms(
        com.surwing.search.PatientStatusDisplayTerms displayTerms,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _patientLocalService.countPatientStatusByDisplayTerms(displayTerms,
            serviceContext);
    }

    @Override
    public java.util.List<com.surwing.model.Patient> findMajorPatients(
        long locationId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _patientLocalService.findMajorPatients(locationId, serviceContext);
    }

    @Override
    public void discharge(long patientId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _patientLocalService.discharge(patientId);
    }

    @Override
    public boolean hasFebrilePatient()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _patientLocalService.hasFebrilePatient();
    }

    @Override
    public void unRegisterTag(long patientId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _patientLocalService.unRegisterTag(patientId);
    }

    @Override
    public java.util.List<com.surwing.model.Patient> getInpatientByLocation(
        long locationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _patientLocalService.getInpatientByLocation(locationId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PatientLocalService getWrappedPatientLocalService() {
        return _patientLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPatientLocalService(
        PatientLocalService patientLocalService) {
        _patientLocalService = patientLocalService;
    }

    @Override
    public PatientLocalService getWrappedService() {
        return _patientLocalService;
    }

    @Override
    public void setWrappedService(PatientLocalService patientLocalService) {
        _patientLocalService = patientLocalService;
    }
}
