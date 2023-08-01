package com.ofss.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/stringutilapi
@RestController
@RequestMapping("stringutilapi")
public class StringUtilController {

	// http://localhost:8080/stringutilapi/hi
	@RequestMapping(value = "{text}", method = RequestMethod.GET)
	public String doProcess(@PathVariable String text) {
		return "GET : " + text.toUpperCase();
	}

	// http://localhost:8080/stringutilapi/hi
	@RequestMapping(value = "{text}", method = RequestMethod.POST)
	public String doProcessPost(@PathVariable String text) {
		return "POST : " + text.toUpperCase();
	}

	// http://localhost:8080/stringutilapi/hi
	@RequestMapping(value = "{text}", method = RequestMethod.PUT)
	public String doProcessPut(@PathVariable String text) {
		return "PUT : " + text.toUpperCase();
	}

	// http://localhost:8080/stringutilapi/hi
	@RequestMapping(value = "{text}", method = RequestMethod.DELETE)
	public String doProcessDelete(@PathVariable String text) {
		return "DELETE : " + text.toUpperCase();
	}

}
