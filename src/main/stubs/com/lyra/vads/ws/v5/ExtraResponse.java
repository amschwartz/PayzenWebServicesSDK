
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extraResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extraResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentOptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOptionOccNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extraResponse", propOrder = {
    "paymentOptionCode",
    "paymentOptionOccNumber"
})
public class ExtraResponse {

    protected String paymentOptionCode;
    protected Integer paymentOptionOccNumber;

    /**
     * Gets the value of the paymentOptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOptionCode() {
        return paymentOptionCode;
    }

    /**
     * Sets the value of the paymentOptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOptionCode(String value) {
        this.paymentOptionCode = value;
    }

    /**
     * Gets the value of the paymentOptionOccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentOptionOccNumber() {
        return paymentOptionOccNumber;
    }

    /**
     * Sets the value of the paymentOptionOccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentOptionOccNumber(Integer value) {
        this.paymentOptionOccNumber = value;
    }

}
