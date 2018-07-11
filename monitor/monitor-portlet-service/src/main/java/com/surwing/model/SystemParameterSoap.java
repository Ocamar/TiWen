package com.surwing.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author zhaiyz
 * @generated
 */
public class SystemParameterSoap implements Serializable {
    private long _systemParameterId;
    private long _locationId;
    private String _key;
    private String _value;

    public SystemParameterSoap() {
    }

    public static SystemParameterSoap toSoapModel(SystemParameter model) {
        SystemParameterSoap soapModel = new SystemParameterSoap();

        soapModel.setSystemParameterId(model.getSystemParameterId());
        soapModel.setLocationId(model.getLocationId());
        soapModel.setKey(model.getKey());
        soapModel.setValue(model.getValue());

        return soapModel;
    }

    public static SystemParameterSoap[] toSoapModels(SystemParameter[] models) {
        SystemParameterSoap[] soapModels = new SystemParameterSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static SystemParameterSoap[][] toSoapModels(
        SystemParameter[][] models) {
        SystemParameterSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new SystemParameterSoap[models.length][models[0].length];
        } else {
            soapModels = new SystemParameterSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static SystemParameterSoap[] toSoapModels(
        List<SystemParameter> models) {
        List<SystemParameterSoap> soapModels = new ArrayList<SystemParameterSoap>(models.size());

        for (SystemParameter model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new SystemParameterSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _systemParameterId;
    }

    public void setPrimaryKey(long pk) {
        setSystemParameterId(pk);
    }

    public long getSystemParameterId() {
        return _systemParameterId;
    }

    public void setSystemParameterId(long systemParameterId) {
        _systemParameterId = systemParameterId;
    }

    public long getLocationId() {
        return _locationId;
    }

    public void setLocationId(long locationId) {
        _locationId = locationId;
    }

    public String getKey() {
        return _key;
    }

    public void setKey(String key) {
        _key = key;
    }

    public String getValue() {
        return _value;
    }

    public void setValue(String value) {
        _value = value;
    }
}
