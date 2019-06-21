package com.jcba.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.jcba.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
