package com.web.MoviesAdda.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.web.MoviesAdda.entity.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {

	
}
