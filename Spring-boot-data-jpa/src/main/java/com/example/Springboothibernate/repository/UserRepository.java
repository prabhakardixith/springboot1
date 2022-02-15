package com.example.Springboothibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Springboothibernate.entity.User;

public interface UserRepository extends JpaRepository<User, String> 
{

}
