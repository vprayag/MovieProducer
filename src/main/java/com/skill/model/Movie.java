package com.skill.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	
	
	//private int movieId;
	@Id
	@Column(length=20)
	private String movieName;
	@Column(length=20)
	private int rating;
	@Column(length=20)
	private String genre;
//	public int getMovieId() {
//		return movieId;
//	}
//	public void setMovieId(int movieId) {
//		this.movieId = movieId;
//	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", rating=" + rating + ", genre=" + genre
				+ "]";
	}
	public Movie(int movieId, String movieName, int rating, String genre) {
		super();
		
		this.movieName = movieName;
		this.rating = rating;
		this.genre = genre;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

}
