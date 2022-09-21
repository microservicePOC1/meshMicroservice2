package com.co.services.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    
    @GetMapping("/")
    public String sampleApi() {

        return "Hello Sample Microservice 2";
    }
    
}
