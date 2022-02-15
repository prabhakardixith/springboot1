package com.mapping.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Complaint_OneTOMany")
public class Complaint
{
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer cid;
    private String complaintType;
    private String complaintDescription;
    private String complaintStatus;
//    @ManyToOne
//    @JoinColumn(name = "userId",referencedColumnName = "id")
//    private User user;
}
