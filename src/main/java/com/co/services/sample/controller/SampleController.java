package com.service.keyvault.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.beans.factory.annotation.Value;

@RestController
public class SampleController {

	@Value("${NGF-DB-user}")
	private String credsNgf;

	@Value("${connectionString}")
	private String credsAmcis;

	@Value("${connectionString2}")
	private String credsSpanas;

	
	@RequestMapping(value="creds", method = RequestMethod.GET)
	public @ResponseBody String getItem(@RequestParam("db") String dbRequested){

	   switch(dbRequested) {
	   case("ngf"):
		   return credsNgf;
	   case("amcis"):
		   return credsAmcis;
	   case("spanas"):
		   return credsSpanas;
	   	default:
	   		return new String("");
	   }
		   
	}
		@GetMapping("/trial")
	    public String trial() {


	        
	        return new String("Response from api");
	    }
}
