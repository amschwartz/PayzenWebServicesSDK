
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkThreeDSAuthentication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkThreeDSAuthentication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonRequest" type="{http://v5.ws.vads.lyra.com/}commonRequest" minOccurs="0"/>
 *         &lt;element name="threeDSRequest" type="{http://v5.ws.vads.lyra.com/}threeDSRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkThreeDSAuthentication", propOrder = {
    "commonRequest",
    "threeDSRequest"
})
public class CheckThreeDSAuthentication {

    protected CommonRequest commonRequest;
    protected ThreeDSRequest threeDSRequest;

    /**
     * Gets the value of the commonRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CommonRequest }
     *     
     */
    public CommonRequest getCommonRequest() {
        return commonRequest;
    }

    /**
     * Sets the value of the commonRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonRequest }
     *     
     */
    public void setCommonRequest(CommonRequest value) {
        this.commonRequest = value;
    }

    /**
     * Gets the value of the threeDSRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ThreeDSRequest }
     *     
     */
    public ThreeDSRequest getThreeDSRequest() {
        return threeDSRequest;
    }

    /**
     * Sets the value of the threeDSRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDSRequest }
     *     
     */
    public void setThreeDSRequest(ThreeDSRequest value) {
        this.threeDSRequest = value;
    }

}
