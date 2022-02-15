package com.example.SpringBootEmailClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringBootEmailClientApplication 
{
	@Autowired
	EmailSenderService ess;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailClientApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail()
	{
		ess.sendSimpleEmail("prabhakar.dixith96@gmail.com", "Java Email Sender", "Java Email Subject");
	}

}
