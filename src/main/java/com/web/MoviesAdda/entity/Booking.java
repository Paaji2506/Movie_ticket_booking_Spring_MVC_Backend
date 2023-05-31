package com.web.MoviesAdda.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;


@Entity
@Table(name="Bookings_table")
public class Booking {
	
	@Id
	private int tcid;
	private String tcdate;
	private String tcshow;
	private double tcquan;
	private double tcprice;
	
	
	@ManyToOne
	@JoinColumn(name="uid")
	private Users users;


	public Booking() {
		super();
	}


	public Booking(int tcid, String tcdate, String tcshow, double tcquan, double tcprice) {
		super();
		this.tcid = tcid;
		this.tcdate = tcdate;
		this.tcshow = tcshow;
		this.tcquan = tcquan;
		this.tcprice = tcprice;
	}


	public int getTcid() {
		return tcid;
	}


	public void setTcid(int tcid) {
		this.tcid = tcid;
	}


	public String getTcdate() {
		return tcdate;
	}


	public void setTcdate(String tcdate) {
		this.tcdate = tcdate;
	}


	public String getTcshow() {
		return tcshow;
	}


	public void setTcshow(String tcshow) {
		this.tcshow = tcshow;
	}


	public double getTcquan() {
		return tcquan;
	}


	public void setTcquan(double tcquan) {
		this.tcquan = tcquan;
	}


	public double getTcprice() {
		return tcprice;
	}


	public void setTcprice(double tcprice) {
		this.tcprice = tcprice;
	}


	@Override
	public String toString() {
		return "Booking [tcid=" + tcid + ", tcdate=" + tcdate + ", tcshow=" + tcshow + ", tcquan=" + tcquan
				+ ", tcprice=" + tcprice + "]";
	}
	
 

}
