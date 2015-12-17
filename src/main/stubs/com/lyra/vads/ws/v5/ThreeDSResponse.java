
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for threeDSResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="threeDSResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticationRequestData" type="{http://v5.ws.vads.lyra.com/}authenticationRequestData" minOccurs="0"/>
 *         &lt;element name="authenticationResultData" type="{http://v5.ws.vads.lyra.com/}authenticationResultData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "threeDSResponse", propOrder = {
    "authenticationRequestData",
    "authenticationResultData"
})
public class ThreeDSResponse {

    protected AuthenticationRequestData authenticationRequestData;
    protected AuthenticationResultData authenticationResultData;

    /**
     * Gets the value of the authenticationRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationRequestData }
     *     
     */
    public AuthenticationRequestData getAuthenticationRequestData() {
        return authenticationRequestData;
    }

    /**
     * Sets the value of the authenticationRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationRequestData }
     *     
     */
    public void setAuthenticationRequestData(AuthenticationRequestData value) {
        this.authenticationRequestData = value;
    }

    /**
     * Gets the value of the authenticationResultData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationResultData }
     *     
     */
    public AuthenticationResultData getAuthenticationResultData() {
        return authenticationResultData;
    }

    /**
     * Sets the value of the authenticationResultData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationResultData }
     *     
     */
    public void setAuthenticationResultData(AuthenticationResultData value) {
        this.authenticationResultData = value;
    }

}
