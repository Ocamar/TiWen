package com.surwing.util;

/**
 * @author zhaiyz
 */
public final class MonitorPropsKeys {

    public static final String CRONJOB_ENABLE = "conjob.enable";

    public static final String SOCKET_PORT = "socket.port";

    public static final String ESB_URL = "esb.url";

    /**
     * 是否开启或关闭体温音频报警
     */
    public static final String TEMPERATURE_AUDIO_ALARM = "TEMPERATURE_AUDIO_ALARM";

    /**
     * 标签超时时间（分钟）
     */
    public static final String TAG_TIMEOUT = "TAG_TIMEOUT";

    /**
     * 病人默认最低报警体温
     */
    public static final String PATIENT_DEFAULT_MIN_TEMP = "PATIENT_DEFAULT_MIN_TEMP";

    /**
     * 病人默认最高报警体温
     */
    public static final String PATIENT_DEFAULT_MAX_TEMP = "PATIENT_DEFAULT_MAX_TEMP";

    /**
     * 红色报警级别温度范围最小值
     */
    public static final String RED_LEVEL_TEMP_RANGE_MIN = "RED_LEVEL_TEMP_RANGE_MIN";

    /**
     * 红色报警级别温度范围最大值
     */
    public static final String RED_LEVEL_TEMP_RANGE_MAX = "RED_LEVEL_TEMP_RANGE_MAX";

    /**
     * 橙色报警级别温度范围最小值
     */
    public static final String ORANGE_LEVEL_TEMP_RANGE_MIN = "ORANGE_LEVEL_TEMP_RANGE_MIN";

    /**
     * 橙色报警级别温度范围最大值
     */
    public static final String ORANGE_LEVEL_TEMP_RANGE_MAX = "ORANGE_LEVEL_TEMP_RANGE_MAX";

    private MonitorPropsKeys() {
    }
}
