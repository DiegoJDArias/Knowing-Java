package nio2.ruta.normalizada;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Relativizar {

	public static void main(String[] args) {
		
		Path p1 = Paths.get("poemas");
		Path p2 = Paths.get("Documentos\\poemas\\Si");
		System.out.println(p1.relativize(p2));

		Path p3 = Paths.get("Juan");
		Path p4 = Paths.get("Pedro");
		System.out.println(p3.relativize(p4));
		System.out.println(p4.relativize(p3));

		Path p5 = Paths.get("C:\\Documentos");
		Path p6 = Paths.get("c:\\Documentos\\Prueba.txt");
		System.out.println(p5.relativize(p6));
		System.out.println(p6.relativize(p5));


		Path p7 = Paths.get("poemas");
		Path p8 = Paths.get("C:\\Documentos\\poemas\\Si");
		System.out.println(p7.relativize(p8));
	}

}
