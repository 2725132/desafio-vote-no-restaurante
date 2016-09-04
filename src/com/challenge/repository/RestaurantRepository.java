package com.challenge.repository;

import org.springframework.stereotype.Repository;

import com.challenge.identity.Restaurant;

import lombok.Data;

@Repository
public class RestaurantRepository extends GenericRepository<Restaurant, Long> {
	
	public RestaurantRepository(){
		super(Restaurant.class);
	}
}
