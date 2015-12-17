
package com.lyra.vads.ws.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findPaymentsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findPaymentsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="findPaymentsResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://v5.ws.vads.lyra.com/}wsResponse">
 *                 &lt;sequence>
 *                   &lt;element name="commonResponse" type="{http://v5.ws.vads.lyra.com/}commonResponse" minOccurs="0"/>
 *                   &lt;element name="orderResponse" type="{http://v5.ws.vads.lyra.com/}orderResponse" minOccurs="0"/>
 *                   &lt;element name="transactionItem" type="{http://v5.ws.vads.lyra.com/}transactionItem" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "findPaymentsResponse", propOrder = {
    "findPaymentsResult"
})
public class FindPaymentsResponse {

    protected FindPaymentsResponse.FindPaymentsResult findPaymentsResult;

    /**
     * Gets the value of the findPaymentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link FindPaymentsResponse.FindPaymentsResult }
     *     
     */
    public FindPaymentsResponse.FindPaymentsResult getFindPaymentsResult() {
        return findPaymentsResult;
    }

    /**
     * Sets the value of the findPaymentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindPaymentsResponse.FindPaymentsResult }
     *     
     */
    public void setFindPaymentsResult(FindPaymentsResponse.FindPaymentsResult value) {
        this.findPaymentsResult = value;
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
     *         &lt;element name="orderResponse" type="{http://v5.ws.vads.lyra.com/}orderResponse" minOccurs="0"/>
     *         &lt;element name="transactionItem" type="{http://v5.ws.vads.lyra.com/}transactionItem" maxOccurs="unbounded" minOccurs="0"/>
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
        "orderResponse",
        "transactionItem"
    })
    public static class FindPaymentsResult
        extends WsResponse
    {

        protected CommonResponse commonResponse;
        protected OrderResponse orderResponse;
        protected List<TransactionItem> transactionItem;

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
         * Gets the value of the transactionItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transactionItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransactionItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TransactionItem }
         * 
         * 
         */
        public List<TransactionItem> getTransactionItem() {
            if (transactionItem == null) {
                transactionItem = new ArrayList<TransactionItem>();
            }
            return this.transactionItem;
        }

    }

}
