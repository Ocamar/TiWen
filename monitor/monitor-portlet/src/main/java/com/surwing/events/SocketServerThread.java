package com.surwing.events;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.surwing.util.MonitorPropsKeys;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by zhaiyz on 16-1-9.
 */
public class SocketServerThread extends Thread {

    private static final Log LOG = LogFactoryUtil.getLog(SocketServerThread.class);

    @Override
    public void run() {
        try {
            int port = GetterUtil.getInteger(PropsUtil.get(MonitorPropsKeys.SOCKET_PORT), 25006);
            ServerSocket server = new ServerSocket(port);
            Socket client;
            boolean f = true;
            while (f) {
                client = server.accept();
                new Thread(new SocketServer(client)).start();
            }
            server.close();
        } catch (IOException e) {
            LOG.error("Socket服务出错", e);
        }
    }
}