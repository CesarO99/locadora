package com.cesaroliveira.locadora.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cesaroliveira.locadora.dto.ScoreDto;
import com.cesaroliveira.locadora.entities.Movie;
import com.cesaroliveira.locadora.entities.Score;
import com.cesaroliveira.locadora.entities.User;
import com.cesaroliveira.locadora.repository.MovieRepository;
import com.cesaroliveira.locadora.repository.ScoreRepository;
import com.cesaroliveira.locadora.repository.UserRepository;



@Service
public class ScoreService {
	
	@Autowired
	private ScoreRepository scoreRepository;
	@Autowired
	private MovieRepository movieRepository;
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void saveScore(ScoreDto scoreDto) {
		
		User user = userRepository.findByEmail(scoreDto.getEmail());
		if(user == null) {
			user = new User();
			user.setEmail(scoreDto.getEmail());
			user = userRepository.saveAndFlush(user);
		}
		
		Movie movie = movieRepository.findById(scoreDto.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		scoreRepository.save(score);
	
	}
}
