package com.hibernate.first.rest;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.first.map.Answer;
import com.hibernate.first.map.Question;


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
		
		Question que = new Question();
		Answer ans = new Answer();
		Answer ans1 = new Answer();
		Answer ans2 = new Answer();
		//answer
		
		ans.setAnswerId(1);
		ans.setAnswer("uday");
		
		ans1.setAnswerId(2);
		ans1.setAnswer("giri");
		
		ans2.setAnswerId(3);
		ans2.setAnswer("suhel");
		
		//question
		que.setQuestionId(1);
		que.setQuestion("what is your name");
		
	    List<Answer> list = new LinkedList<Answer>();
	    list.add(ans);
	    list.add(ans1);
	    list.add(ans2);
	    que.setAnswers(list);
	    
		s.save(que);
		return que;
	}


}
