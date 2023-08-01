package com.ofss.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/myapi
@RestController
@RequestMapping("myapi")
public class HelloWorldController {

	// http://localhost:8080/myapi/greet
	@RequestMapping(value = "greet", method = RequestMethod.GET)
	public String showMessage() {
		return "Hello World!";
	}
}
