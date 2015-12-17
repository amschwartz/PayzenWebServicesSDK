
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for techRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="techRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="browserUserAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="browserAccept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "techRequest", propOrder = {
    "browserUserAgent",
    "browserAccept"
})
public class TechRequest {

    protected String browserUserAgent;
    protected String browserAccept;

    /**
     * Gets the value of the browserUserAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowserUserAgent() {
        return browserUserAgent;
    }

    /**
     * Sets the value of the browserUserAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowserUserAgent(String value) {
        this.browserUserAgent = value;
    }

    /**
     * Gets the value of the browserAccept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowserAccept() {
        return browserAccept;
    }

    /**
     * Sets the value of the browserAccept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowserAccept(String value) {
        this.browserAccept = value;
    }

}
