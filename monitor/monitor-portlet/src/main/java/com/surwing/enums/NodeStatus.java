package com.surwing.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaiyz on 16-1-7.
 */
public enum NodeStatus {

    OFF_LINE(1, "离线"),

    ON_LINE(2, "正常");

    private int nodeStatus;

    private String statusName;

    private static final Map<Integer, String> NODE_STATUS_MAP = new HashMap<>();

    static {
        for (NodeStatus ns : NodeStatus.values()) {
            NODE_STATUS_MAP.put(ns.getNodeStatus(), ns.getStatusName());
        }
    }

    NodeStatus(int nodeStatus, String statusName) {
        this.nodeStatus = nodeStatus;
        this.statusName = statusName;
    }

    public static String getNameByStatus(int nodeStatus) {
        return NODE_STATUS_MAP.get(nodeStatus);
    }

    public int getNodeStatus() {
        return nodeStatus;
    }

    public void setNodeStatus(int nodeStatus) {
        this.nodeStatus = nodeStatus;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
