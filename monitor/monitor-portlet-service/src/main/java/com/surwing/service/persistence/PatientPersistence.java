package com.surwing.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.surwing.model.Patient;

/**
 * The persistence interface for the patient service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see PatientPersistenceImpl
 * @see PatientUtil
 * @generated
 */
public interface PatientPersistence extends BasePersistence<Patient> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PatientUtil} to access the patient persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the patient where mrn = &#63; or throws a {@link com.surwing.NoSuchPatientException} if it could not be found.
    *
    * @param mrn the mrn
    * @return the matching patient
    * @throws com.surwing.NoSuchPatientException if a matching patient could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Patient findByMrn(java.lang.String mrn)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchPatientException;

    /**
    * Returns the patient where mrn = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param mrn the mrn
    * @return the matching patient, or <code>null</code> if a matching patient could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Patient fetchByMrn(java.lang.String mrn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the patient where mrn = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param mrn the mrn
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching patient, or <code>null</code> if a matching patient could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Patient fetchByMrn(java.lang.String mrn,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the patient where mrn = &#63; from the database.
    *
    * @param mrn the mrn
    * @return the patient that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Patient removeByMrn(java.lang.String mrn)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchPatientException;

    /**
    * Returns the number of patients where mrn = &#63;.
    *
    * @param mrn the mrn
    * @return the number of matching patients
    * @throws SystemException if a system exception occurred
    */
    public int countByMrn(java.lang.String mrn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the patients where febrile = &#63; and discharge = &#63; and deleted = &#63;.
    *
    * @param febrile the febrile
    * @param discharge the discharge
    * @param deleted the deleted
    * @return the matching patients
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.surwing.model.Patient> findByFebrile(
        boolean febrile, boolean discharge, boolean deleted)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.surwing.model.Patient> findByFebrile(
        boolean febrile, boolean discharge, boolean deleted, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.surwing.model.Patient> findByFebrile(
        boolean febrile, boolean discharge, boolean deleted, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.surwing.model.Patient findByFebrile_First(boolean febrile,
        boolean discharge, boolean deleted,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchPatientException;

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
    public com.surwing.model.Patient fetchByFebrile_First(boolean febrile,
        boolean discharge, boolean deleted,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.surwing.model.Patient findByFebrile_Last(boolean febrile,
        boolean discharge, boolean deleted,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchPatientException;

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
    public com.surwing.model.Patient fetchByFebrile_Last(boolean febrile,
        boolean discharge, boolean deleted,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.surwing.model.Patient[] findByFebrile_PrevAndNext(
        long patientId, boolean febrile, boolean discharge, boolean deleted,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchPatientException;

    /**
    * Removes all the patients where febrile = &#63; and discharge = &#63; and deleted = &#63; from the database.
    *
    * @param febrile the febrile
    * @param discharge the discharge
    * @param deleted the deleted
    * @throws SystemException if a system exception occurred
    */
    public void removeByFebrile(boolean febrile, boolean discharge,
        boolean deleted)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of patients where febrile = &#63; and discharge = &#63; and deleted = &#63;.
    *
    * @param febrile the febrile
    * @param discharge the discharge
    * @param deleted the deleted
    * @return the number of matching patients
    * @throws SystemException if a system exception occurred
    */
    public int countByFebrile(boolean febrile, boolean discharge,
        boolean deleted)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the patient in the entity cache if it is enabled.
    *
    * @param patient the patient
    */
    public void cacheResult(com.surwing.model.Patient patient);

    /**
    * Caches the patients in the entity cache if it is enabled.
    *
    * @param patients the patients
    */
    public void cacheResult(java.util.List<com.surwing.model.Patient> patients);

    /**
    * Creates a new patient with the primary key. Does not add the patient to the database.
    *
    * @param patientId the primary key for the new patient
    * @return the new patient
    */
    public com.surwing.model.Patient create(long patientId);

    /**
    * Removes the patient with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param patientId the primary key of the patient
    * @return the patient that was removed
    * @throws com.surwing.NoSuchPatientException if a patient with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Patient remove(long patientId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchPatientException;

    public com.surwing.model.Patient updateImpl(
        com.surwing.model.Patient patient)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the patient with the primary key or throws a {@link com.surwing.NoSuchPatientException} if it could not be found.
    *
    * @param patientId the primary key of the patient
    * @return the patient
    * @throws com.surwing.NoSuchPatientException if a patient with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Patient findByPrimaryKey(long patientId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchPatientException;

    /**
    * Returns the patient with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param patientId the primary key of the patient
    * @return the patient, or <code>null</code> if a patient with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Patient fetchByPrimaryKey(long patientId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the patients.
    *
    * @return the patients
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.surwing.model.Patient> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.surwing.model.Patient> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.surwing.model.Patient> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the patients from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of patients.
    *
    * @return the number of patients
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
