package com.springOnetoMany.springbootonetomany.repo;

import com.springOnetoMany.springbootonetomany.entity.Complaint;
import com.springOnetoMany.springbootonetomany.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ComplainRepositoryTest {

    @Autowired
    private ComplainRepository complainRepository;
    @Test
    void addComplaint()
    {
        User user = User.builder()
                .firstName("prabhakar").lastName("dixith").build();

        Complaint complaint = Complaint.builder().complaintName("Fashion")
                .description("clothes size is not appropriate").user(user).build();

        complainRepository.save(complaint);
    }

    @Test
    void getComplaint()
    {

        Complaint complaint = complainRepository.findById(1L).get();
        System.out.println(complaint);
    }

}