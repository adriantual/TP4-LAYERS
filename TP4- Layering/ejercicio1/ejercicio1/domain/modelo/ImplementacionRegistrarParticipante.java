package ejercicio1.domain.modelo;

import ejericicio1.domain.portin.ExcepcionesPortsIn;
import ejericicio1.domain.portin.RegistrarParticipante;
import ejericicio1.domain.portout.ExcepcionesPortsOut;
import ejericicio1.domain.portout.Registrar;

public class ImplementacionRegistrarParticipante implements RegistrarParticipante {

	private Registrar tipoRegistro;

	public ImplementacionRegistrarParticipante(Registrar tipoRegistro) {
		super();
		this.tipoRegistro = tipoRegistro;
	}

	/*
	 * @Override /*public void registrarParticipante(Participante unParticipante) {
	 * try { tipoRegistro.registrar(unParticipante.getNombre(),
	 * unParticipante.getTelefono(), unParticipante.getRegion()); } catch
	 * (ExcepcionesPortsOut e) { throw new
	 * ExcepcionesPortsIn("no se pudo registrar al participante"); }
	 * 
	 * }
	 */

	@Override
	public void registrarParticipante(String nombre, String telefono, String region) {
		// crear persona y usar getters validar datos

		try {
			Region unaRegion = new Region(region);
			Telefono unTelefono = new Telefono(telefono);
			Participante unParticipante = new Participante(nombre, unTelefono, unaRegion);
			tipoRegistro.registrar(unParticipante.nombre(), unParticipante.telefono(), unParticipante.region());
		} catch (ExcepcionesPortsOut e) {
			throw new ExcepcionesPortsIn("no se pudo registrar al participante");
		}

	}

}
