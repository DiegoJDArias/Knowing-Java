package archivos;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

public class VistasDelSO {
	public static void main(String[] args) {
		Path ruta = Paths.get("C:/documentos/poemas/CantoDeBilbo.txt");
		FileSystem sistemaDeArchivos = ruta.getFileSystem();
		Set<String> vistasSoportadas = sistemaDeArchivos.supportedFileAttributeViews();
		for (String vista : vistasSoportadas) {
			System.out.println(vista);
		}
	}
}
