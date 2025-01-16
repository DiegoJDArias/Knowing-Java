package nio2.ruta.normalizada;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Resolver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Path p1 = Paths.get("C:\\Documentos");
		Path p2 = Paths.get("Pruebas.txt");
		System.out.println(p1.resolve(p2));

		Path p3 = Paths.get("C:\\Pruebas.txt");
		System.out.println(p1.resolve(p3));

		Path p4 = Paths.get("");
		System.out.println(p1.resolve(p4));

		Path p5 = Paths.get("poemas\\CantoDeBilbo.txt");
		Path p6 = Paths.get("Pruebas.txt");
		System.out.println(p5.resolve(p6));
	}

}
