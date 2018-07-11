package com.surwing.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import com.surwing.model.Temperature;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.math.BigDecimal;

import java.util.Date;

/**
 * The cache model class for representing Temperature in entity cache.
 *
 * @author zhaiyz
 * @see Temperature
 * @generated
 */
public class TemperatureCacheModel implements CacheModel<Temperature>,
    Externalizable {
    public long temperatureId;
    public long patientId;
    public BigDecimal temperature;
    public long createDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{temperatureId=");
        sb.append(temperatureId);
        sb.append(", patientId=");
        sb.append(patientId);
        sb.append(", temperature=");
        sb.append(temperature);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Temperature toEntityModel() {
        TemperatureImpl temperatureImpl = new TemperatureImpl();

        temperatureImpl.setTemperatureId(temperatureId);
        temperatureImpl.setPatientId(patientId);
        temperatureImpl.setTemperature(temperature);

        if (createDate == Long.MIN_VALUE) {
            temperatureImpl.setCreateDate(null);
        } else {
            temperatureImpl.setCreateDate(new Date(createDate));
        }

        temperatureImpl.resetOriginalValues();

        return temperatureImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput)
        throws ClassNotFoundException, IOException {
        temperatureId = objectInput.readLong();
        patientId = objectInput.readLong();
        temperature = (BigDecimal) objectInput.readObject();
        createDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(temperatureId);
        objectOutput.writeLong(patientId);
        objectOutput.writeObject(temperature);
        objectOutput.writeLong(createDate);
    }
}
