package com.challenge.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.challenge.identity.Restaurant;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:WebContent/WEB-INF/application-context.xml")
public class RestaurantRepositoryTest {
	@Autowired
	RestaurantRepository repository;

	@Test
	public void insert() {
		String name = "Gouva";
		Restaurant restaurant = repository.insert(new Restaurant(name, 0));
		Assert.assertNotNull(restaurant);
	}

	@Test
	public void update() {
		Restaurant restaurant = repository.findById((long) 1);
		Assert.assertNotNull(restaurant);
		restaurant.setName("The Fifties");
		Restaurant updated = repository.update(restaurant);
		Assert.assertTrue(updated.getName() == "The Fifties");
	}

	@Test
	public void computeVote() {
		Long id = (long) 1;
		Restaurant before = repository.findById(id);
		Assert.assertNotNull(before);
		repository.computeVote(id);
		Restaurant after = repository.findById(id);
		Assert.assertNotNull(after);
		Assert.assertTrue(before.getVoteCount() + 1 == after.getVoteCount());
	}
}
