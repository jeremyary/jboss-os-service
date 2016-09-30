package jary.refarch.os.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "creditservice", portName = "creditservice", name = "creditservice",
        targetNamespace = "http://cs.bxms.ose/creditservice")
public class CreditService {

    @WebMethod
    public String sayHello() {
        return "Hello World!";
    }
}
