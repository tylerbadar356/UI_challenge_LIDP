package com.tylerbadarUIChallenge.UI_Challenge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {
	
	@GetMapping(path = "/hello-world")
	public String hello() {
		return "Hello world!";
	}

}
