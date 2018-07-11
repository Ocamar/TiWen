package com.surwing.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.math.BigDecimal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Temperature}.
 * </p>
 *
 * @author zhaiyz
 * @see Temperature
 * @generated
 */
public class TemperatureWrapper implements Temperature,
    ModelWrapper<Temperature> {
    private Temperature _temperature;

    public TemperatureWrapper(Temperature temperature) {
        _temperature = temperature;
    }

    @Override
    public Class<?> getModelClass() {
        return Temperature.class;
    }

    @Override
    public String getModelClassName() {
        return Temperature.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("temperatureId", getTemperatureId());
        attributes.put("patientId", getPatientId());
        attributes.put("temperature", getTemperature());
        attributes.put("createDate", getCreateDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long temperatureId = (Long) attributes.get("temperatureId");

        if (temperatureId != null) {
            setTemperatureId(temperatureId);
        }

        Long patientId = (Long) attributes.get("patientId");

        if (patientId != null) {
            setPatientId(patientId);
        }

        BigDecimal temperature = (BigDecimal) attributes.get("temperature");

        if (temperature != null) {
            setTemperature(temperature);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }
    }

    /**
    * Returns the primary key of this temperature.
    *
    * @return the primary key of this temperature
    */
    @Override
    public long getPrimaryKey() {
        return _temperature.getPrimaryKey();
    }

    /**
    * Sets the primary key of this temperature.
    *
    * @param primaryKey the primary key of this temperature
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _temperature.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the temperature ID of this temperature.
    *
    * @return the temperature ID of this temperature
    */
    @Override
    public long getTemperatureId() {
        return _temperature.getTemperatureId();
    }

    /**
    * Sets the temperature ID of this temperature.
    *
    * @param temperatureId the temperature ID of this temperature
    */
    @Override
    public void setTemperatureId(long temperatureId) {
        _temperature.setTemperatureId(temperatureId);
    }

    /**
    * Returns the patient ID of this temperature.
    *
    * @return the patient ID of this temperature
    */
    @Override
    public long getPatientId() {
        return _temperature.getPatientId();
    }

    /**
    * Sets the patient ID of this temperature.
    *
    * @param patientId the patient ID of this temperature
    */
    @Override
    public void setPatientId(long patientId) {
        _temperature.setPatientId(patientId);
    }

    /**
    * Returns the temperature of this temperature.
    *
    * @return the temperature of this temperature
    */
    @Override
    public java.math.BigDecimal getTemperature() {
        return _temperature.getTemperature();
    }

    /**
    * Sets the temperature of this temperature.
    *
    * @param temperature the temperature of this temperature
    */
    @Override
    public void setTemperature(java.math.BigDecimal temperature) {
        _temperature.setTemperature(temperature);
    }

    /**
    * Returns the create date of this temperature.
    *
    * @return the create date of this temperature
    */
    @Override
    public java.util.Date getCreateDate() {
        return _temperature.getCreateDate();
    }

    /**
    * Sets the create date of this temperature.
    *
    * @param createDate the create date of this temperature
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _temperature.setCreateDate(createDate);
    }

    @Override
    public boolean isNew() {
        return _temperature.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _temperature.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _temperature.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _temperature.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _temperature.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _temperature.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _temperature.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _temperature.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _temperature.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _temperature.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _temperature.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new TemperatureWrapper((Temperature) _temperature.clone());
    }

    @Override
    public int compareTo(com.surwing.model.Temperature temperature) {
        return _temperature.compareTo(temperature);
    }

    @Override
    public int hashCode() {
        return _temperature.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.surwing.model.Temperature> toCacheModel() {
        return _temperature.toCacheModel();
    }

    @Override
    public com.surwing.model.Temperature toEscapedModel() {
        return new TemperatureWrapper(_temperature.toEscapedModel());
    }

    @Override
    public com.surwing.model.Temperature toUnescapedModel() {
        return new TemperatureWrapper(_temperature.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _temperature.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _temperature.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _temperature.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TemperatureWrapper)) {
            return false;
        }

        TemperatureWrapper temperatureWrapper = (TemperatureWrapper) obj;

        if (Validator.equals(_temperature, temperatureWrapper._temperature)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Temperature getWrappedTemperature() {
        return _temperature;
    }

    @Override
    public Temperature getWrappedModel() {
        return _temperature;
    }

    @Override
    public void resetOriginalValues() {
        _temperature.resetOriginalValues();
    }
}
