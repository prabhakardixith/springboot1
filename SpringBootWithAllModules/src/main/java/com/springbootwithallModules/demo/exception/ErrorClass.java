package com.springbootwithallModules.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorClass
{
    private Date timeStamp;
    private String message;
    private String detail;
}
