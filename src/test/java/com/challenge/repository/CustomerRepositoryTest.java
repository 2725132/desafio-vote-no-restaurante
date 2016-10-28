package com.challenge.repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.support.XmlWebApplicationContext;

import com.challenge.identity.Customer;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/application-context.xml")
public class CustomerRepositoryTest {
	
	@Autowired
	private CustomerRepository repository;
	
	
	@Test
	public void findByFirstName(){
		
		Customer customer = repository.findByNickName("Felipe");
		Assert.assertNotNull(customer);
		Assert.assertTrue("Nome correto", customer.getFirstName() == "Felipe");
		
		
	}
}
