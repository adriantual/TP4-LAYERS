package ejericicio1.infrastructure.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ejericicio1.domain.portout.ExcepcionesPortsOut;
import ejericicio1.domain.portout.Registrar;

public class EnBaseDeDatosRegistrar implements Registrar {

	private Conn conn;

	public EnBaseDeDatosRegistrar(String conn) {
		this.conn = new Conn(conn);
	}

	@Override
	public void registrar(String nombre, String telefono, String region) throws ExcepcionesPortsOut {

		try {
			Connection dbConn = this.conn.open();
			PreparedStatement st = dbConn
					.prepareStatement("insert into participantes(nombre, telefono, region) values(?,?,?)");

			st.setString(1, nombre);
			st.setString(2, telefono);
			st.setString(3, region);
			st.executeUpdate();
			st.close();

		} catch (SQLException e) {
			throw new ExcepcionesPortsOut(e, "No ha podido registrarse el participante.");
		}

	}
}
