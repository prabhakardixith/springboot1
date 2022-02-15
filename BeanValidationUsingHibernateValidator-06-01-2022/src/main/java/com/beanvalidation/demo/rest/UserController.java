package com.beanvalidation.demo.rest;

import com.beanvalidation.demo.entity.User;
import com.beanvalidation.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Component
public class UserController
{
    @Autowired
    UserRepository userRepository;

    @PostMapping("user")
    public User addUser(@Valid @RequestBody User user)
    {
        return this.userRepository.save(user);

    }
}
