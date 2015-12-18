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
package com.profesorfalken.payzen.webservices.sdk.builder;

import com.lyra.vads.ws.v5.CardRequest;
import com.lyra.vads.ws.v5.CommonRequest;
import com.lyra.vads.ws.v5.CreatePayment;
import com.lyra.vads.ws.v5.OrderRequest;
import com.lyra.vads.ws.v5.PaymentRequest;
import com.lyra.vads.ws.v5.ThreeDSRequest;
import java.util.Date;
import com.profesorfalken.payzen.webservices.sdk.util.BuilderUtils;

/**
 * Builder class to help in the construction of a PaymentRequest
 * 
 * @author Javier Garcia Alonso
 */
public class PaymentBuilder {

    private String paymentSource;
    private Date submissionDate;
    private String contractNumber;
    private String comment;

    OrderRequest order;
    PaymentRequest payment;
    CardRequest card;
    ThreeDSRequest threeDS;

    private PaymentBuilder() {
    }

    public static PaymentBuilder getBuilder() {
        return new PaymentBuilder();
    }

    public PaymentBuilder paymentSource(String paymentSource) {
        this.paymentSource = paymentSource;
        return this;
    }

    public PaymentBuilder submissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
        return this;
    }

    public PaymentBuilder contractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
        return this;
    }

    public PaymentBuilder comment(String comment) {
        this.comment = comment;
        return this;
    }

    public PaymentBuilder order(OrderRequest order) {
        this.order = order;
        return this;
    }

    public PaymentBuilder payment(PaymentRequest payment) {
        this.payment = payment;
        return this;
    }

    public PaymentBuilder card(CardRequest card) {
        this.card = card;
        return this;
    }
    
    public PaymentBuilder threeDS(ThreeDSRequest threeDS) {
        this.threeDS = threeDS;
        return this;
    }

    public CreatePayment buildCreate() {
        CreatePayment createPayment = new CreatePayment();

        CommonRequest commonRequest = new CommonRequest();
        commonRequest.setPaymentSource(paymentSource);
        commonRequest.setSubmissionDate(BuilderUtils.date2XMLGregorianCalendar(submissionDate));
        commonRequest.setContractNumber(contractNumber);
        commonRequest.setComment(comment);

        createPayment.setCommonRequest(commonRequest);
        createPayment.setOrderRequest(order);
        createPayment.setPaymentRequest(payment);
        createPayment.setCardRequest(card);
        createPayment.setThreeDSRequest(threeDS);

        return createPayment;
    }
}
