package com.surwing.util;

import com.liferay.portal.kernel.util.StringPool;
import org.apache.commons.lang3.StringUtils;

/**
 * @author zhaiyz
 */
public final class CommonHelper {

    public static String removePreZero(String str) {
        if (StringUtils.isBlank(str)) {
            return StringPool.BLANK;
        }

        while (str.startsWith("0")) {
            str = str.substring(1);
        }
        return str;
    }

    private CommonHelper() {
    }
}
