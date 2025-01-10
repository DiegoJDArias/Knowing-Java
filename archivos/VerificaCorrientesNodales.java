package archivos;

import java.io.*;

public class VerificaCorrientesNodales {
	
	public static void main(String[] args) {
		
		try {
			FileReader entrada = new FileReader(args[0]);
			FileWriter salida = new FileWriter(args[1]);
			char[] buffer = new char[128];
			int caracLeidos;

			// primera lectura sobre el buffer
			caracLeidos = entrada.read(buffer);

			while (caracLeidos != -1) {
				// escribir la salida del buffer al archivo de salida
				salida.write(buffer, 0, caracLeidos);

				// Pr�xima lectura sobre el buffer
				caracLeidos = entrada.read(buffer);
			}

			entrada.close();
			salida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
