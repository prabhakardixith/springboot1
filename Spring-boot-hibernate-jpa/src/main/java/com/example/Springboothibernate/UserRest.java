package com.example.Springboothibernate;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.bytebuddy.asm.Advice.Local;

@RestController
public class UserRest 
{
	@Autowired
	EntityManager em;

	@GetMapping("/")
	public List h()
	{
		Session ses = em.unwrap(Session.class);
		
		List<User> list = ses.createQuery("from User").getResultList();
	
		return list;
	}

}
