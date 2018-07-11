package com.surwing.util;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

/**
 * @author zhaiyz
 */
public final class DateHelper {

    private void DateHelper() {
    }

    /**
     * 取得去除了时、分、秒、毫秒的时间
     *
     * @param date 指定时间
     * @return 取得去除了时、分、秒、毫秒的时间
     */
    public static Date getStartDateOfDay(Date date) {
        Date eraseHour = DateUtils.setHours(date, 0);
        Date eraseMin = DateUtils.setMinutes(eraseHour, 0);
        Date eraseSec = DateUtils.setSeconds(eraseMin, 0);
        return DateUtils.setMilliseconds(eraseSec, 0);
    }
}
