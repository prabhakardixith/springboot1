package com.springbootwithallModules.demo.repo;

import com.springbootwithallModules.demo.enity.Complaint;
import com.springbootwithallModules.demo.enity.User;
import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest
{
    @Autowired
    private UserRepository userRepository;
    private Pageable pageable2;

    @Test
    void addUserAndComplaint()
    {
        Complaint complaint1 = Complaint.builder()
                .complaint_Type("Clothes")
                .complaint_Description("size of cloth is appropriate").build();

        Complaint complaint2 = Complaint.builder()
                .complaint_Type("electronic")
                .complaint_Description("Laptop is working").build();

        User user= User.builder()
                .firstName("prabhakar").lastName("dixith")
                .complaint(List.of(complaint1,complaint2))
                .build();

        userRepository.save(user);
    }
    @Test
    void addUser()
    {
        User user  = User.builder().firstName("uday").lastName("garu").build();
        userRepository.save(user);
    }

    @Test
    void getUser()
    {
        User user = userRepository.findById(1).get();
        System.out.println(user);
    }

    @Test
    void findAllPagination()
    {
        Pageable pageable1
                = PageRequest.of(0,2);

//        Pageable pageable2
//                = PageRequest.of(1,2);

        java.util.List<User> list
                = userRepository.findAll(pageable1).getContent();

        System.out.println(list);

    }

    @Test
    void findAllPaginationSort()
    {
        Pageable pageable1
                = PageRequest.of(0,2, Sort.by("lastName").descending());

        java.util.List<User> list
                = userRepository.findAll(pageable1).getContent();

        System.out.println(list);

    }
}