package com.surwing.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaiyz on 16-1-14.
 */
public enum TagType {

    /**
     * ThermoSENSOR-II
     */
    THERMO_SENSOR_II(1, "FD", "ThermoSENSOR-II");

    private int tagType;

    private String tagFlag;

    private String tagName;

    private static final Map<Integer, String> TAG_TYPE_MAP = new HashMap<>();

    private static final Map<String, Integer> TAG_FLAG_MAP = new HashMap<>();

    static {
        for (TagType tt : TagType.values()) {
            TAG_TYPE_MAP.put(tt.getTagType(), tt.getTagName());
            TAG_FLAG_MAP.put(tt.getTagFlag(), tt.getTagType());
        }
    }

    TagType(int tagType, String tagFlag, String tagName) {
        this.tagType = tagType;
        this.tagFlag = tagFlag;
        this.tagName = tagName;
    }

    public static int getTagTypeByTagFlag(String tagFlag) {
        return TAG_FLAG_MAP.get(tagFlag);
    }

    public static String getTypeNameByTagType(int tagType) {
        return TAG_TYPE_MAP.get(tagType);
    }

    public int getTagType() {
        return tagType;
    }

    public void setTagType(int tagType) {
        this.tagType = tagType;
    }

    public String getTagFlag() {
        return tagFlag;
    }

    public void setTagFlag(String tagFlag) {
        this.tagFlag = tagFlag;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}
