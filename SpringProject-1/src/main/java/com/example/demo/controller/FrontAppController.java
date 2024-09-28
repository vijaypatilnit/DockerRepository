package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class FrontAppController {

	
	@GetMapping("/getUser")
	public String getUserDetails() {
		
		return "Welcome to new orgnization";
		
	}
}
