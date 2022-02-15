package com.exceptionsHandlings.springbootexception.exceptio;

public class ExceptionClass extends RuntimeException
{
    public ExceptionClass(String message) {
        super(message);
    }

    public ExceptionClass(String message, Throwable cause) {
        super(message, cause);
    }
}
