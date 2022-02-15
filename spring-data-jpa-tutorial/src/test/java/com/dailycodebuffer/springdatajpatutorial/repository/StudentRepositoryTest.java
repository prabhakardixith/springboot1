package com.dailycodebuffer.springdatajpatutorial.repository;

import com.dailycodebuffer.springdatajpatutorial.entity.Guardian;
import com.dailycodebuffer.springdatajpatutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
    Logger logger = LoggerFactory.getLogger(StudentRepositoryTest.class);

    @Autowired
private StudentRepository studentRepository;
    
    @Test
    public void saveStudent()
    {
        Student student  = Student.builder()
                .firstName("prabhakar")
                .lastName("dixit")
                .emailId("pd@gmail.com")
                //.guardianName("anushka")
                //.guardianMobile("9986839524")
                //.guardianEmail("d@gmail.com")

                .build();

        studentRepository.save(student);


    }

    @Test
    public void saveStudentWithGuardian()
    {
        Guardian guardian = Guardian.builder()
                .name("amma")
                .email("amma@gmail.com")
                .mobile("12312312").build();
        Student student = Student.builder()
                .firstName("p")
                .lastName("d")
                .emailId("p@gmail.com")
                .guardian(guardian ).build();

        studentRepository.save(student);
    }


    @Test
    public void getAllStudent()
    {
        List<Student> studentList = studentRepository.findAll();
        System.out.println(studentList);
    }

    @Test
    public void printStudentByLastName()
    {
        List<Student> list = studentRepository.findByLastName("d");
        System.out.println(list);
    }


    @Test
    public void printStudentByFirstNameContaining()
    {
        List<Student> list = studentRepository.findByFirstNameContaining("p");
        System.out.println(list);
    }

    @Test
    public void printStudentBasedOnGuardianName()
    {
        List<Student> list = studentRepository.findByGuardianName("amma");
        System.out.println(list);
    }

    @Test
    public void printByFirstAndLastName()
    {
        List<Student> list = studentRepository.findByFirstNameAndLastNameContaining("p","d");
        System.out.println(list);
    }


    @Test
    public void getStudentByEmailId()
    {        String list = studentRepository.getStudentByEmailAddress("pd@gmail.com");
        System.out.println(list);
    }

    @Test
    public void getStudentByEmailIdNativeQuery()
    {        Student list = studentRepository.getStudentByEmailByNativeQuery("pd@gmail.com");
        System.out.println(list);
    }

    @Test
    public void getStudentByEmailIdNativeQueryParam()
    {        Student list = studentRepository.getStudentByEmailByNativeQueryParam("pd@gmail.com");
        System.out.println(list);
    }


    @Test
    public void updateStudentNameByEmailId()
    {        Integer result = studentRepository.updateStudentNameByEmailId("prabhakar","p@gmail.com");
        logger.info("information update : "+result);

    }








}