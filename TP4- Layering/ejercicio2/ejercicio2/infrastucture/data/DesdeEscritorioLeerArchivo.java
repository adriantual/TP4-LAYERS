package ejercicio2.infrastucture.data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejercicio2.domain.portsout.LeerEmpleados;

public class DesdeEscritorioLeerArchivo implements LeerEmpleados {

	private String direccionDeArchivo;

	public DesdeEscritorioLeerArchivo(String direccionDeArchivo) {
		super();
		this.direccionDeArchivo = direccionDeArchivo;
	}

	@Override
	public List<String[]> leerArchivo() throws IOException {

		List<String[]> empleados = new ArrayList<>();

		Scanner scanner = new Scanner(new File(direccionDeArchivo));
		while (scanner.hasNextLine()) {
			String linea = scanner.nextLine();
			String[] empleado = linea.split(",");
			String nombre = empleado[0];
			String apellido = empleado[1];
			String fechaNacimiento = empleado[2];
			String correo = empleado[3];
			empleados.add(empleado);
		}
		scanner.close();

		return empleados;
	}
}
