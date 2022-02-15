package com.thymeleafe.thymeleafCrudDb.repository;

import java.util.List;

import com.thymeleafe.thymeleafCrudDb.entity.User;

public interface UserRepository 
{
	public List<User> listUser();
	public void deleteUser(String id);

}
