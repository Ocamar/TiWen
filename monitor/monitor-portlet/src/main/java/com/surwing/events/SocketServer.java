package com.surwing.events;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.surwing.util.MessageHelper;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Calendar;

/**
 * Created by zhaiyz on 16-1-9.
 */
public class SocketServer implements Runnable {

    private static final Log LOG = LogFactoryUtil.getLog(SocketServer.class);

    private Socket client;

    public SocketServer(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            DataInputStream in = new DataInputStream(client.getInputStream());

            byte[] bytesHead = new byte[8];
            in.read(bytesHead);

            StringBuilder sbHead = new StringBuilder(bytesHead.length * 2);
            for (byte b : bytesHead) {
                sbHead.append(String.format("%02X", b & 0xff));
            }
            String headMessage = sbHead.toString();
            LOG.info("报文头：" + headMessage);
            MessageHelper.processHead(headMessage);

            byte[] count = new byte[2];
            count[0] = bytesHead[6];
            count[1] = bytesHead[7];

            int c = (count[0] * (1 << 0)) + (count[1] * (1 << 8));

            c = c > 500 ? 500 : c;

            byte[] bytesBody = new byte[c * 27];
            in.read(bytesBody);
            String bodyMessage = "";
            for (int i = 0; i < c; i++) {
                byte[] bytesBodySingle = Arrays.copyOfRange(bytesBody, i * 27, (i + 1) * 27);
                StringBuilder sbBody = new StringBuilder(bytesBodySingle.length * 2);
                for (byte b : bytesBodySingle) {
                    sbBody.append(String.format("%02X", b & 0xff));
                }
                LOG.info("第" + (i + 1) + "条报文：" + sbBody.toString());
                bodyMessage += sbBody.toString();
            }
            MessageHelper.processBody(headMessage, bodyMessage);

            Calendar cal = Calendar.getInstance();
            String ack = String.format("210%d.%d.%d%c0F%d.%d.%d%c", cal.get(Calendar.HOUR_OF_DAY),
                    cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND), (char) 13, cal.get(Calendar.DATE),
                    cal.get(Calendar.MONTH) + 1, cal.get(Calendar.YEAR) - 2000, (char) 13);

            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            out.write(ack.getBytes());
            out.close();
            in.close();
            client.close();
        } catch (Exception e) {
            LOG.info("读取报文出错", e);
        }
    }
}
