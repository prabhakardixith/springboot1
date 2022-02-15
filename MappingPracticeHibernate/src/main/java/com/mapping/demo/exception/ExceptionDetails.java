package com.mapping.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionDetails
{
    private String name;
    private String msg;
    private HttpStatus status;
    private LocalDate time;
}
