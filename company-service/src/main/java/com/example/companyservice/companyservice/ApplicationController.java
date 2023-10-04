package com.example.companyservice.companyservice;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/properties")
public class ApplicationController {

    @Value("${my.property.test}")
    private String testProperty;

    @GetMapping
    public String getTestProperty() {
        return testProperty;
    }
}

