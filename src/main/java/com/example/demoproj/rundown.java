package com.example.demoproj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rundown {
	@GetMapping("/")
	public String index() {
		return "Welcome to MIT-FIS!";
	}
}
