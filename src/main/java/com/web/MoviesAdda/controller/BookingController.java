package com.web.MoviesAdda.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.MoviesAdda.entity.Booking;
import com.web.MoviesAdda.service.BookingService;

@CrossOrigin
@RestController
public class BookingController {

	@Autowired
	private BookingService bookingservice;
	
	@PostMapping("addbooking")
	public Booking addBooking(@RequestBody Booking booking)
	{
		return bookingservice.addBooking(booking);
	}
	
	@GetMapping(value="getbookings/{uid}")
	public Set<Booking> getBookings(@PathVariable int uid)
	{
		return bookingservice.getAllBooking(uid);
	}


	@GetMapping(value="getonebooking/{tcid}")
	public Booking getBooking(@PathVariable int tcid)
	{
		return bookingservice.getOneBooking(tcid);
	}
}