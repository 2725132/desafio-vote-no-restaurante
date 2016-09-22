package com.challenge.repository;

import org.springframework.stereotype.Repository;

import com.challenge.identity.Customer;

import lombok.Data;
import lombok.NoArgsConstructor;

@Repository
public class CustomerRepository extends GenericRepository<Customer, Long>{
	public CustomerRepository(){
		super(Customer.class);
	}
}
