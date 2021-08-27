package com.onlinestore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String showHomePage() {
		
		System.out.println("In Home Page");
		
		return "home";
	}
	
	@GetMapping("/error")
	public String errorPage() {
		
		System.out.println("In Home Page");
		
		return "home";
	}
	
	@GetMapping("/addProduct")
	public String showAddPage() {
		
		System.out.println("Add product Page");
		
		return "addProduct";
	}
}
