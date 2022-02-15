package com.thymeleafe.thymeleafCrudDb.restController;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thymeleafe.thymeleafCrudDb.entity.User;
import com.thymeleafe.thymeleafCrudDb.service.UserService;

@Controller
public class RestController 
{
	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	public String allList(Model model)
	{
		List<User> list = userService.listUser();
		model.addAttribute("userList",list);
//		return "list";
		Iterator<User> i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		return "UserList";
	}
	
	@DeleteMapping("/user")
	public String deleteUser(@RequestParam String id)
	{
		System.out.println(id);
		userService.deleteUser(id);
		return "UserList";
	}
	
	@PostMapping("/user")
	public String addUser(@RequestBody User user)
	{
		
		return "CreateUser";
	}

}
