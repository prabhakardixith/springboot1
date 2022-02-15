package com.beanvalidation.demo.repository;

import com.beanvalidation.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>
{

}
