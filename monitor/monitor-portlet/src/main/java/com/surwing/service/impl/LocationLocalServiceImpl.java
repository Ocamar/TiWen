package com.surwing.service.impl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.surwing.MonitorException;
import com.surwing.model.Location;
import com.surwing.search.LocationDisplayTerms;
import com.surwing.service.base.LocationLocalServiceBaseImpl;
import com.surwing.swgcms.orm.DAOUtil;
import com.surwing.util.OrderByTermHelper;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the location local service.
 * <p>
 * <p> All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy
 * their definitions into the {@link com.surwing.service.LocationLocalService} interface.
 * <p>
 * <p> This is a local service. Methods of this service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same VM. </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.surwing.service.base.LocationLocalServiceBaseImpl
 * @see com.surwing.service.LocationLocalServiceUtil
 */
public class LocationLocalServiceImpl extends LocationLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.surwing.service.LocationLocalServiceUtil} to
     * access the location local service.
     */

    /**
     * 添加病区
     *
     * @param locationNo   病区编号
     * @param locationName 病区名称
     * @param companyId    companyId
     * @param groupId      groupId
     * @return 新添加的病区
     * @throws SystemException if a system exception occurred
     * @throws PortalException 病区编号已存在时
     */
    public Location addLocation(String locationNo, String locationName, boolean esbEnabled, long companyId, long groupId) throws
            SystemException, PortalException {
        Location location = locationPersistence.fetchByLocationNo_C_G(locationNo, companyId, groupId);
        if (location != null) {
            throw new MonitorException("病区编号已存在");
        }

        long locationId = counterLocalService.increment(Location.class.getName());
        location = locationPersistence.create(locationId);
        location.setLocationNo(locationNo);
        location.setLocationName(locationName);
        location.setCompanyId(companyId);
        location.setGroupId(groupId);
        location.setEsbEnabled(esbEnabled);
        Date now = new Date();
        location.setCreateDate(now);
        location.setModifiedDate(now);

        return addLocation(location);
    }

    /**
     * 取得指定company和group的病区数量
     *
     * @param companyId companyId
     * @param groupId   groupId
     * @return 病区数量
     * @throws SystemException if a system exception occurred
     */
    public int getLocationsCountByC_G(long companyId, long groupId) throws SystemException {
        return locationPersistence.countByC_G(companyId, groupId);
    }

    /**
     * 取得指定company和group的病区列表
     *
     * @param companyId companyId
     * @param groupId   groupId
     * @param start     start
     * @param end       end
     * @return 病区列表
     * @throws SystemException if a system exception occurred
     */
    public List<Location> getLocationsByC_G(long companyId, long groupId, int start, int end) throws SystemException {
        return locationPersistence.findByC_G(companyId, groupId, start, end);
    }

    public Location updateLocationInfo(Location location) throws SystemException, MonitorException {
        Location l = locationPersistence.fetchByLocationNo_C_G(location.getLocationNo(), location.getCompanyId(),
                location.getGroupId());
        if (l != null && l.getLocationId() != location.getLocationId()) {
            throw new MonitorException("病区编号已存在");
        }
        location.setModifiedDate(new Date());
        return super.updateLocation(location);
    }

    @Override
    public Location deleteLocation(long locationId) throws PortalException, SystemException {
        int nodeCount = nodePersistence.countByLocationId(locationId);
        if (nodeCount > 0) {
            throw new MonitorException("病区下有基站，不能删除");
        }
        int bedCount = bedPersistence.countByLocationId(locationId);
        if (bedCount > 0) {
            throw new MonitorException("病区下有病床，不能删除");
        }
        return super.deleteLocation(locationId);
    }

    public List<Location> findByDisplayTerms(LocationDisplayTerms displayTerms, OrderByComparator obc, int start,
                                             int end) throws SystemException {
        DynamicQuery dynamicQuery = getLocationDisplayTerms(displayTerms);
        OrderByTermHelper.addOrderByTerm(obc, dynamicQuery);
        dynamicQuery.addOrder(OrderFactoryUtil.asc("locationId"));
        return dynamicQuery(dynamicQuery, start, end);
    }

    public int countByDisplayTerms(LocationDisplayTerms displayTerms) throws SystemException {
        DynamicQuery dynamicQuery = getLocationDisplayTerms(displayTerms);
        return Long.valueOf(dynamicQueryCount(dynamicQuery)).intValue();
    }

    public List<Location> getEsbEnabledLocations() throws SystemException {
        DynamicQuery dynamicQuery = dynamicQuery();
        dynamicQuery.add(PropertyFactoryUtil.forName("esbEnabled").eq(true));
        return dynamicQuery(dynamicQuery);
    }

    private DynamicQuery getLocationDisplayTerms(LocationDisplayTerms displayTerms) {
        String locationNo = displayTerms.getLocationNo();
        String locationName = displayTerms.getLocationName();

        DynamicQuery dynamicQuery = dynamicQuery();
        if (StringUtils.isNotBlank(locationNo)) {
            dynamicQuery.add(PropertyFactoryUtil.forName("locationNo").eq(locationNo));
        }
        if (StringUtils.isNotBlank(locationName)) {
            dynamicQuery.add(PropertyFactoryUtil.forName("locationName").like(DAOUtil.getLike(locationName)));
        }

        return dynamicQuery;
    }
}
