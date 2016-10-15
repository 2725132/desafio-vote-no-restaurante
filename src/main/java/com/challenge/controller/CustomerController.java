package com.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.challenge.identity.Customer;
import com.challenge.repository.CustomerRepository;

@Controller
public class CustomerController {
	@Autowired
	CustomerRepository cr;


	@RequestMapping(value = "/customer")
	public ModelAndView customerPage() {
		ModelAndView resultPage = new ModelAndView("/customer-form");

		return resultPage;

	}

	@RequestMapping(value = "/insertCustomer", method = RequestMethod.POST)
	public String createNewUser(Customer customer) {
		cr.insert(customer);
		return "redirect:/displayRanking";
	}
}
