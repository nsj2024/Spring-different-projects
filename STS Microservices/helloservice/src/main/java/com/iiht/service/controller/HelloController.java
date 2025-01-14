package com.iiht.service.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")
public class HelloController {
	
	
	
	Logger l = Logger.getLogger("HelloController");
	@GetMapping
	public String confirm()
	{
		return "Connected Hello Service 1 ----- Responding";
	}
	
	@GetMapping("/factorial/{num}")
	public int fact(@PathVariable int num)
	{
		int i ;
		int fact=1;
		for(i=1;i<=num;i++)
		{
			fact = fact * i;
		}
	
		return fact;
		
	}
	

}
