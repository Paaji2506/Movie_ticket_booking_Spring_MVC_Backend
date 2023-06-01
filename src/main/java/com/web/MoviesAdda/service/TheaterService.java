package com.web.MoviesAdda.service;



import java.util.List;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.MoviesAdda.entity.Movies;
import com.web.MoviesAdda.entity.Theater;
import com.web.MoviesAdda.repository.MovieRepo;
import com.web.MoviesAdda.repository.TheaterRepo;

@Service
public class TheaterService {

	@Autowired
	private TheaterRepo theaterrepo;
	
	@Autowired
	private MovieRepo movierepo;
	
	public Theater addTheater(Theater theater)
	{
		Theater thea = theaterrepo.save(theater);
		return thea;
	}
	
	public List<Theater> getAllTheater()
	{
		List<Theater> theater = theaterrepo.findAll();
		return theater;
	}
	
	
	public Theater updateTheater(Theater theater)
	{
		Theater thea = theaterrepo.findById(theater.getThid()).get();
		
		thea.setThname(theater.getThname());
		thea.setThcity(theater.getThcity());
		thea.setThtype(theater.getThtype());
		thea.setThsc(theater.getThsc());
		thea.setThadd(theater.getThadd());
		thea.setThimg(theater.getThimg());
		
		theaterrepo.save(thea);
		return thea;
	}
     public Theater addThMovie(int thid, int movid)
     {
    	 Set<Movies> movieset = null;
    	 Movies movies = movierepo.findById(movid).get();
    	 Theater thea = theaterrepo.findById(thid).get();
    	 movieset = thea.getThmovies();
    	 
    	 movieset.add(movies);
    	 thea.setThmovies(movieset);
    	 
    	 return theaterrepo.save(thea);
    	 
    	
    	 
     }
     
     public Set<Movies> gettheaMovie(int thid)
     {
    	Theater thea = theaterrepo.findById(thid).get();
    	return thea.getThmovies();
    	 
     }
	public void deleteTheater(int id)
	{
		 theaterrepo.deleteById(id);
		
	}
	public long gettheaters()
	{
	  return  theaterrepo.count();
		
	}
	
	
	public Theater getseats(int thid)
	{
	   
	return  theaterrepo.findById(thid).get();
		
	  
		
	}
	
	public void deleteThMovie(int movid)
	{
		List<Theater> thea = theaterrepo.findAll();
		
		for(Theater th : thea)
		{
		   Set<Movies> sm = th.getThmovies();
		   for(Movies m : sm)
		   {
			   if(m.getMovid()==movid)
			   {
				   sm.remove(m);
			   }
		   }
		}
		
	}
}
