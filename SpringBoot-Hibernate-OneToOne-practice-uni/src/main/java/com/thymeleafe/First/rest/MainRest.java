package com.thymeleafe.First.rest;



import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thymeleafe.First.entity.Answer;
import com.thymeleafe.First.entity.Question;


@RestController
public class MainRest 
{
	@Autowired
	EntityManager em;
	
	@PostConstruct
	@Transactional
	public Question get()
	{
		Session s = em.unwrap(Session.class);
		
		Question que = new Question();
		Answer ans = new Answer();
		//answer
		
		ans.setAnswer("uday");
		
		//question
		que.setQuestion("what is your name");
		que.setAnswer(ans);

		s.save(que);
		
		s.close();
		
		return que;
	}
	
	@GetMapping("/{id}")
	@Transactional
	public Question getById(@PathVariable int id)
	{
		Session s = em.unwrap(Session.class);
		
		Question que = s.get(Question.class, id);
		
		s.close();
		
		return que;
	}
	
	@GetMapping("/")
	@Transactional
	public List getAll()
	{
		Session s = em.unwrap(Session.class);
		
		List<Question> list = s.createQuery("from Question").getResultList();
		
		s.close();
		
		return list;
	}
	
	@PostMapping("/")
	@PutMapping("/update")
	@Transactional
	public Question add(@RequestBody Question que)
	{
		Session s = em.unwrap(Session.class);
		
		s.saveOrUpdate(que);
		
		s.close();
		
		return que;
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public Question delete(@PathVariable int id)
	{
		Session s = em.unwrap(Session.class);
		
		Question q = s.get(Question.class, id);
		
		s.delete(q);
		
		s.close();
		
		return q;
	}
	
	
	
	@PutMapping("/")
	@Transactional
	public Question update(@RequestBody Question que)
	{
		Session s = em.unwrap(Session.class);
		
		s.saveOrUpdate(que);
		
		s.close();
		
		return que;
	}



}
