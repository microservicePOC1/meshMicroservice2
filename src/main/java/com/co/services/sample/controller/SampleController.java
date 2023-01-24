package com.service.keyvault.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Value;


@RestController
public class SampleController {

    
    @Value("${connectionString}")
    private String connectionString;
    
    
    @GetMapping("get")
    public String get() {
        return connectionString;
    }

    
}
