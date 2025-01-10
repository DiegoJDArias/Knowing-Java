package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeeArchivo {
	
	 public static void main(String[] args) {
		 
		File file = new File(args[0]);
		
		try { // Crear un lector 
	// con buffer para leer cada l�nea del archivo
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			s = in.readLine();
			// leer cada l�nea del archivo y mostrarlo en pantalla
			while (s != null) {
				System.out.println(" Leyo : " + s);
				s = in.readLine();
			}
			in.close();
			// Cerrar el lector con buffer, que tambi�n 
			// cierra el lector de archivo
		} catch (FileNotFoundException e1) {
			// Si no existe el archivo
			System.err.println("Archivo no encontrado : " + file); 
		} catch (IOException e2) {
			e2.printStackTrace();//Para cualquier otra excepci�n de E/S
		}
	  }
	}
