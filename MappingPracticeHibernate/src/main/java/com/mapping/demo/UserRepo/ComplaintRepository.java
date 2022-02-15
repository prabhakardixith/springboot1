package com.mapping.demo.UserRepo;

import com.mapping.demo.entity.Complaint;
import com.mapping.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint,Integer>
{
    @Modifying
    @Query(nativeQuery = true,value = "select * from complaint_onetomany c where user_id = :userId")
    List<Complaint> getAllComplaintByUserId(@Param("userId") Integer userId);

    @Modifying
    @Transactional
    @Query(nativeQuery = true,
            value="insert into complaint_onetomany " +
                    "values(:cid,:cDesc,:cType,:uid)")
    void AddComplaintByUserId(@Param("cid") Integer cid,@Param("cDesc") String cDesc,@Param("cType") String cType,@Param("uid") Integer uid);
}
