package com.springbootwithallModules.demo.repo;

import com.springbootwithallModules.demo.enity.Complaint;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ComplaintRepositoryTest
{

    @Autowired
    private ComplaintRepository complaintRepository;

    @Test
    void getComplaintById()
    {
       List<Complaint> complaint =  complaintRepository.getComplaintByUserId(1);
        System.out.println(complaint);
    }

    @Test
    void addComplaint()
    {
        Complaint complaint = Complaint.builder().complaint_Type("Book")
                .complaint_Description("book packing was not good").build();
    }
}