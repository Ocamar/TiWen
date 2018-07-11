package com.surwing.portlet.bed;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.surwing.MonitorException;
import com.surwing.model.UserInfo;
import com.surwing.service.BedLocalServiceUtil;
import com.surwing.service.UserInfoLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

/**
 * @author zhaiyz
 */
public class BedAddAction extends LiferayActionSupport {

    private static final Log LOG = LogFactoryUtil.getLog(BedAddAction.class);

    private int count;

    private String fromNo;

    @Override
    public String execute() throws Exception {
        try {
            BedLocalServiceUtil.addBeds(fromNo, count, getDefaultAreaId(), getServiceContext());
            addActionMessage("添加床位成功");
        } catch (MonitorException ce) {
            addActionError(ce.getMessage());
        } catch (Exception e) {
            LOG.error("添加床位失败", e);
            addActionError("添加床位失败");
        }
        return BACK;
    }

    private long getDefaultAreaId() {
        try {
            UserInfo userInfo = UserInfoLocalServiceUtil.getUserInfo(getUserId());
            return userInfo.getLocationId();
        } catch (Exception e) {
            return 0L;
        }
    }

    public int getCount() throws PortalException, SystemException {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getFromNo() {
        return fromNo;
    }

    public void setFromNo(String fromNo) {
        this.fromNo = fromNo;
    }
}
