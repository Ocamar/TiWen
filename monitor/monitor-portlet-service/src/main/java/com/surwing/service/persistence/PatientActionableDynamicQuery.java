package com.surwing.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.surwing.model.Patient;

import com.surwing.service.PatientLocalServiceUtil;

/**
 * @author zhaiyz
 * @generated
 */
public abstract class PatientActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PatientActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PatientLocalServiceUtil.getService());
        setClass(Patient.class);

        setClassLoader(com.surwing.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("patientId");
    }
}
