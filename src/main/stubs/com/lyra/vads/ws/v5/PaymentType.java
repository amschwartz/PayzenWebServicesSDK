
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="paymentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SINGLE"/>
 *     &lt;enumeration value="INSTALLMENT"/>
 *     &lt;enumeration value="SPLIT"/>
 *     &lt;enumeration value="SUBSCRIPTION"/>
 *     &lt;enumeration value="RETRY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "paymentType")
@XmlEnum
public enum PaymentType {

    SINGLE,
    INSTALLMENT,
    SPLIT,
    SUBSCRIPTION,
    RETRY;

    public String value() {
        return name();
    }

    public static PaymentType fromValue(String v) {
        return valueOf(v);
    }

}
