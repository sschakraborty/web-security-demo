package com.sschakraborty.poc.security.xss;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XSSDemoController {
    @GetMapping("reflected_xss_api")
    public String reflect(@RequestParam("script") String script) {
        return script;
    }
}
