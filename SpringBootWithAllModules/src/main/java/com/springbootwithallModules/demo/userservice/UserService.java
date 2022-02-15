package com.springbootwithallModules.demo.userservice;

import com.springbootwithallModules.demo.enity.User;
import com.springbootwithallModules.demo.exception.UserException;
import com.springbootwithallModules.demo.repo.UserRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    @SneakyThrows
    @Transactional
    public User getUserById(Integer id){
        return this.userRepository.findById(id).orElseThrow(()-> new UserException("User not exist"));
    }

    @Transactional
    @Cacheable
    public List<User> getAllUser()
    {
        return this.userRepository.findAll();
    }
}
