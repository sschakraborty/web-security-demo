package com.sschakraborty.poc.security.proxy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/proxy")
public class ServiceController {
    @Autowired
    @Qualifier("localService")
    private Service service;

    @PostMapping("/process")
    public String process(@RequestBody String message) {
        return service.process(message);
    }
}
