package rutas;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativasEnAbsolutas {
	
	public static void main(String[] args) {
		
		String separator = FileSystems.getDefault().getSeparator();
		System.out.println("El separador es " + separator);
		
		try {
			Path path = Paths.get(new URI("file:///C:/documentos/poemas/CantoDeBilbo.txt"));
			System.out.println("sub ruta: " + path.subpath(0, 3));
			path = Paths.get("/documentos", "poemas", "CantoDeBilbo.txt");
			System.out.println("Ruta absoluta: " + path.toAbsolutePath());
			System.out.println("URI: " + path.toUri());
		} catch (URISyntaxException ex) {
			System.out.println("URI mal formada");
		} catch (InvalidPathException ex) {
			System.out.println("Ruta mal formada: [" + ex.getInput() + "] en la posici�n "
					+ ex.getIndex());
		}
	}
}
