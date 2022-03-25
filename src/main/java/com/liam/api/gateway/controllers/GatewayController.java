package com.liam.api.gateway.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {
	
	
	@GetMapping("/employeeFallback")
	public String employeeFallback() {
		return "Employee service is unavailable, please try again later";
	}

	@GetMapping("/companyFallback")
	public String companyFallback() {
		return "Company service is unavailable, please try again later";
	}
	
	@GetMapping("/departmentFallback")
	public String departmentFallback() {
		return "Department service is unavailable, please try again later";
	}

}
