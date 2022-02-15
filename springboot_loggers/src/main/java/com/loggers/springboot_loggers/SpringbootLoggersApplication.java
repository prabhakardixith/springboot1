package com.loggers.springboot_loggers;

import com.loggers.springboot_loggers.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringbootLoggersApplication
{
	static Logger logger = LoggerFactory.getLogger(SpringbootLoggersApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLoggersApplication.class, args);
		displayLoggers(new User().builder().firstName("prabhakar").lastName("dixith").build());
	}

	public static void  displayLoggers(User user)
	{
		logger.info(user.toString());
		logger.info("first logger entered method");
		logger.info("/Users/prabhakardixit/Desktop");
	}
}
