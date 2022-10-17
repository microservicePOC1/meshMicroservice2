package com.co.services.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class SampleController {
    @Autowired
    private Environment environment;

    private final Logger log = LoggerFactory.getLogger(SampleController.class);

    @GetMapping("/")
    public String sampleApi() {
        String serverName = environment.getProperty("environment.servername");
        String port = environment.getProperty("environment.dbport");
        String databaseName = environment.getProperty("environment.dbname");
        String userName = environment.getProperty("environment.username");
        String password = environment.getProperty("environment.password");
        String envSample = environment.getProperty("environment.username");
        log.info("********************************* logging env var from Config map/yaml");
        log.info(envSample);
        return "Hello Sample Microservice 2";
    }
    
}
