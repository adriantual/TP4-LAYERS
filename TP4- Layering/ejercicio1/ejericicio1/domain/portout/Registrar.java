package ejericicio1.domain.portout;

public interface Registrar {

	// preguntar como armar la interface
	// public void registrar(String nombre, Telefono telefono, Region region)
	public void registrar(String nombre, String telefono, String region) throws ExcepcionesPortsOut;
}
