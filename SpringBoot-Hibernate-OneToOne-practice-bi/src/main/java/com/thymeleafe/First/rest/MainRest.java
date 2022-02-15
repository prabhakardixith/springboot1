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
	public Answer get()
	{
		Session s = em.unwrap(Session.class);
		
		Question que = new Question();
		Answer ans = new Answer();
		//answer
		
		ans.setAnswer("uday");
		
		//question
		que.setQuestion("what is your name");
		que.setAnswer(ans);

		s.save(ans);
		
		s.close();
		
		return ans;
	}
	
	@GetMapping("/{id}")
	@Transactional
	public Answer getById(@PathVariable int id)
	{
		Session s = em.unwrap(Session.class);
		
		Answer ans = s.get(Answer.class, id);
		
		s.close();
		
		return ans;
	}
	
	@GetMapping("/")
	@Transactional
	public List<Answer> getAll()
	{
		Session s = em.unwrap(Session.class);
		
		List<Answer> list = s.createQuery("from Question").getResultList();
		
		s.close();
		
		return list;
	}
	
	@PostMapping("/")
	@PutMapping("/update")
	@Transactional
	public Answer add(@RequestBody Answer ans)
	{
		Session s = em.unwrap(Session.class);
		
		s.saveOrUpdate(ans);
		
		s.close();
		
		return ans;
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public Answer delete(@PathVariable int id)
	{
		Session s = em.unwrap(Session.class);
		
		Answer ans = s.get(Answer.class, id);
		
		s.delete(ans);
		
		s.close();
		
		return ans;
	}
	
	
	
	@PutMapping("/")
	@Transactional
	public Answer update(@RequestBody Answer que)
	{
		Session s = em.unwrap(Session.class);
		
		s.saveOrUpdate(que);
		
		s.close();
		
		return que;
	}



}
