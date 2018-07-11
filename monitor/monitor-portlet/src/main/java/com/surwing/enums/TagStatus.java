package com.surwing.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaiyz on 16-1-14.
 */
public enum TagStatus {

    /**
     * 正常
     */
    NORMAL(1, "正常"),

    /**
     * 低电量
     */
    BATTERY_LOW(2, "低电量");

    private int tagStatus;

    private String tagName;

    private static final Map<Integer, String> TAG_STATUS_MAP = new HashMap<>();

    static {
        for (TagStatus ts : TagStatus.values()) {
            TAG_STATUS_MAP.put(ts.getTagStatus(), ts.getTagName());
        }
    }

    TagStatus(int tagStatus, String tagName) {
        this.tagStatus = tagStatus;
        this.tagName = tagName;
    }

    public static String getNameByStatus(int status) {
        return TAG_STATUS_MAP.get(status);
    }

    public int getTagStatus() {
        return tagStatus;
    }

    public void setTagStatus(int tagStatus) {
        this.tagStatus = tagStatus;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}
