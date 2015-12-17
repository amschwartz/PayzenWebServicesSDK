
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for capturePayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="capturePayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settlementRequest" type="{http://v5.ws.vads.lyra.com/}settlementRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "capturePayment", propOrder = {
    "settlementRequest"
})
public class CapturePayment {

    protected SettlementRequest settlementRequest;

    /**
     * Gets the value of the settlementRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementRequest }
     *     
     */
    public SettlementRequest getSettlementRequest() {
        return settlementRequest;
    }

    /**
     * Sets the value of the settlementRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementRequest }
     *     
     */
    public void setSettlementRequest(SettlementRequest value) {
        this.settlementRequest = value;
    }

}
