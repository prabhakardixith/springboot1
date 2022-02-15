package com.springbootwithallModules.demo.enity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User_Table")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String firstName;
    private String lastName;

    @OneToMany(cascade= CascadeType.ALL,fetch = FetchType.EAGER)
            @JoinColumn(name="userId"
            ,referencedColumnName = "userId")
    List<Complaint> complaint;

}
