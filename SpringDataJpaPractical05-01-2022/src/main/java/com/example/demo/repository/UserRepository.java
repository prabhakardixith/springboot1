package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> 
{


    @Query(value = "select u from User u where mobileNumber = :id")
    User findByMobileNumber(@Param("id") Long id);

    @Modifying
    @Transactional
    @Query(value = "update User u set u.mobileNumber = :no where u.userId= :id")
    int updateUserMobileNumberById(@Param("id") Integer id,@Param("no") Long no);
}
