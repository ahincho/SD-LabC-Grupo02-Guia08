package com.memory.ws;

import javax.xml.ws.Endpoint;

/**
 * @author Angel
 */
public class WebServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/service/order", new OrderServiceImpl());
    }
}
