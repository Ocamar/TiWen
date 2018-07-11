package com.surwing.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SystemParameter}.
 * </p>
 *
 * @author zhaiyz
 * @see SystemParameter
 * @generated
 */
public class SystemParameterWrapper implements SystemParameter,
    ModelWrapper<SystemParameter> {
    private SystemParameter _systemParameter;

    public SystemParameterWrapper(SystemParameter systemParameter) {
        _systemParameter = systemParameter;
    }

    @Override
    public Class<?> getModelClass() {
        return SystemParameter.class;
    }

    @Override
    public String getModelClassName() {
        return SystemParameter.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("systemParameterId", getSystemParameterId());
        attributes.put("locationId", getLocationId());
        attributes.put("key", getKey());
        attributes.put("value", getValue());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long systemParameterId = (Long) attributes.get("systemParameterId");

        if (systemParameterId != null) {
            setSystemParameterId(systemParameterId);
        }

        Long locationId = (Long) attributes.get("locationId");

        if (locationId != null) {
            setLocationId(locationId);
        }

        String key = (String) attributes.get("key");

        if (key != null) {
            setKey(key);
        }

        String value = (String) attributes.get("value");

        if (value != null) {
            setValue(value);
        }
    }

    /**
    * Returns the primary key of this system parameter.
    *
    * @return the primary key of this system parameter
    */
    @Override
    public long getPrimaryKey() {
        return _systemParameter.getPrimaryKey();
    }

    /**
    * Sets the primary key of this system parameter.
    *
    * @param primaryKey the primary key of this system parameter
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _systemParameter.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the system parameter ID of this system parameter.
    *
    * @return the system parameter ID of this system parameter
    */
    @Override
    public long getSystemParameterId() {
        return _systemParameter.getSystemParameterId();
    }

    /**
    * Sets the system parameter ID of this system parameter.
    *
    * @param systemParameterId the system parameter ID of this system parameter
    */
    @Override
    public void setSystemParameterId(long systemParameterId) {
        _systemParameter.setSystemParameterId(systemParameterId);
    }

    /**
    * Returns the location ID of this system parameter.
    *
    * @return the location ID of this system parameter
    */
    @Override
    public long getLocationId() {
        return _systemParameter.getLocationId();
    }

    /**
    * Sets the location ID of this system parameter.
    *
    * @param locationId the location ID of this system parameter
    */
    @Override
    public void setLocationId(long locationId) {
        _systemParameter.setLocationId(locationId);
    }

    /**
    * Returns the key of this system parameter.
    *
    * @return the key of this system parameter
    */
    @Override
    public java.lang.String getKey() {
        return _systemParameter.getKey();
    }

    /**
    * Sets the key of this system parameter.
    *
    * @param key the key of this system parameter
    */
    @Override
    public void setKey(java.lang.String key) {
        _systemParameter.setKey(key);
    }

    /**
    * Returns the value of this system parameter.
    *
    * @return the value of this system parameter
    */
    @Override
    public java.lang.String getValue() {
        return _systemParameter.getValue();
    }

    /**
    * Sets the value of this system parameter.
    *
    * @param value the value of this system parameter
    */
    @Override
    public void setValue(java.lang.String value) {
        _systemParameter.setValue(value);
    }

    @Override
    public boolean isNew() {
        return _systemParameter.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _systemParameter.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _systemParameter.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _systemParameter.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _systemParameter.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _systemParameter.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _systemParameter.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _systemParameter.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _systemParameter.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _systemParameter.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _systemParameter.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new SystemParameterWrapper((SystemParameter) _systemParameter.clone());
    }

    @Override
    public int compareTo(com.surwing.model.SystemParameter systemParameter) {
        return _systemParameter.compareTo(systemParameter);
    }

    @Override
    public int hashCode() {
        return _systemParameter.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.surwing.model.SystemParameter> toCacheModel() {
        return _systemParameter.toCacheModel();
    }

    @Override
    public com.surwing.model.SystemParameter toEscapedModel() {
        return new SystemParameterWrapper(_systemParameter.toEscapedModel());
    }

    @Override
    public com.surwing.model.SystemParameter toUnescapedModel() {
        return new SystemParameterWrapper(_systemParameter.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _systemParameter.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _systemParameter.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _systemParameter.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SystemParameterWrapper)) {
            return false;
        }

        SystemParameterWrapper systemParameterWrapper = (SystemParameterWrapper) obj;

        if (Validator.equals(_systemParameter,
                    systemParameterWrapper._systemParameter)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public SystemParameter getWrappedSystemParameter() {
        return _systemParameter;
    }

    @Override
    public SystemParameter getWrappedModel() {
        return _systemParameter;
    }

    @Override
    public void resetOriginalValues() {
        _systemParameter.resetOriginalValues();
    }
}
