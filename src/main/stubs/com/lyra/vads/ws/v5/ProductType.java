
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="productType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FOOD_AND_GROCERY"/>
 *     &lt;enumeration value="AUTOMOTIVE"/>
 *     &lt;enumeration value="ENTERTAINMENT"/>
 *     &lt;enumeration value="HOME_AND_GARDEN"/>
 *     &lt;enumeration value="HOME_APPLIANCE"/>
 *     &lt;enumeration value="AUCTION_AND_GROUP_BUYING"/>
 *     &lt;enumeration value="FLOWERS_AND_GIFTS"/>
 *     &lt;enumeration value="COMPUTER_AND_SOFTWARE"/>
 *     &lt;enumeration value="HEALTH_AND_BEAUTY"/>
 *     &lt;enumeration value="SERVICE_FOR_INDIVIDUAL"/>
 *     &lt;enumeration value="SERVICE_FOR_BUSINESS"/>
 *     &lt;enumeration value="SPORTS"/>
 *     &lt;enumeration value="CLOTHING_AND_ACCESSORIES"/>
 *     &lt;enumeration value="TRAVEL"/>
 *     &lt;enumeration value="HOME_AUDIO_PHOTO_VIDEO"/>
 *     &lt;enumeration value="TELEPHONY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "productType")
@XmlEnum
public enum ProductType {

    FOOD_AND_GROCERY,
    AUTOMOTIVE,
    ENTERTAINMENT,
    HOME_AND_GARDEN,
    HOME_APPLIANCE,
    AUCTION_AND_GROUP_BUYING,
    FLOWERS_AND_GIFTS,
    COMPUTER_AND_SOFTWARE,
    HEALTH_AND_BEAUTY,
    SERVICE_FOR_INDIVIDUAL,
    SERVICE_FOR_BUSINESS,
    SPORTS,
    CLOTHING_AND_ACCESSORIES,
    TRAVEL,
    HOME_AUDIO_PHOTO_VIDEO,
    TELEPHONY;

    public String value() {
        return name();
    }

    public static ProductType fromValue(String v) {
        return valueOf(v);
    }

}
