package com.challenge.repository.cache;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.challenge.controller.RestaurantAction;
import com.challenge.identity.Restaurant;
import com.challenge.service.RestaurantService;

@Component
public class RestaurantCache implements RestaurantAction {
	@Autowired
	RestaurantService service;
	private Map<Long, Restaurant> cache;

	public RestaurantCache() {
		cache = new HashMap<Long, Restaurant>();
	}

	public Restaurant findById(Long id) {
		if (cache.containsKey(id)) {
			return cache.get(id);
		} else {
			Restaurant restaurant = service.findById(id);
			cache.put(id, restaurant);

			return restaurant;
		}
	}

}
