package com.loggers.springboot_loggers.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class apiExceptionHandler
{
    @ExceptionHandler(value={ApiRequestException.class})
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e)
    {
        apiException apiException = new apiException(e.getMessage(),e, HttpStatus.BAD_REQUEST, ZonedDateTime.now(ZoneId.of("Z")));
return new ResponseEntity<>(apiException,HttpStatus.BAD_REQUEST);
    }
}
