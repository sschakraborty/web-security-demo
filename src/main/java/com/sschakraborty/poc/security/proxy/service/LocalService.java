package com.sschakraborty.poc.security.proxy.service;

import org.springframework.stereotype.Component;

@Component("localService")
public class LocalService implements Service {
    @Override
    public String process(String message) {
        return message + "_" + message;
    }
}
