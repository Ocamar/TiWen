package com.surwing.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.surwing.model.Patient;

import com.surwing.service.PatientLocalServiceUtil;

/**
 * The extended model base implementation for the Patient service. Represents a row in the &quot;M_Patient&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PatientImpl}.
 * </p>
 *
 * @author zhaiyz
 * @see PatientImpl
 * @see com.surwing.model.Patient
 * @generated
 */
public abstract class PatientBaseImpl extends PatientModelImpl
    implements Patient {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a patient model instance should use the {@link Patient} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PatientLocalServiceUtil.addPatient(this);
        } else {
            PatientLocalServiceUtil.updatePatient(this);
        }
    }
}