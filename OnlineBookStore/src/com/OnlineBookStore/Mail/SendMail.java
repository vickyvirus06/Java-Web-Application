package com.OnlineBookStore.Mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

	
	public static boolean sendMail(String toEmail,String amount,String user_message)
	{
		String username = "poojarivicky3@gmail.com";
		String password = "virus1995";
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host","smtp.gmail.com");
		properties.put("mail.smtp.port", "587");




		Session session_mail = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username,password);
			}
		});

		MimeMessage msg = new MimeMessage(session_mail);
		try {
			msg.setFrom(new InternetAddress(username));
			
				msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
				msg.setSubject("Vicky Book Centre");
				msg.setText(user_message);
			Transport.send(msg);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} 	
		return false;
	}
	
}

