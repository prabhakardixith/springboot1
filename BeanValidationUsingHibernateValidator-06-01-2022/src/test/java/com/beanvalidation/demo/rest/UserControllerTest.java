package com.beanvalidation.demo.rest;

import com.beanvalidation.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserControllerTest
{

    @Autowired
    UserController userController;

    Logger logger = LoggerFactory.getLogger(UserControllerTest.class);
    @Test
    void addUser()
    {
        logger.info("addUser() of testUserController");

        User user = User.builder().firstName("pd").lastName("dixith").mobile(9986839524L).email("pd").build();
        logger.info("user record : "+user);
        this.userController.addUser(user);

    }
}