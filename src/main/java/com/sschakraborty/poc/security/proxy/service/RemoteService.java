package com.sschakraborty.poc.security.proxy.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component("remoteService")
public class RemoteService implements Service {
    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public String process(String message) {
        String url = "http://pi.local:8080/service/proxy/process";
        final ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.POST, new HttpEntity<>(message), String.class);
        return exchange.getBody();
    }
}
