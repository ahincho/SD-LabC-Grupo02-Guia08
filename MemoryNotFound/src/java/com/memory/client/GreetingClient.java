package com.memory.client;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import java.util.Arrays;
import com.memory.ws.OrderService;

/**
 * @author Angel
 */
public class GreetingClient {
    public static void main(String[] args) throws Exception {
        URL wsdlUrl = new URL("http://localhost:8888/service/order?wsdl");
        QName qName = new QName("http://ws.memory.com/", "OrderServiceImplService");
        Service service = Service.create(wsdlUrl, qName);
        OrderService orderService = service.getPort(OrderService.class);
        System.out.println(Arrays.toString(orderService.getOrders()));
        System.out.println("Order completed: " + orderService.addOrder("Mother Board"));
        System.out.println("Order completed: " + orderService.addOrder("Keyboard"));
        System.out.println("Order completed: " + orderService.addOrder("Webcam"));
        System.out.println("Order completed: " + orderService.addOrder("Solid State Drive"));
    }
}
