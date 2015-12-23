/*
 * Copyright 2015 Javier Garcia Alonso.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.profesorfalken.payzen.webservices.sdk.handler.soap;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.management.openmbean.InvalidKeyException;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This SOAP handler class generates the header of the message with all the 
 * authentication token information
 * 
 * @author Javier Garcia Alonso
 */
public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {
    private static final Logger logger = LoggerFactory.getLogger(HeaderHandler.class);
    
    private final String shopId;
    private final String shopKey;
    private final String mode;

    private static final String NAMESPACE = "http://v5.ws.vads.lyra.com/Header/";

    public HeaderHandler(String shopId, String shopKey, String mode) {
        this.shopId = shopId;
        this.shopKey = shopKey;
        this.mode = mode;
    }

    /**
     * Takes the outgoing SOAP message and modifies it adding the header 
     * information
     * 
     * @param smc SOAP message context
     * @return 
     */
    @Override
    public boolean handleMessage(SOAPMessageContext smc) {

        Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        
        if (Boolean.TRUE.equals(outboundProperty)) {

            SOAPMessage message = smc.getMessage();

            try {
                SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
                
                //Creates header into SOAP envelope
                SOAPHeader header = envelope.getHeader();
                if (header == null) {
                    header = envelope.addHeader();
                }

                // Add shopId
                addHeaderField(header, "shopId", this.shopId);

                // Timestamp
                TimeZone tz = TimeZone.getTimeZone("UTC");
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                df.setTimeZone(tz);
                String nowAsISO = df.format(new Date());
                addHeaderField(header, "timestamp", nowAsISO);

                // Mode
                addHeaderField(header, "mode", this.mode);

                // Add requestId
                String requestId = UUID.randomUUID().toString();
                addHeaderField(header, "requestId", requestId);

                // Authentication token
                String tokenString = requestId + nowAsISO;
                addHeaderField(header, "authToken", sign(tokenString, shopKey));

            } catch (SOAPException e) {
                logger.error("Error sending header", e);
            }
        }

        return outboundProperty;

    }

    @Override
    public Set getHeaders() {
        return null;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {
    }

    private void addHeaderField(SOAPHeader header, String fieldName, String value) throws SOAPException {
        QName qname = new QName(NAMESPACE, fieldName);
        SOAPElement element = header.addChildElement(qname);
        element.addTextNode(value);
    }

    private String sign(String stringToSign, String key) {
        try {
            byte[] bytes = encode256(key.getBytes("UTF-8"), stringToSign.getBytes("UTF-8"));

            return Base64.encodeBase64String(bytes);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }

    private static byte[] encode256(byte[] keyBytes, byte[] text) throws NoSuchAlgorithmException, InvalidKeyException {

        Mac hmacSha1;
        try {
            hmacSha1 = Mac.getInstance("HmacSHA256");
        } catch (NoSuchAlgorithmException nsae) {
            hmacSha1 = Mac.getInstance("HMAC-SHA-256");
        }
        SecretKeySpec macKey = new SecretKeySpec(keyBytes, "RAW");
        try {
            hmacSha1.init(macKey);
        } catch (java.security.InvalidKeyException ex) {
            logger.error("Error encoding auth hash", ex);
        }

        return hmacSha1.doFinal(text);
    }
}