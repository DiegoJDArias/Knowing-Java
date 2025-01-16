package nio2.ruta.normalizada;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RutaNormalizada {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Path p1 = Paths.get("C:\\Documentos\\poemas\\..\\\\poemas\\Si");
		Path p1n = p1.normalize();
		System.out.println(p1 + " normalizado queda " + p1n);

		Path p2 = Paths.get("C:\\Documentos\\poemas\\Si");
		Path p2n = p2.normalize();
		System.out.println(p2 + " normalizado queda " + p2n);

		Path p3 = Paths.get("\\Directorio\\..\\.\\Pruebas.txt");
		Path p3n = p3.normalize();
		System.out.println(p3 + " normalizado queda " + p3n);

	}

}
