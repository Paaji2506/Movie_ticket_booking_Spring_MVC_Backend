package com.web.MoviesAdda.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.MoviesAdda.entity.Movies;
import com.web.MoviesAdda.service.MovieService;

@CrossOrigin
@RestController
public class MovieController {

	@Autowired MovieService movieservice;
	
	
	@PostMapping("addmovie")
	public Movies addmovie(@RequestBody Movies movies) {
		
		return movieservice.addmovie(movies);
		
	}
	

	@GetMapping("getmovie")
	public List<Movies> getAllMovies()
	{
       return  movieservice.getAllMovies();
		
	}

	
	@GetMapping("getnoofmovies")
	public long getNoofTheaters()
		{
			return movieservice.getmovies();
	        
		}
	@PostMapping("updatemovie")
	public Movies updateMovie(@RequestBody Movies movie)
	{
		Movies mov = movieservice.updateMovie(movie);
		
		return mov;
	}
	
	

	@DeleteMapping(value = "deletemovie/{id}")
	public String DeleteTheater(@PathVariable("id") int id)
	{
		 movieservice.deleteMovie(id);
		
		return "Deleted Successfully";
	}


	
}
