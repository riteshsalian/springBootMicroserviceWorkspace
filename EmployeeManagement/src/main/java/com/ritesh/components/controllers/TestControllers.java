package com.ritesh.components.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllers {
	
	@RequestMapping("/")
	public String checkStatus()
	{
		return "Hello World";
	}
	
	
	
	

}
