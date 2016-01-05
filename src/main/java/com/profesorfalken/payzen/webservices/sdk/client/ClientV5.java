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
import com.profesorfalken.payzen.webservices.sdk.util.NullHostnameVerifier;
import com.profesorfalken.payzen.webservices.sdk.util.PayzenHostnameVerifier;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;

/**
 * Encapsulates the client WS to call Payment operations
 *
 * @author Javier Garcia Alonso
 */
public class ClientV5 {

    private final PaymentAPI port;

    public ClientV5(Map<String, String> config) {
        //Read client properties - payzen-config.properties
        String shopId = (config != null && config.get("shopId") != null) ? config.get("shopId") : Config.getConfig().getProperty("shopId");
        String shopKey = (config != null && config.get("shopKey") != null) ? config.get("shopKey") : Config.getConfig().getProperty("shopKey");
        String mode = (config != null && config.get("mode") != null) ? config.get("mode") : Config.getConfig().getProperty("mode");
        String endpointHost = (config != null && config.get("endpointHost") != null) ? config.get("endpointHost") : Config.getConfig().getProperty("endpointHost");
        String secureConnection = (config != null && config.get("secureConnection") != null) ? config.get("secureConnection") : Config.getConfig().getProperty("secureConnection");
        String disableHostnameVerifier = (config != null && config.get("disableHostnameVerifier") != null) ? config.get("disableHostnameVerifier") : Config.getConfig().getProperty("disableHostnameVerifier");

        String protocol = "https://";
        if (!("true".equalsIgnoreCase(secureConnection))) {
            protocol = "http://";
        }

        //Adds hostnameverifier to check domain/certificate
        HostnameVerifier verifier = ("true".equalsIgnoreCase(disableHostnameVerifier)) ? 
                new NullHostnameVerifier() : new PayzenHostnameVerifier();
        HttpsURLConnection.setDefaultHostnameVerifier(verifier);

        //Initialises port
        String wsdlURLStr = protocol + endpointHost + "/vads-ws/v5?wsdl";
        URL wsdlURL;
        try {
            wsdlURL = new URL(wsdlURLStr);
            QName qname = new QName("http://v5.ws.vads.lyra.com/", "v5");
            Service service = Service.create(wsdlURL, qname);
            service.setHandlerResolver(new HeaderHandlerResolver(shopId, shopKey, mode));
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
