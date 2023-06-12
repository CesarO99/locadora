package com.cesaroliveira.locadora.dto;

import com.cesaroliveira.locadora.entities.Movie;

public class MovieDto {
	
	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;
	
	public MovieDto() {
		
	}

	public MovieDto(Long id, String title, Double score, Integer count, String image) {
		super();
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}

	public MovieDto(Movie movie) {
	}

}
