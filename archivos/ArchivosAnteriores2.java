package archivos;

import java.io.File;
import java.io.IOException;

public class ArchivosAnteriores2 {

/* /////////////////////////////////////////////////
  Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

	public static void main(String[] args) {
		
		File miArchivo;
		miArchivo = new File("miArchivo.txt");
		File miArchivo2 = new File("MisDocs", "miArchivo.txt");
		
		try {
			  // A partir del objeto File creamos el archivo fisicamente
			  if (miArchivo.createNewFile())
			    System.out.println("El archivo se ha creado correctamente");
			  else
			    System.out.println("No ha podido ser creado el archivo");
			  if (miArchivo2.createNewFile())
				    System.out.println("El archivo se ha creado correctamente");
				  else
				    System.out.println("No ha podido ser creado el archivo");
			} catch (IOException ioe) {
			  ioe.printStackTrace();
			}
	}

}
