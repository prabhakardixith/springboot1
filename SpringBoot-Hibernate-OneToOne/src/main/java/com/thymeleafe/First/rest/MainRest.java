package com.thymeleafe.First.rest;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thymeleafe.First.map.Answer;
import com.thymeleafe.First.map.Question;


@RestController
public class MainRest 
{
	@Autowired
	EntityManager em;
	
	@GetMapping("/")
	@Transactional
	public Question get()
	{
		Session s = em.unwrap(Session.class);
		
//		Question que = new Question();
//		Answer ans = new Answer();
//		//answer
//		
//		ans.setAnswerId(2);
//		ans.setAnswer("uday");
//		
//		//question
//		que.setQuestionId(1);
//		que.setQuestion("what is your name");
//		que.setAnswer(ans);
//		
//		s.save(que);
//		s.save(ans);
		Question que = s.get(Question.class, 1);
		
		return que;
	}


}
