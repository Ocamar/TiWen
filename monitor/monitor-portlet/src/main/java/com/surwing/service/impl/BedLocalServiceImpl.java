package com.surwing.service.impl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.service.ServiceContext;
import com.surwing.MonitorException;
import com.surwing.model.Bed;
import com.surwing.model.Patient;
import com.surwing.search.BedDisplayTerms;
import com.surwing.service.base.BedLocalServiceBaseImpl;
import com.surwing.util.OrderByTermHelper;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the bed local service.
 * <p>
 * <p> All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy
 * their definitions into the {@link com.surwing.service.BedLocalService} interface.
 * <p>
 * <p> This is a local service. Methods of this service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same VM. </p>
 *
 * @author zhaiyz
 * @see com.surwing.service.base.BedLocalServiceBaseImpl
 * @see com.surwing.service.BedLocalServiceUtil
 */
public class BedLocalServiceImpl extends BedLocalServiceBaseImpl {

    public void addBeds(String fromNo, int count, long areaId, ServiceContext serviceContext)
            throws PortalException, SystemException {
        if (org.apache.commons.lang3.StringUtils.length(fromNo) < 3) {
            throw new MonitorException("床位起始号码至少有3个数字");
        }
        if (org.apache.commons.lang3.StringUtils.length(fromNo) > 5) {
            throw new MonitorException("床位起始号码最多有5个数字");
        }
        if (count < 1) {
            throw new MonitorException("床位数量必须大于1");
        }
        if (count > 99) {
            throw new MonitorException("床位数量必须小于99");
        }

        int startCount;
        String start;
        String prefix;
        if (fromNo.contains(StringPool.PLUS)) {
            int indexOfPlus = fromNo.indexOf(StringPool.PLUS);
            start = fromNo.substring(indexOfPlus);
            prefix = fromNo.substring(0, indexOfPlus + 1);
        } else {
            start = fromNo.substring(fromNo.length() - 2);
            prefix = fromNo.substring(0, fromNo.length() - 2);
        }

        startCount = Integer.valueOf(start);

        if (startCount + count > 99) {
            throw new MonitorException("最多添加99张床位");
        }

        add(prefix, startCount, startCount + count, areaId, serviceContext);
    }

    private void add(String prefix, int from, int to, long areaId, ServiceContext serviceContext)
            throws PortalException, SystemException {
        for (int i = from; i < to; i++) {
            String bedNo = getFinalBedNo(prefix, String.valueOf(i));
            String alias = getBedAlias(prefix, String.valueOf(i));
            add(bedNo, alias, areaId, serviceContext);
        }
    }

    private Bed add(String bedNo, String alias, long areaId, ServiceContext serviceContext)
            throws MonitorException, SystemException {
        Bed bed = bedPersistence.fetchByLocationIdAndBedNo(areaId, bedNo);
        if (bed != null) {
            throw new MonitorException("床位编号已存在：" + bedNo);
        }

        long bedId = counterLocalService.increment(Bed.class.getName());
        bed = bedPersistence.create(bedId);
        bed.setCompanyId(serviceContext.getCompanyId());
        bed.setGroupId(serviceContext.getScopeGroupId());
        bed.setBedNo(bedNo);
        bed.setAlias(alias);
        bed.setLocationId(areaId);
        bed.setPatientId(0L);
        Date now = new Date();
        bed.setCreateDate(now);
        bed.setModifiedDate(now);
        return super.addBed(bed);
    }

    private String getFinalBedNo(String prefix, String bedNo) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        if (bedNo.length() == 1 && !prefix.contains(StringPool.PLUS)) {
            sb.append("0");
        }
        sb.append(bedNo);
        return sb.toString();
    }

    private String getBedAlias(String prefix, String bedNo) {
        StringBuilder sb = new StringBuilder();
        if (prefix.contains(StringPool.PLUS)) {
            sb.append(StringPool.PLUS);
        }
        if (bedNo.length() == 1 && !prefix.contains(StringPool.PLUS)) {
            sb.append("0");
        }
        sb.append(bedNo);
        return sb.toString();
    }

    @Override
    public Bed deleteBed(long bedId) throws PortalException, SystemException {
        Bed bed = getBed(bedId);
        if (bed.getPatientId() > 0) {
            throw new MonitorException(bed.getBedNo() + "床位有病人不能删除");
        }
        return super.deleteBed(bedId);
    }

    public List<Bed> findByDisplayTerms(BedDisplayTerms displayTerms, OrderByComparator obc, int start, int end,
                                        ServiceContext serviceContext) throws SystemException {
        DynamicQuery dynamicQuery = getDynamicQuery(displayTerms, serviceContext);
        OrderByTermHelper.addOrderByTerm(obc, dynamicQuery);
        return dynamicQuery(dynamicQuery, start, end);
    }

    public int countByDisplayTerms(BedDisplayTerms displayTerms, ServiceContext serviceContext) throws SystemException {
        DynamicQuery dynamicQuery = getDynamicQuery(displayTerms, serviceContext);
        return Long.valueOf(dynamicQueryCount(dynamicQuery)).intValue();
    }

    private DynamicQuery getDynamicQuery(BedDisplayTerms displayTerms, ServiceContext serviceContext) {
        long locationId = displayTerms.getLocationId();
        long companyId = serviceContext.getCompanyId();
        long groupId = serviceContext.getScopeGroupId();

        DynamicQuery dynamicQuery = bedLocalService.dynamicQuery();
        dynamicQuery.add(PropertyFactoryUtil.forName("companyId").eq(companyId));
        dynamicQuery.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
        if (locationId > 0) {
            dynamicQuery.add(PropertyFactoryUtil.forName("locationId").eq(locationId));
        }

        return dynamicQuery;
    }

    public List<Bed> findByLocationId(long locationId) throws SystemException {
        return bedPersistence.findByLocationId(locationId);
    }

    public int countByLocationId(long locationId) throws SystemException {
        return bedPersistence.countByLocationId(locationId);
    }

    public void bindPatient(long bedId, long patientId) throws SystemException, PortalException {
        Bed bed = getBed(bedId);
        if (bed.getPatientId() > 0) {
            throw new MonitorException("床位已被使用");
        }
        bed.setPatientId(patientId);
        bed.setModifiedDate(new Date());
        super.updateBed(bed);
    }

    public void unbindPatient(long bedId) throws SystemException, PortalException {
        Bed bed = getBed(bedId);
        if (bed.getPatientId() > 0) {
            Patient patient = patientLocalService.fetchPatient(bed.getPatientId());
            if (patient != null) {
                patient.setBedId(0L);
                patient.setModifiedDate(new Date());
                patientLocalService.updatePatient(patient);
            }
        }
        bed.setPatientId(0L);
        bed.setModifiedDate(new Date());
        super.updateBed(bed);
    }

    public List<Bed> findUsableBeds(long locationId) throws SystemException {
        DynamicQuery dynamicQuery = bedLocalService.dynamicQuery();
        dynamicQuery.add(PropertyFactoryUtil.forName("locationId").eq(locationId));
        dynamicQuery.add(PropertyFactoryUtil.forName("patientId").eq(0L));
        return dynamicQuery(dynamicQuery);
    }

    public Bed getByBedAlias(long locationId, String bedAlias) throws SystemException {
        DynamicQuery bedDynamicQuery = dynamicQuery();
        bedDynamicQuery.add(PropertyFactoryUtil.forName("locationId").eq(locationId));
        bedDynamicQuery.add(PropertyFactoryUtil.forName("alias").eq(bedAlias));
        List<Bed> beds = dynamicQuery(bedDynamicQuery);
        if (beds.isEmpty()) {
            return null;
        }
        return beds.get(0);
    }

}
