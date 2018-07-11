package com.surwing.portlet.location;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.surwing.MonitorException;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

/**
 * Created by zhaiyz on 16-1-5.
 */
public class LocationAddAction extends LiferayActionSupport {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private static final Log LOG = LogFactoryUtil.getLog(LocationAddAction.class);

    private String locationNo;

    private String locationName;

    private boolean esbEnabled;

    @Override
    public String input() throws Exception {
        return super.input();
    }

    @Override
    public String execute() throws Exception {
        try {
            LocationLocalServiceUtil.addLocation(locationNo, locationName, esbEnabled, getCompanyId(), getScopeGroupId());
            addActionMessage("添加病区成功");
        } catch (MonitorException me) {
            LOG.error("添加病区失败", me);
            addActionError(me.getMessage());
            return ERROR;
        } catch (Exception e) {
            LOG.error("添加病区失败", e);
            addActionError("添加病区失败");
            return ERROR;
        }
        return BACK;
    }

    public String getLocationNo() {
        return locationNo;
    }

    public void setLocationNo(String locationNo) {
        this.locationNo = locationNo;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public boolean isEsbEnabled() {
        return esbEnabled;
    }

    public void setEsbEnabled(boolean esbEnabled) {
        this.esbEnabled = esbEnabled;
    }
}
