package com.example.Springboothibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.Springboothibernate.entity.User;

// for endpoints for rest request
//@RepositoryRestResource(path="members")
public interface UserRepository extends JpaRepository<User,String>
{

}
