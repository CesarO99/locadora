package com.cesaroliveira.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cesaroliveira.locadora.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
