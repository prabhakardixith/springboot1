package com.example.Springboothibernate.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Springboothibernate.entity.User;
import com.example.Springboothibernate.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService 
{

	@Autowired
	UserRepository userRepo;

	@Override
	@Transactional
	public List<User> allUser() {

		return userRepo.findAll();
	}

	@Override
	@Transactional
	public User getUserById(String id) 
	{
		// TODO Auto-generated method stub
		User user = null;
		Optional<User> res= userRepo.findById(id);
		
		if(res.isPresent())
		{
			user = res.get();
		}
		
		return user;
	}

	@Override
	@Transactional
	public String deleteUser(String id) {
		// TODO Auto-generated method stub
		if (id != null) {
			
			userRepo.deleteById(id);
			
			return "deleted";
		}
		return "id not found";

	}


	@Override
	@Transactional
	public User userSave(User user) {
		// TODO Auto-generated method stub
	
		if(user != null)
		{
			return userRepo.saveAndFlush(user);
			
		}
		return user;
	}


}
