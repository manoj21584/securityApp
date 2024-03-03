package com.spring.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.model.Customer;
import com.spring.security.repository.CustomerRepository;

@RestController
public class LoginController {
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody Customer customer) {
		Customer savedCustomer = null;
		ResponseEntity response = null;
		try {
			String endocePassword=passwordEncoder.encode(customer.getPwd());
			customer.setPwd(endocePassword);
			savedCustomer = customerRepository.save(customer);
			if (savedCustomer.getId() > 0) {
				response = ResponseEntity.status(HttpStatus.CREATED).body("given user is successfully register");
			}
		} catch (Exception ex) {
			response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("an exception occure due to" + ex.getMessage());
		}
		return response;
	}

}
