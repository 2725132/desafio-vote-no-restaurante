package com.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.challenge.identity.Customer;
import com.challenge.repository.CustomerRepository;

import lombok.Data;


@Controller
public class CustomerController {
	@Autowired
	CustomerRepository cr;
	
	@Autowired
	
	@RequestMapping(value="/customer")
	public ModelAndView customerPage(){
		ModelAndView resultPage = new ModelAndView("/customer-form");

		return resultPage;
		
	}
	
	@RequestMapping(value="/insertCustomer", method=RequestMethod.POST)
	public ModelAndView createNewUser(Customer customer){
		cr.insert(customer);
		return new ModelAndView("redirect:/home");
	}
}
