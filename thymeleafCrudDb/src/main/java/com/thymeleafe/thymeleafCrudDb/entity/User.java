package com.thymeleafe.thymeleafCrudDb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	public User() {
		super();
	}

	public User(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	@Id
	@Column(name="fname")
	private String fname;
	@Column(name="lname")
	private String lname;
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + "]";
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
}
