package archivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Contenido {
	public static void main(String[] args) throws Exception {
		mostrarElTipoDeContenido("/documentos/archivos/curso/poema.txt");
		mostrarElTipoDeContenido("/documentos/archivos/Capítulo.doc");
		mostrarElTipoDeContenido("/documentos/archivos/java.exe");
	}

	static void mostrarElTipoDeContenido(String ruta) throws Exception {
		Path camino = Paths.get(ruta);
		String tipo = Files.probeContentType(camino);
		System.out.println(tipo);
	}
}
