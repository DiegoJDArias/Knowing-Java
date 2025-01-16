package nio2.ruta;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Rutas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(System.getProperty("java.class.path"));

		Path path = Paths.get(System.getProperty("java.class.path"));
		
		System.out.format("toString: %s%n", path.toString());
		System.out.format("getFileName: %s%n", path.getFileName());
		System.out.format("getName(0): %s%n", path.getName(0));
		System.out.format("getNameCount: %d%n", path.getNameCount());
		System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
		System.out.format("getParent: %s%n", path.getParent());
		System.out.format("getRoot: %s%n", path.getRoot());
		System.out.format("%s%n", path.toUri());
	}
}
