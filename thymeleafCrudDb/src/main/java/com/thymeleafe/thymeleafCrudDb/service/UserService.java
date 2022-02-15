package com.thymeleafe.thymeleafCrudDb.service;

import java.util.List;

import com.thymeleafe.thymeleafCrudDb.entity.User;

public interface UserService 
{
	public List<User> listUser();
	public void deleteUser(String id);

}
