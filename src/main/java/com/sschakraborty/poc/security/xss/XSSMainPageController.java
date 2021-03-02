package com.sschakraborty.poc.security.xss;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class XSSMainPageController {
    @RequestMapping("/xss")
    public String renderPage() {
        return "xss";
    }
}
