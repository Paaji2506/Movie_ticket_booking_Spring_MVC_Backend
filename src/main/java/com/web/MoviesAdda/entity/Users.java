package com.web.MoviesAdda.entity;

import java.util.HashSet;


import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users_table")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String uname;
	private String uemail;
	private String upsw;
	private String ucpsw;
	private long umob;
	private String loginStatus;
	private boolean isAdmin;
	

	
	@OneToMany(mappedBy="users")
	private Set<Booking> bookset = new HashSet<>();

	public Users() {
		super();
	}
	public Users(int uid, String uname, String uemail, String upsw, String ucpsw, long umob,String loginStatus,boolean isAdmin , Set<Booking> bookset) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uemail = uemail;
		this.upsw = upsw;
		this.ucpsw = ucpsw;
		this.umob = umob;
		this.loginStatus= loginStatus;
		this.isAdmin = isAdmin;
		this.bookset= bookset;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpsw() {
		return upsw;
	}
	public void setUpsw(String upsw) {
		this.upsw = upsw;
	}
	public String getUcpsw() {
		return ucpsw;
	}
	public void setUcpsw(String ucpsw) {
		this.ucpsw = ucpsw;
	}
	public long getUmob() {
		return umob;
	}
	public void setUmob(long umob) {
		this.umob = umob;
	
	}
	
	
	public String getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
	public Set<Booking> getBookings() {
		return bookset;
	}
	public void setBookings(Set<Booking> bookset) {
		this.bookset = bookset;
	}
	@Override
	public String toString() {
		return "Users [uid=" + uid + ", uname=" + uname + ", uemail=" + uemail + ", upsw=" + upsw + ", ucpsw=" + ucpsw
				+ ", umob=" + umob + ", isAdmin=" + isAdmin + ", Bookset= "+ bookset +"]";
	}
}
