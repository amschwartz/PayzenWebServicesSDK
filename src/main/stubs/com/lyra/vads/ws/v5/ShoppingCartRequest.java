
package com.lyra.vads.ws.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shoppingCartRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shoppingCartRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="insuranceAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="shippingAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cartItemInfo" type="{http://v5.ws.vads.lyra.com/}cartItemInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shoppingCartRequest", propOrder = {
    "insuranceAmount",
    "shippingAmount",
    "taxAmount",
    "cartItemInfo"
})
public class ShoppingCartRequest {

    protected Long insuranceAmount;
    protected Long shippingAmount;
    protected Long taxAmount;
    protected List<CartItemInfo> cartItemInfo;

    /**
     * Gets the value of the insuranceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInsuranceAmount() {
        return insuranceAmount;
    }

    /**
     * Sets the value of the insuranceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInsuranceAmount(Long value) {
        this.insuranceAmount = value;
    }

    /**
     * Gets the value of the shippingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShippingAmount() {
        return shippingAmount;
    }

    /**
     * Sets the value of the shippingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShippingAmount(Long value) {
        this.shippingAmount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxAmount(Long value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the cartItemInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartItemInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCartItemInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CartItemInfo }
     * 
     * 
     */
    public List<CartItemInfo> getCartItemInfo() {
        if (cartItemInfo == null) {
            cartItemInfo = new ArrayList<CartItemInfo>();
        }
        return this.cartItemInfo;
    }

}
