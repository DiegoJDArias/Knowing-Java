package caracteres;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PruebaLecturaCaracteres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader entrada = null;
		CharArrayReader car=null;
		char[] buffer = new char[100000];

		try {
			entrada = new FileReader("SiUnicode.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader r = new BufferedReader(entrada);
		LeeArchivo pd = new LeeArchivo(r);
		car = pd.nuevaLecturaDeContenido();
		try {
			car.read(buffer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i < buffer.length; i++){
			System.out.print(buffer[i]);
		}
	}

}
