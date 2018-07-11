package com.surwing.portlet.location;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.surwing.MonitorException;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

/**
 * Created by zhaiyz on 16-1-8.
 */
public class LocationDeleteAction extends LiferayActionSupport {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Log LOG = LogFactoryUtil.getLog(LocationDeleteAction.class);

    private long locationId;

    @Override
    public String execute() throws Exception {
        try {
            LocationLocalServiceUtil.deleteLocation(locationId);
            addActionMessage("删除病区成功");
        } catch (MonitorException me) {
            LOG.error("删除病区失败", me);
            addActionError(me.getMessage());
            return ERROR;
        } catch (Exception e) {
            LOG.error("删除病区失败", e);
            addActionError("删除病区失败");
            return ERROR;
        }
        return BACK;
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }
}
