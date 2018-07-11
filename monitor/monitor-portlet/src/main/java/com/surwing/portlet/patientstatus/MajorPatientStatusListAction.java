package com.surwing.portlet.patientstatus;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.surwing.model.Bed;
import com.surwing.model.Patient;
import com.surwing.model.UserInfo;
import com.surwing.service.BedLocalServiceUtil;
import com.surwing.service.PatientLocalServiceUtil;
import com.surwing.service.UserInfoLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;
import org.apache.commons.lang3.time.DateUtils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author zhaiyz
 */
public class MajorPatientStatusListAction extends LiferayActionSupport {

    private List<Patient> patients;

    @Override
    public String input() throws Exception {
        UserInfo userInfo = UserInfoLocalServiceUtil.getUserInfo(getUserId());
        patients = PatientLocalServiceUtil.findMajorPatients(userInfo.getLocationId(), getServiceContext());
        for (Patient patient : patients) {
            patient.setTemperature(patient.getTemperature().setScale(1, BigDecimal.ROUND_HALF_UP));
        }
        return super.input();
    }

    public String getBedNo(long bedId) throws SystemException, PortalException {
        Bed bed = BedLocalServiceUtil.getBed(bedId);
        return bed.getBedNo();
    }

    public Date getThreeMinutesAgo() {
        return DateUtils.addMinutes(getNow(), -3);
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}
