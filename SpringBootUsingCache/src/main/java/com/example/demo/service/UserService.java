package com.example.demo.service;

import com.example.demo.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService
{
    Logger logger = LoggerFactory.getLogger(UserService.class);

   public List<User> list = new ArrayList();
    public void init()
    {
        logger.info("in init() of UserService");
        list.add(new User(1,"prabhakar","dixith"));
        list.add(new User(2,"uday","garu"));
        list.add(new User(3,"girish","garu"));
    }

    @Cacheable("users")
    public List<User> getUserList()
    {
        logger.info("in getUserList() of userService");
        logger.info(" list of values : "+list);
        return new ArrayList(list);
    }

    @CacheEvict(value="users",allEntries = true)
    public void addUser(User user)
    {
        list.add(user);
        logger.info("record added to list"+user);
    }

    public void destroy()
    {
        logger.info("in destroy() of userService");
        list.clear();
    }


}
