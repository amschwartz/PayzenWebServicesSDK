
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonRequest" type="{http://v5.ws.vads.lyra.com/}commonRequest" minOccurs="0"/>
 *         &lt;element name="threeDSRequest" type="{http://v5.ws.vads.lyra.com/}threeDSRequest" minOccurs="0"/>
 *         &lt;element name="paymentRequest" type="{http://v5.ws.vads.lyra.com/}paymentRequest" minOccurs="0"/>
 *         &lt;element name="orderRequest" type="{http://v5.ws.vads.lyra.com/}orderRequest" minOccurs="0"/>
 *         &lt;element name="cardRequest" type="{http://v5.ws.vads.lyra.com/}cardRequest" minOccurs="0"/>
 *         &lt;element name="customerRequest" type="{http://v5.ws.vads.lyra.com/}customerRequest" minOccurs="0"/>
 *         &lt;element name="techRequest" type="{http://v5.ws.vads.lyra.com/}techRequest" minOccurs="0"/>
 *         &lt;element name="shoppingCartRequest" type="{http://v5.ws.vads.lyra.com/}shoppingCartRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPayment", propOrder = {
    "commonRequest",
    "threeDSRequest",
    "paymentRequest",
    "orderRequest",
    "cardRequest",
    "customerRequest",
    "techRequest",
    "shoppingCartRequest"
})
public class CreatePayment {

    protected CommonRequest commonRequest;
    protected ThreeDSRequest threeDSRequest;
    protected PaymentRequest paymentRequest;
    protected OrderRequest orderRequest;
    protected CardRequest cardRequest;
    protected CustomerRequest customerRequest;
    protected TechRequest techRequest;
    protected ShoppingCartRequest shoppingCartRequest;

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

    /**
     * Gets the value of the paymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRequest }
     *     
     */
    public PaymentRequest getPaymentRequest() {
        return paymentRequest;
    }

    /**
     * Sets the value of the paymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRequest }
     *     
     */
    public void setPaymentRequest(PaymentRequest value) {
        this.paymentRequest = value;
    }

    /**
     * Gets the value of the orderRequest property.
     * 
     * @return
     *     possible object is
     *     {@link OrderRequest }
     *     
     */
    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    /**
     * Sets the value of the orderRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderRequest }
     *     
     */
    public void setOrderRequest(OrderRequest value) {
        this.orderRequest = value;
    }

    /**
     * Gets the value of the cardRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CardRequest }
     *     
     */
    public CardRequest getCardRequest() {
        return cardRequest;
    }

    /**
     * Sets the value of the cardRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardRequest }
     *     
     */
    public void setCardRequest(CardRequest value) {
        this.cardRequest = value;
    }

    /**
     * Gets the value of the customerRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRequest }
     *     
     */
    public CustomerRequest getCustomerRequest() {
        return customerRequest;
    }

    /**
     * Sets the value of the customerRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRequest }
     *     
     */
    public void setCustomerRequest(CustomerRequest value) {
        this.customerRequest = value;
    }

    /**
     * Gets the value of the techRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TechRequest }
     *     
     */
    public TechRequest getTechRequest() {
        return techRequest;
    }

    /**
     * Sets the value of the techRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechRequest }
     *     
     */
    public void setTechRequest(TechRequest value) {
        this.techRequest = value;
    }

    /**
     * Gets the value of the shoppingCartRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCartRequest }
     *     
     */
    public ShoppingCartRequest getShoppingCartRequest() {
        return shoppingCartRequest;
    }

    /**
     * Sets the value of the shoppingCartRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCartRequest }
     *     
     */
    public void setShoppingCartRequest(ShoppingCartRequest value) {
        this.shoppingCartRequest = value;
    }

}
