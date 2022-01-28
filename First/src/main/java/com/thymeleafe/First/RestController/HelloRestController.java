package com.thymeleafe.First.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloRestController {

	@GetMapping("/hello")
	public String hellos(Model model)
	{
		model.addAttribute("message","prabhakar");
		return "hello";
	}
}
