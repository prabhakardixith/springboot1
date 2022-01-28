package com.thymeleafe.Second.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController {

	@GetMapping("/hello")
	public String helloWorld(Model model)
	{
		model.addAttribute("m","prabhakar");
		return "hello";
	}
}
