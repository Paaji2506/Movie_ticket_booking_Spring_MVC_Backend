package com.web.MoviesAdda.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.MoviesAdda.entity.Movies;
import com.web.MoviesAdda.entity.Theater;
import com.web.MoviesAdda.service.TheaterService;

@CrossOrigin
@RestController
public class TheaterController {

	@Autowired
	private TheaterService theaterservice;
	
	@PostMapping("addtheater")
	public Theater addTheater(@RequestBody Theater theater) {
		
		Theater thea = theaterservice.addTheater(theater);
		
		return thea;
		
	}
	
	@PostMapping("addthmovie/{thid}/{movid}")
	public Theater addThMovie(@PathVariable int thid, @PathVariable int movid ) {
		
		Theater thea = theaterservice.addThMovie(thid,movid);
		
		return thea;

	}
	
	@GetMapping("getthmovie/{thid}")
	public Set<Movies> getthMovie(@PathVariable int thid)
	{
		return theaterservice.gettheaMovie(thid);
	}
	

	@GetMapping("gettheater")
	public List<Theater> getAllTheater()
	{
		return theaterservice.getAllTheater();
		
	}
		
	
	@PostMapping("updatetheater")
	public Theater updateTheater(@RequestBody Theater theater)
	{
		Theater thea = theaterservice.updateTheater(theater);
		
		return thea;
	}
	
	@DeleteMapping(value = "deletetheater/{thid}")
	public String DeleteTheater(@PathVariable("thid") int id)
	{
		 theaterservice.deleteTheater(id);
		
		return "Deleted Successfully";
	}
	
	@DeleteMapping(value = "deletethmovie/{movid}")
	public String DeleteThMovie(@PathVariable("movid") int movid)
	{
		 theaterservice.deleteThMovie(movid);
		
		return "Theater Movie Deleted Successfully";
	}
	
	

}
