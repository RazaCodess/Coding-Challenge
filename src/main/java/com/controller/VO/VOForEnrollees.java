package com.controller.VO;

public class VOForEnrollees {

	private int id;
	private String name;
	private boolean status;
	private String birthday;
	public VOForEnrollees(int id, String name, boolean status, String birthday, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.birthday = birthday;
		this.phoneNumber = phoneNumber;
	}
	private String phoneNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public VOForEnrollees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
