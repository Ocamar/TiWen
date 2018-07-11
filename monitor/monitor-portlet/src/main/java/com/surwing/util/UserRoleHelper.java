package com.surwing.util;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.Role;
import com.liferay.portal.security.auth.CompanyThreadLocal;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.UserGroupRoleLocalServiceUtil;

import java.util.List;

/**
 * Created by zhaiyz on 16-1-16.
 */
public final class UserRoleHelper {

    private static final Log LOG = LogFactoryUtil.getLog(UserRoleHelper.class);

    private static final String ADMIN_ROLE_NAME = "管理员";

    private static final String NURSE_ROLE_NAME = "护士";

    private static final String HEAD_NURSE_ROLE_NAME = "护士长";

    private static long adminRoleId;

    private static long nurseRoleId;

    private static long headNurseRoleId;

    static {
        long companyId = CompanyThreadLocal.getCompanyId();
        try {
            Role role = RoleLocalServiceUtil.getRole(companyId, ADMIN_ROLE_NAME);
            adminRoleId = role.getRoleId();
        } catch (PortalException e) {
            LOG.error("管理员角色不存在，请添加站点角色，名称为‘管理员’", e);
        } catch (SystemException e) {
            LOG.error(e);
        }

        try {
            Role role = RoleLocalServiceUtil.getRole(companyId, NURSE_ROLE_NAME);
            nurseRoleId = role.getRoleId();
        } catch (PortalException e) {
            LOG.error("护士角色不存在，请添加站点角色，名称为‘护士’", e);
        } catch (SystemException e) {
            LOG.error(e);
        }

        try {
            Role role = RoleLocalServiceUtil.getRole(companyId, HEAD_NURSE_ROLE_NAME);
            headNurseRoleId = role.getRoleId();
        } catch (PortalException e) {
            LOG.error("护士长角色不存在，请添加站点角色，名称为‘护士长’", e);
        } catch (SystemException e) {
            LOG.error(e);
        }
    }

    public static boolean hasAdminRole(long userId, long groupId) {
        List<Role> roles;
        try {
            roles = RoleLocalServiceUtil.getUserGroupRoles(userId, groupId);
        } catch (SystemException e) {
            LOG.error(e);
            return false;
        }

        for (Role role : roles) {
            if (role.getRoleId() == adminRoleId) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasNurseRole(long userId, long groupId) {
        List<Role> roles;
        try {
            roles = RoleLocalServiceUtil.getUserGroupRoles(userId, groupId);
        } catch (SystemException e) {
            LOG.error(e);
            return false;
        }

        for (Role role : roles) {
            if (role.getRoleId() == nurseRoleId) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasHeadNurseRole(long userId, long groupId) {
        List<Role> roles;
        try {
            roles = RoleLocalServiceUtil.getUserGroupRoles(userId, groupId);
        } catch (SystemException e) {
            LOG.error(e);
            return false;
        }

        for (Role role : roles) {
            if (role.getRoleId() == headNurseRoleId) {
                return true;
            }
        }
        return false;
    }

    public static void addAdminRole(long userId, long groupId) throws SystemException {
        UserGroupRoleLocalServiceUtil.addUserGroupRoles(userId, groupId, new long[]{adminRoleId});
    }

    public static void addNurseRole(long userId, long groupId) throws SystemException {
        UserGroupRoleLocalServiceUtil.addUserGroupRoles(userId, groupId, new long[]{nurseRoleId});
    }

    public static void addHeadNurseRole(long userId, long groupId) throws SystemException {
        UserGroupRoleLocalServiceUtil.addUserGroupRoles(userId, groupId, new long[]{headNurseRoleId});
    }

    public static void deleteAdminRole(long userId, long groupId) throws SystemException {
        UserGroupRoleLocalServiceUtil.deleteUserGroupRoles(userId, groupId, new long[]{adminRoleId});
    }

    public static void deleteNurseRole(long userId, long groupId) throws SystemException {
        UserGroupRoleLocalServiceUtil.deleteUserGroupRoles(userId, groupId, new long[]{nurseRoleId});
    }

    public static void deleteHeadNurseRole(long userId, long groupId) throws SystemException {
        UserGroupRoleLocalServiceUtil.deleteUserGroupRoles(userId, groupId, new long[]{headNurseRoleId});
    }

    private UserRoleHelper() {
    }
}
