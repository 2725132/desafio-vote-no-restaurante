package com.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.challenge.identity.Restaurant;
import com.challenge.repository.RestaurantRepository;

@Controller
public class RestaurantController {
	@Autowired
	RestaurantRepository repository;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createNewRestaurant(String name) {
		Restaurant result = repository.insert(new Restaurant(name, 0));
		String response = result.getName() + " Successfully added with id " + result.getId(); 
		return new ModelAndView("/restaurant-form", "response", response);
	}

	@RequestMapping(value = "/findById", method = RequestMethod.GET)
	public Restaurant findById(long id) {
		return repository.findById(id);
	}

	@RequestMapping(value = "/computeVote")
	public String vote(String button) {
		Long id = Long.parseLong(button);
		repository.computeVote(id);
		return "redirect:/home";
	}
}
