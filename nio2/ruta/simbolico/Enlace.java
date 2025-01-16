package nio2.ruta.simbolico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Enlace {
	public static void main(String[] args) {
		
		Path p1 = Paths.get("C:\\Documentos\\poemas\\CantoDeBilbo.txt");
		Path enlaceSimbolico = Paths.get("c:\\Documentos\\enlace_a_CantoDeBilbo");
		
		try {
			Files.createLink(enlaceSimbolico, p1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
