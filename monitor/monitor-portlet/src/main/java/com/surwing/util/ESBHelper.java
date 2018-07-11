package com.surwing.util;

import cn.com.winning.*;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.surwing.esb.PatientInfos;
import org.apache.commons.lang3.time.DateFormatUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

/**
 * Created by zhaiyz on 18-3-9.
 */
public final class ESBHelper {

    private static final Log LOG = LogFactoryUtil.getLog(ESBHelper.class);

    private ESBHelper() {
    }

    private static final String ESB_URL = GetterUtil.getString(PropsUtil.get(MonitorPropsKeys.ESB_URL),
            "http://111.111.111.21:20015/WebServiceBodyHealt");

    /**
     * 获取指定病区的病人
     *
     * @param locationName 病区名称
     * @return 在院病人列表
     */
    public static PatientInfos getPatientInfos(String locationName) throws MalformedURLException, JAXBException {
        LOG.info("开始请求" + locationName + "病区的病人信息");

        WebServiceBodyHeat service = new WebServiceBodyHeat(new URL(ESB_URL));
        WebServiceBodyHeatPortType port = service.getWebServiceBodyHeatPort();

        GetInPatientInforRequest request = new GetInPatientInforRequest();
        request.setDeptname(locationName);
        GetInPatientInforResponse response = port.getInPatientInfor(request);
        String output = response.getOutput();

        LOG.info("请求" + locationName + "病区的病人信息成功，" + output);

        String xml = "<output>" + output + "</output>";
        JAXBContext jaxbContext = JAXBContext.newInstance(PatientInfos.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return (PatientInfos) jaxbUnmarshaller.unmarshal(new StringReader(xml));
    }

    public static void reportPatientHeat(String mrn, String name, BigDecimal temperature) throws MalformedURLException {
        LOG.info("开始上报病人体温信息：" + mrn + "," + name + "," + temperature.toString());

        WebServiceBodyHeat service = new WebServiceBodyHeat(new URL(ESB_URL));
        WebServiceBodyHeatPortType port = service.getWebServiceBodyHeatPort();

        GetInPatientBodyHeatRequest request = new GetInPatientBodyHeatRequest();
        String xml = "<PatientID>@PatientID@</PatientID><cPatientName>@cPatientName@</cPatientName><dRecordDate>@dRecordDate@</dRecordDate><iTime>@iTime@</iTime><iBodyHeat>@iBodyHeat@</iBodyHeat>";
        xml = xml.replace("@PatientID@", mrn);
        xml = xml.replace("@cPatientName@", name);
        Date now = new Date();
        xml = xml.replace("@dRecordDate@", DateFormatUtils.format(now, "yyyy-MM-dd"));
        xml = xml.replace("@iTime@", DateFormatUtils.format(now, "HH"));
        xml = xml.replace("@iBodyHeat@", temperature.toString());
        request.setXml(xml);
        GetInPatientBodyHeatResponse response = port.getInPatientBodyHeat(request);
        String output = response.getOutput();

        LOG.info("上报病人体温信息完成" + mrn + "," + name + "," + temperature.toString() + ", " + output);
    }
}
