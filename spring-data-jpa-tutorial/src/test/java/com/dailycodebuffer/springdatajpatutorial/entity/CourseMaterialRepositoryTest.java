package com.dailycodebuffer.springdatajpatutorial.entity;

import com.dailycodebuffer.springdatajpatutorial.repository.CourseMaterialRepository;
import com.dailycodebuffer.springdatajpatutorial.repository.CourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CourseMaterialRepositoryTest
{

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void saveCourseMaterial()
    {
        Course course = Course.builder()
                .courseTitle("Algorithm")
                .credits(5).build();
        CourseMaterial courseMaterial = CourseMaterial.builder().url("www.facebook.com")
                .course(course).build();

        courseMaterialRepository.save(courseMaterial);
    }

    @Test
    public void printAllCourseMaterials()
    {
         List<CourseMaterial> list = courseMaterialRepository.findAll();
        System.out.println(list);
    }

        @Autowired
        private CourseRepository courseRepo;

        @Test
        public void printCourse()
        {
            List<Course> list = courseRepo.findAll();
            System.out.println(list);

        }


    }


