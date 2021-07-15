package com.skill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skill.model.Movie;
import com.skill.service.IMovieService;

@RestController
public class MovieController {
	@Autowired 
	private IMovieService movieService;
	
	@GetMapping(path="/movies/{moviename}", produces="application/json")
	public Movie getMoviesInfo(@PathVariable("moviename") String name)
	{
		return (movieService.getMovieInfo(name));
	}
	
	@PutMapping(path="/addmovies", consumes="application/json")
	public Movie addMovie(@RequestBody Movie movie)
	{
		return (movieService.addMovie(movie));
	}
	
	
	@DeleteMapping(path="/deletemovies/{moviename}", produces="application/json")
	public ResponseEntity<String> deleteMovie(@PathVariable("moviename") String name)
	{
	movieService.deleteMovie(name);
	return new ResponseEntity<>("Movie Deleted ", HttpStatus.OK);
	}

	@GetMapping(path="/allmovies",produces = "application/json")
	public List<Movie> searchAllMovies(){
		return movieService.getAllMovies();
	}







}
