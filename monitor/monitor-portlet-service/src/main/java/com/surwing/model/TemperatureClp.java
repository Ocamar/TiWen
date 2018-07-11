package com.surwing.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.surwing.service.ClpSerializer;
import com.surwing.service.TemperatureLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.math.BigDecimal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class TemperatureClp extends BaseModelImpl<Temperature>
    implements Temperature {
    private long _temperatureId;
    private long _patientId;
    private BigDecimal _temperature;
    private Date _createDate;
    private BaseModel<?> _temperatureRemoteModel;
    private Class<?> _clpSerializerClass = com.surwing.service.ClpSerializer.class;

    public TemperatureClp() {
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
    public long getPrimaryKey() {
        return _temperatureId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setTemperatureId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _temperatureId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getTemperatureId() {
        return _temperatureId;
    }

    @Override
    public void setTemperatureId(long temperatureId) {
        _temperatureId = temperatureId;

        if (_temperatureRemoteModel != null) {
            try {
                Class<?> clazz = _temperatureRemoteModel.getClass();

                Method method = clazz.getMethod("setTemperatureId", long.class);

                method.invoke(_temperatureRemoteModel, temperatureId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPatientId() {
        return _patientId;
    }

    @Override
    public void setPatientId(long patientId) {
        _patientId = patientId;

        if (_temperatureRemoteModel != null) {
            try {
                Class<?> clazz = _temperatureRemoteModel.getClass();

                Method method = clazz.getMethod("setPatientId", long.class);

                method.invoke(_temperatureRemoteModel, patientId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public BigDecimal getTemperature() {
        return _temperature;
    }

    @Override
    public void setTemperature(BigDecimal temperature) {
        _temperature = temperature;

        if (_temperatureRemoteModel != null) {
            try {
                Class<?> clazz = _temperatureRemoteModel.getClass();

                Method method = clazz.getMethod("setTemperature",
                        BigDecimal.class);

                method.invoke(_temperatureRemoteModel, temperature);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_temperatureRemoteModel != null) {
            try {
                Class<?> clazz = _temperatureRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_temperatureRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getTemperatureRemoteModel() {
        return _temperatureRemoteModel;
    }

    public void setTemperatureRemoteModel(BaseModel<?> temperatureRemoteModel) {
        _temperatureRemoteModel = temperatureRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _temperatureRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_temperatureRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            TemperatureLocalServiceUtil.addTemperature(this);
        } else {
            TemperatureLocalServiceUtil.updateTemperature(this);
        }
    }

    @Override
    public Temperature toEscapedModel() {
        return (Temperature) ProxyUtil.newProxyInstance(Temperature.class.getClassLoader(),
            new Class[] { Temperature.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        TemperatureClp clone = new TemperatureClp();

        clone.setTemperatureId(getTemperatureId());
        clone.setPatientId(getPatientId());
        clone.setTemperature(getTemperature());
        clone.setCreateDate(getCreateDate());

        return clone;
    }

    @Override
    public int compareTo(Temperature temperature) {
        int value = 0;

        if (getTemperatureId() < temperature.getTemperatureId()) {
            value = -1;
        } else if (getTemperatureId() > temperature.getTemperatureId()) {
            value = 1;
        } else {
            value = 0;
        }

        value = value * -1;

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TemperatureClp)) {
            return false;
        }

        TemperatureClp temperature = (TemperatureClp) obj;

        long primaryKey = temperature.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{temperatureId=");
        sb.append(getTemperatureId());
        sb.append(", patientId=");
        sb.append(getPatientId());
        sb.append(", temperature=");
        sb.append(getTemperature());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.surwing.model.Temperature");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>temperatureId</column-name><column-value><![CDATA[");
        sb.append(getTemperatureId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>patientId</column-name><column-value><![CDATA[");
        sb.append(getPatientId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>temperature</column-name><column-value><![CDATA[");
        sb.append(getTemperature());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
