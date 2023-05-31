package com.web.MoviesAdda.model;


public class UserModel {

	
	private String uname;
	private String uemail;
	private String upsw;
	private String ucpsw;
	private long umob;
	public UserModel() {
		super();
	}
	public UserModel(String uname, String uemail, String upsw, String ucpsw, long umob) {
		super();
		this.uname = uname;
		this.uemail = uemail;
		this.upsw = upsw;
		this.ucpsw = ucpsw;
		this.umob = umob;
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
	@Override
	public String toString() {
		return "UserModel [uname=" + uname + ", uemail=" + uemail + ", upsw=" + upsw + ", ucpsw=" + ucpsw + ", umob="
				+ umob + "]";
	}
	
	
	
	
	
}
