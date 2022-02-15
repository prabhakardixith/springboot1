package com.example.Springboothibernate.rest;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springboothibernate.entity.User;
import com.example.Springboothibernate.service.UserService;



@RestController
public class UserRest 
{
	@Autowired
	UserService userService;
	
	
	@GetMapping("/user")
	public List<User> allUser()
	{
//		System.out.println(userService);
		return userService.allUser();
	}
	
	@GetMapping("/user/{id}")
	public User getByIdUser(@PathVariable String id)
	{
//	System.out.println(id);
		return userService.getUserById(id);
	}
	
	@GetMapping("/user/{id}")
	public User getByIdUserLastNmae(@PathVariable String id)
	{
//	System.out.println(id);
		return userService.getUserById(id);
	}
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user)
	{
//		System.out.println(user);
	
		return userService.userSave(user);
	}
	
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable String id)
	{
//		System.out.println(id);
		return userService.deleteUser(id);
	}
	
	@PutMapping("/user")
	public User updateUser(@RequestBody User user)
	{
		
		return userService.userSave(user);
	}
	

}
