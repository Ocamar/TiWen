
package cn.com.winning;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebService_BodyHeatPortType", targetNamespace = "http://www.winning.com.cn/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServiceBodyHeatPortType {


    /**
     * 
     * @param parameters
     * @return
     *     returns cn.com.winning.GetInPatientInforResponse
     */
    @WebMethod(operationName = "GetInPatientInfor", action = "http://www.winning.com.cn//GetInPatientInfor")
    @WebResult(name = "GetInPatientInforResponse", targetNamespace = "http://www.winning.com.cn/", partName = "parameters")
    public GetInPatientInforResponse getInPatientInfor(
        @WebParam(name = "GetInPatientInforRequest", targetNamespace = "http://www.winning.com.cn/", partName = "parameters")
        GetInPatientInforRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns cn.com.winning.GetInPatientBodyHeatResponse
     */
    @WebMethod(operationName = "GetInPatientBodyHeat", action = "http://www.winning.com.cn//GetInPatientBodyHeat")
    @WebResult(name = "GetInPatientBodyHeatResponse", targetNamespace = "http://www.winning.com.cn/", partName = "parameters")
    public GetInPatientBodyHeatResponse getInPatientBodyHeat(
        @WebParam(name = "GetInPatientBodyHeatRequest", targetNamespace = "http://www.winning.com.cn/", partName = "parameters")
        GetInPatientBodyHeatRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns cn.com.winning.GetDeptInfoResponse
     */
    @WebMethod(operationName = "GetDeptInfo", action = "http://www.winning.com.cn//GetDeptInfo")
    @WebResult(name = "GetDeptInfoResponse", targetNamespace = "http://www.winning.com.cn/", partName = "parameters")
    public GetDeptInfoResponse getDeptInfo(
        @WebParam(name = "GetDeptInfoRequest", targetNamespace = "http://www.winning.com.cn/", partName = "parameters")
        GetDeptInfoRequest parameters);

}