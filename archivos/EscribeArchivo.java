package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EscribeArchivo {
	
	public static void main(String[] args) {
		
		File file = new File(args[0]); // Crear el archivo
		
		try {
			// Crear el lector con buffer para leer cada l�nea del
			// est�ndar input
			BufferedReader in = new BufferedReader(new InputStreamReader(
					System.in));
			PrintWriter out = new PrintWriter(new FileWriter(file));
			// Para escribir este archivo
			String s;
			System.out.print("Ingresar el texto del archivo : ");
			System.out.println("[Tipee ctrl-d (or ctrl-z) para finalizar.]");
			while ((s = in.readLine()) != null) {
				// Leer cada l�nea y mostrarla por pantalla
				out.println(s);
			}
			in.close(); // Cerrar el lector con buffer y el print
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
