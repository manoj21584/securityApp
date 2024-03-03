package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
	@GetMapping("/myloan")
	public String getLoanDetails() {
		return "welcome to loan controller";
	}

}
