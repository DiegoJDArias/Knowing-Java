package archivos;

import java.io.FileReader; import java.io.BufferedReader;
import java.io.FileWriter; import java.io.BufferedWriter;
import java.io.IOException;

public class VerificaCorrientesConBuffer {
	
  public static void main(String[] args) {
	  
    try {
      FileReader     entrada     = new FileReader(args[0]);
      BufferedReader bufEntrada  = new BufferedReader(entrada);
      FileWriter     salida    = new FileWriter(args[1]);
      BufferedWriter bufSalida = new BufferedWriter(salida);
      String line;

      // leer la primera linea
      line = bufEntrada.readLine();

      while ( line != null ) {
	// escribir la linea en el archivo de salida
	bufSalida.write(line, 0, line.length());
	bufSalida.newLine();

	// leer la proxima linea
	line = bufEntrada.readLine();
      }

      bufEntrada.close();
      bufSalida.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
