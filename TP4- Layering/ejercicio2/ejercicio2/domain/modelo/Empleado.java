package ejercicio2.domain.modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Empleado {
	private String nombre;
	private String apellido;
	private LocalDate fechaDeNacimiento;
	private Email email;

	public Empleado(String nombre, String apellido, LocalDate fechaDeNacimiento, Email email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.email = email;
	}

	public Email email() {
		return email;
	}

	public String nombre() {
		return nombre;
	}

	public String apellido() {
		return apellido;
	}

	public LocalDate fechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public boolean cumpleAniosHoy() {
		// new LocalDate();
		LocalDate hoy = LocalDate.now();
		if (this.fechaDeNacimiento == hoy) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, email, fechaDeNacimiento, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(email, other.email)
				&& Objects.equals(fechaDeNacimiento, other.fechaDeNacimiento) && Objects.equals(nombre, other.nombre);
	}

}
