package com.web.MoviesAdda.service;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.MoviesAdda.entity.Movies;
import com.web.MoviesAdda.repository.MovieRepo;

@Service
public class MovieService {

	@Autowired MovieRepo movierepo;
	
	public Movies addmovie(Movies movies)
	{
	
      return  movierepo.save(movies);
	
	}
	
	public List<Movies> getAllMovies()
	{
	   return  movierepo.findAll();
	}
	
	
	public Movies updateMovie(Movies movies)
	{
		Movies mov = movierepo.findById(movies.getMovid()).get();
		
		mov.setMovname(movies.getMovname());
		mov.setMovcity(movies.getMovcity());
		mov.setMovimg(movies.getMovimg());
		mov.setMovcast(movies.getMovcast());
		mov.setMovdir(movies.getMovdir());
		mov.setMovdes(movies.getMovdes());
		
		movierepo.save(mov);
		return mov;
	}
	
	
	
	
	public void deleteMovie(int id)
	{
		 movierepo.deleteById(id);
		
	}
}
