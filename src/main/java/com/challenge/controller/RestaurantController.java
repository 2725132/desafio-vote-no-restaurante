package com.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.challenge.identity.Restaurant;
import com.challenge.repository.cache.RestaurantCache;
import com.challenge.service.RestaurantService;

@Controller
public class RestaurantController {

	@Autowired
	RestaurantService service;

	@Autowired
	RestaurantCache cache;
	
	@RequestMapping("/home")
	public ModelAndView vote() {
		ModelAndView resultPage = new ModelAndView("/vote-restaurant");
		
		resultPage.addObject("restaurantOne", cache.findById(Long.parseLong("1")));
		resultPage.addObject("restaurantTwo", cache.findById(Long.parseLong("2")));
		resultPage.addObject("restaurantThree", cache.findById(Long.parseLong("3")));
		return resultPage;
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createNewRestaurant(String name) {
		Restaurant result = service.insert(new Restaurant(name, 0));
		
		String response = result.getName() + " Successfully added with id " + result.getId();
		return new ModelAndView("/register", "response", response);
	}

	@RequestMapping(value = "/findById", method = RequestMethod.GET)
	public Restaurant findById(long id) {
		return service.findById(id);
	}

	@RequestMapping(value = "/computeVote")
	public ModelAndView vote(String restaurantId) {
		service.computeVote(Long.parseLong(restaurantId));

		ModelAndView resultPage = new ModelAndView("/customer-form");
		resultPage.addObject("restaurantOne", service.findById(Long.parseLong("1")));
		resultPage.addObject("restaurantTwo", service.findById(Long.parseLong("2")));
		resultPage.addObject("restaurantThree", service.findById(Long.parseLong("3")));

		return resultPage;
	}

	@RequestMapping(value = "/displayRanking")
	public ModelAndView displayRanking() {
		List<Restaurant> restaurants = service.getResultList(5);

		return new ModelAndView("ranking", "restaurants", restaurants);
	}
}
