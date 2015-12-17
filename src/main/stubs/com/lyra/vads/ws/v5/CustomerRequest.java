
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingDetails" type="{http://v5.ws.vads.lyra.com/}billingDetailsRequest" minOccurs="0"/>
 *         &lt;element name="shippingDetails" type="{http://v5.ws.vads.lyra.com/}shippingDetailsRequest" minOccurs="0"/>
 *         &lt;element name="extraDetails" type="{http://v5.ws.vads.lyra.com/}extraDetailsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerRequest", propOrder = {
    "billingDetails",
    "shippingDetails",
    "extraDetails"
})
public class CustomerRequest {

    protected BillingDetailsRequest billingDetails;
    protected ShippingDetailsRequest shippingDetails;
    protected ExtraDetailsRequest extraDetails;

    /**
     * Gets the value of the billingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BillingDetailsRequest }
     *     
     */
    public BillingDetailsRequest getBillingDetails() {
        return billingDetails;
    }

    /**
     * Sets the value of the billingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingDetailsRequest }
     *     
     */
    public void setBillingDetails(BillingDetailsRequest value) {
        this.billingDetails = value;
    }

    /**
     * Gets the value of the shippingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDetailsRequest }
     *     
     */
    public ShippingDetailsRequest getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Sets the value of the shippingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDetailsRequest }
     *     
     */
    public void setShippingDetails(ShippingDetailsRequest value) {
        this.shippingDetails = value;
    }

    /**
     * Gets the value of the extraDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraDetailsRequest }
     *     
     */
    public ExtraDetailsRequest getExtraDetails() {
        return extraDetails;
    }

    /**
     * Sets the value of the extraDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraDetailsRequest }
     *     
     */
    public void setExtraDetails(ExtraDetailsRequest value) {
        this.extraDetails = value;
    }

}
