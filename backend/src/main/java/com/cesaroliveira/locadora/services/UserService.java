package com.cesaroliveira.locadora.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cesaroliveira.locadora.dto.UserDto;
import com.cesaroliveira.locadora.entities.User;
import com.cesaroliveira.locadora.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Page<UserDto> findAll(Pageable pageable){
		Page<User> result = userRepository.findAll(pageable);
		Page<UserDto> page = result.map(x -> new UserDto(x));
		return page;
	}
	
	public UserDto findById(Long id) {
		User result = userRepository.findById(id).get();
		UserDto resultFinal = new UserDto(result);
		return resultFinal;
	}

}
