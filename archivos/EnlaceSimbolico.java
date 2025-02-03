package archivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EnlaceSimbolico {
	public static void main(String[] args) throws Exception {
		Path targetFile = Paths.get("C:/documentos/poemas/CantoDeBilbo.txt");
		Path linkFile = Paths.get("C:/documentos/archivos/CantoDeBilbo");
		Files.createSymbolicLink(linkFile, targetFile);
		}
}
