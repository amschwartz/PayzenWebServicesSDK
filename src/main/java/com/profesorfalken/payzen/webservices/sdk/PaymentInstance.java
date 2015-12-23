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
package com.profesorfalken.payzen.webservices.sdk;

import com.lyra.vads.ws.v5.CancelPaymentResponse;
import com.lyra.vads.ws.v5.CardRequest;
import com.lyra.vads.ws.v5.CommonRequest;
import com.lyra.vads.ws.v5.CreatePayment;
import com.lyra.vads.ws.v5.CreatePaymentResponse;
import com.lyra.vads.ws.v5.GetPaymentDetailsResponse;
import com.lyra.vads.ws.v5.GetPaymentUuidResponse;
import com.lyra.vads.ws.v5.LegacyTransactionKeyRequest;
import com.lyra.vads.ws.v5.OrderRequest;
import com.lyra.vads.ws.v5.PaymentAPI;
import com.lyra.vads.ws.v5.PaymentRequest;
import com.lyra.vads.ws.v5.QueryRequest;
import com.lyra.vads.ws.v5.ThreeDSMode;
import com.lyra.vads.ws.v5.ThreeDSRequest;
import com.lyra.vads.ws.v5.UpdatePaymentResponse;
import java.util.Collections;
import java.util.Date;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import com.profesorfalken.payzen.webservices.sdk.client.ClientV5;
import com.profesorfalken.payzen.webservices.sdk.util.BuilderUtils;
import com.profesorfalken.payzen.webservices.sdk.util.RequestUtils;
import com.profesorfalken.payzen.webservices.sdk.util.SessionUtils;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of methods used by Payment class to create web service
 * requests related with payments.
 *
 * @see Payment
 *
 * @author Javier Garcia Alonso
 */
final class PaymentInstance {

    //Logger
    private static final Logger logger = LoggerFactory.getLogger(PaymentInstance.class);

    /**
     * Creates a payment request using the common parameters in a simple way.<p>
     *
     * Please read official documentation for more detailed information about
     * parameters.
     *
     * @param orderId Optional, null is none. The order Id.
     * @param amount Amount of the payment in cents
     * @param currency used currency
     * @param cardNumber card number
     * @param expMonth expiration month
     * @param expYear expiration year
     * @param cvvCode card verification code
     *
     * @return result with all the response objects
     *
     * @see Payment#create(java.lang.String, long, int, java.lang.String, int,
     * int, java.lang.String)
     */
    ServiceResult createSimple(Map<String, String> config, String orderId, long amount, int currency, String cardNumber, int expMonth, int expYear, String cvvCode) {
        PaymentAPI api = new ClientV5(config).getPaymentAPIImplPort();

        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setOrderId(orderId);

        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setAmount(amount);
        paymentRequest.setCurrency(currency);

        CardRequest cardRequest = new CardRequest();
        cardRequest.setNumber(cardNumber);
        cardRequest.setScheme("VISA"); //It does not matter. It will be recalified
        cardRequest.setExpiryMonth(expMonth);
        cardRequest.setExpiryYear(expYear);
        cardRequest.setCardSecurityCode(cvvCode);

        CreatePaymentResponse.CreatePaymentResult paymentResponse = api.createPayment(new CommonRequest(), null, paymentRequest, orderRequest, cardRequest, null, null, null);

        ServiceResult serviceResult = new ServiceResult(paymentResponse, SessionUtils.getHttpSessionId((BindingProvider) api));

        return serviceResult;
    }

    /**
     * Creates a payment request using the common parameters in a simple way.<p>
     *
     * Please read official documentation for more detailed information about
     * parameters.
     *
     * @param orderId Optional, null is none. The order Id.
     * @param amount Amount of the payment in cents
     * @param currency used currency
     * @param cardNumber card number
     * @param expMonth expiration month
     * @param expYear expiration year
     * @param cvvCode card verification code
     * @param response callback handler to work with the response
     *
     * @return result with all the response objects
     *
     * @see Payment#create(java.lang.String, long, int, java.lang.String, int,
     * int, java.lang.String,
     * com.profesorfalken.payzen.webservices.sdk.ResponseHandler)
     */
    ServiceResult createSimple(Map<String, String> config, String orderId, long amount, int currency, String cardNumber, int expMonth, int expYear, String cvvCode, ResponseHandler response) {
        ServiceResult serviceResult = createSimple(config, orderId, amount, currency, cardNumber, expMonth, expYear, cvvCode);

        handleResponse(response, serviceResult);

        return serviceResult;
    }

    /**
     * Creates a payment request using the createPayment object
     * <p>
     * Please read official documentation for more detailed information about
     * parameter content.
     *
     * @param createPaymentRequest complex object with all the parameters for
     * service call
     * @return result with all the response objects
     *
     * @see Payment#create(com.lyra.vads.ws.v5.CreatePayment)
     */
    ServiceResult create(Map<String, String> config, CreatePayment createPaymentRequest) {
        PaymentAPI api = new ClientV5(config).getPaymentAPIImplPort();

        CreatePaymentResponse.CreatePaymentResult paymentResponse = api.createPayment(createPaymentRequest.getCommonRequest(), createPaymentRequest.getThreeDSRequest(), createPaymentRequest.getPaymentRequest(), createPaymentRequest.getOrderRequest(), createPaymentRequest.getCardRequest(), createPaymentRequest.getCustomerRequest(), createPaymentRequest.getTechRequest(), createPaymentRequest.getShoppingCartRequest());

        ServiceResult serviceResult = new ServiceResult(paymentResponse, SessionUtils.getHttpSessionId((BindingProvider) api));

        return serviceResult;
    }

    /**
     * Creates a payment request using the createPayment object
     * <p>
     * Please read official documentation for more detailed information about
     * parameter content.
     *
     * @param createPaymentRequest complex object with all the parameters for
     * service call
     * @param response callback handler to work with the response
     * @return result with all the response objects
     *
     * @see Payment#create(com.lyra.vads.ws.v5.CreatePayment,
     * com.profesorfalken.payzen.webservices.sdk.ResponseHandler)
     */
    ServiceResult create(Map<String, String> config, CreatePayment createPaymentRequest, ResponseHandler response) {
        ServiceResult serviceResult = create(config, createPaymentRequest);

        handleResponse(response, serviceResult);

        return serviceResult;
    }

    /**
     * Creates a payment in the system after returning from ACS (payment 3DS)
     * .<p>
     *
     * Please read official documentation for more detailed information about
     * parameters.
     *
     * @param paRes Response from ACS
     * @param MD Payment session information
     * @return result with all the response objects
     *
     * @see Payment#create(java.lang.String, java.lang.String)
     */
    ServiceResult create3DS(Map<String, String> config, String paREs, String MD) {
        PaymentAPI api = new ClientV5(config).getPaymentAPIImplPort();

        ThreeDSRequest threeDSRequest = new ThreeDSRequest();
        threeDSRequest.setMode(ThreeDSMode.ENABLED_FINALIZE);
        threeDSRequest.setPares(paREs);
        threeDSRequest.setRequestId(RequestUtils.getRequestIdFormMD(MD));

        //Maintain Session! (this payment context will not be found if we do not provide the good session)
        ((BindingProvider) api).getRequestContext().put(
                MessageContext.HTTP_REQUEST_HEADERS,
                Collections.singletonMap("Cookie", Collections.singletonList(RequestUtils.getSessionCookieFromMD(MD))
                )
        );
        logger.info("Setting session Cookie: " + RequestUtils.getSessionCookieFromMD(MD));

        CreatePaymentResponse.CreatePaymentResult paymentResponse
                = api.createPayment(new CommonRequest(), threeDSRequest, null, null, null, null, null, null);

        ServiceResult serviceResult = new ServiceResult(paymentResponse, RequestUtils.getSessionCookieFromMD(MD));

        return serviceResult;
    }

    /**
     * Creates a payment in the system after returning from ACS (payment 3DS)
     * .<p>
     *
     * Please read official documentation for more detailed information about
     * parameters.
     *
     * @param paRes Response from ACS
     * @param MD Payment session information
     * @param response callback handler to work with the response
     * @return result with all the response objects
     *
     * @see Payment#create(java.lang.String, java.lang.String,
     * com.profesorfalken.payzen.webservices.sdk.ResponseHandler)
     */
    ServiceResult create3DS(Map<String, String> config, String paREs, String MD, ResponseHandler response) {
        ServiceResult serviceResult = create3DS(config, paREs, MD);

        handleResponse(response, serviceResult);

        return serviceResult;
    }

    /**
     * Get all the details of an existing transaction using the UUID of the
     * transaction<p>
     *
     * Please read official documentation for more detailed information about
     * parameter content.
     *
     * @param uuidTransaction unique identifier of the transaction
     * @return result with all the response objects
     *
     * @see Payment#details(java.lang.String)
     */
    ServiceResult detailsSimple(Map<String, String> config, String uuidTransaction) {
        PaymentAPI api = new ClientV5(config).getPaymentAPIImplPort();
        QueryRequest queryRequest = new QueryRequest();
        queryRequest.setUuid(uuidTransaction);

        GetPaymentDetailsResponse.GetPaymentDetailsResult detailsResponse = api.getPaymentDetails(queryRequest);

        ServiceResult serviceResult = new ServiceResult(detailsResponse);

        return serviceResult;
    }

    /**
     * Get all the details of an existing transaction using the UUID of the
     * transaction<p>
     *
     * Please read official documentation for more detailed information about
     * parameter content.
     *
     * @param uuidTransaction unique identifier of the transaction
     * @param response callback handler to work with the response
     * @return result with all the response objects
     *
     * @see Payment#details(java.lang.String,
     * com.profesorfalken.payzen.webservices.sdk.ResponseHandler)
     */
    ServiceResult detailsSimple(Map<String, String> config, String uuidTransaction, ResponseHandler response) {
        ServiceResult serviceResult = detailsSimple(config, uuidTransaction);

        handleResponse(response, serviceResult);

        return serviceResult;
    }

    /**
     * Get all the details of an existing transaction using the three key field
     * that identify a transaction uniquely<p>
     * Please read official documentation for more detailed information about
     * parameter content.
     *
     * @param transactionId the transaction id number
     * @param creationDate the creation date. It only takes the day into account
     * @param sequenceNumber the sequence number in case o multiple payment.
     * Always 1 in case of simple payment
     * @return result with all the response objects
     *
     * @see Payment#details(java.lang.String, java.util.Date, int)
     */
    ServiceResult detailsByFind(Map<String, String> config, String transactionId, Date creationDate, int sequenceNumber) {
        PaymentAPI api = new ClientV5(config).getPaymentAPIImplPort();

        LegacyTransactionKeyRequest transactionKey = new LegacyTransactionKeyRequest();
        transactionKey.setTransactionId(transactionId);
        transactionKey.setCreationDate(BuilderUtils.date2XMLGregorianCalendar(creationDate));
        transactionKey.setSequenceNumber(sequenceNumber);

        GetPaymentUuidResponse.LegacyTransactionKeyResult keyResult = api.getPaymentUuid(transactionKey);

        ServiceResult serviceResult;
        if (keyResult.getPaymentResponse() != null && keyResult.getPaymentResponse().getTransactionUuid() != null) {
            serviceResult = detailsSimple(config, keyResult.getPaymentResponse().getTransactionUuid());
        } else {
            serviceResult = new ServiceResult(keyResult);
        }

        return serviceResult;
    }

    /**
     * Get all the details of an existing transaction using the three key field
     * that identify a transaction uniquely<p>
     * Please read official documentation for more detailed information about
     * parameter content.
     *
     * @param transactionId the transaction id number
     * @param creationDate the creation date. It only takes the day into account
     * @param sequenceNumber the sequence number in case o multiple payment.
     * Always 1 in case of simple payment
     * @param response callback handler to work with the response
     * @return result with all the response objects
     *
     * @see Payment#details(java.lang.String, java.util.Date, int,
     * com.profesorfalken.payzen.webservices.sdk.ResponseHandler)
     */
    ServiceResult detailsByFind(Map<String, String> config, String transactionId, Date creationDate, int sequenceNumber, ResponseHandler response) {
        ServiceResult serviceResult = detailsByFind(config, transactionId, creationDate, sequenceNumber);

        handleResponse(response, serviceResult);

        return serviceResult;
    }

    /**
     * Cancel an existing transaction using the UUID of the transaction<p>
     *
     * Please read official documentation for more detailed information about
     * parameter content.
     *
     * @param uuidTransaction unique identifier of the transaction
     * @return result with all the response objects
     *
     * @see Payment#details(java.lang.String)
     */
    ServiceResult cancelSimple(Map<String, String> config, String uuidTransaction) {
        PaymentAPI api = new ClientV5(config).getPaymentAPIImplPort();
        QueryRequest queryRequest = new QueryRequest();
        queryRequest.setUuid(uuidTransaction);

        CancelPaymentResponse.CancelPaymentResult cancelResponse = api.cancelPayment(new CommonRequest(), queryRequest);

        ServiceResult serviceResult = new ServiceResult(cancelResponse);

        return serviceResult;
    }

    /**
     * Cancel an existing transaction using the UUID of the transaction<p>
     *
     * Please read official documentation for more detailed information about
     * parameter content.
     *
     * @param uuidTransaction unique identifier of the transaction
     * @param response callback handler to work with the response
     * @return result with all the response objects
     *
     * @see Payment#details(java.lang.String,
     * com.profesorfalken.payzen.webservices.sdk.ResponseHandler)
     */
    ServiceResult cancelSimple(Map<String, String> config, String uuidTransaction, ResponseHandler response) {
        ServiceResult serviceResult = cancelSimple(config, uuidTransaction);

        handleResponse(response, serviceResult);

        return serviceResult;
    }

    /**
     * Cancel an existing transaction using the three key field that identify a
     * transaction uniquely<p>
     * Please read official documentation for more detailed information about
     * parameter content.
     *
     * @param transactionId the transaction id number
     * @param creationDate the creation date. It only takes the day into account
     * @param sequenceNumber the sequence number in case o multiple payment.
     * Always 1 in case of simple payment
     * @return result with all the response objects
     *
     * @see Payment#details(java.lang.String, java.util.Date, int)
     */
    ServiceResult cancelByFind(Map<String, String> config, String transactionId, Date creationDate, int sequenceNumber) {
        PaymentAPI api = new ClientV5(config).getPaymentAPIImplPort();

        LegacyTransactionKeyRequest transactionKey = new LegacyTransactionKeyRequest();
        transactionKey.setTransactionId(transactionId);
        transactionKey.setCreationDate(BuilderUtils.date2XMLGregorianCalendar(creationDate));
        transactionKey.setSequenceNumber(sequenceNumber);

        GetPaymentUuidResponse.LegacyTransactionKeyResult keyResult = api.getPaymentUuid(transactionKey);

        ServiceResult serviceResult;
        if (keyResult.getPaymentResponse() != null && keyResult.getPaymentResponse().getTransactionUuid() != null) {
            serviceResult = cancelSimple(config, keyResult.getPaymentResponse().getTransactionUuid());
        } else {
            serviceResult = new ServiceResult(keyResult);
        }

        return serviceResult;
    }

    /**
     * Cancel an existing transaction using the three key field that identify a
     * transaction uniquely<p>
     * Please read official documentation for more detailed information about
     * parameter content.
     *
     * @param transactionId the transaction id number
     * @param creationDate the creation date. It only takes the day into account
     * @param sequenceNumber the sequence number in case o multiple payment.
     * Always 1 in case of simple payment
     * @param response callback handler to work with the response
     * @return result with all the response objects
     *
     * @see Payment#details(java.lang.String, java.util.Date, int,
     * com.profesorfalken.payzen.webservices.sdk.ResponseHandler)
     */
    ServiceResult cancelByFind(Map<String, String> config, String transactionId, Date creationDate, int sequenceNumber, ResponseHandler response) {
        ServiceResult serviceResult = cancelByFind(config, transactionId, creationDate, sequenceNumber);

        handleResponse(response, serviceResult);

        return serviceResult;
    }
    
    /**
     * Updates an existing transaction using the UUID of the transaction<p>
     *
     * Please read official documentation for more detailed information about
     * parameter content.
     *
     * @param uuidTransaction unique identifier of the transaction
     * @param amount the new amount of the transaction
     * 
     * @return result with all the response objects
     *
     * @see Payment#details(java.lang.String)
     */
    ServiceResult updateSimple(Map<String, String> config, String uuidTransaction, long amount, int currency) {
        PaymentAPI api = new ClientV5(config).getPaymentAPIImplPort();
        QueryRequest queryRequest = new QueryRequest();
        queryRequest.setUuid(uuidTransaction);
        
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setAmount(amount);
        paymentRequest.setCurrency(currency);

        UpdatePaymentResponse.UpdatePaymentResult updateResponse = api.updatePayment(new CommonRequest(), queryRequest, paymentRequest);

        ServiceResult serviceResult = new ServiceResult(updateResponse);

        return serviceResult;
    }
    
    /**
     * Updates an existing transaction using the UUID of the transaction<p>
     *
     * Please read official documentation for more detailed information about
     * parameter content.
     *
     * @param uuidTransaction unique identifier of the transaction
     * @param captureDate expected capture date
     * 
     * @return result with all the response objects
     *
     * @see Payment#details(java.lang.String)
     */
    ServiceResult updateSimple(Map<String, String> config, String uuidTransaction, Date captureDate) {
        PaymentAPI api = new ClientV5(config).getPaymentAPIImplPort();
        QueryRequest queryRequest = new QueryRequest();
        queryRequest.setUuid(uuidTransaction);
        
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setExpectedCaptureDate(BuilderUtils.date2XMLGregorianCalendar(captureDate));

        UpdatePaymentResponse.UpdatePaymentResult updateResponse = api.updatePayment(new CommonRequest(), queryRequest, paymentRequest);

        ServiceResult serviceResult = new ServiceResult(updateResponse);

        return serviceResult;
    }
    
    /**
     * Updates an existing transaction using the UUID of the transaction<p>
     *
     * Please read official documentation for more detailed information about
     * parameter content.
     *
     * @param uuidTransaction unique identifier of the transaction
     * @param amount the new amount of the transaction
     * @param response callback handler to work with the response
     * @return result with all the response objects
     *
     * @see Payment#details(java.lang.String)
     */
    ServiceResult updateSimple(Map<String, String> config, String uuidTransaction, long amount, int currency, ResponseHandler response) {
        PaymentAPI api = new ClientV5(config).getPaymentAPIImplPort();
        QueryRequest queryRequest = new QueryRequest();
        queryRequest.setUuid(uuidTransaction);
        
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setAmount(amount);
        paymentRequest.setCurrency(currency);

        UpdatePaymentResponse.UpdatePaymentResult updateResponse = api.updatePayment(new CommonRequest(), queryRequest, paymentRequest);

        ServiceResult serviceResult = new ServiceResult(updateResponse);

        return serviceResult;
    }
    
    /**
     * Updates an existing transaction using the UUID of the transaction<p>
     *
     * Please read official documentation for more detailed information about
     * parameter content.
     *
     * @param uuidTransaction unique identifier of the transaction
     * @param captureDate expected capture date
     * @param response callback handler to work with the response
     * @return result with all the response objects
     *
     * @see Payment#details(java.lang.String)
     */
    ServiceResult updateSimple(Map<String, String> config, String uuidTransaction, Date captureDate, ResponseHandler response) {
        PaymentAPI api = new ClientV5(config).getPaymentAPIImplPort();
        QueryRequest queryRequest = new QueryRequest();
        queryRequest.setUuid(uuidTransaction);
        
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setExpectedCaptureDate(BuilderUtils.date2XMLGregorianCalendar(captureDate));

        UpdatePaymentResponse.UpdatePaymentResult updateResponse = api.updatePayment(new CommonRequest(), queryRequest, paymentRequest);

        ServiceResult serviceResult = new ServiceResult(updateResponse);

        return serviceResult;
    }

    //TODO: not used for the moment
    ServiceResult details(Map<String, String> config, String orderId) {
        PaymentAPI api = new ClientV5(config).getPaymentAPIImplPort();
        QueryRequest queryRequest = new QueryRequest();
        queryRequest.setOrderId(orderId);

        GetPaymentDetailsResponse.GetPaymentDetailsResult detailsResponse = api.getPaymentDetails(queryRequest);

        ServiceResult serviceResult = new ServiceResult(detailsResponse);

        return serviceResult;
    }

    //TODO: not used for the moment
    ServiceResult details(Map<String, String> config, String orderId, ResponseHandler response) {
        ServiceResult serviceResult = details(config, orderId);

        handleResponse(response, serviceResult);

        return serviceResult;
    }

    //Handle response in callback way
    private void handleResponse(ResponseHandler response, ServiceResult serviceResult) {
        try {
            response.handle(serviceResult);
        } catch (Exception ex) {
            logger.error("Cannot handle response.", ex);
        }
    }
}
