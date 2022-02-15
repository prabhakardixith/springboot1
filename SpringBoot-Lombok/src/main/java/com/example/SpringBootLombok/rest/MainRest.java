package com.example.SpringBootLombok.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootLombok.entity.User;
import com.example.SpringBootLombok.entity.User2;
import com.example.SpringBootLombok.entity.User3;

@RestController
public class MainRest 
{
	
	@GetMapping("/")
	public User getAll()
	{
		User user1 = new User();
		User2 user2= new User2();
		
	
		user1.setFname("prabhakar");
		user1.setLname("dixith");
		
		user2.setFname("prabhakar");
		user2.setLname("dixith");
		
		System.out.println(user1.equals(user2));
		return user1;
	
	}

}
