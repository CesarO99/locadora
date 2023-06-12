package com.cesaroliveira.locadora.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_score")
public class Score {
	
	@EmbeddedId
	private ScorePk id = new ScorePk(); //Instanciação de um id que representa o usuário e o filme que será avaliado, para garantir.
	private Double value;
	
	public Score() {
	}
	
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public ScorePk getId() {
		return id;
	}

	public void setId(ScorePk id) {
		this.id = id;
	}
	
	

}
