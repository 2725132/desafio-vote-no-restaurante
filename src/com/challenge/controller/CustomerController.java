package com.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.identity.Customer;
import com.challenge.repository.CustomerRepository;

import lombok.Data;
@Data
@RestController
public class CustomerController {
	@Autowired
	CustomerRepository cr;
	
	public void createNewUser(String name, String email){
		cr.insert(new Customer(name, email));
	}
}
