package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Hello from Spring Boot in Docker!";
	}

	@GetMapping("/health")
    	public String health() {
        	return "Application is running healthy!";
    	}
}
