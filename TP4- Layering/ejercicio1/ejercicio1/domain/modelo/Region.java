package ejercicio1.domain.modelo;

import java.util.List;
import java.util.Objects;

import ejericicio1.domain.portin.ExcepcionesPortsIn;

public class Region {
	private List<String> regiones;
	private String nombre;

	public Region(String region) {
		super();
		this.regiones = List.of("US", "China", "Europa");

		Objects.requireNonNull(region);

		if (region.isEmpty())
			throw new ExcepcionesPortsIn("El campo Region no puede estar vacio.");

		if (esUnaRegionPermitida(region))
			throw new ExcepcionesPortsIn("Region desconocida. Las conocidas son: China, US, Europa");

		this.nombre = region;
	}

	private boolean esUnaRegionPermitida(String region) {
		return regiones.contains(region);
	}

	public String nombre() {
		return nombre;
	}

}
