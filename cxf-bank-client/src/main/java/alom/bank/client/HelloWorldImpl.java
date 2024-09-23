
package alom.bank.client;

import jakarta.jws.WebService;

@WebService(endpointInterface = "alom.bank.client.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

