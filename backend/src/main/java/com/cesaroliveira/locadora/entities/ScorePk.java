package com.cesaroliveira.locadora.entities;

public class ScorePk {
	
	private Movie movie;
	private User user;
	
	public ScorePk() {
	}

	public ScorePk(Movie movie, User user) {
		super();
		this.movie = movie;
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
