package com.example.day_3.a.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ApiController {
	@Value("${Student.name}")
	String name;
	
	@GetMapping("/")
	public String getName() {
		return name;
		
	}
	
}
