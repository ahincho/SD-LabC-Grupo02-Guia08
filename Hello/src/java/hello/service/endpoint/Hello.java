package hello.service.endpoint;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 * @author Angel
 */
@WebService(serviceName = "HelloService")
public class Hello {
    private final String message = "Hello, ";
    public void Hello() { }
    @WebMethod(operationName = "sayHello")
    public String sayHello(@WebParam(name = "name") String name) {
        return message + name + ".";
    }
}