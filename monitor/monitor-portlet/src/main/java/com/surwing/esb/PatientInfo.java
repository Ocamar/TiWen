package com.surwing.esb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by zhaiyz on 18-3-9.
 */
@XmlRootElement(name = "select")
public class PatientInfo {

//        <ClinDiag>抽搐原因待查:癫痫? 支气管炎</ClinDiag>
//        <cPatientName>段智昱</cPatientName>
//        <BedNO>810-27</BedNO>
//        <DeptCode>1</DeptCode>
//        <WardCode>331</WardCode>
//        <DoctorInCharge>孙浩</DoctorInCharge>
//        <PatientID>661060</PatientID>
//        <VisitID>14687463</VisitID>
//        <Memo/>
//        <AdmissionDateTime>2018-02-28 20:52:48</AdmissionDateTime>
//        <AdmWardDateTime>2018-02-28 20:52:48</AdmWardDateTime>

    private String patientID;

    private String wardCode;

    private String cPatientName;

    private String bedNo;

    private String admissionDateTime;

    public String getPatientID() {
        return patientID;
    }

    @XmlElement(name = "PatientID")
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getWardCode() {
        return wardCode;
    }

    @XmlElement(name = "WardCode")
    public void setWardCode(String wardCode) {
        this.wardCode = wardCode;
    }

    public String getcPatientName() {
        return cPatientName;
    }

    @XmlElement(name = "cPatientName")
    public void setcPatientName(String cPatientName) {
        this.cPatientName = cPatientName;
    }

    public String getBedNo() {
        return bedNo;
    }

    @XmlElement(name = "BedNO")
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getAdmissionDateTime() {
        return admissionDateTime;
    }

    @XmlElement(name = "AdmissionDateTime")
    public void setAdmissionDateTime(String admissionDateTime) {
        this.admissionDateTime = admissionDateTime;
    }

    @Override
    public String toString() {
        return "PatientInfo{" +
                "patientID='" + patientID + '\'' +
                ", wardCode='" + wardCode + '\'' +
                ", cPatientName='" + cPatientName + '\'' +
                ", bedNo='" + bedNo + '\'' +
                ", admissionDateTime=" + admissionDateTime +
                '}';
    }
}
