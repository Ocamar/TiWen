
package cn.com.winning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="begindate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enddate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "begindate",
    "enddate",
    "deptname"
})
@XmlRootElement(name = "GetInPatientInforRequest")
public class GetInPatientInforRequest {

    @XmlElement(required = true)
    protected String begindate;
    @XmlElement(required = true)
    protected String enddate;
    @XmlElement(required = true)
    protected String deptname;

    /**
     * Gets the value of the begindate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegindate() {
        return begindate;
    }

    /**
     * Sets the value of the begindate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegindate(String value) {
        this.begindate = value;
    }

    /**
     * Gets the value of the enddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnddate() {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnddate(String value) {
        this.enddate = value;
    }

    /**
     * Gets the value of the deptname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * Sets the value of the deptname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptname(String value) {
        this.deptname = value;
    }

}
