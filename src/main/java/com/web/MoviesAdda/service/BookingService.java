package com.web.MoviesAdda.service;



import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.MoviesAdda.entity.Booking;

import com.web.MoviesAdda.entity.Users;
import com.web.MoviesAdda.repository.BookingRepo;
import com.web.MoviesAdda.repository.UserRepo;

@Service
public class BookingService {

	@Autowired 
	private BookingRepo bookingrepo;
	
	
	@Autowired
	private UserRepo userrepo;
	
	public Booking addBooking(Booking booking)
	{
	   return bookingrepo.save(booking);
	   
	}
	
	public Booking getOneBooking(int tcid)
	{
	
		 return  bookingrepo.findById(tcid).get();
		
	}
	
	public Set<Booking> getAllBooking(int uid)
	{
	 
		Users user = userrepo.findById(uid).get();
		Set<Booking> booking =  user.getBookings();
		return booking;
	}
	
	
	
}
