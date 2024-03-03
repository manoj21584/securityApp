package com.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories("com.spring.security.repository")
//@EntityScan("com.spring.security.model")
public class SimpleSpringSecurityProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringSecurityProjectApplication.class, args);
	}

}
