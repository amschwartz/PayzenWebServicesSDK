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
package com.org.pfalken.webservices.sdk;

import com.lyra.vads.ws.v5.CreatePayment;
import java.util.Date;

/**
 * Allows to perform payment related operations using the Payzen API based in 
 * SOAP Web Services.<br>
 * This SDK simplifies the usage of the API, handling the auth token calculation 
 * and giving a modern and simple interface.<p>
 * 
 * All the methods are represented by verbs, and they allow different modes for 
 * each operation: 
 * <ul>
 * <li>Simple/Full mode: allows to perform a simple operation with simplified 
 * parameters or use instead a complete mode which can be easily handled using 
 * object builders.</li>
 * <li>With/without response handler: the usage of a response handler allows 
 * to create easily a callback model which help to work with the result and 
 * is ready to work with new Java 8 features. </li>
 * </ul>
 * 
 * @author Javier Garcia Alonso
 */
public final class Payment {

    // Hide constructor
    private Payment() {
    }

    /**
     * Initializes singleton.
     */
    private static class SingletonHolder {
        private static final PaymentInstance INSTANCE = new PaymentInstance();
    }

    /**
     * Gets instance
     * 
     * @return 
     */
    private static PaymentInstance getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * Creates a payment request using the common parameters in a simple way.<p>
     * 
     * Please read official documentation for more detailed information about parameters.
     * 
     * @param orderId Optional, null is none. The order Id. 
     * @param amount Amount of the payment in cents
     * @param currency used currency 
     * @param cardNumber card number
     * @param expMonth expiration month
     * @param expYear expiration year
     * @param cvvCode card verification code
     * @return result with all the response objects
     */
    public static ServiceResult create(String orderId, long amount, int currency, String cardNumber, int expMonth, int expYear, String cvvCode) {
        return getInstance().createSimple(orderId, amount, currency, cardNumber, expMonth, expYear, cvvCode);
    }
    
    /**
     * Creates a payment request using the common parameters in a simple way.<p>
     * 
     * Please read official documentation for more detailed information about parameters.
     * 
     * @param orderId Optional, null is none. The order Id. 
     * @param amount Amount of the payment in cents
     * @param currency used currency 
     * @param cardNumber card number
     * @param expMonth expiration month
     * @param expYear expiration year
     * @param cvvCode card verification code
     * @param response callback handler to work with the response
     * @return result with all the response objects
     */
    public static ServiceResult create(String orderId, long amount, int currency, String cardNumber, int expMonth, int expYear, String cvvCode, ResponseHandler response) {
        return getInstance().createSimple(orderId, amount, currency, cardNumber, expMonth, expYear, cvvCode, response);
    }
    
    /**
     * Creates a payment request using the createPayment object <p>
     * Please read official documentation for more detailed information about parameter content.
     * 
     * @param createPaymentRequest complex object with all the parameters for service call
     * @return result with all the response objects
     */
    public static ServiceResult create(CreatePayment createPaymentRequest) {
        return getInstance().create(createPaymentRequest); 
    }
    
    /**
     * Creates a payment request using the createPayment object <p>
     * 
     * Please read official documentation for more detailed information about parameter content.
     * 
     * @param createPaymentRequest complex object with all the parameters for service call
     * @param response callback handler to work with the response
     * @return result with all the response objects
     */
    public static ServiceResult create(CreatePayment createPaymentRequest, ResponseHandler response) {
        return getInstance().create(createPaymentRequest, response); 
    }
    
    /**
     * Creates a payment in the system after returning from ACS (payment 3DS) .<p>
     * 
     * Please read official documentation for more detailed information about parameters.
     * 
     * @param paRes Response from ACS
     * @param MD Payment session information
     * @return result with all the response objects
     */
    public static ServiceResult create(String paRes, String MD) {
        return getInstance().create3DS(paRes, MD);
    }
    
    /**
     * Creates a payment in the system after returning from ACS (payment 3DS) .<p>
     * 
     * Please read official documentation for more detailed information about parameters.
     * 
     * @param paRes Response from ACS
     * @param MD Payment session information
     * @param response callback handler to work with the response
     * @return result with all the response objects
     */
    public static ServiceResult create(String paRes, String MD, ResponseHandler response) {
        return getInstance().create3DS(paRes, MD, response);
    }
    
    /**
     * Get all the details of an existing transaction using the UUID of the transaction<p>
     * 
     * Please read official documentation for more detailed information about parameter content.
     * 
     * @param uuidTransaction unique identifier of the transaction
     * @return result with all the response objects
     */
    public static ServiceResult details(String uuidTransaction) {
        return getInstance().detailsSimple(uuidTransaction);
    }
    
    /**
     * Get all the details of an existing transaction using the three key field that identify a transaction uniquely<p>
     * Please read official documentation for more detailed information about parameter content.
     * 
     * @param transactionId the transaction id number
     * @param creationDate the creation date. It only takes the day into account
     * @param sequenceNumber the sequence number in case o multiple payment. Always 1 in case of simple payment
     * @return result with all the response objects
     */
    public static ServiceResult details(String transactionId, Date creationDate, int sequenceNumber) {
        return getInstance().detailsByFind(transactionId, creationDate, sequenceNumber);
    }
    
    /**
     * Get all the details of an existing transaction using the UUID of the transaction<p>
     * Please read official documentation for more detailed information about parameter content.
     * 
     * @param uuidTransaction unique identifier of the transaction
     * @param response callback handler to work with the response
     * @return result with all the response objects
     */
    public static ServiceResult details(String uuidTransaction, ResponseHandler response) {
        return getInstance().detailsSimple(uuidTransaction, response);
    }
    
    /**
     * Get all the details of an existing transaction using the three key field that identify a transaction uniquely<p>
     * Please read official documentation for more detailed information about parameter content.
     * 
     * @param transactionId the transaction id number
     * @param creationDate the creation date. It only takes the day into account
     * @param sequenceNumber the sequence number in case o multiple payment. Always 1 in case of simple payment
     * @param response callback handler to work with the response
     * @return result with all the response objects
     */
    public static ServiceResult details(String transactionId, Date creationDate, int sequenceNumber, ResponseHandler response) {
        return getInstance().detailsByFind(transactionId, creationDate, sequenceNumber, response);
    }

}