package com.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Dependents {

	@Id
	private long id;
	private String name;
	private String birthday;
	
	@ManyToOne
	private Enrollees enrollees;

	public Dependents(long id, String name, String birthday, Enrollees enrollees) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.enrollees = enrollees;
	}

	public Dependents() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Enrollees getEnrollees() {
		return enrollees;
	}

	public void setEnrollees(Enrollees enrollees) {
		this.enrollees = enrollees;
	} 
	
	
}
