package com.surwing.portlet.bed;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.surwing.MonitorException;
import com.surwing.service.BedLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

/**
 * @author zhaiyz
 */
public class BedDeleteAction extends LiferayActionSupport {

    private static final Log LOG = LogFactoryUtil.getLog(BedDeleteAction.class);

    private long bedId;

    @Override
    public String execute() throws Exception {
        try {
            BedLocalServiceUtil.deleteBed(bedId);
            addActionMessage("删除床位成功");
        } catch (MonitorException ce) {
            addActionError(ce.getMessage());
        } catch (Exception e) {
            LOG.error("删除床位失败", e);
            addActionError("删除床位失败");
        }
        return BACK;
    }

    public long getBedId() {
        return bedId;
    }

    public void setBedId(long bedId) {
        this.bedId = bedId;
    }
}
