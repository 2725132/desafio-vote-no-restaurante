package com.challenge.repository;

import com.challenge.identity.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:WebContent/WEB-INF/application-context.xml")
public class CustomerRepositoryTest {
	@Autowired
	CustomerRepository cr;
	
	@Test
	public void insertTest(){
		Customer c = cr.insert(new Customer("Gouvea", "Felipe" ,"95felipeg@gmail.com"));
		Assert.assertNotNull(c);
	}
	
	@Test
	public void findTest(){
		Long id = (long) 1;
		Customer c = cr.findById(id);
		Assert.assertNotNull(c);
		System.out.println(c.toString());
	}
	
	@Test
	public void deleteTest(){
		Long id = (long) 1;
		Customer c = cr.findById(id);
		
		Assert.assertNotNull(c);
		
		cr.delete(c);
		Customer deleted = cr.findById(id);
		
		Assert.assertNull(deleted);
	}
}
