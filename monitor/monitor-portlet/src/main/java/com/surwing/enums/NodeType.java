package com.surwing.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaiyz on 16-1-7.
 */
public enum NodeType {

    SMART_NODE_820(1, "SmartNode820"),

    SMART_NODE_890_S(2, "SmartNode890/S"),

    SMART_NODE_826(3, "SmartNode826"),

    SMART_NODE_800(4, "SmartNode800");

    private int nodeType;

    private String nodeName;

    private static final Map<Integer, String> nodeTypeMap = new HashMap<>();

    static {
        for (NodeType nt : NodeType.values()) {
            nodeTypeMap.put(nt.getNodeType(), nt.getNodeName());
        }
    }

    NodeType(int nodeType, String nodeName) {
        this.nodeType = nodeType;
        this.nodeName = nodeName;
    }

    public static String getNameByType(int nodeType) {
        return nodeTypeMap.get(nodeType);
    }

    public int getNodeType() {
        return nodeType;
    }

    public void setNodeType(int nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }
}
