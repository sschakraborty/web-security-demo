package com.sschakraborty.poc.security.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ServiceDemoRunner implements CommandLineRunner {
    @Autowired
    private ServiceDemo serviceDemo;

    @Override
    public void run(String... args) throws Exception {
        serviceDemo.demo();
    }
}
