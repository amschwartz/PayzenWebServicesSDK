
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkThreeDSAuthenticationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkThreeDSAuthenticationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkThreeDSAuthenticationResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://v5.ws.vads.lyra.com/}wsResponse">
 *                 &lt;sequence>
 *                   &lt;element name="commonResponse" type="{http://v5.ws.vads.lyra.com/}commonResponse" minOccurs="0"/>
 *                   &lt;element name="threeDSResponse" type="{http://v5.ws.vads.lyra.com/}threeDSResponse" minOccurs="0"/>
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
@XmlType(name = "checkThreeDSAuthenticationResponse", propOrder = {
    "checkThreeDSAuthenticationResult"
})
public class CheckThreeDSAuthenticationResponse {

    protected CheckThreeDSAuthenticationResponse.CheckThreeDSAuthenticationResult checkThreeDSAuthenticationResult;

    /**
     * Gets the value of the checkThreeDSAuthenticationResult property.
     * 
     * @return
     *     possible object is
     *     {@link CheckThreeDSAuthenticationResponse.CheckThreeDSAuthenticationResult }
     *     
     */
    public CheckThreeDSAuthenticationResponse.CheckThreeDSAuthenticationResult getCheckThreeDSAuthenticationResult() {
        return checkThreeDSAuthenticationResult;
    }

    /**
     * Sets the value of the checkThreeDSAuthenticationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckThreeDSAuthenticationResponse.CheckThreeDSAuthenticationResult }
     *     
     */
    public void setCheckThreeDSAuthenticationResult(CheckThreeDSAuthenticationResponse.CheckThreeDSAuthenticationResult value) {
        this.checkThreeDSAuthenticationResult = value;
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
     *         &lt;element name="threeDSResponse" type="{http://v5.ws.vads.lyra.com/}threeDSResponse" minOccurs="0"/>
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
        "threeDSResponse"
    })
    public static class CheckThreeDSAuthenticationResult
        extends WsResponse
    {

        protected CommonResponse commonResponse;
        protected ThreeDSResponse threeDSResponse;

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

    }

}
