
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPaymentUuidResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPaymentUuidResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="legacyTransactionKeyResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://v5.ws.vads.lyra.com/}wsResponse">
 *                 &lt;sequence>
 *                   &lt;element name="commonResponse" type="{http://v5.ws.vads.lyra.com/}commonResponse" minOccurs="0"/>
 *                   &lt;element name="paymentResponse" type="{http://v5.ws.vads.lyra.com/}paymentResponse" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPaymentUuidResponse", propOrder = {
    "legacyTransactionKeyResult"
})
public class GetPaymentUuidResponse {

    protected GetPaymentUuidResponse.LegacyTransactionKeyResult legacyTransactionKeyResult;

    /**
     * Gets the value of the legacyTransactionKeyResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetPaymentUuidResponse.LegacyTransactionKeyResult }
     *     
     */
    public GetPaymentUuidResponse.LegacyTransactionKeyResult getLegacyTransactionKeyResult() {
        return legacyTransactionKeyResult;
    }

    /**
     * Sets the value of the legacyTransactionKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPaymentUuidResponse.LegacyTransactionKeyResult }
     *     
     */
    public void setLegacyTransactionKeyResult(GetPaymentUuidResponse.LegacyTransactionKeyResult value) {
        this.legacyTransactionKeyResult = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://v5.ws.vads.lyra.com/}wsResponse">
     *       &lt;sequence>
     *         &lt;element name="commonResponse" type="{http://v5.ws.vads.lyra.com/}commonResponse" minOccurs="0"/>
     *         &lt;element name="paymentResponse" type="{http://v5.ws.vads.lyra.com/}paymentResponse" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "commonResponse",
        "paymentResponse"
    })
    public static class LegacyTransactionKeyResult
        extends WsResponse
    {

        protected CommonResponse commonResponse;
        protected PaymentResponse paymentResponse;

        /**
         * Gets the value of the commonResponse property.
         * 
         * @return
         *     possible object is
         *     {@link CommonResponse }
         *     
         */
        public CommonResponse getCommonResponse() {
            return commonResponse;
        }

        /**
         * Sets the value of the commonResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonResponse }
         *     
         */
        public void setCommonResponse(CommonResponse value) {
            this.commonResponse = value;
        }

        /**
         * Gets the value of the paymentResponse property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentResponse }
         *     
         */
        public PaymentResponse getPaymentResponse() {
            return paymentResponse;
        }

        /**
         * Sets the value of the paymentResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentResponse }
         *     
         */
        public void setPaymentResponse(PaymentResponse value) {
            this.paymentResponse = value;
        }

    }

}
