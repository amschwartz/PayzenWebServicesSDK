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

import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

/**
 * Class used to add a handler into the web service handler chain 
 * 
 * @author Javier Garcia Alonso
 */
public class HeaderHandlerResolver implements HandlerResolver {

    private final String shopId;
    private final String shopKey;
    private final String mode;

    public HeaderHandlerResolver(String shopId, String shopKey, String mode) {
        this.shopId = shopId;
        this.shopKey = shopKey;
        this.mode = mode;
    }

    /**
     * Adds HeaderHandler into the handler chain
     * 
     * @param portInfo
     * @return list of handlers
     */
    @Override
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        List<Handler> handlerChain = new ArrayList<Handler>();

        HeaderHandler hh = new HeaderHandler(shopId, shopKey, mode);

        handlerChain.add(hh);

        return handlerChain;
    }
}