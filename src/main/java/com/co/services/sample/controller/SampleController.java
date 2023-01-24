package com.co.services.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.Console;

import org.springframework.beans.factory.annotation.Value;


@RestController
public class SampleController {
    @Value("${connectionString}")
    private String connectionString;
    
        @Value("${connectionString2}")
    private String connectionString2;
    
        @Value("${connectionString3}")
    private String connectionStringNew;
    
    
            @Value("${NGF-DB-user}")
    private String connectionStringOrignal;

    
    @GetMapping("get")
    public String get() {
        return connectionString;
    }
    
        
    @GetMapping("get1")
    public String get1() {
        return connectionString2;
    }
    
        
    @GetMapping("get2")
    public String get2() {
        return connectionStringNew;
    }
    
        
        
    @GetMapping("original")
    public String original() {
        return connectionStringOrignal;
    }
    
    
    
}
