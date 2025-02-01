package rutas;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Caminos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Path path = FileSystems.getDefault().getPath("/home/documentos/estado.txt");
		
		System.out.println("Sistema de Archivos: " + path.getFileSystem());
		System.out.println("Ruta absoluta: " + path.toAbsolutePath());
		System.out.printf("toString: %s\n", path.toString());
		System.out.printf("getFileName: %s\n", path.getFileName());
		System.out.printf("getRoot: %s\n", path.getRoot());
		System.out.printf("getNameCount: %d\n", path.getNameCount());
		
		for (int index = 0; index < path.getNameCount(); index++) {
			System.out.printf("getName(%d): %s\n", index, path.getName(index));
		}
		System.out.printf("subpath(0,2): %s\n", path.subpath(0, 2));
		System.out.printf("getParent: %s\n", path.getParent());
		System.out.println("Es una ruta absoluta?: "+path.isAbsolute());
	}
}
