package archivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BorrarArchivosYDirectorios {
	public static void main(String[] args) throws Exception {
//		Path archivo = Paths.get("C:/documentos/archivos/curso/miArchivo.txt");
//		Files.delete(archivo);
//		System.out.println("El archivo se borró correctamente");
		Path directorio = Paths.get("C:/documentos/archivos/curso");
		Files.delete(directorio);
		System.out.println("El directorio se borró correctamente");
	}
}
