package com.thymeleafe.Second.entity;

public class Emp {
private String fname;
private String lname;
private String role;
public Emp(String fname, String lname, String role) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.role = role;
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
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@Override
public String toString() {
	return "Emp [fname=" + fname + ", lname=" + lname + ", role=" + role + "]";
}

}
