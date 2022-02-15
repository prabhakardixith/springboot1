package com.mapping.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ExceptionClass extends Exception
{
    public ExceptionClass(String message) {
        super(message);
    }

    public ExceptionClass(String message, Throwable cause) {
        super(message, cause);
    }
}
