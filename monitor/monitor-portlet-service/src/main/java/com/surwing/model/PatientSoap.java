package com.surwing.model;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author zhaiyz
 * @generated
 */
public class PatientSoap implements Serializable {
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

    public PatientSoap() {
    }

    public static PatientSoap toSoapModel(Patient model) {
        PatientSoap soapModel = new PatientSoap();

        soapModel.setPatientId(model.getPatientId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setMrn(model.getMrn());
        soapModel.setName(model.getName());
        soapModel.setLocationId(model.getLocationId());
        soapModel.setBedId(model.getBedId());
        soapModel.setGender(model.getGender());
        soapModel.setBirthday(model.getBirthday());
        soapModel.setMinTemperature(model.getMinTemperature());
        soapModel.setMaxTemperature(model.getMaxTemperature());
        soapModel.setTagNo(model.getTagNo());
        soapModel.setTemperature(model.getTemperature());
        soapModel.setLatestDate(model.getLatestDate());
        soapModel.setTemperatureIn8h(model.getTemperatureIn8h());
        soapModel.setHighestDate(model.getHighestDate());
        soapModel.setFebrile(model.getFebrile());
        soapModel.setAlarmLevel(model.getAlarmLevel());
        soapModel.setDischarge(model.getDischarge());
        soapModel.setDeleted(model.getDeleted());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static PatientSoap[] toSoapModels(Patient[] models) {
        PatientSoap[] soapModels = new PatientSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PatientSoap[][] toSoapModels(Patient[][] models) {
        PatientSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PatientSoap[models.length][models[0].length];
        } else {
            soapModels = new PatientSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PatientSoap[] toSoapModels(List<Patient> models) {
        List<PatientSoap> soapModels = new ArrayList<PatientSoap>(models.size());

        for (Patient model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PatientSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _patientId;
    }

    public void setPrimaryKey(long pk) {
        setPatientId(pk);
    }

    public long getPatientId() {
        return _patientId;
    }

    public void setPatientId(long patientId) {
        _patientId = patientId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public String getMrn() {
        return _mrn;
    }

    public void setMrn(String mrn) {
        _mrn = mrn;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public long getLocationId() {
        return _locationId;
    }

    public void setLocationId(long locationId) {
        _locationId = locationId;
    }

    public long getBedId() {
        return _bedId;
    }

    public void setBedId(long bedId) {
        _bedId = bedId;
    }

    public int getGender() {
        return _gender;
    }

    public void setGender(int gender) {
        _gender = gender;
    }

    public Date getBirthday() {
        return _birthday;
    }

    public void setBirthday(Date birthday) {
        _birthday = birthday;
    }

    public BigDecimal getMinTemperature() {
        return _minTemperature;
    }

    public void setMinTemperature(BigDecimal minTemperature) {
        _minTemperature = minTemperature;
    }

    public BigDecimal getMaxTemperature() {
        return _maxTemperature;
    }

    public void setMaxTemperature(BigDecimal maxTemperature) {
        _maxTemperature = maxTemperature;
    }

    public String getTagNo() {
        return _tagNo;
    }

    public void setTagNo(String tagNo) {
        _tagNo = tagNo;
    }

    public BigDecimal getTemperature() {
        return _temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        _temperature = temperature;
    }

    public Date getLatestDate() {
        return _latestDate;
    }

    public void setLatestDate(Date latestDate) {
        _latestDate = latestDate;
    }

    public BigDecimal getTemperatureIn8h() {
        return _temperatureIn8h;
    }

    public void setTemperatureIn8h(BigDecimal temperatureIn8h) {
        _temperatureIn8h = temperatureIn8h;
    }

    public Date getHighestDate() {
        return _highestDate;
    }

    public void setHighestDate(Date highestDate) {
        _highestDate = highestDate;
    }

    public boolean getFebrile() {
        return _febrile;
    }

    public boolean isFebrile() {
        return _febrile;
    }

    public void setFebrile(boolean febrile) {
        _febrile = febrile;
    }

    public BigDecimal getAlarmLevel() {
        return _alarmLevel;
    }

    public void setAlarmLevel(BigDecimal alarmLevel) {
        _alarmLevel = alarmLevel;
    }

    public boolean getDischarge() {
        return _discharge;
    }

    public boolean isDischarge() {
        return _discharge;
    }

    public void setDischarge(boolean discharge) {
        _discharge = discharge;
    }

    public boolean getDeleted() {
        return _deleted;
    }

    public boolean isDeleted() {
        return _deleted;
    }

    public void setDeleted(boolean deleted) {
        _deleted = deleted;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }
}
