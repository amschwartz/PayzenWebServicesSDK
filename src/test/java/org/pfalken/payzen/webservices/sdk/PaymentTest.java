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
package org.pfalken.payzen.webservices.sdk;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.pfalken.payzen.webservices.sdk.Payment.*;
import org.pfalken.payzen.webservices.sdk.builder.PaymentBuilder;
import org.pfalken.payzen.webservices.sdk.builder.request.CardRequestBuilder;
import org.pfalken.payzen.webservices.sdk.builder.request.OrderRequestBuilder;
import org.pfalken.payzen.webservices.sdk.builder.request.PaymentRequestBuilder;
import org.pfalken.payzen.webservices.sdk.handler.response.LogResponseHandler;
import org.pfalken.payzen.webservices.sdk.util.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author javier
 */
public class PaymentTest {

    private static final Logger logger = LoggerFactory.getLogger(LogResponseHandler.class);

    public PaymentTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class Payment.
     */
    @Test
    public void testCreate() {
        logger.info("Test create simple");

        if (checkConfig()) {
            ServiceResult result = create("TestTRS",
                    100,
                    978,
                    "4970100000000003",
                    12,
                    2017,
                    "123",
                    new LogAndCheckResponseHandler()
            );

            String trsUuid = (result != null && result.getPaymentResponse() != null && result.getPaymentResponse().getTransactionUuid() != null)
                    ? result.getPaymentResponse().getTransactionUuid() : null;

            Assert.assertNotNull("Not UUID generated", trsUuid);

            //Verify transaction
            details(trsUuid, new LogAndCheckResponseHandler());
        } else {
            logger.info("Config not set");
        }

        logger.info("End Test create");
    }

    /**
     * Test of create method, of class Payment.
     */
    @Test
    public void testCreateFull() {
        logger.info("Test create full");

        if (checkConfig()) {
            String trsUuid = createNormalPayment("4970100000000003");

            Assert.assertNotNull("Not UUID generated", trsUuid != null);

            //Verify transaction
            details(trsUuid, new LogAndCheckResponseHandler());
        } else {
            logger.info("Config not set");
        }

        logger.info("End create full");
    }

    /**
     * Test of details method, of class Payment.
     */
    @Test
    public void testDetails() {
        logger.info("Test details simple");

        if (checkConfig()) {
            String trsUuid = createNormalPayment("4970100000000003");

            Assert.assertNotNull("Not UUID generated", trsUuid != null);

            ServiceResult result = details(trsUuid, new LogAndCheckResponseHandler());
            int responseCode = result.getCommonResponse().getResponseCode();
            Assert.assertTrue("Cannot get details. Error code: " + responseCode, responseCode == 0);
        } else {
            logger.info("Config not set");
        }

        logger.info("Test details full");
    }

    /**
     * Test of details method, of class Payment.
     */
    @Test
    public void testDetailsByFind() {
        logger.info("Test details using find");

        if (checkConfig()) {
            OrderRequestBuilder orderRequestBuilder
                    = OrderRequestBuilder
                    .create()
                    .orderId("TestTRS");

            PaymentRequestBuilder paymentRequestBuilder
                    = PaymentRequestBuilder
                    .create()
                    .amount(100)
                    .currency(978);

            CardRequestBuilder cardRequestBuilder
                    = CardRequestBuilder
                    .create()
                    .number("4970100000000003")
                    .scheme("CB")
                    .expiryMonth(12)
                    .expiryYear(2017)
                    .cardSecurityCode("123");

            ServiceResult result = create(PaymentBuilder
                    .getBuilder()
                    .order(orderRequestBuilder.build())
                    .payment(paymentRequestBuilder.build())
                    .card(cardRequestBuilder.build())
                    .comment("Test payment")
                    .buildCreate(),
                    new LogAndCheckResponseHandler()
            );
            Assert.assertNotNull("Not UUID generated", result.getPaymentResponse());
            Assert.assertNotNull("Not UUID generated", result.getPaymentResponse().getTransactionId());
            Assert.assertNotNull("Not UUID generated", result.getPaymentResponse().getSequenceNumber());
            Assert.assertNotNull("Not UUID generated", result.getPaymentResponse().getCreationDate());

            String transactionId = result.getPaymentResponse().getTransactionId();
            int sequenceNumber = result.getPaymentResponse().getSequenceNumber();
            Date creationDate = result.getPaymentResponse().getCreationDate().toGregorianCalendar().getTime();

            result = details(transactionId, creationDate, sequenceNumber, new LogAndCheckResponseHandler());

            int responseCode = result.getCommonResponse().getResponseCode();
            Assert.assertTrue("Cannot get details. Error code: " + responseCode, responseCode == 0);
        } else {
            logger.info("Config not set");
        }

        logger.info("Test details full");
    }

    private String createNormalPayment(String cardNumber) {
        String trsUuid = null;

        if (checkConfig()) {
            OrderRequestBuilder orderRequestBuilder
                    = OrderRequestBuilder
                    .create()
                    .orderId("TestTRS");

            PaymentRequestBuilder paymentRequestBuilder
                    = PaymentRequestBuilder
                    .create()
                    .amount(100)
                    .currency(978);

            CardRequestBuilder cardRequestBuilder
                    = CardRequestBuilder
                    .create()
                    .number(cardNumber)
                    .scheme("CB")
                    .expiryMonth(12)
                    .expiryYear(2017)
                    .cardSecurityCode("123");

            ServiceResult result = create(PaymentBuilder
                    .getBuilder()
                    .order(orderRequestBuilder.build())
                    .payment(paymentRequestBuilder.build())
                    .card(cardRequestBuilder.build())
                    .comment("Test payment")
                    .buildCreate(),
                    new LogAndCheckResponseHandler()
            );

            if (result != null && result.getPaymentResponse() != null) {
                trsUuid = result.getPaymentResponse().getTransactionUuid();
            }
        } else {
            logger.info("Config not set");
        }

        return trsUuid;
    }

    private class LogAndCheckResponseHandler extends LogResponseHandler {

        @Override
        public void handle(ServiceResult response) throws Exception {
            super.handle(response);

            //Add checks here
            int errorCode = response.getCommonResponse().getResponseCode();
            Assert.assertTrue("The web service returned an error code: " + errorCode, errorCode == 0);
        }
    }

    private boolean checkConfig() {
        if ("[NOT SET]".equals(Config.getConfig().getProperty("shopId"))) {
            return false;
        }
        return true;
    }
}
