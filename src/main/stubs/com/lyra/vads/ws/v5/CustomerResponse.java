
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingDetails" type="{http://v5.ws.vads.lyra.com/}billingDetailsResponse" minOccurs="0"/>
 *         &lt;element name="shippingDetails" type="{http://v5.ws.vads.lyra.com/}shippingDetailsResponse" minOccurs="0"/>
 *         &lt;element name="extraDetails" type="{http://v5.ws.vads.lyra.com/}extraDetailsResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerResponse", propOrder = {
    "billingDetails",
    "shippingDetails",
    "extraDetails"
})
public class CustomerResponse {

    protected BillingDetailsResponse billingDetails;
    protected ShippingDetailsResponse shippingDetails;
    protected ExtraDetailsResponse extraDetails;

    /**
     * Gets the value of the billingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BillingDetailsResponse }
     *     
     */
    public BillingDetailsResponse getBillingDetails() {
        return billingDetails;
    }

    /**
     * Sets the value of the billingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingDetailsResponse }
     *     
     */
    public void setBillingDetails(BillingDetailsResponse value) {
        this.billingDetails = value;
    }

    /**
     * Gets the value of the shippingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDetailsResponse }
     *     
     */
    public ShippingDetailsResponse getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Sets the value of the shippingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDetailsResponse }
     *     
     */
    public void setShippingDetails(ShippingDetailsResponse value) {
        this.shippingDetails = value;
    }

    /**
     * Gets the value of the extraDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraDetailsResponse }
     *     
     */
    public ExtraDetailsResponse getExtraDetails() {
        return extraDetails;
    }

    /**
     * Sets the value of the extraDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraDetailsResponse }
     *     
     */
    public void setExtraDetails(ExtraDetailsResponse value) {
        this.extraDetails = value;
    }

}
