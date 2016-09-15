package com.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.challenge.repository.RestaurantRepository;

@Controller
public class MainController {
	@Autowired
	RestaurantController restaurantController;

	@RequestMapping("/")
	public ModelAndView vote() {
		ModelAndView resultPage = new ModelAndView("vote-restaurant");
		resultPage.addObject("restaurant1", restaurantController.findById(1));
		resultPage.addObject("restaurant2", restaurantController.findById(2));
		resultPage.addObject("restaurant3", restaurantController.findById(3));
		return resultPage;
	}

	@RequestMapping("/restaurant")
	public ModelAndView restaurantManager() {
		return new ModelAndView("restaurant-form");
	}

}
