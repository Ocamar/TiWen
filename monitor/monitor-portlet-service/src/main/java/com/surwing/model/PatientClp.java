package com.surwing.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.surwing.service.ClpSerializer;
import com.surwing.service.PatientLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.math.BigDecimal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class PatientClp extends BaseModelImpl<Patient> implements Patient {
    private long _patientId;
    private long _companyId;
    private long _groupId;
    private String _mrn;
    private String _name;
    private long _locationId;
    private long _bedId;
    private int _gender;
    private Date _birthday;
    private BigDecimal _minTemperature;
    private BigDecimal _maxTemperature;
    private String _tagNo;
    private BigDecimal _temperature;
    private Date _latestDate;
    private BigDecimal _temperatureIn8h;
    private Date _highestDate;
    private boolean _febrile;
    private BigDecimal _alarmLevel;
    private boolean _discharge;
    private boolean _deleted;
    private Date _createDate;
    private Date _modifiedDate;
    private BaseModel<?> _patientRemoteModel;
    private Class<?> _clpSerializerClass = com.surwing.service.ClpSerializer.class;

    public PatientClp() {
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
    public long getPrimaryKey() {
        return _patientId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPatientId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _patientId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getPatientId() {
        return _patientId;
    }

    @Override
    public void setPatientId(long patientId) {
        _patientId = patientId;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setPatientId", long.class);

                method.invoke(_patientRemoteModel, patientId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_patientRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_patientRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMrn() {
        return _mrn;
    }

    @Override
    public void setMrn(String mrn) {
        _mrn = mrn;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setMrn", String.class);

                method.invoke(_patientRemoteModel, mrn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_patientRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getLocationId() {
        return _locationId;
    }

    @Override
    public void setLocationId(long locationId) {
        _locationId = locationId;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setLocationId", long.class);

                method.invoke(_patientRemoteModel, locationId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getBedId() {
        return _bedId;
    }

    @Override
    public void setBedId(long bedId) {
        _bedId = bedId;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setBedId", long.class);

                method.invoke(_patientRemoteModel, bedId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getGender() {
        return _gender;
    }

    @Override
    public void setGender(int gender) {
        _gender = gender;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setGender", int.class);

                method.invoke(_patientRemoteModel, gender);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getBirthday() {
        return _birthday;
    }

    @Override
    public void setBirthday(Date birthday) {
        _birthday = birthday;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setBirthday", Date.class);

                method.invoke(_patientRemoteModel, birthday);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public BigDecimal getMinTemperature() {
        return _minTemperature;
    }

    @Override
    public void setMinTemperature(BigDecimal minTemperature) {
        _minTemperature = minTemperature;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setMinTemperature",
                        BigDecimal.class);

                method.invoke(_patientRemoteModel, minTemperature);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public BigDecimal getMaxTemperature() {
        return _maxTemperature;
    }

    @Override
    public void setMaxTemperature(BigDecimal maxTemperature) {
        _maxTemperature = maxTemperature;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setMaxTemperature",
                        BigDecimal.class);

                method.invoke(_patientRemoteModel, maxTemperature);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTagNo() {
        return _tagNo;
    }

    @Override
    public void setTagNo(String tagNo) {
        _tagNo = tagNo;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setTagNo", String.class);

                method.invoke(_patientRemoteModel, tagNo);
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

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setTemperature",
                        BigDecimal.class);

                method.invoke(_patientRemoteModel, temperature);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getLatestDate() {
        return _latestDate;
    }

    @Override
    public void setLatestDate(Date latestDate) {
        _latestDate = latestDate;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setLatestDate", Date.class);

                method.invoke(_patientRemoteModel, latestDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public BigDecimal getTemperatureIn8h() {
        return _temperatureIn8h;
    }

    @Override
    public void setTemperatureIn8h(BigDecimal temperatureIn8h) {
        _temperatureIn8h = temperatureIn8h;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setTemperatureIn8h",
                        BigDecimal.class);

                method.invoke(_patientRemoteModel, temperatureIn8h);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getHighestDate() {
        return _highestDate;
    }

    @Override
    public void setHighestDate(Date highestDate) {
        _highestDate = highestDate;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setHighestDate", Date.class);

                method.invoke(_patientRemoteModel, highestDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getFebrile() {
        return _febrile;
    }

    @Override
    public boolean isFebrile() {
        return _febrile;
    }

    @Override
    public void setFebrile(boolean febrile) {
        _febrile = febrile;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setFebrile", boolean.class);

                method.invoke(_patientRemoteModel, febrile);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public BigDecimal getAlarmLevel() {
        return _alarmLevel;
    }

    @Override
    public void setAlarmLevel(BigDecimal alarmLevel) {
        _alarmLevel = alarmLevel;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setAlarmLevel",
                        BigDecimal.class);

                method.invoke(_patientRemoteModel, alarmLevel);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getDischarge() {
        return _discharge;
    }

    @Override
    public boolean isDischarge() {
        return _discharge;
    }

    @Override
    public void setDischarge(boolean discharge) {
        _discharge = discharge;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setDischarge", boolean.class);

                method.invoke(_patientRemoteModel, discharge);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getDeleted() {
        return _deleted;
    }

    @Override
    public boolean isDeleted() {
        return _deleted;
    }

    @Override
    public void setDeleted(boolean deleted) {
        _deleted = deleted;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setDeleted", boolean.class);

                method.invoke(_patientRemoteModel, deleted);
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

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_patientRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_patientRemoteModel != null) {
            try {
                Class<?> clazz = _patientRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_patientRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPatientRemoteModel() {
        return _patientRemoteModel;
    }

    public void setPatientRemoteModel(BaseModel<?> patientRemoteModel) {
        _patientRemoteModel = patientRemoteModel;
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

        Class<?> remoteModelClass = _patientRemoteModel.getClass();

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

        Object returnValue = method.invoke(_patientRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PatientLocalServiceUtil.addPatient(this);
        } else {
            PatientLocalServiceUtil.updatePatient(this);
        }
    }

    @Override
    public Patient toEscapedModel() {
        return (Patient) ProxyUtil.newProxyInstance(Patient.class.getClassLoader(),
            new Class[] { Patient.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PatientClp clone = new PatientClp();

        clone.setPatientId(getPatientId());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());
        clone.setMrn(getMrn());
        clone.setName(getName());
        clone.setLocationId(getLocationId());
        clone.setBedId(getBedId());
        clone.setGender(getGender());
        clone.setBirthday(getBirthday());
        clone.setMinTemperature(getMinTemperature());
        clone.setMaxTemperature(getMaxTemperature());
        clone.setTagNo(getTagNo());
        clone.setTemperature(getTemperature());
        clone.setLatestDate(getLatestDate());
        clone.setTemperatureIn8h(getTemperatureIn8h());
        clone.setHighestDate(getHighestDate());
        clone.setFebrile(getFebrile());
        clone.setAlarmLevel(getAlarmLevel());
        clone.setDischarge(getDischarge());
        clone.setDeleted(getDeleted());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());

        return clone;
    }

    @Override
    public int compareTo(Patient patient) {
        long primaryKey = patient.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PatientClp)) {
            return false;
        }

        PatientClp patient = (PatientClp) obj;

        long primaryKey = patient.getPrimaryKey();

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
        StringBundler sb = new StringBundler(45);

        sb.append("{patientId=");
        sb.append(getPatientId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", mrn=");
        sb.append(getMrn());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", locationId=");
        sb.append(getLocationId());
        sb.append(", bedId=");
        sb.append(getBedId());
        sb.append(", gender=");
        sb.append(getGender());
        sb.append(", birthday=");
        sb.append(getBirthday());
        sb.append(", minTemperature=");
        sb.append(getMinTemperature());
        sb.append(", maxTemperature=");
        sb.append(getMaxTemperature());
        sb.append(", tagNo=");
        sb.append(getTagNo());
        sb.append(", temperature=");
        sb.append(getTemperature());
        sb.append(", latestDate=");
        sb.append(getLatestDate());
        sb.append(", temperatureIn8h=");
        sb.append(getTemperatureIn8h());
        sb.append(", highestDate=");
        sb.append(getHighestDate());
        sb.append(", febrile=");
        sb.append(getFebrile());
        sb.append(", alarmLevel=");
        sb.append(getAlarmLevel());
        sb.append(", discharge=");
        sb.append(getDischarge());
        sb.append(", deleted=");
        sb.append(getDeleted());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(70);

        sb.append("<model><model-name>");
        sb.append("com.surwing.model.Patient");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>patientId</column-name><column-value><![CDATA[");
        sb.append(getPatientId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>mrn</column-name><column-value><![CDATA[");
        sb.append(getMrn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>locationId</column-name><column-value><![CDATA[");
        sb.append(getLocationId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bedId</column-name><column-value><![CDATA[");
        sb.append(getBedId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>gender</column-name><column-value><![CDATA[");
        sb.append(getGender());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>birthday</column-name><column-value><![CDATA[");
        sb.append(getBirthday());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>minTemperature</column-name><column-value><![CDATA[");
        sb.append(getMinTemperature());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>maxTemperature</column-name><column-value><![CDATA[");
        sb.append(getMaxTemperature());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tagNo</column-name><column-value><![CDATA[");
        sb.append(getTagNo());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>temperature</column-name><column-value><![CDATA[");
        sb.append(getTemperature());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>latestDate</column-name><column-value><![CDATA[");
        sb.append(getLatestDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>temperatureIn8h</column-name><column-value><![CDATA[");
        sb.append(getTemperatureIn8h());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>highestDate</column-name><column-value><![CDATA[");
        sb.append(getHighestDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>febrile</column-name><column-value><![CDATA[");
        sb.append(getFebrile());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>alarmLevel</column-name><column-value><![CDATA[");
        sb.append(getAlarmLevel());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>discharge</column-name><column-value><![CDATA[");
        sb.append(getDischarge());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>deleted</column-name><column-value><![CDATA[");
        sb.append(getDeleted());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
