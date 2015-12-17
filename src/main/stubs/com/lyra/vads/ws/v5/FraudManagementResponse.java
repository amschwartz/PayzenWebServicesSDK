
package com.lyra.vads.ws.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fraudManagementResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fraudManagementResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="riskControl" type="{http://v5.ws.vads.lyra.com/}riskControl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="riskAnalysis" type="{http://v5.ws.vads.lyra.com/}riskAnalysis" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="riskAssessments" type="{http://v5.ws.vads.lyra.com/}riskAssessments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fraudManagementResponse", propOrder = {
    "riskControl",
    "riskAnalysis",
    "riskAssessments"
})
public class FraudManagementResponse {

    protected List<RiskControl> riskControl;
    protected List<RiskAnalysis> riskAnalysis;
    protected RiskAssessments riskAssessments;

    /**
     * Gets the value of the riskControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskControl }
     * 
     * 
     */
    public List<RiskControl> getRiskControl() {
        if (riskControl == null) {
            riskControl = new ArrayList<RiskControl>();
        }
        return this.riskControl;
    }

    /**
     * Gets the value of the riskAnalysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskAnalysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskAnalysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskAnalysis }
     * 
     * 
     */
    public List<RiskAnalysis> getRiskAnalysis() {
        if (riskAnalysis == null) {
            riskAnalysis = new ArrayList<RiskAnalysis>();
        }
        return this.riskAnalysis;
    }

    /**
     * Gets the value of the riskAssessments property.
     * 
     * @return
     *     possible object is
     *     {@link RiskAssessments }
     *     
     */
    public RiskAssessments getRiskAssessments() {
        return riskAssessments;
    }

    /**
     * Sets the value of the riskAssessments property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskAssessments }
     *     
     */
    public void setRiskAssessments(RiskAssessments value) {
        this.riskAssessments = value;
    }

}
