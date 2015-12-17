
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authenticationRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authenticationRequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="threeDSAcctId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threeDSAcsUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threeDSBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threeDSEncodedPareq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threeDSEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threeDSRequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authenticationRequestData", propOrder = {
    "threeDSAcctId",
    "threeDSAcsUrl",
    "threeDSBrand",
    "threeDSEncodedPareq",
    "threeDSEnrolled",
    "threeDSRequestId"
})
public class AuthenticationRequestData {

    protected String threeDSAcctId;
    protected String threeDSAcsUrl;
    protected String threeDSBrand;
    protected String threeDSEncodedPareq;
    protected String threeDSEnrolled;
    protected String threeDSRequestId;

    /**
     * Gets the value of the threeDSAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDSAcctId() {
        return threeDSAcctId;
    }

    /**
     * Sets the value of the threeDSAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDSAcctId(String value) {
        this.threeDSAcctId = value;
    }

    /**
     * Gets the value of the threeDSAcsUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDSAcsUrl() {
        return threeDSAcsUrl;
    }

    /**
     * Sets the value of the threeDSAcsUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDSAcsUrl(String value) {
        this.threeDSAcsUrl = value;
    }

    /**
     * Gets the value of the threeDSBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDSBrand() {
        return threeDSBrand;
    }

    /**
     * Sets the value of the threeDSBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDSBrand(String value) {
        this.threeDSBrand = value;
    }

    /**
     * Gets the value of the threeDSEncodedPareq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDSEncodedPareq() {
        return threeDSEncodedPareq;
    }

    /**
     * Sets the value of the threeDSEncodedPareq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDSEncodedPareq(String value) {
        this.threeDSEncodedPareq = value;
    }

    /**
     * Gets the value of the threeDSEnrolled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDSEnrolled() {
        return threeDSEnrolled;
    }

    /**
     * Sets the value of the threeDSEnrolled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDSEnrolled(String value) {
        this.threeDSEnrolled = value;
    }

    /**
     * Gets the value of the threeDSRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDSRequestId() {
        return threeDSRequestId;
    }

    /**
     * Sets the value of the threeDSRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDSRequestId(String value) {
        this.threeDSRequestId = value;
    }

}
