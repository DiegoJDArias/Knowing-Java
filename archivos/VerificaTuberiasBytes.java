package archivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class VerificaTuberiasBytes {

	public static void main(String[] args) {
		
		try {
			PipedInputStream escribirTubo = new PipedInputStream();
			PipedOutputStream leerTubo = new PipedOutputStream(escribirTubo);

			FileOutputStream fos = new FileOutputStream("Tuberia.txt");
			FileInputStream fis = new FileInputStream("CantoDeBilbo.txt");

			ThreadDeESBytes tLee = new ThreadDeESBytes("lector", fis,
					leerTubo);
			ThreadDeESBytes tEscribe = new ThreadDeESBytes("escritor",
					escribirTubo, fos);
			tLee.start();
			tEscribe.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
