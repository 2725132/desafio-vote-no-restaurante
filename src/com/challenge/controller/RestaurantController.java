package com.challenge.controller;

import java.util.List;

import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.challenge.identity.Restaurant;
import com.challenge.repository.RestaurantRepository;
import com.challenge.service.RestaurantService;
import com.challenge.statistics.RestaurantStatistics;

@Controller
public class RestaurantController {
	@Autowired
	RestaurantRepository repository;
	
	@Autowired
	RestaurantService service;

	@RequestMapping("/home")
	public ModelAndView vote() {
		ModelAndView resultPage = new ModelAndView("/vote-restaurant");
		resultPage.addObject("restaurant1", service.findById(1));
		resultPage.addObject("restaurant2", service.findById(2));
		resultPage.addObject("restaurant3", service.findById(3));
		return resultPage;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createNewRestaurant(String name) {
		Restaurant result = repository.insert(new Restaurant(name, 0));
		String response = result.getName() + " Successfully added with id " + result.getId(); 
		return new ModelAndView("/register", "response", response);
	}

	@RequestMapping(value = "/findById", method = RequestMethod.GET)
	public Restaurant findById(long id) {
		return service.findById(id);
	}

	@RequestMapping(value = "/computeVote")
	public ModelAndView vote(String restaurantId) {
		repository.computeVote(Long.parseLong(restaurantId));
		
		ModelAndView resultPage = new ModelAndView("/customer-form");
		resultPage.addObject("restaurantOne", service.findById(1));
		resultPage.addObject("restaurantTwo", service.findById(2));
		resultPage.addObject("restaurantThree", service.findById(3));
		
		return resultPage;
	}
}
