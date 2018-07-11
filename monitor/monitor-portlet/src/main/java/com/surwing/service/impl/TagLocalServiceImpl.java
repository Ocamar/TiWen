package com.surwing.service.impl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import com.surwing.MonitorException;
import com.surwing.NoSuchTagException;
import com.surwing.model.Tag;
import com.surwing.search.TagDisplayTerms;
import com.surwing.service.base.TagLocalServiceBaseImpl;
import com.surwing.swgcms.orm.DAOUtil;
import com.surwing.util.CommonHelper;
import com.surwing.util.OrderByTermHelper;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the tag local service.
 *
 * <p> All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy
 * their definitions into the {@link com.surwing.service.TagLocalService} interface.
 *
 * <p> This is a local service. Methods of this service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same VM. </p>
 *
 * @author zhaiyz
 * @see com.surwing.service.base.TagLocalServiceBaseImpl
 * @see com.surwing.service.TagLocalServiceUtil
 */
public class TagLocalServiceImpl extends TagLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.surwing.service.TagLocalServiceUtil} to access
     * the tag local service.
     */
    public Tag addTag(String tagNo, int type, int status, long companyId, long groupId) throws SystemException {
        tagNo = CommonHelper.removePreZero(tagNo);
        long tagId = counterLocalService.increment(Tag.class.getName());
        Tag tag = createTag(tagId);
        tag.setCompanyId(companyId);
        tag.setGroupId(groupId);
        tag.setTagNo(tagNo);
        tag.setType(type);
        tag.setStatus(status);

        Date now = new Date();
        tag.setCreateDate(now);
        tag.setModifiedDate(now);

        return super.addTag(tag);
    }

    public Tag updateTag(String tagNo, long nodeId) throws NoSuchTagException, SystemException {
        tagNo = CommonHelper.removePreZero(tagNo);
        Tag tag = tagPersistence.findByTagNo(tagNo);
        tag.setNodeId(nodeId);
        tag.setModifiedDate(new Date());
        return super.updateTag(tag);
    }

    public Tag fetchByTagNo(String tagNo) throws SystemException {
        tagNo = CommonHelper.removePreZero(tagNo);
        return tagPersistence.fetchByTagNo(tagNo);
    }

    public int countTagsByDisplayTerms(TagDisplayTerms displayTerms, long companyId, long groupId) throws
            SystemException {
        DynamicQuery dynamicQuery = getTagDynamicQuery(displayTerms, companyId, groupId);
        return Long.valueOf(dynamicQueryCount(dynamicQuery)).intValue();
    }

    public List<Tag> findTagsByDisplayTerms(TagDisplayTerms displayTerms, OrderByComparator obc, int start, int end,
                                            long companyId, long groupId) throws SystemException {
        DynamicQuery dynamicQuery = getTagDynamicQuery(displayTerms, companyId, groupId);
        OrderByTermHelper.addOrderByTerm(obc, dynamicQuery);
        dynamicQuery.addOrder(OrderFactoryUtil.desc("tagId"));
        return dynamicQuery(dynamicQuery, start, end);
    }

    private DynamicQuery getTagDynamicQuery(TagDisplayTerms displayTerms, long companyId, long groupId) {
        int tagType = displayTerms.getTagType();
        int status = displayTerms.getStatus();
        int registered = displayTerms.getRegistered();
        String tagNo = displayTerms.getTagNo();
        long locationId = displayTerms.getLocationId();
        boolean avaliable = displayTerms.isAvaliable();

        DynamicQuery dynamicQuery = dynamicQuery();
        dynamicQuery.add(PropertyFactoryUtil.forName("companyId").eq(companyId));
        dynamicQuery.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
        if (tagType > 0) {
            dynamicQuery.add(PropertyFactoryUtil.forName("type").eq(tagType));
        }
        if (status > 0) {
            dynamicQuery.add(PropertyFactoryUtil.forName("status").eq(status));
        }
        if (registered == 1) {
            dynamicQuery.add(PropertyFactoryUtil.forName("locationId").gt(0L));
        } else if (registered == 2) {
            dynamicQuery.add(PropertyFactoryUtil.forName("locationId").eq(0L));
        }
        if (Validator.isNotNull(tagNo)) {
            dynamicQuery.add(PropertyFactoryUtil.forName("tagNo").like(DAOUtil.getLike(tagNo)));
        }
        if (locationId > 0) {
            dynamicQuery.add(PropertyFactoryUtil.forName("locationId").eq(locationId));
        }
        if (avaliable) {
            dynamicQuery.add(PropertyFactoryUtil.forName("patientId").eq(0L));
        }

        return dynamicQuery;
    }

    public boolean isUsable(String tagNo) throws SystemException {
        Tag tag = tagPersistence.fetchByTagNo(tagNo);
        if (tag == null) {
            return false;
        }
        return tag.getPatientId() == 0;
    }

    public void registerTag(long tagId, long locationId) throws SystemException, PortalException {
        Tag tag = getTag(tagId);
        tag.setLocationId(locationId);
        tag.setModifiedDate(new Date());
        super.updateTag(tag);
    }

    @Override
    public Tag deleteTag(long tagId) throws PortalException, SystemException {
        Tag tag = getTag(tagId);
        if (tag.getPatientId() > 0) {
            throw new MonitorException("此标签已绑定到病人，不能删除");
        }
        return super.deleteTag(tagId);
    }
}
