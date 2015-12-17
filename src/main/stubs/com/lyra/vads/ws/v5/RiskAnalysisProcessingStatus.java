
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for riskAnalysisProcessingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="riskAnalysisProcessingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P_TO_SEND"/>
 *     &lt;enumeration value="P_SEND_KO"/>
 *     &lt;enumeration value="P_PENDING_AT_ANALYZER"/>
 *     &lt;enumeration value="P_SEND_OK"/>
 *     &lt;enumeration value="P_MANUAL"/>
 *     &lt;enumeration value="P_SKIPPED"/>
 *     &lt;enumeration value="P_SEND_EXPIRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "riskAnalysisProcessingStatus")
@XmlEnum
public enum RiskAnalysisProcessingStatus {

    P_TO_SEND,
    P_SEND_KO,
    P_PENDING_AT_ANALYZER,
    P_SEND_OK,
    P_MANUAL,
    P_SKIPPED,
    P_SEND_EXPIRED;

    public String value() {
        return name();
    }

    public static RiskAnalysisProcessingStatus fromValue(String v) {
        return valueOf(v);
    }

}
