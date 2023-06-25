
package hello.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Hello", targetNamespace = "http://endpoint.service.hello/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Hello {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://endpoint.service.hello/", className = "hello.service.deploy.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://endpoint.service.hello/", className = "hello.service.deploy.SayHelloResponse")
    @Action(input = "http://endpoint.service.hello/Hello/sayHelloRequest", output = "http://endpoint.service.hello/Hello/sayHelloResponse")
    public String sayHello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     */
    @WebMethod(operationName = "Hello")
    @RequestWrapper(localName = "Hello", targetNamespace = "http://endpoint.service.hello/", className = "hello.service.deploy.Hello_Type")
    @ResponseWrapper(localName = "HelloResponse", targetNamespace = "http://endpoint.service.hello/", className = "hello.service.deploy.HelloResponse")
    @Action(input = "http://endpoint.service.hello/Hello/HelloRequest", output = "http://endpoint.service.hello/Hello/HelloResponse")
    public void hello();

}
