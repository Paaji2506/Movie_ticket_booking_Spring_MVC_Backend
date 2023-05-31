package com.web.MoviesAdda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.MoviesAdda.entity.Theater;

@Repository
public interface TheaterRepo extends JpaRepository<Theater, Integer> {

	public Theater findByThname(String string);
}
