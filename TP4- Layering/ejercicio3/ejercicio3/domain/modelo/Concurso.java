package ejercicio3.domain.modelo;

import java.time.LocalDate;
import java.util.ArrayList;

import ejercicio3.domain.portsin.InscribirParticipantes;

public class Concurso implements InscribirParticipantes {
	private String nombre;
	private ArrayList<Participante> participantes;
	private int idconcurso;
	private LocalDate fechaInicioInscripcion;
	private LocalDate fechaFinInscripcion;

	public Concurso(String nombre, LocalDate fechaInicioInscripcion, LocalDate fechaFinInscripcion) {
		super();
		this.nombre = nombre;
		this.fechaFinInscripcion = fechaFinInscripcion;
		this.fechaInicioInscripcion = fechaInicioInscripcion;
	}

	@Override
	public void inscribirParticipante(String nombre, String apellido, int dni, String email, String telefono) {
		Participante unParticipante = new Participante(nombre, apellido, dni, email, telefono);
		participantes.add(unParticipante);
	}

	public boolean IncripcionAbierta() {
		if (menorIgualQueHoy(fechaFinInscripcion)) {
			return true;
		}
		return false;
	}

	public boolean menorIgualQueHoy(LocalDate fecha) {

		LocalDate hoy = LocalDate.now();
		if (fecha.isAfter(hoy) || fecha.equals(hoy)) {
			return true;
		}
		return false;
	}

}
