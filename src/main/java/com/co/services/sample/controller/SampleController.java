package com.service.keyvault.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Value;


@RestController
public class SampleController {
    @Value("${NGF-DB-user}")
    private String connectionString;
    
    @Value("${connectionString2}")
    private String connectionString2;
    
    @Value("${connectionString3}")
    private String connectionString3;

    @GetMapping("/")
    public String sampleApi() throws InterruptedException, IllegalArgumentException {

        return "Hello Sample Microservice 2";
    }
    
    @GetMapping("get")
    public String get() {
        return connectionString2;
    }

    
}
