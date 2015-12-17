
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateSubscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateSubscription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonRequest" type="{http://v5.ws.vads.lyra.com/}commonRequest" minOccurs="0"/>
 *         &lt;element name="queryRequest" type="{http://v5.ws.vads.lyra.com/}queryRequest" minOccurs="0"/>
 *         &lt;element name="subscriptionRequest" type="{http://v5.ws.vads.lyra.com/}subscriptionRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateSubscription", propOrder = {
    "commonRequest",
    "queryRequest",
    "subscriptionRequest"
})
public class UpdateSubscription {

    protected CommonRequest commonRequest;
    protected QueryRequest queryRequest;
    protected SubscriptionRequest subscriptionRequest;

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

    /**
     * Gets the value of the subscriptionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionRequest }
     *     
     */
    public SubscriptionRequest getSubscriptionRequest() {
        return subscriptionRequest;
    }

    /**
     * Sets the value of the subscriptionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionRequest }
     *     
     */
    public void setSubscriptionRequest(SubscriptionRequest value) {
        this.subscriptionRequest = value;
    }

}
