package com.web.MoviesAdda.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.web.MoviesAdda.entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
	
	public Users findByUemail(String email);


}
