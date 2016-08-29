package com.challenge.repository;

import org.springframework.stereotype.Repository;

import com.challenge.identity.Customer;

import lombok.Data;

@Data
@Repository
public class CustomerRepository extends GenericRepository<Customer>{
	
}
