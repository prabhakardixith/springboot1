package com.springbootwithallModules.demo.restController;

import com.springbootwithallModules.demo.enity.User;
import com.springbootwithallModules.demo.exception.UserException;
import com.springbootwithallModules.demo.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{

    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public User addUser(@PathVariable("id") Integer id){
        return this.userService.getUserById(id);
    }
}
