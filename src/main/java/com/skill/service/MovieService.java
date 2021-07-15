package com.skill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skill.dao.IMovieDao;
import com.skill.model.Movie;
@Service
public class MovieService implements IMovieService{
	@Autowired
	private IMovieDao movieDao;

	@Override
	public Movie addMovie(Movie movie) {
		return(movieDao.save(movie));

	}

	@Override
	public Movie getMovieInfo(String movieName) {
		return movieDao.findById(movieName).get();
		
	}

	@Override
	public void deleteMovie(String movieName) {
		movieDao.deleteById(movieName);
		
	}

	@Override
	public List<Movie> getAllMovies() {
		return((List<Movie>)movieDao.findAll());
		
	}

//	@Override
//	public Movie updateMovie(String movieName) {
//				return movieDao.;
//	}
	
	

}
