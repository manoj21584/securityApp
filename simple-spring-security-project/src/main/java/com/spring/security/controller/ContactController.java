package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	@GetMapping("/myContact")
	public String getContactDetails() {
		return "welcome to contact controller";
	}

}
