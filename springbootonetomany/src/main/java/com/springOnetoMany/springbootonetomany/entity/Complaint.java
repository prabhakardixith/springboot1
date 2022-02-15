package com.springOnetoMany.springbootonetomany.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Complaint
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    private String complaintName;

    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_Id",referencedColumnName="userId")
    private User user;

}
