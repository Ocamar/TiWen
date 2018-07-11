package com.surwing.service.impl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.surwing.MonitorException;
import com.surwing.enums.NodeStatus;
import com.surwing.model.Node;
import com.surwing.search.NodeDisplayTerms;
import com.surwing.service.base.NodeLocalServiceBaseImpl;
import com.surwing.util.CommonHelper;
import com.surwing.util.OrderByTermHelper;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the node local service.
 * <p>
 * <p> All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy
 * their definitions into the {@link com.surwing.service.NodeLocalService} interface.
 * <p>
 * <p> This is a local service. Methods of this service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same VM. </p>
 *
 * @author zhaiyz
 * @see com.surwing.service.base.NodeLocalServiceBaseImpl
 * @see com.surwing.service.NodeLocalServiceUtil
 */
public class NodeLocalServiceImpl extends NodeLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.surwing.service.NodeLocalServiceUtil} to access
      * the node local service.
     */

    public Node addNode(long locationId, int nodeType, String nodeNo, long companyId, long groupId) throws
            SystemException, MonitorException {
        nodeNo = CommonHelper.removePreZero(nodeNo);
        Node node = nodePersistence.fetchByNodeNo(nodeNo);
        if (node != null) {
            throw new MonitorException("基站编号已经存在");
        }

        long nodeId = counterLocalService.increment(Node.class.getName());
        node = nodePersistence.create(nodeId);
        node.setNodeId(nodeId);
        node.setCompanyId(companyId);
        node.setGroupId(groupId);
        node.setNodeNo(nodeNo);
        node.setLocationId(locationId);
        node.setNodeType(nodeType);
        node.setStatus(NodeStatus.OFF_LINE.getNodeStatus());

        Date now = new Date();
        node.setCreateDate(now);
        node.setModifiedDate(now);

        return super.addNode(node);
    }

    public int countNodesByDisplayTerms(NodeDisplayTerms displayTerms, long companyId, long groupId) throws
            SystemException {
        DynamicQuery dynamicQuery = getNodeDynamicQuery(displayTerms, companyId, groupId);
        return Long.valueOf(dynamicQueryCount(dynamicQuery)).intValue();
    }

    public List<Node> findNodesByDisplayTerms(NodeDisplayTerms displayTerms, OrderByComparator obc, int start,
                                              int end, long companyId, long groupId) throws SystemException {
        DynamicQuery dynamicQuery = getNodeDynamicQuery(displayTerms, companyId, groupId);
        OrderByTermHelper.addOrderByTerm(obc, dynamicQuery);
        dynamicQuery.addOrder(OrderFactoryUtil.desc("nodeId"));
        return dynamicQuery(dynamicQuery, start, end);
    }

    private DynamicQuery getNodeDynamicQuery(NodeDisplayTerms displayTerms, long companyId, long groupId) {
        int nodeType = displayTerms.getNodeType();
        long locationId = displayTerms.getLocationId();
        int status = displayTerms.getStatus();

        DynamicQuery dynamicQuery = dynamicQuery();
        dynamicQuery.add(PropertyFactoryUtil.forName("companyId").eq(companyId));
        dynamicQuery.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
        if (nodeType > 0) {
            dynamicQuery.add(PropertyFactoryUtil.forName("nodeType").eq(nodeType));
        }
        if (locationId > 0) {
            dynamicQuery.add(PropertyFactoryUtil.forName("locationId").eq(locationId));
        }
        if (status > 0) {
            dynamicQuery.add(PropertyFactoryUtil.forName("status").eq(status));
        }

        return dynamicQuery;
    }

    public Node updateNodeInfo(Node node) throws SystemException, MonitorException {
        String nodeNo = CommonHelper.removePreZero(node.getNodeNo());
        node.setNodeNo(nodeNo);
        Node n = nodePersistence.fetchByNodeNo(node.getNodeNo());
        if (n != null && n.getNodeId() != node.getNodeId()) {
            throw new MonitorException("基站编号已存在");
        }
        node.setModifiedDate(new Date());
        return super.updateNode(node);
    }

    public Node fetchByNodeNo(String nodeNo) throws SystemException {
        nodeNo = CommonHelper.removePreZero(nodeNo);
        return nodePersistence.fetchByNodeNo(nodeNo);
    }

    public void updateNodeStatusToTimeout() throws SystemException {
        Date now = new Date();
        Date timeoutDate = DateUtils.addMinutes(now, -40);
        DynamicQuery dynamicQuery = dynamicQuery();
        dynamicQuery.add(PropertyFactoryUtil.forName("lastReceivedTime").lt(timeoutDate));
        List<Node> nodes = dynamicQuery(dynamicQuery);
        for (Node node : nodes) {
            node.setStatus(NodeStatus.OFF_LINE.getNodeStatus());
            node.setModifiedDate(now);
            updateNode(node);
        }
    }
}
