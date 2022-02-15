 package com.example.SpringBootEmailClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService 
{
	@Autowired
	private JavaMailSender jms;
	
	public void sendSimpleEmail(String toEmail,String body,String subject)
	{
		System.out.println(toEmail.endsWith("@gmail.com"));
		SimpleMailMessage mes = new SimpleMailMessage();
		
		mes.setFrom("abhik.patra2021@gmail.com");
		mes.setTo(toEmail);
		mes.setText(body);
		mes.setSubject(subject);
		
		jms.send(mes);
		System.out.println("mail sent");
	}

}
