package ejercicio2.infrastucture.mail;

import java.net.PasswordAuthentication;
import java.util.Properties;

import ejercicio2.domain.modelo.Email;
import ejercicio2.domain.portsout.EnviarFelizCumpleanios;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class ViaMailEnviarFelizCumpleanios implements EnviarFelizCumpleanios {

	@Override
	public void enviarFelizCumpleanios(Email email) {

		String to = email.email();

		String from = "jakartafrom@example.com";

		final String username = "e1aa2e5afc42df";

		final String password = "b8bc167ddcc249";

		String host = "smtp.mailtrap.io";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		try {

			Message message = new MimeMessage(session);

			message.setFrom(new InternetAddress(from));

			message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("ticket");
			message.setText("FELIZ CUMPLEANIOS ");
			Transport.send(message);
			System.out.println("Email Message Sent Successfully");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}

}
