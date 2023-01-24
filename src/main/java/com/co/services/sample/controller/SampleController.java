package com.service.keyvault.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Value;


@RestController
public class KeyVaultController {
    @Value("${NGF-DB-user}")
    private String connectionString;
    
    @Value("${connectionString2}")
    private String connectionString2;
    
    @Value("${connectionString3}")
    private String connectionString3;


    
    @GetMapping("get")
    public String get() {
        return connectionString;
    }
    
        
    @GetMapping("get1")
    public String get() {
        return connectionString2;
    }
    
        
    @GetMapping("get2")
    public String get() {
        return connectionString3;
    }
    
}
