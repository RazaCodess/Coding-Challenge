package com.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_for_enrollees")
public class Enrollees {

	@Id
	private int id;
	private String name;
	private boolean status;
	private String birthday;
	private String phoneNumber;
	
	@OneToMany
	private List<Dependents> dependents;

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

	public List<Dependents> getDependents() {
		return dependents;
	}

	public void setDependents(List<Dependents> dependents) {
		this.dependents = dependents;
	}

	public Enrollees(int id, String name, boolean status, String birthday, String phoneNumber,
			List<Dependents> dependents) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.birthday = birthday;
		this.phoneNumber = phoneNumber;
		this.dependents = dependents;
	}

	public Enrollees() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
