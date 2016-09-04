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
@Data
@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerRepository cr;
	
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ModelAndView createNewUser(@ModelAttribute("name")String name, @ModelAttribute("email")String email ){
		cr.insert(new Customer(name, email));
		return new ModelAndView("/customer");
	}
}
