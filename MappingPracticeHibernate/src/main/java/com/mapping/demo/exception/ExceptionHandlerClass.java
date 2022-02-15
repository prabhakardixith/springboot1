package com.mapping.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDate;

@ControllerAdvice
public class ExceptionHandlerClass
{
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> handleAllExceptions(Exception e)
    {
        ExceptionDetails exceptionDetails = new ExceptionDetails("Not Found", e.getMessage(), HttpStatus.EXPECTATION_FAILED, LocalDate.now());

        return new ResponseEntity<>(exceptionDetails,HttpStatus.EXPECTATION_FAILED);
    }

    @ExceptionHandler(value = ExceptionClass.class)
    public ResponseEntity<Object> handleUserThrownExceptions(ExceptionClass e)
    {
        ExceptionDetails exceptionDetails = new ExceptionDetails("Not Found", e.getMessage(), HttpStatus.NO_CONTENT, LocalDate.now());

        return new ResponseEntity<>(exceptionDetails,HttpStatus.EXPECTATION_FAILED);
    }


}
