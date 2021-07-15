package com.skill.service;

import java.util.List;

import com.skill.model.Movie;

public interface IMovieService {
	
	public Movie addMovie(Movie movie);
	public Movie getMovieInfo(String movieName);
	//public Movie updateMovie(String movieName);
	public void deleteMovie(String movieName);
	public List<Movie> getAllMovies();
	

}
