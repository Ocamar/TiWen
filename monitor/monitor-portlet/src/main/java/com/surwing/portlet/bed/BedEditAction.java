package com.surwing.portlet.bed;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.surwing.model.Bed;
import com.surwing.service.BedLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

/**
 * @author zhaiyz
 */
public class BedEditAction extends LiferayActionSupport {

    private static final Log LOG = LogFactoryUtil.getLog(BedEditAction.class);

    private long bedId;

    private String alias;

    private String bedNo;

    @Override
    public String input() throws Exception {
        Bed bed = BedLocalServiceUtil.getBed(bedId);
        alias = bed.getAlias();
        bedNo = bed.getBedNo();
        return super.input();
    }

    @Override
    public String execute() throws Exception {
        try {
            Bed bed = BedLocalServiceUtil.getBed(bedId);
            bed.setAlias(alias);
            bed.setModifiedDate(getNow());
            BedLocalServiceUtil.updateBed(bed);
            addActionMessage("编辑床位成功");
        } catch (Exception e) {
            addActionError("编辑床位失败");
            LOG.error("编辑床位失败，bedId=" + bedId, e);
            return ERROR;
        }
        return BACK;
    }

    public long getBedId() {
        return bedId;
    }

    public void setBedId(long bedId) {
        this.bedId = bedId;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }
}
