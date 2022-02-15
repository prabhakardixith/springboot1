package com.exceptionsHandlings.springbootexception.rest;

import com.exceptionsHandlings.springbootexception.exceptio.ExceptionClass;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHandler
{

    @RequestMapping("/")
    public String hi()
    {
        String str = null;
        if(str == null)
        {
            throw new ExceptionClass("exception handled");
        }
       return "hi";
    }

}
