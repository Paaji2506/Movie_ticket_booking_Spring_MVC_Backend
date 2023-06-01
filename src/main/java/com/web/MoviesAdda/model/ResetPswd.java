package com.web.MoviesAdda.model;


public class ResetPswd {
	
	private String remail;
	private String roldpsw;
	private String rnewpsw;
	public ResetPswd() {
		super();
	}
	public ResetPswd(String remail, String roldpsw, String rnewpsw) {
		super();
		this.remail = remail;
		this.roldpsw = roldpsw;
		this.rnewpsw = rnewpsw;
	}
	public String getRemail() {
		return remail;
	}
	public void setRemail(String remail) {
		this.remail = remail;
	}
	public String getRoldpsw() {
		return roldpsw;
	}
	public void setRoldpsw(String roldpsw) {
		this.roldpsw = roldpsw;
	}
	public String getRnewpsw() {
		return rnewpsw;
	}
	public void setRnewpsw(String rnewpsw) {
		this.rnewpsw = rnewpsw;
	}
	@Override
	public String toString() {
		return "ResetPswd [remail=" + remail + ", roldpsw=" + roldpsw + ", rnewpsw=" + rnewpsw + "]";
	}
	
	

}
