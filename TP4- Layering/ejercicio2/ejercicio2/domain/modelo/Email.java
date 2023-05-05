package ejercicio2.domain.modelo;

import java.util.Objects;

import ejercicio2.domain.portsin.ExcepcionesPortsin;

public class Email {

	private String mail;

	public Email(String mail) {
		Objects.requireNonNull(mail);

		if (mail.isEmpty())
			throw new ExcepcionesPortsin("el campo mail esta vacio");

		if (!mailValido(mail))
			throw new ExcepcionesPortsin("el mail que ingreso no es valido");

		this.mail = mail;
	}

	public String email() {
		return this.mail;
	}

	private boolean mailValido(String mail) {
		String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		return mail.matches(regex);
	}

}
