package com.surwing.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.surwing.model.Patient;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.math.BigDecimal;

import java.util.Date;

/**
 * The cache model class for representing Patient in entity cache.
 *
 * @author zhaiyz
 * @see Patient
 * @generated
 */
public class PatientCacheModel implements CacheModel<Patient>, Externalizable {
    public long patientId;
    public long companyId;
    public long groupId;
    public String mrn;
    public String name;
    public long locationId;
    public long bedId;
    public int gender;
    public long birthday;
    public BigDecimal minTemperature;
    public BigDecimal maxTemperature;
    public String tagNo;
    public BigDecimal temperature;
    public long latestDate;
    public BigDecimal temperatureIn8h;
    public long highestDate;
    public boolean febrile;
    public BigDecimal alarmLevel;
    public boolean discharge;
    public boolean deleted;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(45);

        sb.append("{patientId=");
        sb.append(patientId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", mrn=");
        sb.append(mrn);
        sb.append(", name=");
        sb.append(name);
        sb.append(", locationId=");
        sb.append(locationId);
        sb.append(", bedId=");
        sb.append(bedId);
        sb.append(", gender=");
        sb.append(gender);
        sb.append(", birthday=");
        sb.append(birthday);
        sb.append(", minTemperature=");
        sb.append(minTemperature);
        sb.append(", maxTemperature=");
        sb.append(maxTemperature);
        sb.append(", tagNo=");
        sb.append(tagNo);
        sb.append(", temperature=");
        sb.append(temperature);
        sb.append(", latestDate=");
        sb.append(latestDate);
        sb.append(", temperatureIn8h=");
        sb.append(temperatureIn8h);
        sb.append(", highestDate=");
        sb.append(highestDate);
        sb.append(", febrile=");
        sb.append(febrile);
        sb.append(", alarmLevel=");
        sb.append(alarmLevel);
        sb.append(", discharge=");
        sb.append(discharge);
        sb.append(", deleted=");
        sb.append(deleted);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Patient toEntityModel() {
        PatientImpl patientImpl = new PatientImpl();

        patientImpl.setPatientId(patientId);
        patientImpl.setCompanyId(companyId);
        patientImpl.setGroupId(groupId);

        if (mrn == null) {
            patientImpl.setMrn(StringPool.BLANK);
        } else {
            patientImpl.setMrn(mrn);
        }

        if (name == null) {
            patientImpl.setName(StringPool.BLANK);
        } else {
            patientImpl.setName(name);
        }

        patientImpl.setLocationId(locationId);
        patientImpl.setBedId(bedId);
        patientImpl.setGender(gender);

        if (birthday == Long.MIN_VALUE) {
            patientImpl.setBirthday(null);
        } else {
            patientImpl.setBirthday(new Date(birthday));
        }

        patientImpl.setMinTemperature(minTemperature);
        patientImpl.setMaxTemperature(maxTemperature);

        if (tagNo == null) {
            patientImpl.setTagNo(StringPool.BLANK);
        } else {
            patientImpl.setTagNo(tagNo);
        }

        patientImpl.setTemperature(temperature);

        if (latestDate == Long.MIN_VALUE) {
            patientImpl.setLatestDate(null);
        } else {
            patientImpl.setLatestDate(new Date(latestDate));
        }

        patientImpl.setTemperatureIn8h(temperatureIn8h);

        if (highestDate == Long.MIN_VALUE) {
            patientImpl.setHighestDate(null);
        } else {
            patientImpl.setHighestDate(new Date(highestDate));
        }

        patientImpl.setFebrile(febrile);
        patientImpl.setAlarmLevel(alarmLevel);
        patientImpl.setDischarge(discharge);
        patientImpl.setDeleted(deleted);

        if (createDate == Long.MIN_VALUE) {
            patientImpl.setCreateDate(null);
        } else {
            patientImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            patientImpl.setModifiedDate(null);
        } else {
            patientImpl.setModifiedDate(new Date(modifiedDate));
        }

        patientImpl.resetOriginalValues();

        return patientImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput)
        throws ClassNotFoundException, IOException {
        patientId = objectInput.readLong();
        companyId = objectInput.readLong();
        groupId = objectInput.readLong();
        mrn = objectInput.readUTF();
        name = objectInput.readUTF();
        locationId = objectInput.readLong();
        bedId = objectInput.readLong();
        gender = objectInput.readInt();
        birthday = objectInput.readLong();
        minTemperature = (BigDecimal) objectInput.readObject();
        maxTemperature = (BigDecimal) objectInput.readObject();
        tagNo = objectInput.readUTF();
        temperature = (BigDecimal) objectInput.readObject();
        latestDate = objectInput.readLong();
        temperatureIn8h = (BigDecimal) objectInput.readObject();
        highestDate = objectInput.readLong();
        febrile = objectInput.readBoolean();
        alarmLevel = (BigDecimal) objectInput.readObject();
        discharge = objectInput.readBoolean();
        deleted = objectInput.readBoolean();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(patientId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(groupId);

        if (mrn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(mrn);
        }

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeLong(locationId);
        objectOutput.writeLong(bedId);
        objectOutput.writeInt(gender);
        objectOutput.writeLong(birthday);
        objectOutput.writeObject(minTemperature);
        objectOutput.writeObject(maxTemperature);

        if (tagNo == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(tagNo);
        }

        objectOutput.writeObject(temperature);
        objectOutput.writeLong(latestDate);
        objectOutput.writeObject(temperatureIn8h);
        objectOutput.writeLong(highestDate);
        objectOutput.writeBoolean(febrile);
        objectOutput.writeObject(alarmLevel);
        objectOutput.writeBoolean(discharge);
        objectOutput.writeBoolean(deleted);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
    }
}
