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
package com.profesorfalken.payzen.webservices.sdk.builder.request;

import com.lyra.vads.ws.v5.CardRequest;
import java.util.Date;
import com.profesorfalken.payzen.webservices.sdk.util.BuilderUtils;

/**
 * Builder class to help in the construction of a CardRequest
 * 
 * @author Javier Garcia Alonso
 */
public class CardRequestBuilder {

    private String number;
    private String scheme;
    private Integer expiryMonth;
    private Integer expiryYear;
    private String cardSecurityCode;
    private Date cardHolderBirthDay;
    private String paymentToken;

    private CardRequestBuilder() {
    }

    public static CardRequestBuilder create() {
        return new CardRequestBuilder();
    }

    public CardRequestBuilder number(String number) {
        this.number = number;
        return this;
    }

    public CardRequestBuilder scheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    public CardRequestBuilder expiryMonth(int expiryMonth) {
        this.expiryMonth = expiryMonth;
        return this;
    }

    public CardRequestBuilder expiryYear(int expiryYear) {
        this.expiryYear = expiryYear;
        return this;
    }

    public CardRequestBuilder cardSecurityCode(String cardSecurityCode) {
        this.cardSecurityCode = cardSecurityCode;
        return this;
    }

    public CardRequestBuilder cardHolderBirthDay(Date cardHolderBirthDay) {
        this.cardHolderBirthDay = cardHolderBirthDay;
        return this;
    }

    public CardRequestBuilder paymentToken(String paymentToken) {
        this.paymentToken = paymentToken;
        return this;
    }

    public CardRequest build() {
        CardRequest cardRequest = new CardRequest();

        cardRequest.setNumber(number);
        cardRequest.setScheme(scheme);
        cardRequest.setExpiryMonth(expiryMonth);
        cardRequest.setExpiryYear(expiryYear);
        cardRequest.setCardSecurityCode(cardSecurityCode);
        cardRequest.setCardHolderBirthDay(BuilderUtils.date2XMLGregorianCalendar(cardHolderBirthDay));
        cardRequest.setPaymentToken(paymentToken);

        return cardRequest;
    }
}
