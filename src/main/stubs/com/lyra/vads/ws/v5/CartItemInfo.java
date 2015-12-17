
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cartItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cartItemInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://v5.ws.vads.lyra.com/}productType" minOccurs="0"/>
 *         &lt;element name="productRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="productAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productVat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productExtId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cartItemInfo", propOrder = {
    "productLabel",
    "productType",
    "productRef",
    "productQty",
    "productAmount",
    "productVat",
    "productExtId"
})
public class CartItemInfo {

    protected String productLabel;
    protected ProductType productType;
    protected String productRef;
    protected Integer productQty;
    protected String productAmount;
    protected String productVat;
    protected String productExtId;

    /**
     * Gets the value of the productLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLabel() {
        return productLabel;
    }

    /**
     * Sets the value of the productLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLabel(String value) {
        this.productLabel = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProductType(ProductType value) {
        this.productType = value;
    }

    /**
     * Gets the value of the productRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductRef() {
        return productRef;
    }

    /**
     * Sets the value of the productRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductRef(String value) {
        this.productRef = value;
    }

    /**
     * Gets the value of the productQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductQty() {
        return productQty;
    }

    /**
     * Sets the value of the productQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductQty(Integer value) {
        this.productQty = value;
    }

    /**
     * Gets the value of the productAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductAmount() {
        return productAmount;
    }

    /**
     * Sets the value of the productAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductAmount(String value) {
        this.productAmount = value;
    }

    /**
     * Gets the value of the productVat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductVat() {
        return productVat;
    }

    /**
     * Sets the value of the productVat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductVat(String value) {
        this.productVat = value;
    }

    /**
     * Gets the value of the productExtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductExtId() {
        return productExtId;
    }

    /**
     * Sets the value of the productExtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductExtId(String value) {
        this.productExtId = value;
    }

}
