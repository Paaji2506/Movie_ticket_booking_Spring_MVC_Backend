package com.web.MoviesAdda.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.web.MoviesAdda.entity.Users;
import com.web.MoviesAdda.model.ResetPswd;
import com.web.MoviesAdda.model.UserModel;
import com.web.MoviesAdda.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired 
	UserRepo userrepo;
	
	public Users saveUser(UserModel usermodel)
	{
	      	Users user = new Users();
	      	
			user.setUname(usermodel.getUname());
			user.setUemail(usermodel.getUemail());
			user.setUpsw(usermodel.getUpsw());
			user.setUcpsw(usermodel.getUcpsw());
			user.setUmob(usermodel.getUmob());
	
		
		
		userrepo.save(user);
		
		return user;
	}
	
	public long getUsers()
	{
		return userrepo.count();
	
	}
	
	public Users getByEmail(String uemail)
	{
		Users user = userrepo.findByUemail(uemail);
		return user;
	}
	
	public void logout(Users user) {
		
		Users us = userrepo.findByUemail(user.getUemail());
		us.setLoginStatus("Deactive");
		userrepo.save(us);
		
	}
	
	public String resetPswd(ResetPswd resetpsw)
	{
		Users user = userrepo.findByUemail(resetpsw.getRemail());
		if(user!=null)
		{
			if(user.getUpsw().equals(resetpsw.getRoldpsw()))
			{
			  user.setUpsw(resetpsw.getRnewpsw());
			  user.setUcpsw(resetpsw.getRnewpsw());
			  userrepo.save(user);
			  return "Password Reset Successfully";
			}
			else
			  return "Enter Valid Old Password";
		}
		else
			return "Invalid Email ID";
	}

}
