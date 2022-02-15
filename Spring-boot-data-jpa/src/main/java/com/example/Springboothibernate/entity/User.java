package com.example.Springboothibernate.entity;


import javax.persistence.*;



@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="fname")
	private String fName;
	@Column(name="lname")
	private String lName;
	

	public User() {

	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public User(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "User [fName=" + fName + ", lName=" + lName + "]";
	}

	

	

}
