package com.springOnetoMany.springbootonetomany.repo;

import com.springOnetoMany.springbootonetomany.entity.Complaint;
import com.springOnetoMany.springbootonetomany.onetomanyentity.ComplaintOneToMany;
import com.springOnetoMany.springbootonetomany.onetomanyentity.UserOneToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserOneToManyRepositoryRepo extends JpaRepository<UserOneToMany, Long> {
}
