package be.vdab.mail;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class LidMailing {
    private final JavaMailSender sender;
    private final String userName;

    public LidMailing(JavaMailSender sender, @Value("${spring.mail.username}") String userName) {
        this.sender = sender;
        this.userName = userName;
    }

    public void stuurMailNaRegistratie(Lid lid) throws MessagingException {
        var message = sender.createMimeMessage();
        var helper = new MimeMessageHelper(message);
        helper.setFrom(userName);
        helper.setTo(lid.getEmailAdres());
        helper.setSubject("Geregistreerd");
        helper.setText("<h1>Je bent nu lid.</h1> Je nummer is:" + lid.getId(),true);
        sender.send(message);
    }
}
