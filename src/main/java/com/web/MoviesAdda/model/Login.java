package com.web.MoviesAdda.model;

public class Login {

	private String logemail;
	private String logpsw;
	public Login() {
		super();
	}
	public Login(String logemail, String logpsw) {
		super();
		this.logemail = logemail;
		this.logpsw = logpsw;
	}
	public String getUemail() {
		return logemail;
	}
	public void setUemail(String logemail) {
		this.logemail = logemail;
	}
	public String getUpsw() {
		return logpsw;
	}
	public void setUpsw(String logpsw) {
		this.logpsw = logpsw;
	}
	@Override
	public String toString() {
		return "Login [uemail=" + logemail + ", upsw=" + logpsw + "]";
	}
	
	
}
