package com.basicprojecttemplate.template.springbootbackendtemplate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	
	@GetMapping("/test")
	public String test() {
		return "Hello World";
	}
}
