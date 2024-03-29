package com.cesaroliveira.locadora.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cesaroliveira.locadora.dto.MovieDto;
import com.cesaroliveira.locadora.services.MovieService;

@RestController
public class MovieController {
	
	private MovieService service;
	
	@GetMapping
	public Page<MovieDto> findAll(Pageable pageable){
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public MovieDto findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	
}
