
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for duplicatePaymentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="duplicatePaymentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="duplicatePaymentResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://v5.ws.vads.lyra.com/}wsResponse">
 *                 &lt;sequence>
 *                   &lt;element name="commonResponse" type="{http://v5.ws.vads.lyra.com/}commonResponse" minOccurs="0"/>
 *                   &lt;element name="paymentResponse" type="{http://v5.ws.vads.lyra.com/}paymentResponse" minOccurs="0"/>
 *                   &lt;element name="orderResponse" type="{http://v5.ws.vads.lyra.com/}orderResponse" minOccurs="0"/>
 *                   &lt;element name="cardResponse" type="{http://v5.ws.vads.lyra.com/}cardResponse" minOccurs="0"/>
 *                   &lt;element name="authorizationResponse" type="{http://v5.ws.vads.lyra.com/}authorizationResponse" minOccurs="0"/>
 *                   &lt;element name="captureResponse" type="{http://v5.ws.vads.lyra.com/}captureResponse" minOccurs="0"/>
 *                   &lt;element name="customerResponse" type="{http://v5.ws.vads.lyra.com/}customerResponse" minOccurs="0"/>
 *                   &lt;element name="markResponse" type="{http://v5.ws.vads.lyra.com/}markResponse" minOccurs="0"/>
 *                   &lt;element name="threeDSResponse" type="{http://v5.ws.vads.lyra.com/}threeDSResponse" minOccurs="0"/>
 *                   &lt;element name="extraResponse" type="{http://v5.ws.vads.lyra.com/}extraResponse" minOccurs="0"/>
 *                   &lt;element name="fraudManagementResponse" type="{http://v5.ws.vads.lyra.com/}fraudManagementResponse" minOccurs="0"/>
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
@XmlType(name = "duplicatePaymentResponse", propOrder = {
    "duplicatePaymentResult"
})
public class DuplicatePaymentResponse {

    protected DuplicatePaymentResponse.DuplicatePaymentResult duplicatePaymentResult;

    /**
     * Gets the value of the duplicatePaymentResult property.
     * 
     * @return
     *     possible object is
     *     {@link DuplicatePaymentResponse.DuplicatePaymentResult }
     *     
     */
    public DuplicatePaymentResponse.DuplicatePaymentResult getDuplicatePaymentResult() {
        return duplicatePaymentResult;
    }

    /**
     * Sets the value of the duplicatePaymentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DuplicatePaymentResponse.DuplicatePaymentResult }
     *     
     */
    public void setDuplicatePaymentResult(DuplicatePaymentResponse.DuplicatePaymentResult value) {
        this.duplicatePaymentResult = value;
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
     *         &lt;element name="orderResponse" type="{http://v5.ws.vads.lyra.com/}orderResponse" minOccurs="0"/>
     *         &lt;element name="cardResponse" type="{http://v5.ws.vads.lyra.com/}cardResponse" minOccurs="0"/>
     *         &lt;element name="authorizationResponse" type="{http://v5.ws.vads.lyra.com/}authorizationResponse" minOccurs="0"/>
     *         &lt;element name="captureResponse" type="{http://v5.ws.vads.lyra.com/}captureResponse" minOccurs="0"/>
     *         &lt;element name="customerResponse" type="{http://v5.ws.vads.lyra.com/}customerResponse" minOccurs="0"/>
     *         &lt;element name="markResponse" type="{http://v5.ws.vads.lyra.com/}markResponse" minOccurs="0"/>
     *         &lt;element name="threeDSResponse" type="{http://v5.ws.vads.lyra.com/}threeDSResponse" minOccurs="0"/>
     *         &lt;element name="extraResponse" type="{http://v5.ws.vads.lyra.com/}extraResponse" minOccurs="0"/>
     *         &lt;element name="fraudManagementResponse" type="{http://v5.ws.vads.lyra.com/}fraudManagementResponse" minOccurs="0"/>
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
        "paymentResponse",
        "orderResponse",
        "cardResponse",
        "authorizationResponse",
        "captureResponse",
        "customerResponse",
        "markResponse",
        "threeDSResponse",
        "extraResponse",
        "fraudManagementResponse"
    })
    public static class DuplicatePaymentResult
        extends WsResponse
    {

        protected CommonResponse commonResponse;
        protected PaymentResponse paymentResponse;
        protected OrderResponse orderResponse;
        protected CardResponse cardResponse;
        protected AuthorizationResponse authorizationResponse;
        protected CaptureResponse captureResponse;
        protected CustomerResponse customerResponse;
        protected MarkResponse markResponse;
        protected ThreeDSResponse threeDSResponse;
        protected ExtraResponse extraResponse;
        protected FraudManagementResponse fraudManagementResponse;

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

        /**
         * Gets the value of the orderResponse property.
         * 
         * @return
         *     possible object is
         *     {@link OrderResponse }
         *     
         */
        public OrderResponse getOrderResponse() {
            return orderResponse;
        }

        /**
         * Sets the value of the orderResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderResponse }
         *     
         */
        public void setOrderResponse(OrderResponse value) {
            this.orderResponse = value;
        }

        /**
         * Gets the value of the cardResponse property.
         * 
         * @return
         *     possible object is
         *     {@link CardResponse }
         *     
         */
        public CardResponse getCardResponse() {
            return cardResponse;
        }

        /**
         * Sets the value of the cardResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link CardResponse }
         *     
         */
        public void setCardResponse(CardResponse value) {
            this.cardResponse = value;
        }

        /**
         * Gets the value of the authorizationResponse property.
         * 
         * @return
         *     possible object is
         *     {@link AuthorizationResponse }
         *     
         */
        public AuthorizationResponse getAuthorizationResponse() {
            return authorizationResponse;
        }

        /**
         * Sets the value of the authorizationResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link AuthorizationResponse }
         *     
         */
        public void setAuthorizationResponse(AuthorizationResponse value) {
            this.authorizationResponse = value;
        }

        /**
         * Gets the value of the captureResponse property.
         * 
         * @return
         *     possible object is
         *     {@link CaptureResponse }
         *     
         */
        public CaptureResponse getCaptureResponse() {
            return captureResponse;
        }

        /**
         * Sets the value of the captureResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link CaptureResponse }
         *     
         */
        public void setCaptureResponse(CaptureResponse value) {
            this.captureResponse = value;
        }

        /**
         * Gets the value of the customerResponse property.
         * 
         * @return
         *     possible object is
         *     {@link CustomerResponse }
         *     
         */
        public CustomerResponse getCustomerResponse() {
            return customerResponse;
        }

        /**
         * Sets the value of the customerResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerResponse }
         *     
         */
        public void setCustomerResponse(CustomerResponse value) {
            this.customerResponse = value;
        }

        /**
         * Gets the value of the markResponse property.
         * 
         * @return
         *     possible object is
         *     {@link MarkResponse }
         *     
         */
        public MarkResponse getMarkResponse() {
            return markResponse;
        }

        /**
         * Sets the value of the markResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link MarkResponse }
         *     
         */
        public void setMarkResponse(MarkResponse value) {
            this.markResponse = value;
        }

        /**
         * Gets the value of the threeDSResponse property.
         * 
         * @return
         *     possible object is
         *     {@link ThreeDSResponse }
         *     
         */
        public ThreeDSResponse getThreeDSResponse() {
            return threeDSResponse;
        }

        /**
         * Sets the value of the threeDSResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link ThreeDSResponse }
         *     
         */
        public void setThreeDSResponse(ThreeDSResponse value) {
            this.threeDSResponse = value;
        }

        /**
         * Gets the value of the extraResponse property.
         * 
         * @return
         *     possible object is
         *     {@link ExtraResponse }
         *     
         */
        public ExtraResponse getExtraResponse() {
            return extraResponse;
        }

        /**
         * Sets the value of the extraResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExtraResponse }
         *     
         */
        public void setExtraResponse(ExtraResponse value) {
            this.extraResponse = value;
        }

        /**
         * Gets the value of the fraudManagementResponse property.
         * 
         * @return
         *     possible object is
         *     {@link FraudManagementResponse }
         *     
         */
        public FraudManagementResponse getFraudManagementResponse() {
            return fraudManagementResponse;
        }

        /**
         * Sets the value of the fraudManagementResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link FraudManagementResponse }
         *     
         */
        public void setFraudManagementResponse(FraudManagementResponse value) {
            this.fraudManagementResponse = value;
        }

    }

}
