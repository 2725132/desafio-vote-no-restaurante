package com.challenge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	
	@RequestMapping("/vote")
	public ModelAndView vote(){
		String message="FOI!";
		return new ModelAndView("vote-restaurant", "message", message);
	}
}