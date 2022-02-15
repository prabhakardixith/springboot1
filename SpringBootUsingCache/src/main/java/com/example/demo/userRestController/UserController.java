package com.example.demo.userRestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@RestController
public class UserController
{
    Logger logger =
            LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @PostConstruct
    public void inits()
    {
        this.userService.init();
    }


    @GetMapping("/users")
    public List getAllUsers()
    {
        logger.info("in getAllUser() of RestController");
        return this.userService.getUserList();
    }

    @PostMapping("/users")
    public void addUsers(@RequestBody User user)
    {
        logger.info("in addUser() of RestController");
        this.userService.addUser(user);
    }

    @GetMapping("/test")
    public List test()
    {
        logger.info("in test() of RestController"+userService.list);
        return this.userService.list;
    }


    @PreDestroy
    public void destroy()
    {
        this.userService.destroy();
    }

}
