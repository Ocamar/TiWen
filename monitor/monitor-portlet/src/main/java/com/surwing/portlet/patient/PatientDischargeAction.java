package com.surwing.portlet.patient;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.surwing.service.PatientLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

/**
 * @author zhaiyz
 */
public class PatientDischargeAction extends LiferayActionSupport {

    private static final Log LOG = LogFactoryUtil.getLog(PatientDischargeAction.class);

    private long patientId;

    @Override
    public String execute() throws Exception {
        try {
            PatientLocalServiceUtil.discharge(patientId);
            addActionMessage("病人出院成功");
        } catch (Exception e) {
            LOG.error("病人出院失败", e);
            addActionError("病人出院失败");
        }
        return BACK;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }
}
