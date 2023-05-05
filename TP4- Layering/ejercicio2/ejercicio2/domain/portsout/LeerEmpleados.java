package ejercicio2.domain.portsout;

import java.io.IOException;
import java.util.List;

public interface LeerEmpleados {
	List<String[]> leerArchivo() throws IOException;

}
