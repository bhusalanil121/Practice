package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8sApplication {

	@GetMapping("/message")
	public String getMapping() {
		return "Congralutation its connected";
	}
	public static void main(String[] args) {
		SpringApplication.run(K8sApplication.class, args);
	}

}
