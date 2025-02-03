package archivos;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class AtributoUnico {
	public static void main(String[] args) {
		
		try {
			Path ruta = FileSystems.getDefault()
					.getPath("/documentos/poemas/CantoDeBilbo.txt");
			System.out.println(Files.getAttribute(ruta, "size"));
		} catch (IOException ex) {
			System.out.println("IOException");
		}
	}
}
