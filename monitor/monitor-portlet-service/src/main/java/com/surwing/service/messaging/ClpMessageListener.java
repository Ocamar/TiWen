package com.surwing.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.surwing.service.BedLocalServiceUtil;
import com.surwing.service.ClpSerializer;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.service.NodeLocalServiceUtil;
import com.surwing.service.PatientLocalServiceUtil;
import com.surwing.service.SystemParameterLocalServiceUtil;
import com.surwing.service.TagLocalServiceUtil;
import com.surwing.service.TemperatureLocalServiceUtil;
import com.surwing.service.UserInfoLocalServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            BedLocalServiceUtil.clearService();

            LocationLocalServiceUtil.clearService();

            NodeLocalServiceUtil.clearService();

            PatientLocalServiceUtil.clearService();

            SystemParameterLocalServiceUtil.clearService();

            TagLocalServiceUtil.clearService();

            TemperatureLocalServiceUtil.clearService();

            UserInfoLocalServiceUtil.clearService();
        }
    }
}
