package hello.appclient;

import hello.service.deploy.HelloService;
import javax.xml.ws.WebServiceRef;

public class HelloAppClient {
    @WebServiceRef(wsdlLocation = "META-INF/wsdl/localhost_8085/Hello/HelloService.wsdl")
    private static final HelloService service = new HelloService();
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        System.out.println(sayHello("world"));
    }
    private static String sayHello(java.lang.String arg0) {
        hello.service.deploy.Hello port = service.getHelloPort();
        return port.sayHello(arg0);
    }
}