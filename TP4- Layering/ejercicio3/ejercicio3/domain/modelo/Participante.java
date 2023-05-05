package ejercicio3.domain.modelo;

import java.util.Objects;

import ejercicio3.domain.portsin.ExcepcionesPortsIn;

public class Participante {
	private String nombre;
	private String apellido;
	private String dni;
	private String email;
	private String telefono;

	public Participante(String nombre, String apellido, String dni, String email, String telefono) {
		super();
		Objects.requireNonNull(nombre);
		Objects.requireNonNull(apellido);
		Objects.requireNonNull(dni);

		if (nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty())
			;
		throw new ExcepcionesPortsIn("los campos no pueden estar vacio");

		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.email = email;
		this.telefono = telefono;
	}

}
