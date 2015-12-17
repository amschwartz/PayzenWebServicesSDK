
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cancelSubscriptionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancelSubscriptionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancelSubscriptionResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://v5.ws.vads.lyra.com/}wsResponse">
 *                 &lt;sequence>
 *                   &lt;element name="commonResponse" type="{http://v5.ws.vads.lyra.com/}commonResponse" minOccurs="0"/>
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
@XmlType(name = "cancelSubscriptionResponse", propOrder = {
    "cancelSubscriptionResult"
})
public class CancelSubscriptionResponse {

    protected CancelSubscriptionResponse.CancelSubscriptionResult cancelSubscriptionResult;

    /**
     * Gets the value of the cancelSubscriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link CancelSubscriptionResponse.CancelSubscriptionResult }
     *     
     */
    public CancelSubscriptionResponse.CancelSubscriptionResult getCancelSubscriptionResult() {
        return cancelSubscriptionResult;
    }

    /**
     * Sets the value of the cancelSubscriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelSubscriptionResponse.CancelSubscriptionResult }
     *     
     */
    public void setCancelSubscriptionResult(CancelSubscriptionResponse.CancelSubscriptionResult value) {
        this.cancelSubscriptionResult = value;
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
        "commonResponse"
    })
    public static class CancelSubscriptionResult
        extends WsResponse
    {

        protected CommonResponse commonResponse;

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

    }

}
