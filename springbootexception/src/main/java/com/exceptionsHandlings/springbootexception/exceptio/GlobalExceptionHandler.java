package com.exceptionsHandlings.springbootexception.exceptio;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(value={ExceptionClass.class})
    public ResponseEntity<Object> responseEntities(ExceptionClass e)
    {
        ErrorDetails er = new ErrorDetails();
        er.setMessage(e.getMessage());
        er.setTimestamp(new Date());
        er.setDetail("Resource Not Found");
        return new ResponseEntity<>(er, HttpStatus.BAD_REQUEST);
    }


}
