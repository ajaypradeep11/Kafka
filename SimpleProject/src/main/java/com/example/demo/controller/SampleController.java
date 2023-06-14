package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	
	@RequestMapping("/param")
	public String sayHello() {
		return "Hi";
		
	}
}
