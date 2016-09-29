package com.challenge.service;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.identity.Restaurant;
import com.challenge.repository.RestaurantRepository;
import com.challenge.statistics.RestaurantStatistics;

@Service
public class RestaurantService {
	@Autowired
	private RestaurantRepository repository;
	
	@Autowired
	private RestaurantStatistics statistics;
	
	public int getVoteCount(Long id){
		Restaurant restaurant = repository.findById(id);
		return restaurant.getVoteCount();
	}
	
	public Restaurant findById(long id){
		return repository.findById(id);
	}
	
	public List<Restaurant> getResultList(int size){
		List<Restaurant> restaurants = repository.findList(size);
		Collections.sort(restaurants);
		return restaurants;
	}
	
}
