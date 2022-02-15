package com.mapping.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OnlyUserRecord
{
    private Integer userid;
    private String name;
    private String email;
    private String mobile;
}
