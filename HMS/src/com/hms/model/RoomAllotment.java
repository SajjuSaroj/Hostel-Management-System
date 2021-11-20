package com.hms.model;

public class RoomAllotment {
	
	private int id;
	private String cid;
	private String eno;
	private String sname;
	private String courses;
	private String year;
	
	
	private String hostel_type;
	private String hostel;
	private String roomno;
	private String category;

public RoomAllotment()
{}

public RoomAllotment(int id,String cid, String eno,String sname,String courses, String year,String hostel_type,
		String hostel,String roomno,String category) {
	
	super();
	this.id = id;
	this.cid = cid;
	this.eno = eno;
	this.sname = sname;
	this.courses = courses;
	this.year = year;
	this.hostel_type = hostel_type;
	this.hostel = hostel;
	this.roomno = roomno;
	this.category = category;
		
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCid() {
	return cid;
}

public void setCid(String cid) {
	this.cid = cid;
}

public String getEno() {
	return eno;
}

public void setEno(String eno) {
	this.eno = eno;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public String getCourses() {
	return courses;
}

public void setCourses(String courses) {
	this.courses = courses;
}

public String getYear() {
	return year;
}

public void setYear(String year) {
	this.year = year;
}

public String getHostel_type() {
	return hostel_type;
}

public void setHostel_type(String hostel_type) {
	this.hostel_type = hostel_type;
}

public String getHostel() {
	return hostel;
}

public void setHostel(String hostel) {
	this.hostel = hostel;
}

public String getRoomno() {
	return roomno;
}

public void setRoomno(String roomno) {
	this.roomno = roomno;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

@Override
public String toString() {
	return "RoomAllotment [id=" + id + ", cid=" + cid + ", eno=" + eno + ", sname=" + sname + ", courses=" + courses
			+ ", year=" + year + ", hostel_type=" + hostel_type + ", hostel=" + hostel + ", roomno=" + roomno
			+ ", category=" + category + "]";
}


}
