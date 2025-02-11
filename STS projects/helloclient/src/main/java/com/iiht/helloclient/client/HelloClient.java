package com.iiht.helloclient.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/client")
public class HelloClient {
	
	
	@Autowired
	RestTemplate template;
	
	
	@GetMapping
	public String connect()
	{
		String url ="http://localhost:8071/rest/service";
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		return response.toString();
	}
	
	
	

}
