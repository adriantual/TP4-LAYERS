package ejercicio2.main;

import java.io.IOException;

import ejercicio2.domain.modelo.Empleados;
import ejercicio2.infrastucture.data.DesdeEscritorioLeerArchivo;
import ejercicio2.infrastucture.mail.ViaMailEnviarFelizCumpleanios;

public class Main {

	public static void main(String[] args) throws IOException {
		Empleados empleados = new Empleados(
				new DesdeEscritorioLeerArchivo("C://Users//User//Desktop//UNIVERSIDAD 2023//OBJETOS 2//empleados.txt"),
				new ViaMailEnviarFelizCumpleanios());
		empleados.saludar();
	}

}
