package com.surwing.job;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.model.Company;
import com.liferay.portal.security.auth.CompanyThreadLocal;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.surwing.util.MonitorPropsKeys;

import java.util.List;

/**
 * @author zhaiyz
 */
public abstract class MonitorBaseMessageListener extends BaseMessageListener {

    @Override
    protected void doReceive(Message message) throws Exception {
        List<Company> companies = CompanyLocalServiceUtil.getCompanies();
        for (Company company : companies) {
            long companyId = company.getCompanyId();
            CompanyThreadLocal.setCompanyId(companyId);
            boolean cronjobEnable = GetterUtil.getBoolean(PropsUtil.get(MonitorPropsKeys.CRONJOB_ENABLE), false);
            if (cronjobEnable) {
                doJob(companyId);
            }
        }
    }

    protected abstract void doJob(long companyId) throws Exception;
}
