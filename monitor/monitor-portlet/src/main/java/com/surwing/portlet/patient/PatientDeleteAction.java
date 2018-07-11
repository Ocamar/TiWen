package com.surwing.portlet.patient;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.surwing.service.PatientLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

/**
 * Created by zhaiyz on 17-7-18.
 */
public class PatientDeleteAction extends LiferayActionSupport {

    private static final Log LOG = LogFactoryUtil.getLog(PatientDeleteAction.class);

    private long patientId;

    @Override
    public String execute() throws Exception {
        try {
            PatientLocalServiceUtil.deletePatient(patientId);
            addActionMessage("删除病人成功");
        } catch (Exception e) {
            LOG.error("删除病人失败", e);
            addActionError("删除病人失败");
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
