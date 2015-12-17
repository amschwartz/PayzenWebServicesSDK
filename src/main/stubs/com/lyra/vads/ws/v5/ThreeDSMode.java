
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for threeDSMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="threeDSMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DISABLED"/>
 *     &lt;enumeration value="ENABLED_CREATE"/>
 *     &lt;enumeration value="ENABLED_FINALIZE"/>
 *     &lt;enumeration value="MERCHANT_3DS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "threeDSMode")
@XmlEnum
public enum ThreeDSMode {

    DISABLED("DISABLED"),
    ENABLED_CREATE("ENABLED_CREATE"),
    ENABLED_FINALIZE("ENABLED_FINALIZE"),
    @XmlEnumValue("MERCHANT_3DS")
    MERCHANT_3_DS("MERCHANT_3DS");
    private final String value;

    ThreeDSMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThreeDSMode fromValue(String v) {
        for (ThreeDSMode c: ThreeDSMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
