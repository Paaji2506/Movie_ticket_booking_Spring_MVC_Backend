package com.web.MoviesAdda.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.MoviesAdda.entity.Users;
import com.web.MoviesAdda.model.ResetPswd;
import com.web.MoviesAdda.model.UserModel;
import com.web.MoviesAdda.service.UserService;


@RestController
@CrossOrigin
public class UserController {
	
	
	@Autowired UserService userservice;
	
     @PostMapping("/")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping("/signin")
	public String signinPage(Model model) {
		
		UserModel usermodel = new UserModel();
		model.addAttribute(usermodel);
		return "signin";
	}
	
	
	
	@PostMapping("register")
	public Users regUser(@RequestBody UserModel usermodel)
		{
			Users user = userservice.saveUser(usermodel);
		   
		  return user;
		}

	
	
	@GetMapping(value="getuser/{logemail}")
	public ResponseEntity<Users> getuser(@PathVariable String logemail)
		{
		Users user = userservice.getByEmail(logemail);
		  
			if(user!=null)
				return new ResponseEntity<>(user,HttpStatus.OK);
			else
				return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		}
	
	@PostMapping("logout")
	public String logout(@RequestBody Users user)
		{
	         userservice.logout(user);
		  
			   return "Logout Successful";
		}
	


	
	@GetMapping("getnoofusers")
	public long getNoofUsers()
		{
			return userservice.getUsers();
	        
		}
	
	
	@PutMapping("update")
	public Users updateUser(@RequestBody UserModel usermodel)
		{
			Users user = userservice.saveUser(usermodel);
		  return user;
		}
	

	@PostMapping("resetpsw")
	public String resetPswd(@RequestBody ResetPswd resetpswd)
		{
	        return userservice.resetPswd(resetpswd);
		  
		}
	

}

