
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for commonResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commonResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="responseCodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionStatusLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonResponse", propOrder = {
    "responseCode",
    "responseCodeDetail",
    "transactionStatusLabel",
    "shopId",
    "paymentSource",
    "submissionDate",
    "contractNumber",
    "paymentToken"
})
public class CommonResponse {

    protected Integer responseCode;
    protected String responseCodeDetail;
    protected String transactionStatusLabel;
    protected String shopId;
    protected String paymentSource;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissionDate;
    protected String contractNumber;
    protected String paymentToken;

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponseCode(Integer value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the responseCodeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCodeDetail() {
        return responseCodeDetail;
    }

    /**
     * Sets the value of the responseCodeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCodeDetail(String value) {
        this.responseCodeDetail = value;
    }

    /**
     * Gets the value of the transactionStatusLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatusLabel() {
        return transactionStatusLabel;
    }

    /**
     * Sets the value of the transactionStatusLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatusLabel(String value) {
        this.transactionStatusLabel = value;
    }

    /**
     * Gets the value of the shopId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * Sets the value of the shopId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopId(String value) {
        this.shopId = value;
    }

    /**
     * Gets the value of the paymentSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSource() {
        return paymentSource;
    }

    /**
     * Sets the value of the paymentSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSource(String value) {
        this.paymentSource = value;
    }

    /**
     * Gets the value of the submissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmissionDate() {
        return submissionDate;
    }

    /**
     * Sets the value of the submissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmissionDate(XMLGregorianCalendar value) {
        this.submissionDate = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the paymentToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentToken() {
        return paymentToken;
    }

    /**
     * Sets the value of the paymentToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentToken(String value) {
        this.paymentToken = value;
    }

}
