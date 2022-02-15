package com.springOnetoMany.springbootonetomany.repo;

import com.springOnetoMany.springbootonetomany.onetomanyentity.ComplaintOneToMany;
import com.springOnetoMany.springbootonetomany.onetomanyentity.UserOneToMany;
import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComplainOneToManyRepositoryTest {

    @Autowired
    UserOneToManyRepositoryRepo userOneToManyRepository;
    @Test
    void name()
    {
        ComplaintOneToMany complaintOneToMany = ComplaintOneToMany.builder()
                .complaintName("book")
                .description("book is badly packed").build();

        ComplaintOneToMany complaintOneToMany1 = ComplaintOneToMany.builder()
                .complaintName("fashion")
                .description("cloth is badly made").build();
        UserOneToMany userOneToMany = UserOneToMany.builder()
                .firstName("prabhakar").lastName("inamdar")
                .complains(List.of(complaintOneToMany,complaintOneToMany1)).build();

        userOneToManyRepository.save(userOneToMany);
    }

    @Test
    public void getComplaints() {
        UserOneToMany userOneToMany = userOneToManyRepository.findById(1L).get();
        if (userOneToMany != null)
        {
            System.out.println(userOneToMany);
        }
        else {
            System.out.println("no value found");
        }

    }

}