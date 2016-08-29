package com.challenge.repository;

import org.springframework.stereotype.Repository;

import com.challenge.identity.Customer;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Repository
public class CustomerRepository extends GenericRepository<Customer>{
	
}
