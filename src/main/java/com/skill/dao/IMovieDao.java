package com.skill.dao;

import org.springframework.data.repository.CrudRepository;

import com.skill.model.Movie;

public interface IMovieDao extends CrudRepository<Movie, String>{

}
