package com.thymeleafe.thymeleafCrudDb.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thymeleafe.thymeleafCrudDb.entity.User;


@Repository
public class userRepositoryImplementation implements UserRepository {
	@Autowired
	EntityManager entityManager;

	@Override
	public List<User> listUser() 
	{
		Session session = entityManager.unwrap(Session.class);
		
		List<User> list = session.createQuery("from User").getResultList();
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public void deleteUser(String id) 
	{
		Session session = entityManager.unwrap(Session.class);
		
		User u = session.get(User.class,id);
		if(u != null)
		{
			session.delete(u);
		}
		System.out.println("user not found");
		// TODO Auto-generated method stub
		
	}

}
