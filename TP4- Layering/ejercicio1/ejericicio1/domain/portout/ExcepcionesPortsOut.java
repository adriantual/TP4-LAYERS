package ejericicio1.domain.portout;

public class ExcepcionesPortsOut extends Exception {
	public ExcepcionesPortsOut(Exception ex, String msg) {
		super(msg, ex);
	}
}
