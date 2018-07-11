package com.surwing.portlet.node;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.surwing.MonitorException;
import com.surwing.enums.NodeType;
import com.surwing.model.Location;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.service.NodeLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaiyz on 16-1-7.
 */
public class NodeAddAction extends LiferayActionSupport {

    private static final Log LOG = LogFactoryUtil.getLog(NodeAddAction.class);

    private long locationId;

    private int nodeType;

    private String nodeNo;

    @Override
    public String execute() throws Exception {
        try {
            NodeLocalServiceUtil.addNode(locationId, nodeType, nodeNo, getCompanyId(), getScopeGroupId());
            addActionMessage("添加基站成功");
        } catch (MonitorException me) {
            LOG.error("添加基站失败", me);
            addActionError(me.getMessage());
            return ERROR;
        } catch (Exception e) {
            LOG.error("添加基站失败", e);
            addActionError("添加基站失败");
            return ERROR;
        }
        return BACK;
    }

    public List<Location> getLocations() throws SystemException {
        return LocationLocalServiceUtil.getLocationsByC_G(getCompanyId(), getScopeGroupId(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
    }

    public List<NodeType> getNodeTypes() {
        List<NodeType> nodeTypes = new ArrayList<>();
        for (NodeType nodeType : NodeType.values()) {
            nodeTypes.add(nodeType);
        }
        return nodeTypes;
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public int getNodeType() {
        return nodeType;
    }

    public void setNodeType(int nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeNo() {
        return nodeNo;
    }

    public void setNodeNo(String nodeNo) {
        this.nodeNo = nodeNo;
    }
}
