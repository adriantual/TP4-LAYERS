package ejercicio2.domain.modelo;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ejercicio2.domain.portsin.SaludarEmpleados;
import ejercicio2.domain.portsout.EnviarFelizCumpleanios;
import ejercicio2.domain.portsout.LeerEmpleados;

public class Empleados implements SaludarEmpleados {

	private LeerEmpleados leerEmpleados;
	private EnviarFelizCumpleanios felizcumpleanios;
	List<Empleado> empleados = new ArrayList<Empleado>();

	public Empleados(LeerEmpleados cargarEmpleados, EnviarFelizCumpleanios felizcumpleanios) {
		super();
		this.leerEmpleados = cargarEmpleados;
		this.felizcumpleanios = felizcumpleanios;
	}

	public void saludar() throws IOException {

		empleados(leerEmpleados.leerArchivo());
		for (Empleado empleado : empleados) {
			cumpleaAnios(empleado);
		}

	}

	private void empleados(List<String[]> lista) {

		for (String[] posicion : lista) {
			Email email = new Email(posicion[3]);
			LocalDate fecha = LocalDate.parse(posicion[2]);
			Empleado unEmpleado = new Empleado(posicion[0], posicion[1], fecha, email);
			this.empleados.add(unEmpleado);

		}
	}

	private void cumpleaAnios(Empleado empleado) {
		if (empleado.cumpleAniosHoy()) {
			felizcumpleanios.enviarFelizCumpleanios(empleado.email());
		}
	}

}
