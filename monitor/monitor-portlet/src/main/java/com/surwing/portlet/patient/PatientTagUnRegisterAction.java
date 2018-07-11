package com.surwing.portlet.patient;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.surwing.service.PatientLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

/**
 * @author zhaiyz
 */
public class PatientTagUnRegisterAction extends LiferayActionSupport {

    private static final Log LOG = LogFactoryUtil.getLog(PatientTagUnRegisterAction.class);

    private long patientId;

    @Override
    public String execute() throws Exception {
        try {
            PatientLocalServiceUtil.unRegisterTag(patientId);
            addActionMessage("注销标签成功");
        } catch (Exception e) {
            addActionError("注销标签失败");
            LOG.error("注销标签失败", e);
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
