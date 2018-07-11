package com.surwing.esb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringWriter;

/**
 * Created by zhaiyz on 18-3-9.
 */
@XmlRootElement(name = "Xml")
public class PatientBodyHeat {

    private String patientID;

    private String cPatientName;

    private String dRecordDate;

    private String iTime;

    private String iBodyHeat;

    public String getPatientID() {
        return patientID;
    }

    @XmlElement(name = "PatientID")
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getcPatientName() {
        return cPatientName;
    }

    @XmlElement(name = "cPatientName")
    public void setcPatientName(String cPatientName) {
        this.cPatientName = cPatientName;
    }

    public String getdRecordDate() {
        return dRecordDate;
    }

    @XmlElement(name = "dRecordDate")
    public void setdRecordDate(String dRecordDate) {
        this.dRecordDate = dRecordDate;
    }

    public String getiTime() {
        return iTime;
    }

    @XmlElement(name = "iTime")
    public void setiTime(String iTime) {
        this.iTime = iTime;
    }

    public String getiBodyHeat() {
        return iBodyHeat;
    }

    @XmlElement(name = "iBodyHeat")
    public void setiBodyHeat(String iBodyHeat) {
        this.iBodyHeat = iBodyHeat;
    }


    //    <win:Xml>
//    <PatientID>115078</PatientID>
//    <cPatientName>闫海萍</cPatientName>
//    <dRecordDate>2018-02-03</dRecordDate>
//    <iTime>3</iTime>
//    <iBodyHeat>36</iBodyHeat>
//    </win:Xml>

    public static void main(String[] args) throws JAXBException {
        PatientBodyHeat patientBodyHeat = new PatientBodyHeat();
        patientBodyHeat.setPatientID("115078");
        patientBodyHeat.setcPatientName("闫海萍");
        patientBodyHeat.setdRecordDate("2018-02-03");
        patientBodyHeat.setiTime("3");
        patientBodyHeat.setiBodyHeat("36");

        StringWriter sw = new StringWriter();
        JAXBContext jaxbContext = JAXBContext.newInstance(PatientBodyHeat.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(patientBodyHeat, sw);

        System.out.println(sw.toString());
    }
}
