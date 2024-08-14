package com.iiht.bs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	
	@GetMapping("/")
	public String greeet() {
		return "Working";
	}
	
	@GetMapping
	@RequestMapping("/admin")
	public String greetAdmin() {
		return "Admin @ work";
	}
	
	@GetMapping
	@RequestMapping("/user")
	public String greetUser() {
		return "User @ work";
	}
}
