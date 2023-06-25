package com.memory.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @author Angel
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface OrderService {
    @WebMethod(operationName = "getOrders")
    String[] getOrders();
    @WebMethod(operationName = "addOrder")
    boolean addOrder(String order);
}
