package archivos;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreaArchivoYDirectorio {
	public static void main(String[] args) {
		try {
			Path testDirectoryPath = Paths.get("C:/documentos/archivos/curso");
			Path rutaDir = Files.createDirectory(testDirectoryPath);
			System.out.println("¡Se creó satisfactoriamente el directorio!");
			Path newFilePath = FileSystems.getDefault().getPath(
					"C:/documentos/archivos/curso/miArchivo.txt");
			Path archivoDePrueba = Files.createFile(newFilePath);
			System.out.println("¡Se creó satisfactoriamente el archivo!");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
