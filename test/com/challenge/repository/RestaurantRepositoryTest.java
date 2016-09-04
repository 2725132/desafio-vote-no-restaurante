package com.challenge.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.challenge.identity.Restaurant;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:WebContent/WEB-INF/application-context.xml")
public class RestaurantRepositoryTest {
	@Autowired
	RestaurantRepository rr;
	
	@Test
	public void insert(){
		String name = "Gouva";
		Restaurant r =rr.insert(new Restaurant(name));
		Assert.assertNotNull(r);
	}
}
