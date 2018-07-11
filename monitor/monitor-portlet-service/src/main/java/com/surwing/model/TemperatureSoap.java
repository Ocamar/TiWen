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
public class TemperatureSoap implements Serializable {
    private long _temperatureId;
    private long _patientId;
    private BigDecimal _temperature;
    private Date _createDate;

    public TemperatureSoap() {
    }

    public static TemperatureSoap toSoapModel(Temperature model) {
        TemperatureSoap soapModel = new TemperatureSoap();

        soapModel.setTemperatureId(model.getTemperatureId());
        soapModel.setPatientId(model.getPatientId());
        soapModel.setTemperature(model.getTemperature());
        soapModel.setCreateDate(model.getCreateDate());

        return soapModel;
    }

    public static TemperatureSoap[] toSoapModels(Temperature[] models) {
        TemperatureSoap[] soapModels = new TemperatureSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TemperatureSoap[][] toSoapModels(Temperature[][] models) {
        TemperatureSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TemperatureSoap[models.length][models[0].length];
        } else {
            soapModels = new TemperatureSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TemperatureSoap[] toSoapModels(List<Temperature> models) {
        List<TemperatureSoap> soapModels = new ArrayList<TemperatureSoap>(models.size());

        for (Temperature model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TemperatureSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _temperatureId;
    }

    public void setPrimaryKey(long pk) {
        setTemperatureId(pk);
    }

    public long getTemperatureId() {
        return _temperatureId;
    }

    public void setTemperatureId(long temperatureId) {
        _temperatureId = temperatureId;
    }

    public long getPatientId() {
        return _patientId;
    }

    public void setPatientId(long patientId) {
        _patientId = patientId;
    }

    public BigDecimal getTemperature() {
        return _temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        _temperature = temperature;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }
}
