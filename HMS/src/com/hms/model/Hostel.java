package com.hms.model;



public class Hostel {
	private int id;
	private String name;
	private String room_num;
	private String category;
	private String status;
	private String type;

	public Hostel() {
	}

	public Hostel(String name, String room_num, String category, String status, String type) {

		super();
		this.name = name;
		this.room_num = room_num;
		this.category = category;
		this.status = status;
		this.type = type;

	}

	public Hostel(int id, String name, String room_num, String category, String status, String type) {
		this.id = id;
		this.name = name;
		this.room_num = room_num;
		this.category = category;
		this.status = status;
		this.type = type;
	}

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

	public String getRoom_num() {
		return room_num;
	}

	public void setRoom_num(String room_num) {
		this.room_num = room_num;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
