package com.surwing.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Patient. This utility wraps
 * {@link com.surwing.service.impl.PatientLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author zhaiyz
 * @see PatientLocalService
 * @see com.surwing.service.base.PatientLocalServiceBaseImpl
 * @see com.surwing.service.impl.PatientLocalServiceImpl
 * @generated
 */
public class PatientLocalServiceUtil {
    private static PatientLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.surwing.service.impl.PatientLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the patient to the database. Also notifies the appropriate model listeners.
    *
    * @param patient the patient
    * @return the patient that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Patient addPatient(
        com.surwing.model.Patient patient)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addPatient(patient);
    }

    /**
    * Creates a new patient with the primary key. Does not add the patient to the database.
    *
    * @param patientId the primary key for the new patient
    * @return the new patient
    */
    public static com.surwing.model.Patient createPatient(long patientId) {
        return getService().createPatient(patientId);
    }

    /**
    * Deletes the patient with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param patientId the primary key of the patient
    * @return the patient that was removed
    * @throws PortalException if a patient with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Patient deletePatient(long patientId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePatient(patientId);
    }

    /**
    * Deletes the patient from the database. Also notifies the appropriate model listeners.
    *
    * @param patient the patient
    * @return the patient that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Patient deletePatient(
        com.surwing.model.Patient patient)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePatient(patient);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.surwing.model.Patient fetchPatient(long patientId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPatient(patientId);
    }

    /**
    * Returns the patient with the primary key.
    *
    * @param patientId the primary key of the patient
    * @return the patient
    * @throws PortalException if a patient with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Patient getPatient(long patientId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPatient(patientId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.surwing.model.Patient> getPatients(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPatients(start, end);
    }

    /**
    * Returns the number of patients.
    *
    * @return the number of patients
    * @throws SystemException if a system exception occurred
    */
    public static int getPatientsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPatientsCount();
    }

    /**
    * Updates the patient in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param patient the patient
    * @return the patient that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Patient updatePatient(
        com.surwing.model.Patient patient)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatePatient(patient);
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

    public static com.surwing.model.Patient addPatient(java.lang.String mrn,
        java.lang.String name, long locationId, long bedId, int gender,
        java.lang.String birthday, java.math.BigDecimal minTemperature,
        java.math.BigDecimal maxTemperature, java.lang.String tagNo,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            java.text.ParseException {
        return getService()
                   .addPatient(mrn, name, locationId, bedId, gender, birthday,
            minTemperature, maxTemperature, tagNo, serviceContext);
    }

    public static com.surwing.model.Patient fetchByMrn(java.lang.String mrn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchByMrn(mrn);
    }

    public static java.util.List<com.surwing.model.Patient> findByDisplayTerms(
        com.surwing.search.PatientDisplayTerms displayTerms,
        com.liferay.portal.kernel.util.OrderByComparator obc, int start,
        int end, com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .findByDisplayTerms(displayTerms, obc, start, end,
            serviceContext);
    }

    public static int countByDisplayTerms(
        com.surwing.search.PatientDisplayTerms displayTerms,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().countByDisplayTerms(displayTerms, serviceContext);
    }

    public static void updatePatientStatus(long patientId,
        java.math.BigDecimal temperature)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().updatePatientStatus(patientId, temperature);
    }

    public static java.util.List<com.surwing.model.Patient> findPatientStatusByDisplayTerms(
        com.surwing.search.PatientStatusDisplayTerms displayTerms,
        com.liferay.portal.kernel.util.OrderByComparator obc, int start,
        int end, com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .findPatientStatusByDisplayTerms(displayTerms, obc, start,
            end, serviceContext);
    }

    public static int countPatientStatusByDisplayTerms(
        com.surwing.search.PatientStatusDisplayTerms displayTerms,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .countPatientStatusByDisplayTerms(displayTerms,
            serviceContext);
    }

    public static java.util.List<com.surwing.model.Patient> findMajorPatients(
        long locationId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findMajorPatients(locationId, serviceContext);
    }

    public static void discharge(long patientId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().discharge(patientId);
    }

    public static boolean hasFebrilePatient()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().hasFebrilePatient();
    }

    public static void unRegisterTag(long patientId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().unRegisterTag(patientId);
    }

    public static java.util.List<com.surwing.model.Patient> getInpatientByLocation(
        long locationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getInpatientByLocation(locationId);
    }

    public static void clearService() {
        _service = null;
    }

    public static PatientLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PatientLocalService.class.getName());

            if (invokableLocalService instanceof PatientLocalService) {
                _service = (PatientLocalService) invokableLocalService;
            } else {
                _service = new PatientLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(PatientLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(PatientLocalService service) {
    }
}
