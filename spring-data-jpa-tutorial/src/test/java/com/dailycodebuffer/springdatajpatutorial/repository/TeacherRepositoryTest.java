package com.dailycodebuffer.springdatajpatutorial.repository;

import com.dailycodebuffer.springdatajpatutorial.entity.Course;
import com.dailycodebuffer.springdatajpatutorial.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    void saveTeacher()
    {
        Course course = Course.builder().courseTitle("Java")
                .credits(12).build();

        List<Course> list = new ArrayList();
        list.add(course);
        Teacher teacher = Teacher.builder().firstName("suhel")
                .lastName("sahu")
                .courses(list).build();

        teacherRepository.save(teacher);
    }
}