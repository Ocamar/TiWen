package com.surwing.util;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;

/**
 * @author zhaiyz
 */
public final class OrderByTermHelper {

    public static void addOrderByTerm(OrderByComparator obc, DynamicQuery dynamicQuery) {
        if (obc != null && obc.getOrderByFields().length == 1) {
            String orderByField = obc.getOrderByFields()[0];
            if (obc.isAscending()) {
                dynamicQuery.addOrder(OrderFactoryUtil.asc(orderByField));
            } else {
                dynamicQuery.addOrder(OrderFactoryUtil.desc(orderByField));
            }
        }
    }

    private OrderByTermHelper() {
    }
}
