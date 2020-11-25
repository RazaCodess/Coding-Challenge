package com.controller.VO;

public class VOForDependents {

	
	private int id;
	private String name;
	private String birthday;
	
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
	public String getBirthday() {
		return birthday;
	}
	public VOForDependents() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public VOForDependents(int id, String name, String birthday) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}
	
	
	
}
