package caracteres;

import java.io.*;

public class LeeArchivo {
	// Limitar la cantidad de caracteres que se acceden
	// en un determinado documento por si este es largo
	private static final int limiteDeCaracteres = 1000000;
	Reader lector;
	boolean leido;
	char[] caracteresDelArchivo;

	/**
	 * Constructor para LeeArchivo.
	 * 
	 * @param lector
	 *            Reader obtenido par leer
	 *            el archivo
	 */
	public LeeArchivo(Reader lector) {
		this.lector = lector;
		this.leido = false;
	}

	public CharArrayReader nuevaLecturaDeContenido() {
		if (!leido) {
			leido = true;
			leerElArchivo();
		}
		return new CharArrayReader(caracteresDelArchivo);
	}

	private void leerElArchivo() {
		CharArrayWriter escritor = new CharArrayWriter();
		char[] buf = new char[4096];
		int n;
		int caracteresEscritos = 0;
		try {
			while (0 <= (n = lector.read(buf))) {
				if (caracteresEscritos < limiteDeCaracteres) {
					if (n > limiteDeCaracteres - caracteresEscritos) {
						// no leer más allá del limite de caracteres
						escritor.write(buf, 0, limiteDeCaracteres - caracteresEscritos);
						caracteresEscritos = limiteDeCaracteres;
					} else {
						escritor.write(buf, 0, n);
						caracteresEscritos += n;
					}
				} else {
					// Continuar leyendo sin salir del ciclo
					// para evitar rupturas de posibles tuberías
					// (pipes)
				}
			}
		} catch (IOException ioe) {
			System.out.println("Error: " + ioe.getMessage());
		} finally {
			try {
				lector.close();
			} catch (IOException ioe2) {
				System.out.println("Error: " + ioe2.getMessage());
			}
		}
		caracteresDelArchivo = escritor.toCharArray();
	}
}