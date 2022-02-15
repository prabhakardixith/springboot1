package com.springbootwithallModules.demo.repo;

import com.springbootwithallModules.demo.enity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ComplaintRepository extends JpaRepository<Complaint,Integer>
{
    @Query(value="select * from complaint_table c where c.user_id = ?1",nativeQuery = true)
    List<Complaint> getComplaintByUserId(Integer id);
}
