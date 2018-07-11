package com.surwing.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.surwing.model.Patient;

import java.util.List;

/**
 * The persistence utility for the patient service. This utility wraps {@link PatientPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see PatientPersistence
 * @see PatientPersistenceImpl
 * @generated
 */
public class PatientUtil {
    private static PatientPersistence _persistence;

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
    public static void clearCache(Patient patient) {
        getPersistence().clearCache(patient);
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
    public static List<Patient> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Patient> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Patient> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Patient update(Patient patient) throws SystemException {
        return getPersistence().update(patient);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Patient update(Patient patient, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(patient, serviceContext);
    }

    /**
    * Returns the patient where mrn = &#63; or throws a {@link com.surwing.NoSuchPatientException} if it could not be found.
    *
    * @param mrn the mrn
    * @return the matching patient
    * @throws com.surwing.NoSuchPatientException if a matching patient could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Patient findByMrn(java.lang.String mrn)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchPatientException {
        return getPersistence().findByMrn(mrn);
    }

    /**
    * Returns the patient where mrn = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param mrn the mrn
    * @return the matching patient, or <code>null</code> if a matching patient could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Patient fetchByMrn(java.lang.String mrn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByMrn(mrn);
    }

    /**
    * Returns the patient where mrn = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param mrn the mrn
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching patient, or <code>null</code> if a matching patient could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Patient fetchByMrn(java.lang.String mrn,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByMrn(mrn, retrieveFromCache);
    }

    /**
    * Removes the patient where mrn = &#63; from the database.
    *
    * @param mrn the mrn
    * @return the patient that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Patient removeByMrn(java.lang.String mrn)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchPatientException {
        return getPersistence().removeByMrn(mrn);
    }

    /**
    * Returns the number of patients where mrn = &#63;.
    *
    * @param mrn the mrn
    * @return the number of matching patients
    * @throws SystemException if a system exception occurred
    */
    public static int countByMrn(java.lang.String mrn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByMrn(mrn);
    }

    /**
    * Returns all the patients where febrile = &#63; and discharge = &#63; and deleted = &#63;.
    *
    * @param febrile the febrile
    * @param discharge the discharge
    * @param deleted the deleted
    * @return the matching patients
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Patient> findByFebrile(
        boolean febrile, boolean discharge, boolean deleted)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByFebrile(febrile, discharge, deleted);
    }

    /**
    * Returns a range of all the patients where febrile = &#63; and discharge = &#63; and deleted = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param febrile the febrile
    * @param discharge the discharge
    * @param deleted the deleted
    * @param start the lower bound of the range of patients
    * @param end the upper bound of the range of patients (not inclusive)
    * @return the range of matching patients
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Patient> findByFebrile(
        boolean febrile, boolean discharge, boolean deleted, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByFebrile(febrile, discharge, deleted, start, end);
    }

    /**
    * Returns an ordered range of all the patients where febrile = &#63; and discharge = &#63; and deleted = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param febrile the febrile
    * @param discharge the discharge
    * @param deleted the deleted
    * @param start the lower bound of the range of patients
    * @param end the upper bound of the range of patients (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching patients
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Patient> findByFebrile(
        boolean febrile, boolean discharge, boolean deleted, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByFebrile(febrile, discharge, deleted, start, end,
            orderByComparator);
    }

    /**
    * Returns the first patient in the ordered set where febrile = &#63; and discharge = &#63; and deleted = &#63;.
    *
    * @param febrile the febrile
    * @param discharge the discharge
    * @param deleted the deleted
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching patient
    * @throws com.surwing.NoSuchPatientException if a matching patient could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Patient findByFebrile_First(
        boolean febrile, boolean discharge, boolean deleted,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchPatientException {
        return getPersistence()
                   .findByFebrile_First(febrile, discharge, deleted,
            orderByComparator);
    }

    /**
    * Returns the first patient in the ordered set where febrile = &#63; and discharge = &#63; and deleted = &#63;.
    *
    * @param febrile the febrile
    * @param discharge the discharge
    * @param deleted the deleted
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching patient, or <code>null</code> if a matching patient could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Patient fetchByFebrile_First(
        boolean febrile, boolean discharge, boolean deleted,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByFebrile_First(febrile, discharge, deleted,
            orderByComparator);
    }

    /**
    * Returns the last patient in the ordered set where febrile = &#63; and discharge = &#63; and deleted = &#63;.
    *
    * @param febrile the febrile
    * @param discharge the discharge
    * @param deleted the deleted
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching patient
    * @throws com.surwing.NoSuchPatientException if a matching patient could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Patient findByFebrile_Last(
        boolean febrile, boolean discharge, boolean deleted,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchPatientException {
        return getPersistence()
                   .findByFebrile_Last(febrile, discharge, deleted,
            orderByComparator);
    }

    /**
    * Returns the last patient in the ordered set where febrile = &#63; and discharge = &#63; and deleted = &#63;.
    *
    * @param febrile the febrile
    * @param discharge the discharge
    * @param deleted the deleted
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching patient, or <code>null</code> if a matching patient could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Patient fetchByFebrile_Last(
        boolean febrile, boolean discharge, boolean deleted,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByFebrile_Last(febrile, discharge, deleted,
            orderByComparator);
    }

    /**
    * Returns the patients before and after the current patient in the ordered set where febrile = &#63; and discharge = &#63; and deleted = &#63;.
    *
    * @param patientId the primary key of the current patient
    * @param febrile the febrile
    * @param discharge the discharge
    * @param deleted the deleted
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next patient
    * @throws com.surwing.NoSuchPatientException if a patient with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Patient[] findByFebrile_PrevAndNext(
        long patientId, boolean febrile, boolean discharge, boolean deleted,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchPatientException {
        return getPersistence()
                   .findByFebrile_PrevAndNext(patientId, febrile, discharge,
            deleted, orderByComparator);
    }

    /**
    * Removes all the patients where febrile = &#63; and discharge = &#63; and deleted = &#63; from the database.
    *
    * @param febrile the febrile
    * @param discharge the discharge
    * @param deleted the deleted
    * @throws SystemException if a system exception occurred
    */
    public static void removeByFebrile(boolean febrile, boolean discharge,
        boolean deleted)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByFebrile(febrile, discharge, deleted);
    }

    /**
    * Returns the number of patients where febrile = &#63; and discharge = &#63; and deleted = &#63;.
    *
    * @param febrile the febrile
    * @param discharge the discharge
    * @param deleted the deleted
    * @return the number of matching patients
    * @throws SystemException if a system exception occurred
    */
    public static int countByFebrile(boolean febrile, boolean discharge,
        boolean deleted)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByFebrile(febrile, discharge, deleted);
    }

    /**
    * Caches the patient in the entity cache if it is enabled.
    *
    * @param patient the patient
    */
    public static void cacheResult(com.surwing.model.Patient patient) {
        getPersistence().cacheResult(patient);
    }

    /**
    * Caches the patients in the entity cache if it is enabled.
    *
    * @param patients the patients
    */
    public static void cacheResult(
        java.util.List<com.surwing.model.Patient> patients) {
        getPersistence().cacheResult(patients);
    }

    /**
    * Creates a new patient with the primary key. Does not add the patient to the database.
    *
    * @param patientId the primary key for the new patient
    * @return the new patient
    */
    public static com.surwing.model.Patient create(long patientId) {
        return getPersistence().create(patientId);
    }

    /**
    * Removes the patient with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param patientId the primary key of the patient
    * @return the patient that was removed
    * @throws com.surwing.NoSuchPatientException if a patient with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Patient remove(long patientId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchPatientException {
        return getPersistence().remove(patientId);
    }

    public static com.surwing.model.Patient updateImpl(
        com.surwing.model.Patient patient)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(patient);
    }

    /**
    * Returns the patient with the primary key or throws a {@link com.surwing.NoSuchPatientException} if it could not be found.
    *
    * @param patientId the primary key of the patient
    * @return the patient
    * @throws com.surwing.NoSuchPatientException if a patient with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Patient findByPrimaryKey(long patientId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchPatientException {
        return getPersistence().findByPrimaryKey(patientId);
    }

    /**
    * Returns the patient with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param patientId the primary key of the patient
    * @return the patient, or <code>null</code> if a patient with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Patient fetchByPrimaryKey(long patientId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(patientId);
    }

    /**
    * Returns all the patients.
    *
    * @return the patients
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Patient> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.surwing.model.Patient> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the patients.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of patients
    * @param end the upper bound of the range of patients (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of patients
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Patient> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the patients from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of patients.
    *
    * @return the number of patients
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PatientPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PatientPersistence) PortletBeanLocatorUtil.locate(com.surwing.service.ClpSerializer.getServletContextName(),
                    PatientPersistence.class.getName());

            ReferenceRegistry.registerReference(PatientUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PatientPersistence persistence) {
    }
}
