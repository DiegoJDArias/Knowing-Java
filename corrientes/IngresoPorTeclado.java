package corrientes;

import java.io.*;

public class IngresoPorTeclado {
	
	public static void main(String args[]) {
		
		String s;
		// Crea un lector con buffer para cada l�nea del teclado.
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		System.out.println(
			"Unix: Tipear ctrl-d o ctrl-c para salir."
				+ "\nWindows: Tipear ctrl-z para salir ");
		
		try {
		// Lee cada l�nea de entrada y lo muestra por pantalla.
			s = in.readLine();
			while (s != null) {
				System.out.println("Leido: " + s);
				s = in.readLine();
			}
			// Cierra el lector con buffer
			in.close();
		} catch (IOException e) { // Catch any IO exceptions.
			e.printStackTrace();
		}
	}
}