package com.surwing.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

/**
 * The base model interface for the Temperature service. Represents a row in the &quot;M_Temperature&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.surwing.model.impl.TemperatureModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.surwing.model.impl.TemperatureImpl}.
 * </p>
 *
 * @author zhaiyz
 * @see Temperature
 * @see com.surwing.model.impl.TemperatureImpl
 * @see com.surwing.model.impl.TemperatureModelImpl
 * @generated
 */
public interface TemperatureModel extends BaseModel<Temperature> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a temperature model instance should use the {@link Temperature} interface instead.
     */

    /**
     * Returns the primary key of this temperature.
     *
     * @return the primary key of this temperature
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this temperature.
     *
     * @param primaryKey the primary key of this temperature
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the temperature ID of this temperature.
     *
     * @return the temperature ID of this temperature
     */
    public long getTemperatureId();

    /**
     * Sets the temperature ID of this temperature.
     *
     * @param temperatureId the temperature ID of this temperature
     */
    public void setTemperatureId(long temperatureId);

    /**
     * Returns the patient ID of this temperature.
     *
     * @return the patient ID of this temperature
     */
    public long getPatientId();

    /**
     * Sets the patient ID of this temperature.
     *
     * @param patientId the patient ID of this temperature
     */
    public void setPatientId(long patientId);

    /**
     * Returns the temperature of this temperature.
     *
     * @return the temperature of this temperature
     */
    public BigDecimal getTemperature();

    /**
     * Sets the temperature of this temperature.
     *
     * @param temperature the temperature of this temperature
     */
    public void setTemperature(BigDecimal temperature);

    /**
     * Returns the create date of this temperature.
     *
     * @return the create date of this temperature
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this temperature.
     *
     * @param createDate the create date of this temperature
     */
    public void setCreateDate(Date createDate);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(com.surwing.model.Temperature temperature);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.surwing.model.Temperature> toCacheModel();

    @Override
    public com.surwing.model.Temperature toEscapedModel();

    @Override
    public com.surwing.model.Temperature toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}