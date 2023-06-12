package com.cesaroliveira.locadora.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cesaroliveira.locadora.dto.UserDto;
import com.cesaroliveira.locadora.services.UserService;

@RestController
public class UserController {
	
	private UserService userService;
	
	@GetMapping
	public UserDto findById(@PathVariable Long id) {
		return userService.findById(id);
	}
}
