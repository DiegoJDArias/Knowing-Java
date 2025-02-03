package archivos;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.UserDefinedFileAttributeView;

public class VistasSoportadas {

	
	public static void main(String[] args){
		try {
			Path ruta = Paths.get("C:/documentos/poemas/CantoDeBilbo.txt");
			FileStore almacenamientoDeArchivos = Files.getFileStore(ruta);
			System.out.println("Soporte de FileAttributeView: " + almacenamientoDeArchivos.supportsFileAttributeView(
			FileAttributeView.class));
			System.out.println("Soporte de BasicFileAttributeView: " + almacenamientoDeArchivos.supportsFileAttributeView(
			BasicFileAttributeView.class));
			System.out.println("Soporte de FileOwnerAttributeView: " + almacenamientoDeArchivos.supportsFileAttributeView(
			FileOwnerAttributeView.class));
			System.out.println("Soporte de AclFileAttributeView: " + almacenamientoDeArchivos.supportsFileAttributeView(
			AclFileAttributeView.class));
			System.out.println("Soporte de PosixFileAttributeView: " + almacenamientoDeArchivos.supportsFileAttributeView(
			PosixFileAttributeView.class));
			System.out.println("Soporte de UserDefinedFileAttributeView: " + almacenamientoDeArchivos.supportsFileAttributeView(
			UserDefinedFileAttributeView.class));
			System.out.println("Soporte de DosFileAttributeView: " + almacenamientoDeArchivos.supportsFileAttributeView(
			DosFileAttributeView.class));
			}
			catch (IOException ex) {
			System.out.println("No se soporta la vista de atributos");
			}
	}
}
