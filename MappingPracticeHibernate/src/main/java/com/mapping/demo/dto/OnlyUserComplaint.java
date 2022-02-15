package com.mapping.demo.dto;

import com.mapping.demo.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OnlyUserComplaint
{
    private Integer cid;
    private String complaintType;
    private String complaintDescription;
    private Integer userId;

}
