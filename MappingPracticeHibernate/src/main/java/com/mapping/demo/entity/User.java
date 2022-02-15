package com.mapping.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="UserOneToOne")
@Builder
public class User
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String mobile;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="address_id",referencedColumnName = "aId")
    private Address address;

//    @OneToMany(mappedBy="user",cascade = CascadeType.ALL)
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "userId",referencedColumnName = "id")
    private List<Complaint> complaint;
}
