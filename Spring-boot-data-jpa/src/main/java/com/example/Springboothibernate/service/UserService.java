package com.example.Springboothibernate.service;

import java.util.List;

import com.example.Springboothibernate.entity.User;

public interface UserService 
{
	public List<User> allUser();
	public User getUserById(String id);
	public String deleteUser(String id);
	public User userSave(User user);
	

}
