package com.web.MoviesAdda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.MoviesAdda.entity.Movies;

@Repository
public interface MovieRepo extends JpaRepository<Movies, Integer> {

}
