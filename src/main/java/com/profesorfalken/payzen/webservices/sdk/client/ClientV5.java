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
package com.profesorfalken.payzen.webservices.sdk.client;

import com.lyra.vads.ws.v5.PaymentAPI;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.profesorfalken.payzen.webservices.sdk.handler.soap.HeaderHandlerResolver;
import com.profesorfalken.payzen.webservices.sdk.util.Config;
import com.profesorfalken.payzen.webservices.sdk.util.PayzenHostnameVerifier;

/**
 * Encapsulates the client WS to call Payment operations
 * 
 * @author Javier Garcia Alonso
 */
public class ClientV5 {

    private final PaymentAPI port;

    public ClientV5() {
        //Adds hostnameverifier to check domain/certificate
        HttpsURLConnection.setDefaultHostnameVerifier(new PayzenHostnameVerifier());
        
        //Read client properties - payzen-config.properties
        String shopId = Config.getConfig().getProperty("shopId");
        String mode = Config.getConfig().getProperty("mode");
        String endpointHost = Config.getConfig().getProperty("endpointHost");        
        
        //Initialises port
        String wsdlURLStr = "https://" + endpointHost + "/vads-ws/v5?wsdl";
        URL wsdlURL;
        try {
            wsdlURL = new URL(wsdlURLStr);
            QName qname = new QName("http://v5.ws.vads.lyra.com/", "v5");
            Service service = Service.create(wsdlURL, qname);
            service.setHandlerResolver(new HeaderHandlerResolver(shopId, mode));
            port = service.getPort(PaymentAPI.class);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /**
     * Returns Web Service port to Payzen payment API
     * 
     * @return port to Payzen Payment API
     */
    public PaymentAPI getPaymentAPIImplPort() {
        return port;
    }
}
