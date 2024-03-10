package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HomeController {

    @GetMapping("/welcome")
    public String getMethodName() {
        return "welcome amit v1.0";
    }

}
