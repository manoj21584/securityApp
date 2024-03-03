package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
	@GetMapping("/myCard")
	public String getCardDetails() {
		return "welcome to cards controller";
	}

}
