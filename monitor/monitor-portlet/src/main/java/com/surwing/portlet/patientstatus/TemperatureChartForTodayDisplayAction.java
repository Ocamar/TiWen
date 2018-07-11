package com.surwing.portlet.patientstatus;

import com.liferay.portal.kernel.exception.SystemException;
import com.surwing.model.Bed;
import com.surwing.model.Patient;
import com.surwing.service.BedLocalServiceUtil;
import com.surwing.service.PatientLocalServiceUtil;
import com.surwing.service.TemperatureLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

import org.apache.commons.lang3.time.DateUtils;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhaiyz
 */
public class TemperatureChartForTodayDisplayAction extends LiferayActionSupport {

    private long patientId;

    private String name;

    private String bedNo;

    private String temperatureArray;

    @Override
    public String input() throws Exception {
        Patient patient = PatientLocalServiceUtil.getPatient(patientId);
        name = patient.getName();
        Bed bed = BedLocalServiceUtil.getBed(patient.getBedId());
        bedNo = bed.getBedNo();
        temperatureArray = getTemperatureArray(patientId);
        return super.input();
    }

    private String getTemperatureArray(long patientId) throws SystemException {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        Date clearMin = DateUtils.setMinutes(new Date(), 0);
        Date clearSec = DateUtils.setSeconds(clearMin, 0);
        Date clearMill = DateUtils.setMilliseconds(clearSec, 0);
        for (int i = 0; i <= 23; i++) {
            Date currentHour = DateUtils.setHours(clearMill, i);
            BigDecimal temperature = TemperatureLocalServiceUtil.getCurrentHourTemperature(patientId, currentHour);
            if (temperature.compareTo(BigDecimal.ZERO) == 1) {
                sb.append(temperature.toString());
            }

            sb.append(",");
            if (i == 23) {
                currentHour = DateUtils.addHours(DateUtils.setHours(clearMill, i), 1);
                System.out.println(currentHour);
                temperature = TemperatureLocalServiceUtil.getCurrentHourTemperature(patientId, currentHour);
                if (temperature.compareTo(BigDecimal.ZERO) == 1) {
                    sb.append(temperature.toString());
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }


    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getTemperatureArray() {
        return temperatureArray;
    }

    public void setTemperatureArray(String temperatureArray) {
        this.temperatureArray = temperatureArray;
    }
}
