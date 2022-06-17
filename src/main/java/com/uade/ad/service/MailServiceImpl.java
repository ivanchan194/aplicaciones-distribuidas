package com.uade.ad.service;

import com.uade.ad.exception.InternalServerErrorException;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {
    private final JavaMailSender javaMailSender;

    public MailServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendEmail(String destination, int token) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();

            message.setFrom("apiuade1@gmail.com");
            message.setTo(destination);
            message.setSubject("Cambio de contraseña para Cocinapp");
            message.setText("Hola, \n to código para el cambio de contraseña es: \n" + token);

            javaMailSender.send(message);
        } catch (MailException e) {
            throw new InternalServerErrorException();
        }
    }
}
