package com.springbootwithallModules.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class ExceptionHandlingClass
{

    @ExceptionHandler(value = {UserException.class})
    public ResponseEntity<Object> handlingUserException(UserException e)
    {
        ErrorClass errorClass = ErrorClass.builder()
                .timeStamp(new Date())
                .message(e.getMessage())
                .detail("user not found").build();

        return new ResponseEntity(errorClass,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {RuntimeException.class})
    public ResponseEntity<Object> handleRunTimeException(RuntimeException r)
    {
        ErrorClass errorClass = ErrorClass.builder()
                .timeStamp(new Date())
                .message(r.getMessage())
                .detail("problem in code").build();
        return new ResponseEntity<>(errorClass,HttpStatus.BAD_REQUEST);
    }
}
