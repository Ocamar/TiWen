package com.surwing.esb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.util.List;

/**
 * Created by zhaiyz on 18-3-9.
 */
@XmlRootElement(name = "output")
public class PatientInfos {

    private List<PatientInfo> patientInfos;

    public List<PatientInfo> getPatientInfos() {
        return patientInfos;
    }

    @XmlElement(name = "select")
    public void setPatientInfos(List<PatientInfo> patientInfos) {
        this.patientInfos = patientInfos;
    }

    public static void main(String[] args) throws JAXBException {
        File file = new File("/home/zhaiyz/文档/ocamar/sensemonitor/monitor/monitor-portlet/src/main/resources/PatientInfo.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(PatientInfos.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        PatientInfos patientInfos = (PatientInfos) jaxbUnmarshaller.unmarshal(file);

        for (PatientInfo info : patientInfos.getPatientInfos()) {
            System.out.println(info);
        }

    }
}
