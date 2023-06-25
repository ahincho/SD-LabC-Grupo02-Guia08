package com.memory.ws;

import javax.jws.WebService;

/**
 * @author Angel
 */
@WebService(endpointInterface = "com.memory.ws.OrderService")
public class OrderServiceImpl implements OrderService {
    @Override
    public String[] getOrders() {
        return new String[]{"SSD", "Graphic Card", "GPU", "Case", "RAM Memory"};
    }
    @Override
    public boolean addOrder(String order) {
        System.out.println("Saving new order: " + order);
        return true;
    }
}