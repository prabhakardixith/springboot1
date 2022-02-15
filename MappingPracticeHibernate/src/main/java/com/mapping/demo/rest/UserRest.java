package com.mapping.demo.rest;

import com.mapping.demo.UserRepo.UserRepository;
import com.mapping.demo.dto.OnlyUserRecord;
import com.mapping.demo.entity.User;
import com.mapping.demo.exception.ExceptionClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserRest
{


    @Autowired
    private UserRepository userRepository;

    @GetMapping(value="users")
    @Cacheable("user")
    public List<User> getAllUser()
    {
        System.out.println("in getAllUser()");
        return userRepository.findAll();
    }

    @GetMapping("OnlyUsers")
    public List<OnlyUserRecord> getOnlyUserRecord()
    {
//        PageRequest pag = PageRequest.of(1,1);
        List<OnlyUserRecord> collect = userRepository.findAll().stream()
                .map(u -> new OnlyUserRecord(u.getId(), u.getName(), u.getEmail(), u.getMobile()))
                .collect(Collectors.toList());

        return collect;
    }

    @GetMapping("OnlyUsers/{id}")
    public OnlyUserRecord getOnlyUserRecordById(@PathVariable("id") Integer id)
    {
        OnlyUserRecord collect = userRepository.findById(id)
                .map(u -> new OnlyUserRecord(u.getId(), u.getName(), u.getEmail(), u.getMobile()))
                .orElseThrow(() -> new RuntimeException("Record Not Found"));
        return collect;
    }

    @PostMapping(value="users")
    @CacheEvict(value = "user",allEntries = true)
    public User addUser(@RequestBody User user)
    {
        return userRepository.save(user);
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable("id") Integer id) throws ExceptionClass {
        return userRepository.findById(id).orElseThrow(() ->  new ExceptionClass("user Not Found"));
    }
    @PutMapping(value="users")
    @CacheEvict(value = "user",allEntries = true)
    public User updateUser(@RequestBody User user)
    {
        return userRepository.saveAndFlush(user);
    }


    @DeleteMapping("users/{id}")
    @CacheEvict(value = "user",allEntries = true)
    public String deleteUserById(@PathVariable Integer id)
    {
        this.userRepository.deleteById(id);
        return "User deleted";
    }


}
