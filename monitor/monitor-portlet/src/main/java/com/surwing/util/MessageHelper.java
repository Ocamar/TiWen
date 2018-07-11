package com.surwing.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.surwing.enums.NodeStatus;
import com.surwing.enums.TagStatus;
import com.surwing.enums.TagType;
import com.surwing.model.Node;
import com.surwing.model.Tag;
import com.surwing.service.NodeLocalServiceUtil;
import com.surwing.service.TagLocalServiceUtil;
import com.surwing.service.TemperatureLocalServiceUtil;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhaiyz on 16-1-10.
 */
public final class MessageHelper {

    private static final Log LOG = LogFactoryUtil.getLog(MessageHelper.class);

    public static void processHead(String message) {
        try {
            String nodeNo = message.substring(0, 12);
            nodeNo = CommonHelper.removePreZero(nodeNo);
            Node node = NodeLocalServiceUtil.fetchByNodeNo(nodeNo);

            if (node == null) {
                LOG.info("基站不存在，编号：" + nodeNo);
                return;
            }
        } catch (Exception e) {
            LOG.error("解析报文头出错", e);
        }
    }

    public static void processBody(String head, String body) {
        try {
            String nodeNo = head.substring(0, 12);
            nodeNo = CommonHelper.removePreZero(nodeNo);
            Node node = NodeLocalServiceUtil.fetchByNodeNo(nodeNo);

            if (node == null) {
                LOG.info("基站不存在，编号：" + nodeNo);
                return;
            }

            if (body.length() > 54) {
                node.setLastTransmitTime(new Date());
                node = NodeLocalServiceUtil.updateNode(node);
            }

            for (int i = 0; i < body.length(); i += 54) {
                String msg = body.substring(i, (i + 54));
                processMessage(node, msg);
            }
        } catch (Exception e) {
            LOG.error("解析报文头出错", e);
        }
    }

    public static void processMessage(Node node, String message) {
        String tagFlag = message.substring(0, 2);
        switch (tagFlag) {
            case "FD": {
                processTag(node, message);
                break;
            }
            case "FE": {
                processNode(node, message);
                break;
            }
        }
    }

    public static void processTag(Node node, String message) {
        try {
            String tagFlag = message.substring(0, 2);
            String tagNo = message.substring(4, 16);
            tagNo = CommonHelper.removePreZero(tagNo);
            Tag tag = TagLocalServiceUtil.fetchByTagNo(tagNo);
            if (tag == null) {
                int type = TagType.getTagTypeByTagFlag(tagFlag);
                int status = TagStatus.NORMAL.getTagStatus();
                tag = TagLocalServiceUtil.addTag(tagNo, type, status, node.getCompanyId(), node.getGroupId());
                LOG.info("添加了新的标签，编号为：" + tagNo);
            } else {
                LOG.info("标签已存在，编号为：" + tagNo);
                String temperatureStr = message.substring(26, 34);
                if (tag.getPatientId() > 0) {
                    TemperatureLocalServiceUtil.addTemperature(tag.getPatientId(), getTemperature(temperatureStr));
                }
                TagLocalServiceUtil.updateTag(tagNo, node.getNodeId());
            }
        } catch (Exception e) {
            LOG.error("处理标签信息出错", e);
        }
    }

    private static void processNode(Node node, String message) {
        try {
            String ip = getNodeIp(message);
            node.setIp(ip);
            node.setStatus(NodeStatus.ON_LINE.getNodeStatus());
            node.setLastReceivedTime(new Date());
            NodeLocalServiceUtil.updateNode(node);
        } catch (Exception e) {
            LOG.error("处理基站报文出错", e);
        }
    }

    private static BigDecimal getTemperature(String temperatureStr) {
        int temp1 = Integer.parseInt(temperatureStr.substring(0, 2), 16);
        int temp2 = Integer.parseInt(temperatureStr.substring(2, 4), 16);
        int temp3 = Integer.parseInt(temperatureStr.substring(4, 6), 16);
        return new BigDecimal(temp1).add(new BigDecimal(temp2).divide(BigDecimal.TEN)).add(
                new BigDecimal(temp3).divide(BigDecimal.valueOf(100L)));
    }

    private static String getNodeIp(String message) {
        int ip1 = Integer.parseInt(message.substring(2, 4), 16);
        int ip2 = Integer.parseInt(message.substring(4, 6), 16);
        int ip3 = Integer.parseInt(message.substring(6, 8), 16);
        int ip4 = Integer.parseInt(message.substring(8, 10), 16);
        StringBuilder sb = new StringBuilder();
        sb.append(ip1);
        sb.append(StringPool.PERIOD);
        sb.append(ip2);
        sb.append(StringPool.PERIOD);
        sb.append(ip3);
        sb.append(StringPool.PERIOD);
        sb.append(ip4);
        return sb.toString();
    }

    private MessageHelper() {
    }
}
