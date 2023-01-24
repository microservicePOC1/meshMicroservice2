package com.co.services.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.Console;

import org.springframework.beans.factory.annotation.Value;


@RestController
public class SampleController {
    @Value("${connectionString}")
    private String connectionString;
    
    @GetMapping("/")
    public String sampleApi() throws InterruptedException, IllegalArgumentException {
        
        return "Hello Sample Microservice 2";
    }
    
    @GetMapping("get")
    public String get() {
        return connectionString;
    }
    
}
