package ejercicio1.domain.modelo;

import java.util.Objects;

import ejericicio1.domain.portin.ExcepcionesPortsIn;

class Participante {

	private String nombre;
	private Telefono telefono;
	private Region region;

// no abusar d elos primitivos teoria calistenia
	public Participante(String nombre, Telefono telefono, Region region) {
		super();
		Objects.requireNonNull(nombre);
		if (nombre.isEmpty())
			throw new ExcepcionesPortsIn("El campo nombre no puede estar vacio.");
		this.nombre = nombre;
		this.telefono = telefono;
		this.region = region;
	}

	public String nombre() {
		return nombre;
	}

	public String telefono() {
		return telefono.Numero();
	}

	public String region() {
		return region.nombre();
	}

}
