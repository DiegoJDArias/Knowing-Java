package archivos;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;

public class InformacionDeFile {
	public static void main(String[] args) throws Exception {
		Path ruta = FileSystems.getDefault().getPath("/documentos/poemas/CantoDeBilbo.txt");
		mostrarAtributosDeUnArchivo(ruta);
	}

	private static void mostrarAtributosDeUnArchivo(Path ruta) throws Exception {
		String formato = "Existe: %s %n" + "No existe: %s %n"
				+ "Directorio: %s %n" + "Regular: %s %n" + "Ejecutable: %s %n"
				+ "Se puede leer: %s %n" + "Se puede escribir: %s %n" + "Oculto: %s %n"
				+ "Simbólico: %s %n" + "Fecha de la última modificación: %s %n"
				+ "Tamaño: %s %n";
		System.out.printf(formato,
				Files.exists(ruta, LinkOption.NOFOLLOW_LINKS),
				Files.notExists(ruta, LinkOption.NOFOLLOW_LINKS),
				Files.isDirectory(ruta, LinkOption.NOFOLLOW_LINKS),
				Files.isRegularFile(ruta, LinkOption.NOFOLLOW_LINKS),
				Files.isExecutable(ruta), Files.isReadable(ruta),
				Files.isWritable(ruta), Files.isHidden(ruta),
				Files.isSymbolicLink(ruta),
				Files.getLastModifiedTime(ruta, LinkOption.NOFOLLOW_LINKS),
				Files.size(ruta));
	}
}
