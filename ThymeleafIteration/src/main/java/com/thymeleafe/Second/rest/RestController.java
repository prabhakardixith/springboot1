package com.thymeleafe.Second.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thymeleafe.Second.entity.Emp;

@Controller
public class RestController {
	List<Emp> list ;

	@GetMapping("/hello")
	public String helloWorld(Model model)
	{
		
		list = new ArrayList<Emp>();
		Emp emp1 = new Emp("prabhakar","dixith","user");
		Emp emp2 = new Emp("uday","garu","admin");
		Emp emp3 = new Emp("giri","garu","user");
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		model.addAttribute("emp",list);
		return "hello";
	}
}
