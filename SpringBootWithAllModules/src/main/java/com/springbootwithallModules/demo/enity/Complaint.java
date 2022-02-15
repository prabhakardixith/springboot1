package com.springbootwithallModules.demo.enity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Complaint_Table")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Complaint
{
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Integer companyId;

    private String complaint_Type;

    private String complaint_Description;


}
