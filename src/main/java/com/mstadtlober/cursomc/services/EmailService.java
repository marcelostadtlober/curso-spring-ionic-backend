package com.mstadtlober.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.mstadtlober.cursomc.domain.Cliente;
import com.mstadtlober.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

	void sendNewPasswordEmail(Cliente cliente, String newPass);

}
