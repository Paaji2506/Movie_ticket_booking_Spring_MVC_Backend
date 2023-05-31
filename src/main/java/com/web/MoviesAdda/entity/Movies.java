package com.web.MoviesAdda.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Movies_table")
public class Movies {

	@Id
	private int movid;
	private String movname;
	private String movcity;
	private String movimg;
	private String movcast;
	private String movdir;
	private String movdes;
	
	@JsonIgnore
	@ManyToMany(mappedBy="thmovies")
	private Set<Theater> thset = new HashSet<>();
	
	public Movies() {
		super();
	}
	public Movies(int movid, String movname, String movcity, String movimg, String movcast,
			String movdir, String movdes) {
		super();
		this.movid = movid;
		this.movname = movname;
		this.movcity = movcity;
		this.movimg = movimg;
		this.movcast = movcast;
		this.movdir = movdir;
		this.movdes = movdes;
	}
	public int getMovid() {
		return movid;
	}
	public void setMovid(int movid) {
		this.movid = movid;
	}
	public String getMovname() {
		return movname;
	}
	public void setMovname(String movname) {
		this.movname = movname;
	}
	public String getMovcity() {
		return movcity;
	}
	public void setMovcity(String movcity) {
		this.movcity = movcity;
	}
	public String getMovimg() {
		return movimg;
	}
	public void setMovimg(String movimg) {
		this.movimg = movimg;
	}
	public String getMovcast() {
		return movcast;
	}
	public void setMovcast(String movcast) {
		this.movcast = movcast;
	}
	public String getMovdir() {
		return movdir;
	}
	public void setMovdir(String movdir) {
		this.movdir = movdir;
	}
	public String getMovdes() {
		return movdes;
	}
	public void setMovdes(String movdes) {
		this.movdes = movdes;
	}
	@Override
	public String toString() {
		return "Movies [movid=" + movid + ", movname=" + movname + ", movcity=" + movcity + ", movimg=" + movimg
				 + ", movcast=" + movcast + ", movdir=" + movdir + ", movdes=" + movdes + "]";
	}
	
	
	
	
	
}
