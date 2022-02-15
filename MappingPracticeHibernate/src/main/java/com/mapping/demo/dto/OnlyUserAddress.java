package com.mapping.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OnlyUserAddress
{

    private Integer aId;
    private String street;
    private String fullAddress;
    private Integer userId;

}
