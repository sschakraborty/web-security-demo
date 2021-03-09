package com.sschakraborty.poc.security.proxy;

import com.sschakraborty.poc.security.proxy.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ServiceDemo {
    @Autowired
    @Qualifier("remoteService")
    private Service service;

    public void demo() {
        final String message = "fooMessage";
        System.out.println("Original message: " + message);
        System.out.println("Return message: " + service.process(message));
    }
}
