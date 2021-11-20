package com.hms.model;

public class ApplicationForm {

	private int id;
	private String name;
	private String gender;
	private String dob;
	private String email;
	private String course;
	private String year;
	private String category;
	private String address;
	private String smobile;
	private String cAddress;
	private String fname;
	private String fmobile;
	private String localGuardians;

	private String lgname;

	private String photo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSmobile() {
		return smobile;
	}

	public void setSmobile(String smobile) {
		this.smobile = smobile;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFmobile() {
		return fmobile;
	}

	public void setFmobile(String fmobile) {
		this.fmobile = fmobile;
	}

	public String getLocalGuardians() {
		return localGuardians;
	}

	public void setLocalGuardians(String localGuardians) {
		this.localGuardians = localGuardians;
	}

	public String getLgname() {
		return lgname;
	}

	public void setLgname(String lgname) {
		this.lgname = lgname;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "ApplicationForm [id=" + id + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", email="
				+ email + ", course=" + course + ", year=" + year + ", category=" + category + ", address=" + address
				+ ", smobile=" + smobile + ", cAddress=" + cAddress + ", fname=" + fname + ", fmobile=" + fmobile
				+ ", localGuardians=" + localGuardians + ", lgname=" + lgname + ", photo=" + photo + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getGender()=" + getGender() + ", getDob()=" + getDob()
				+ ", getEmail()=" + getEmail() + ", getCourse()=" + getCourse() + ", getYear()=" + getYear()
				+ ", getCategory()=" + getCategory() + ", getAddress()=" + getAddress() + ", getSmobile()="
				+ getSmobile() + ", getcAddress()=" + getcAddress() + ", getFname()=" + getFname() + ", getFmobile()="
				+ getFmobile() + ", getLocalGuardians()=" + getLocalGuardians() + ", getLgname()=" + getLgname()
				+ ", getPhoto()=" + getPhoto() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	

}
