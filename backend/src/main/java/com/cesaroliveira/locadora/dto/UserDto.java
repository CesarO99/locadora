package com.cesaroliveira.locadora.dto;

import com.cesaroliveira.locadora.entities.User;

public class UserDto {
	
	private Long id;
	private Long email;
	
	public UserDto() {
		
	}

	public UserDto(Long id, Long email) {
		this.id = id;
		this.email = email;
	}
	
	public UserDto(User user) { //Utilizado para instanciar um novo dto, quando é resultado de uma conversão de uma entity
		
	}
	
}
