package rutas;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ErrorCaminosConPath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Path path = Paths.get("/home\0", "documentos", "estado.txt");
			System.out.printf("Camino Absoluto: %s", path.toAbsolutePath());
		} catch (InvalidPathException ex) {
			System.out.printf("Ruta incorrecta: [%s] en la posición %s", ex.getInput(),
					ex.getIndex());
		}
	}
}
