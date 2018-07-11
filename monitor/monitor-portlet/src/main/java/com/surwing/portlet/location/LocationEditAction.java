package com.surwing.portlet.location;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.opensymphony.xwork2.Preparable;
import com.surwing.MonitorException;
import com.surwing.model.Location;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

/**
 * Created by zhaiyz on 16-1-5.
 */
public class LocationEditAction extends LiferayActionSupport implements Preparable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private static final Log LOG = LogFactoryUtil.getLog(LocationEditAction.class);

    private long locationId;
    private Location loc;

    @Override
    public void prepare() throws Exception {
        if (locationId == 0)
            addActionError("病区不存在");
        try {
            loc = LocationLocalServiceUtil.fetchLocation(locationId);
        } catch (Exception e) {
            addActionError("病区不存在");
        }
    }

    @Override
    public String execute() throws Exception {
        try {
            LocationLocalServiceUtil.updateLocationInfo(loc);
            addActionMessage("更新病区成功");
        } catch (MonitorException me) {
            LOG.error("更新病区失败", me);
           // addActionError(me.getMessage());
            addActionError(getText("error.internal"));
            return ERROR;
        } catch (Exception e) {
            LOG.error("更新病区失败", e);
            addActionError(getText("error.internal"));
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

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }
}
