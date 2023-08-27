package com.dockerPractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/test-docker")
	public String getString() {
		return "Welcome to my Springboot Application with docker and Kube";
	}

}
