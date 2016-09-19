package com.challenge.statistics;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.challenge.identity.Restaurant;
import com.challenge.service.RestaurantService;

import junit.framework.Assert;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:WebContent/WEB-INF/application-context.xml")
public class RestaurantStatisticsTest {
	@Autowired
	RestaurantStatistics statistics;
	
	@Autowired
	RestaurantService service;
	
	@Test
	public void getVotesResultTest(){
		float result = statistics.getVoteResults((long) 1);
		Assert.assertEquals("votos corretos", 32, result);
	}
	
	@Test
	public void calculateTest(){
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		restaurants.add(service.findById((long) 1));
		Assert.assertNotNull(restaurants.get(0));
		
		restaurants.add(service.findById((long) 2));
		Assert.assertNotNull(restaurants.get(1));
		
		restaurants.add(service.findById((long) 3));
		Assert.assertNotNull(restaurants.get(2));
		
		
		float result = statistics.calculate(10, restaurants);
        Assert.assertNotSame(0, result);
	}
}
