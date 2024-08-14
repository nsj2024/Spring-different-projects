package com.ust.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.security.model.User;
import com.ust.security.repository.UserRepository;

@RestController
public class AdminController {
	
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@PostMapping("/admin/add")
	public String addUserByAdmin(User user)
	{
		userRepository.save(user);
		return "user added successfully";
	}
}
