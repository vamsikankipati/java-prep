package com.org.email;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class AutoBatchEmail {

    // Modify recipient email here
    private final String[] to = { "vamsibh1@gmail.com" };

    // Enter email to be logged in
    private final String from = "from@email.com";
    private final String passwd = "donotharassme";
    String body = "Message comes here";
    private final int numberOfEmails = 2;

    public void triggerEmail() {
        System.out.println("Email batch has started...");

        for (int i = 0; i < numberOfEmails; i++) {
            sendEmail(from, passwd, to, i, body);
            System.out.println("Sending Email " + i);
        }
    }

    private static void sendEmail(String from, String pass, String[] to, int subjectNo, String body) {
        String subject = "Hello " + subjectNo;
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for (InternetAddress address : toAddress) {
                message.addRecipient(Message.RecipientType.TO, address);
            }

            message.setSubject(subject);
            message.setText(body);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
    }
}
