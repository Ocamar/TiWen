package com.surwing.portlet.user;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.util.PortalUtil;
import com.surwing.model.Location;
import com.surwing.model.UserInfo;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.service.UserInfoLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

import org.apache.struts2.portlet.context.PortletActionContext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhaiyz
 */
public class UserLocationNameAction extends LiferayActionSupport {

    private static final Log LOG = LogFactoryUtil.getLog(UserLocationNameAction.class);

    private long uid;

    public void getUserLocationName() {
        String userLocationName = "";
        try {
            UserInfo userInfo = UserInfoLocalServiceUtil.fetchUserInfo(uid);
            if (userInfo != null && userInfo.getLocationId() > 0) {
                Location location = LocationLocalServiceUtil.getLocation(userInfo.getLocationId());
                userLocationName = location.getLocationName();
            } else {
                userLocationName = "未分配病区";
            }
        } catch (Exception e) {
            LOG.error("获取用户所在病区出错", e);
        }

        ResourceResponse resourceResponse = (ResourceResponse) PortletActionContext.getResponse();
        HttpServletResponse response = PortalUtil.getHttpServletResponse(resourceResponse);
        try {
            PrintWriter writer = response.getWriter();
            writer.print(userLocationName);
            writer.flush();
        } catch (IOException e) {
            LOG.error("获取用户所在病区出错", e);
        }
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }
}
