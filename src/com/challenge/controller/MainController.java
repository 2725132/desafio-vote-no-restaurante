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


	@RequestMapping("/restaurant")
	public ModelAndView restaurantManager() {
		return new ModelAndView("restaurant-form");
	}

	@RequestMapping("/")
	public String index(){
		return "index";
	}
}
