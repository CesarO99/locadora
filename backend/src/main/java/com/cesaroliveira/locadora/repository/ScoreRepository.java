package com.cesaroliveira.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesaroliveira.locadora.entities.Score;
import com.cesaroliveira.locadora.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {
	
	

}
