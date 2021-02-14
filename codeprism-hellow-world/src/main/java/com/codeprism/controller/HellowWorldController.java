package com.codeprism.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorldController {

	@RequestMapping("/")
	public String hello() {
		return "Hello world";
	}
}
