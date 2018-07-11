package com.surwing.events;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.SimpleAction;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.security.auth.CompanyThreadLocal;

import sun.reflect.generics.reflectiveObjects.LazyReflectiveObjectGenerator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Calendar;

/**
 * Created by zhaiyz on 16-1-9.
 */
public class MonitorServerAction extends SimpleAction {

    private static final Log LOG = LogFactoryUtil.getLog(MonitorServerAction.class);

    @Override
    public void run(String[] ids) throws ActionException {
        LOG.info("监控服务开始启动");
        new SocketServerThread().start();
        LOG.info("监控服务启动完成");
    }
}
