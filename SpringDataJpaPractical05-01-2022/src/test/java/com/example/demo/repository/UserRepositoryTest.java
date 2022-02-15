package com.example.demo.repository;

import com.example.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest
{
    @Autowired
    UserRepository userRepository;
    Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);

    @Test
    void getUserByMobileNumber()
    {
        logger.info("in getUserByMobileNumber()");
        User user = userRepository.findByMobileNumber(9986839524L);
        logger.info("user data from getUserByMobileNumber : "+user);
    }

    @Test
    void addUser() throws ParseException {
        User user = User.builder()
                .firstName("prabhakar").lastName("dixith").mobileNumber(123L).dateOfBirth(new SimpleDateFormat("dd/mm/yyyy").parse("17/01/1997")).build();
        logger.info("inserting into db : "+user);

        userRepository.save(user);


    }


    @Test
    void updateMobileNumberById()
    {
        logger.info("updateUserById()");

        this.userRepository.updateUserMobileNumberById(2,9986839524L);

        logger.info("after updating");
    }
}