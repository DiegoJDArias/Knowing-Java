package archivos;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Interoperabilidad {
	public static void main(String[] args) {
		try {
			Path ruta = Paths.get(new URI("file:///C:/documentos/poemas/CantoDeBilbo.txt"));
			File archivo = new File("C:\\documentos\\poemas\\CantoDeBilbo.txt");
			Path pasarAPath = archivo.toPath();
			System.out.println(pasarAPath.equals(ruta));
		} catch (URISyntaxException e) {
			System.out.println("URI mal formada");
		}
	}
}