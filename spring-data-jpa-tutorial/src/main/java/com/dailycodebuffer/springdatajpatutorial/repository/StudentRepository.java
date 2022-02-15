package com.dailycodebuffer.springdatajpatutorial.repository;

import com.dailycodebuffer.springdatajpatutorial.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>
{
    public List<Student> findByLastName(String lastName);
    public List<Student> findByFirstNameContaining(String name);
    public List<Student> findByLastNameNotNull();
    public List<Student> findByGuardianName(String name);

    public List<Student> findByFirstNameAndLastNameContaining(String firstName,String lastName);

    //query annotation using Jpql
    @Query("select s.firstName from Student s where s.emailId = ?1")
    String getStudentByEmailAddress(String emailId);

    //native query
    @Query(
            value="select * from tbl_student s where s.email_address=?1",nativeQuery = true
    )
    Student getStudentByEmailByNativeQuery (String id);

    //native named param
    @Query(
            value="select * from tbl_student s where s.email_address=:email",nativeQuery = true
    )
    Student getStudentByEmailByNativeQueryParam(@Param("email") String id);


    @Modifying
    @Transactional
    @Query(
            value="update tbl_student set first_name =:fname where email_address = :email",nativeQuery = true)
    int updateStudentNameByEmailId(@Param("fname") String firstName,@Param("email") String emailId);
}
