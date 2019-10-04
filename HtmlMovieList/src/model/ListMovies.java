package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class ListMovies {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "MOVIE")
	private String Movie;
	@Column(name = "RAITING")
	private int Raiting;
	@Column(name = "MAINCHARACTER")
	private String MainCharacter;
	
	
	
	@Override
	public String toString() {
		return " Movie: " + Movie + " Raiting: " + Raiting + " MainCharacter: " + MainCharacter;
	}


	public ListMovies(String movie, int raiting, String mainCharacter) {
		super();
		Movie = movie;
		Raiting = raiting;
		MainCharacter = mainCharacter;
	}


	public ListMovies() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMovie() {
		return Movie;
	}


	public void setMovie(String movie) {
		Movie = movie;
	}


	public int getRaiting() {
		return Raiting;
	}


	public void setRaiting(int raiting) {
		Raiting = raiting;
	}


	public String getMainCharacter() {
		return MainCharacter;
	}


	public void setMainCharacter(String mainCharacter) {
		MainCharacter = mainCharacter;
	}


	public String returnMovieDetails() {
		return " Movie: " + Movie + " Raiting: " + Raiting + " MainCharacter: " + MainCharacter;
	}
	
	
}
