package com.dailycodebuffer.springdatajpatutorial.repository;

import com.dailycodebuffer.springdatajpatutorial.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CourseRepositoryTest  {

    @Autowired
    private CourseRepository repository;
    @Test
    void printCourse()
    {
        List<Course> list = repository.findAll();
        System.out.println(list);
    }
}