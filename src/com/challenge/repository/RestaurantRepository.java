package com.challenge.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.challenge.identity.Restaurant;

import lombok.Data;

@Repository
public class RestaurantRepository extends GenericRepository<Restaurant, Long> {

	public RestaurantRepository() {
		super(Restaurant.class);
	}

	@Transactional
	public void computeVote(Long id) {
		Restaurant restaurant = findById(id);
		restaurant.incrementVotes();
		update(restaurant);
	}
}
