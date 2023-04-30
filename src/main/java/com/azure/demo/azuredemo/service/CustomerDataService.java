package com.azure.demo.azuredemo.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.azure.demo.azuredemo.Model.CustomerData;

@Service
public class CustomerDataService {

	
	public ResponseEntity<?> getCustomerData(String customerId) {
		
		CustomerData customerData = new CustomerData();
		if(StringUtils.isBlank(customerId)) {
			return new ResponseEntity<>("customerId is missing",HttpStatus.BAD_REQUEST);
		}
		if(customerId !=null && customerId.equalsIgnoreCase("201")) {
			customerData.setCustomerId("201");
			customerData.setCustomerName("John Setter");
			customerData.setCustomerAddress("145 N State Street");
			customerData.setCustomerCity("New York");
			customerData.setCustomerState("New York");
			customerData.setCustomerZip("99099");
		}
		if(customerId !=null && customerId.equalsIgnoreCase("202")) {
			customerData.setCustomerId("202");
			customerData.setCustomerName("Michael");
			customerData.setCustomerAddress("404 Exeter Street");
			customerData.setCustomerCity("Cincinnati");
			customerData.setCustomerState("Ohio");
			customerData.setCustomerZip("43240");
		}
		if(customerId !=null && customerId.equalsIgnoreCase("203")) {
			customerData.setCustomerId("203");
			customerData.setCustomerName("Alivia");
			customerData.setCustomerAddress("567 High Street");
			customerData.setCustomerCity("New York");
			customerData.setCustomerState("New York");
			customerData.setCustomerZip("65356");
		}
		if(customerId !=null && customerId.equalsIgnoreCase("204")) {
			customerData.setCustomerId("204");
			customerData.setCustomerName("Amelia");
			customerData.setCustomerAddress("145 Main Street");
			customerData.setCustomerCity("santa monica");
			customerData.setCustomerState("California");
			customerData.setCustomerZip("70953");
		}
		return new ResponseEntity<>(customerData,HttpStatus.OK);
		
	}
}
