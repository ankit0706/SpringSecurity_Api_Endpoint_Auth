package com.sample.security2.controller;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
	
	@GetMapping("/home")
	public String sayHello() {
		return "Welcome to the Homepage! The time is" + LocalTime.now();
	}
}
