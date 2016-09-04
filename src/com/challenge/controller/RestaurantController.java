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
	RestaurantRepository rr;
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ModelAndView createNewRestaurant(@ModelAttribute("name")String name){
		rr.insert(new Restaurant(name));
		return new ModelAndView("redirect:/vote-restaurant");
	}
	
}
