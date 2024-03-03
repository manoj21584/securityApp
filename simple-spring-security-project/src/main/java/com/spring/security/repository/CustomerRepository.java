package com.spring.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.spring.security.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
 List<Customer> findByEmail(String email);
}
