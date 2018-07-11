package com.surwing.portlet.node;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.opensymphony.xwork2.Preparable;
import com.surwing.MonitorException;
import com.surwing.enums.NodeType;
import com.surwing.model.Location;
import com.surwing.model.Node;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.service.NodeLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaiyz on 16-1-8.
 */
public class NodeEditAction extends LiferayActionSupport implements Preparable {

    private static final Log LOG = LogFactoryUtil.getLog(NodeEditAction.class);

    private long nodeId;

    private Node node;

    @Override
    public void prepare() throws Exception {
        if (nodeId == 0) {
            addActionError("基站不存在");
        }
        try {
            node = NodeLocalServiceUtil.getNode(nodeId);
        } catch (Exception e) {
            addActionError("病区不存在");
        }
    }

    @Override
    public String execute() throws Exception {
        try {
            NodeLocalServiceUtil.updateNodeInfo(node);
            addActionMessage("更新基站成功");
        } catch (MonitorException me) {
            LOG.error("更新基站失败", me);
            addActionError(me.getMessage());
            return ERROR;
        } catch (Exception e) {
            LOG.error("更新基站失败", e);
            addActionError("更新基站失败");
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

    public long getNodeId() {
        return nodeId;
    }

    public void setNodeId(long nodeId) {
        this.nodeId = nodeId;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }


}
