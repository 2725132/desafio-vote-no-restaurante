package com.challenge.repository;

import org.springframework.stereotype.Repository;

import com.challenge.identity.Customer;

@Repository
public class CustomerRepository extends GenericRepository<Customer, Long>{
	public CustomerRepository(){
		super(Customer.class);
	}
	
	public Customer findByNickName(String nick){
		Customer result =(Customer) em.createQuery("select c from customer c where firstName=\"" + nick + "\"", Customer.class).setMaxResults(1);
		return result;
	}
	
}
