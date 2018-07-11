package com.surwing.service.impl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.surwing.model.UserInfo;
import com.surwing.search.UserDisplayTerms;
import com.surwing.service.base.UserInfoLocalServiceBaseImpl;
import com.surwing.util.OrderByTermHelper;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the user info local service.
 * <p>
 * <p> All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy
 * their definitions into the {@link com.surwing.service.UserInfoLocalService} interface.
 * <p>
 * <p> This is a local service. Methods of this service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same VM. </p>
 *
 * @author zhaiyz
 * @see com.surwing.service.base.UserInfoLocalServiceBaseImpl
 * @see com.surwing.service.UserInfoLocalServiceUtil
 */
public class UserInfoLocalServiceImpl extends UserInfoLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.surwing.service.UserInfoLocalServiceUtil} to
     * access the user info local service.
     */

    public int countByUserDisplayTerms(UserDisplayTerms displayTerms, long companyId, long groupId) throws
            SystemException {
        DynamicQuery dynamicQuery = getUserDynamicQuery(displayTerms, companyId, groupId);
        return Long.valueOf(userLocalService.dynamicQueryCount(dynamicQuery)).intValue();
    }

    public List<User> findByUserDisplayTerms(UserDisplayTerms displayTerms, int start, int end,
                                             OrderByComparator obc, long companyId, long groupId) throws
            SystemException {
        DynamicQuery dynamicQuery = getUserDynamicQuery(displayTerms, companyId, groupId);
        OrderByTermHelper.addOrderByTerm(obc, dynamicQuery);
        return userLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    private DynamicQuery getUserDynamicQuery(UserDisplayTerms displayTerms, long companyId, long groupId) throws
            SystemException {
        DynamicQuery dynamicQuery = userLocalService.dynamicQuery();

        String screenName = displayTerms.getScreenName();
        String firstName = displayTerms.getFirstName();

        dynamicQuery.add(PropertyFactoryUtil.forName("screenName").ne(
                PrefsPropsUtil.getString("default.admin.screen.name")));
        dynamicQuery.add(PropertyFactoryUtil.forName("companyId").eq(companyId));
        dynamicQuery.add(PropertyFactoryUtil.forName("defaultUser").eq(false));
        if (Validator.isNotNull(screenName)) {
            dynamicQuery.add(PropertyFactoryUtil.forName("screenName").eq(screenName));
        }
        if (Validator.isNotNull(firstName)) {
            dynamicQuery.add(PropertyFactoryUtil.forName("firstName").eq(firstName));
        }

        return dynamicQuery;
    }

    public User addUser(String screenName, String firstName, String password, String confirmPassword, long
            locationId, ServiceContext serviceContext) throws SystemException, PortalException {
        User user = userLocalService.addUser(serviceContext.getUserId(), serviceContext.getCompanyId(), false,
                password, confirmPassword, false, screenName, null, 0L, "", serviceContext.getLocale(), firstName,
                "", "", 0, 0, true, 1, 1, 1970, "", null, null, null, null, false, serviceContext);

        UserInfo userInfo = userInfoPersistence.create(user.getUserId());
        userInfo.setLocationId(locationId);

        userInfoLocalService.addUserInfo(userInfo);

        return user;
    }

    public void editUser(long userId, String firstName, long locationId) throws SystemException, PortalException {
        User user = userLocalService.getUser(userId);
        user.setFirstName(firstName);
        user.setModifiedDate(new Date());
        userLocalService.updateUser(user);

        UserInfo userInfo = userInfoLocalService.getUserInfo(userId);
        userInfo.setLocationId(locationId);
        userInfoLocalService.updateUserInfo(userInfo);
    }
}
