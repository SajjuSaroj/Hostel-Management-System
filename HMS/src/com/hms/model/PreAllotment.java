package com.hms.model;

public class PreAllotment {
	private int cid;
	private String enroll;
	private String sname;
	private String course;
	private String year;
	private String email;
	private String receipt;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getEnroll() {
		return enroll;
	}
	public void setEnroll(String enroll) {
		this.enroll = enroll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReceipt() {
		return receipt;
	}
	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}
	@Override
	public String toString() {
		return "PreAllotment [cid=" + cid + ", enroll=" + enroll + ", sname=" + sname + ", course=" + course + ", year="
				+ year + ", email=" + email + ", receipt=" + receipt + ", getCid()=" + getCid() + ", getEnroll()="
				+ getEnroll() + ", getSname()=" + getSname() + ", getCourse()=" + getCourse() + ", getYear()="
				+ getYear() + ", getEmail()=" + getEmail() + ", getReceipt()=" + getReceipt() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
