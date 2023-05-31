package com.web.MoviesAdda.entity;





import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Theaters_table")
public class Theater {

	@Id
	private int thid;
	private String thname;
	private String thcity;
	private int thtype;
	private int thsc;
	private String thadd;
	private String thimg;
	
	@ManyToMany
	@JoinColumn(name="movid")
	private Set<Movies> thmovies = new HashSet<>();
	
	public Theater() {
		super();
	}
	public Theater(int thid, String thname, String thcity, int thtype, int thsc, String thadd, String thimg,Set<Movies>  thmovies) {
		super();
		this.thid = thid;
		this.thname = thname;
		this.thcity = thcity;
		this.thtype = thtype;
		this.thsc = thsc;
		this.thadd = thadd;
		this.thimg = thimg;
		this.thmovies = thmovies;
	}
	public int getThid() {
		return thid;
	}
	public void setThid(int thid) {
		this.thid = thid;
	}
	public String getThname() {
		return thname;
	}
	public void setThname(String thname) {
		this.thname = thname;
	}
	public String getThcity() {
		return thcity;
	}
	public void setThcity(String thcity) {
		this.thcity = thcity;
	}
	public int getThtype() {
		return thtype;
	}
	public void setThtype(int thtype) {
		this.thtype = thtype;
	}
	public int getThsc() {
		return thsc;
	}
	public void setThsc(int thsc) {
		this.thsc = thsc;
	}
	public String getThadd() {
		return thadd;
	}
	public void setThadd(String thadd) {
		this.thadd = thadd;
	}
	public String getThimg() {
		return thimg;
	}
	public void setThimg(String thimg) {
		this.thimg = thimg;
	}
	
	
	public Set<Movies> getThmovies() {
		return thmovies;
	}
	public void setThmovies(Set<Movies> movies) {
		this.thmovies = movies;
	}
	@Override
	public String toString() {
		return "Theater [thid=" + thid + ", thname=" + thname + ", thcity=" + thcity + ", thtype=" + thtype + ", thsc="
				+ thsc + ", thadd=" + thadd + ", thimg=" + thimg + ", thmovies=" + thmovies +"]";
	}
	
	
	
	
}
