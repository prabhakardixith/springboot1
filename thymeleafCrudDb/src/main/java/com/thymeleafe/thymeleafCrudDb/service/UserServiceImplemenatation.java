package com.thymeleafe.thymeleafCrudDb.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymeleafe.thymeleafCrudDb.entity.User;
import com.thymeleafe.thymeleafCrudDb.repository.UserRepository;


@Service
public class UserServiceImplemenatation implements UserService
{
	@Autowired
	UserRepository userRepository;

	@Override
	@Transactional
	public List<User> listUser() 
	{
		 List<User> list = userRepository.listUser();
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	@Transactional
	public void deleteUser(String id) 
	{
		userRepository.deleteUser(id);
		
		// TODO Auto-generated method stub
		
	}

}
