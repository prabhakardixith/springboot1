package com.loggers.springboot_loggers.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;


import java.time.ZonedDateTime;

@Data
public class apiException {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
    private final ZonedDateTime timeStamp;

}
