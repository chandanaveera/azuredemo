package com.azure.demo.azuredemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.azure.demo.azuredemo.Model.CustomerData;
import com.azure.demo.azuredemo.service.CustomerDataService;



@RestController
public class AzureDemoController {
	
	@Autowired
	CustomerDataService customerDataService;
	
	@GetMapping(value = "/{customerId}/customerData",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getCustomerData(@PathVariable("customerId") String customerId) {
		ResponseEntity<?> customerData = customerDataService.getCustomerData(customerId);
		return customerData;
	}
	
}


