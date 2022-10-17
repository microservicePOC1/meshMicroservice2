package com.co.services.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SampleApplication {
	@Autowired
    	private Environment environment;

    	private final Logger log = LoggerFactory.getLogger(Config.class);

	public static void main(String[] args) {
		String serverName = environment.getProperty("environment.servername");
		String port = environment.getProperty("environment.dbport");
		String databaseName = environment.getProperty("environment.dbname");
		String userName = environment.getProperty("environment.username");
		String password = environment.getProperty("environment.password");
		String envSample = environment.getProperty("environment.username");
		log.info("********************************* logging env var from yml");
		log.info(envSample);
		SpringApplication.run(SampleApplication.class, args);
	}
	
}
