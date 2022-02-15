package com.springOnetoMany.springbootonetomany.repo;

import com.springOnetoMany.springbootonetomany.entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ComplainRepository extends JpaRepository<Complaint, Long> {
}
