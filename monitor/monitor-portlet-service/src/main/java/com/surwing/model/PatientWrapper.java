package com.surwing.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.math.BigDecimal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Patient}.
 * </p>
 *
 * @author zhaiyz
 * @see Patient
 * @generated
 */
public class PatientWrapper implements Patient, ModelWrapper<Patient> {
    private Patient _patient;

    public PatientWrapper(Patient patient) {
        _patient = patient;
    }

    @Override
    public Class<?> getModelClass() {
        return Patient.class;
    }

    @Override
    public String getModelClassName() {
        return Patient.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("patientId", getPatientId());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("mrn", getMrn());
        attributes.put("name", getName());
        attributes.put("locationId", getLocationId());
        attributes.put("bedId", getBedId());
        attributes.put("gender", getGender());
        attributes.put("birthday", getBirthday());
        attributes.put("minTemperature", getMinTemperature());
        attributes.put("maxTemperature", getMaxTemperature());
        attributes.put("tagNo", getTagNo());
        attributes.put("temperature", getTemperature());
        attributes.put("latestDate", getLatestDate());
        attributes.put("temperatureIn8h", getTemperatureIn8h());
        attributes.put("highestDate", getHighestDate());
        attributes.put("febrile", getFebrile());
        attributes.put("alarmLevel", getAlarmLevel());
        attributes.put("discharge", getDischarge());
        attributes.put("deleted", getDeleted());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long patientId = (Long) attributes.get("patientId");

        if (patientId != null) {
            setPatientId(patientId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        String mrn = (String) attributes.get("mrn");

        if (mrn != null) {
            setMrn(mrn);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Long locationId = (Long) attributes.get("locationId");

        if (locationId != null) {
            setLocationId(locationId);
        }

        Long bedId = (Long) attributes.get("bedId");

        if (bedId != null) {
            setBedId(bedId);
        }

        Integer gender = (Integer) attributes.get("gender");

        if (gender != null) {
            setGender(gender);
        }

        Date birthday = (Date) attributes.get("birthday");

        if (birthday != null) {
            setBirthday(birthday);
        }

        BigDecimal minTemperature = (BigDecimal) attributes.get(
                "minTemperature");

        if (minTemperature != null) {
            setMinTemperature(minTemperature);
        }

        BigDecimal maxTemperature = (BigDecimal) attributes.get(
                "maxTemperature");

        if (maxTemperature != null) {
            setMaxTemperature(maxTemperature);
        }

        String tagNo = (String) attributes.get("tagNo");

        if (tagNo != null) {
            setTagNo(tagNo);
        }

        BigDecimal temperature = (BigDecimal) attributes.get("temperature");

        if (temperature != null) {
            setTemperature(temperature);
        }

        Date latestDate = (Date) attributes.get("latestDate");

        if (latestDate != null) {
            setLatestDate(latestDate);
        }

        BigDecimal temperatureIn8h = (BigDecimal) attributes.get(
                "temperatureIn8h");

        if (temperatureIn8h != null) {
            setTemperatureIn8h(temperatureIn8h);
        }

        Date highestDate = (Date) attributes.get("highestDate");

        if (highestDate != null) {
            setHighestDate(highestDate);
        }

        Boolean febrile = (Boolean) attributes.get("febrile");

        if (febrile != null) {
            setFebrile(febrile);
        }

        BigDecimal alarmLevel = (BigDecimal) attributes.get("alarmLevel");

        if (alarmLevel != null) {
            setAlarmLevel(alarmLevel);
        }

        Boolean discharge = (Boolean) attributes.get("discharge");

        if (discharge != null) {
            setDischarge(discharge);
        }

        Boolean deleted = (Boolean) attributes.get("deleted");

        if (deleted != null) {
            setDeleted(deleted);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }
    }

    /**
    * Returns the primary key of this patient.
    *
    * @return the primary key of this patient
    */
    @Override
    public long getPrimaryKey() {
        return _patient.getPrimaryKey();
    }

    /**
    * Sets the primary key of this patient.
    *
    * @param primaryKey the primary key of this patient
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _patient.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the patient ID of this patient.
    *
    * @return the patient ID of this patient
    */
    @Override
    public long getPatientId() {
        return _patient.getPatientId();
    }

    /**
    * Sets the patient ID of this patient.
    *
    * @param patientId the patient ID of this patient
    */
    @Override
    public void setPatientId(long patientId) {
        _patient.setPatientId(patientId);
    }

    /**
    * Returns the company ID of this patient.
    *
    * @return the company ID of this patient
    */
    @Override
    public long getCompanyId() {
        return _patient.getCompanyId();
    }

    /**
    * Sets the company ID of this patient.
    *
    * @param companyId the company ID of this patient
    */
    @Override
    public void setCompanyId(long companyId) {
        _patient.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this patient.
    *
    * @return the group ID of this patient
    */
    @Override
    public long getGroupId() {
        return _patient.getGroupId();
    }

    /**
    * Sets the group ID of this patient.
    *
    * @param groupId the group ID of this patient
    */
    @Override
    public void setGroupId(long groupId) {
        _patient.setGroupId(groupId);
    }

    /**
    * Returns the mrn of this patient.
    *
    * @return the mrn of this patient
    */
    @Override
    public java.lang.String getMrn() {
        return _patient.getMrn();
    }

    /**
    * Sets the mrn of this patient.
    *
    * @param mrn the mrn of this patient
    */
    @Override
    public void setMrn(java.lang.String mrn) {
        _patient.setMrn(mrn);
    }

    /**
    * Returns the name of this patient.
    *
    * @return the name of this patient
    */
    @Override
    public java.lang.String getName() {
        return _patient.getName();
    }

    /**
    * Sets the name of this patient.
    *
    * @param name the name of this patient
    */
    @Override
    public void setName(java.lang.String name) {
        _patient.setName(name);
    }

    /**
    * Returns the location ID of this patient.
    *
    * @return the location ID of this patient
    */
    @Override
    public long getLocationId() {
        return _patient.getLocationId();
    }

    /**
    * Sets the location ID of this patient.
    *
    * @param locationId the location ID of this patient
    */
    @Override
    public void setLocationId(long locationId) {
        _patient.setLocationId(locationId);
    }

    /**
    * Returns the bed ID of this patient.
    *
    * @return the bed ID of this patient
    */
    @Override
    public long getBedId() {
        return _patient.getBedId();
    }

    /**
    * Sets the bed ID of this patient.
    *
    * @param bedId the bed ID of this patient
    */
    @Override
    public void setBedId(long bedId) {
        _patient.setBedId(bedId);
    }

    /**
    * Returns the gender of this patient.
    *
    * @return the gender of this patient
    */
    @Override
    public int getGender() {
        return _patient.getGender();
    }

    /**
    * Sets the gender of this patient.
    *
    * @param gender the gender of this patient
    */
    @Override
    public void setGender(int gender) {
        _patient.setGender(gender);
    }

    /**
    * Returns the birthday of this patient.
    *
    * @return the birthday of this patient
    */
    @Override
    public java.util.Date getBirthday() {
        return _patient.getBirthday();
    }

    /**
    * Sets the birthday of this patient.
    *
    * @param birthday the birthday of this patient
    */
    @Override
    public void setBirthday(java.util.Date birthday) {
        _patient.setBirthday(birthday);
    }

    /**
    * Returns the min temperature of this patient.
    *
    * @return the min temperature of this patient
    */
    @Override
    public java.math.BigDecimal getMinTemperature() {
        return _patient.getMinTemperature();
    }

    /**
    * Sets the min temperature of this patient.
    *
    * @param minTemperature the min temperature of this patient
    */
    @Override
    public void setMinTemperature(java.math.BigDecimal minTemperature) {
        _patient.setMinTemperature(minTemperature);
    }

    /**
    * Returns the max temperature of this patient.
    *
    * @return the max temperature of this patient
    */
    @Override
    public java.math.BigDecimal getMaxTemperature() {
        return _patient.getMaxTemperature();
    }

    /**
    * Sets the max temperature of this patient.
    *
    * @param maxTemperature the max temperature of this patient
    */
    @Override
    public void setMaxTemperature(java.math.BigDecimal maxTemperature) {
        _patient.setMaxTemperature(maxTemperature);
    }

    /**
    * Returns the tag no of this patient.
    *
    * @return the tag no of this patient
    */
    @Override
    public java.lang.String getTagNo() {
        return _patient.getTagNo();
    }

    /**
    * Sets the tag no of this patient.
    *
    * @param tagNo the tag no of this patient
    */
    @Override
    public void setTagNo(java.lang.String tagNo) {
        _patient.setTagNo(tagNo);
    }

    /**
    * Returns the temperature of this patient.
    *
    * @return the temperature of this patient
    */
    @Override
    public java.math.BigDecimal getTemperature() {
        return _patient.getTemperature();
    }

    /**
    * Sets the temperature of this patient.
    *
    * @param temperature the temperature of this patient
    */
    @Override
    public void setTemperature(java.math.BigDecimal temperature) {
        _patient.setTemperature(temperature);
    }

    /**
    * Returns the latest date of this patient.
    *
    * @return the latest date of this patient
    */
    @Override
    public java.util.Date getLatestDate() {
        return _patient.getLatestDate();
    }

    /**
    * Sets the latest date of this patient.
    *
    * @param latestDate the latest date of this patient
    */
    @Override
    public void setLatestDate(java.util.Date latestDate) {
        _patient.setLatestDate(latestDate);
    }

    /**
    * Returns the temperature in8h of this patient.
    *
    * @return the temperature in8h of this patient
    */
    @Override
    public java.math.BigDecimal getTemperatureIn8h() {
        return _patient.getTemperatureIn8h();
    }

    /**
    * Sets the temperature in8h of this patient.
    *
    * @param temperatureIn8h the temperature in8h of this patient
    */
    @Override
    public void setTemperatureIn8h(java.math.BigDecimal temperatureIn8h) {
        _patient.setTemperatureIn8h(temperatureIn8h);
    }

    /**
    * Returns the highest date of this patient.
    *
    * @return the highest date of this patient
    */
    @Override
    public java.util.Date getHighestDate() {
        return _patient.getHighestDate();
    }

    /**
    * Sets the highest date of this patient.
    *
    * @param highestDate the highest date of this patient
    */
    @Override
    public void setHighestDate(java.util.Date highestDate) {
        _patient.setHighestDate(highestDate);
    }

    /**
    * Returns the febrile of this patient.
    *
    * @return the febrile of this patient
    */
    @Override
    public boolean getFebrile() {
        return _patient.getFebrile();
    }

    /**
    * Returns <code>true</code> if this patient is febrile.
    *
    * @return <code>true</code> if this patient is febrile; <code>false</code> otherwise
    */
    @Override
    public boolean isFebrile() {
        return _patient.isFebrile();
    }

    /**
    * Sets whether this patient is febrile.
    *
    * @param febrile the febrile of this patient
    */
    @Override
    public void setFebrile(boolean febrile) {
        _patient.setFebrile(febrile);
    }

    /**
    * Returns the alarm level of this patient.
    *
    * @return the alarm level of this patient
    */
    @Override
    public java.math.BigDecimal getAlarmLevel() {
        return _patient.getAlarmLevel();
    }

    /**
    * Sets the alarm level of this patient.
    *
    * @param alarmLevel the alarm level of this patient
    */
    @Override
    public void setAlarmLevel(java.math.BigDecimal alarmLevel) {
        _patient.setAlarmLevel(alarmLevel);
    }

    /**
    * Returns the discharge of this patient.
    *
    * @return the discharge of this patient
    */
    @Override
    public boolean getDischarge() {
        return _patient.getDischarge();
    }

    /**
    * Returns <code>true</code> if this patient is discharge.
    *
    * @return <code>true</code> if this patient is discharge; <code>false</code> otherwise
    */
    @Override
    public boolean isDischarge() {
        return _patient.isDischarge();
    }

    /**
    * Sets whether this patient is discharge.
    *
    * @param discharge the discharge of this patient
    */
    @Override
    public void setDischarge(boolean discharge) {
        _patient.setDischarge(discharge);
    }

    /**
    * Returns the deleted of this patient.
    *
    * @return the deleted of this patient
    */
    @Override
    public boolean getDeleted() {
        return _patient.getDeleted();
    }

    /**
    * Returns <code>true</code> if this patient is deleted.
    *
    * @return <code>true</code> if this patient is deleted; <code>false</code> otherwise
    */
    @Override
    public boolean isDeleted() {
        return _patient.isDeleted();
    }

    /**
    * Sets whether this patient is deleted.
    *
    * @param deleted the deleted of this patient
    */
    @Override
    public void setDeleted(boolean deleted) {
        _patient.setDeleted(deleted);
    }

    /**
    * Returns the create date of this patient.
    *
    * @return the create date of this patient
    */
    @Override
    public java.util.Date getCreateDate() {
        return _patient.getCreateDate();
    }

    /**
    * Sets the create date of this patient.
    *
    * @param createDate the create date of this patient
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _patient.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this patient.
    *
    * @return the modified date of this patient
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _patient.getModifiedDate();
    }

    /**
    * Sets the modified date of this patient.
    *
    * @param modifiedDate the modified date of this patient
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _patient.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _patient.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _patient.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _patient.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _patient.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _patient.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _patient.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _patient.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _patient.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _patient.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _patient.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _patient.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PatientWrapper((Patient) _patient.clone());
    }

    @Override
    public int compareTo(com.surwing.model.Patient patient) {
        return _patient.compareTo(patient);
    }

    @Override
    public int hashCode() {
        return _patient.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.surwing.model.Patient> toCacheModel() {
        return _patient.toCacheModel();
    }

    @Override
    public com.surwing.model.Patient toEscapedModel() {
        return new PatientWrapper(_patient.toEscapedModel());
    }

    @Override
    public com.surwing.model.Patient toUnescapedModel() {
        return new PatientWrapper(_patient.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _patient.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _patient.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _patient.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PatientWrapper)) {
            return false;
        }

        PatientWrapper patientWrapper = (PatientWrapper) obj;

        if (Validator.equals(_patient, patientWrapper._patient)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Patient getWrappedPatient() {
        return _patient;
    }

    @Override
    public Patient getWrappedModel() {
        return _patient;
    }

    @Override
    public void resetOriginalValues() {
        _patient.resetOriginalValues();
    }
}
