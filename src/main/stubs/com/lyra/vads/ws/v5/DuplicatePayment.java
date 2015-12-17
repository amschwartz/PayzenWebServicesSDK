
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for duplicatePayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="duplicatePayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonRequest" type="{http://v5.ws.vads.lyra.com/}commonRequest" minOccurs="0"/>
 *         &lt;element name="paymentRequest" type="{http://v5.ws.vads.lyra.com/}paymentRequest" minOccurs="0"/>
 *         &lt;element name="orderRequest" type="{http://v5.ws.vads.lyra.com/}orderRequest" minOccurs="0"/>
 *         &lt;element name="queryRequest" type="{http://v5.ws.vads.lyra.com/}queryRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "duplicatePayment", propOrder = {
    "commonRequest",
    "paymentRequest",
    "orderRequest",
    "queryRequest"
})
public class DuplicatePayment {

    protected CommonRequest commonRequest;
    protected PaymentRequest paymentRequest;
    protected OrderRequest orderRequest;
    protected QueryRequest queryRequest;

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
     * Gets the value of the queryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link QueryRequest }
     *     
     */
    public QueryRequest getQueryRequest() {
        return queryRequest;
    }

    /**
     * Sets the value of the queryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryRequest }
     *     
     */
    public void setQueryRequest(QueryRequest value) {
        this.queryRequest = value;
    }

}
