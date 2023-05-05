package ejercicio1.main;

import java.awt.EventQueue;
import java.sql.SQLException;

import ejercicio1.domain.modelo.ImplementacionRegistrarParticipante;
import ejericicio1.infrastructure.data.EnBaseDeDatosRegistrar;
import ejericicio1.infrastructure.ui.AgregarParticipanteUI;

public class Main {
	public static void main(String[] args) throws SQLException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new AgregarParticipanteUI(new ImplementacionRegistrarParticipante(
							new EnBaseDeDatosRegistrar("jdbc:mysql://localhost:3306/layer-ejercicio1")));
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
	}
}