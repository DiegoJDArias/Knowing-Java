package caracteres;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class VerificaLecturaCaracteres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int c;
		byte [] caracteresLeidos = new byte[15];
		int entero = 0;
		char vecCaracteres[] = new char[15];
		CharArrayWriter caw = new CharArrayWriter(10000);
		// Se define un buffer de 15 caracateres que escribe
		// sobre el CharArrayWriter
		BufferedWriter bw = new BufferedWriter(caw, 15);
		FileWriter fW;

		try {
			FileInputStream fis = new FileInputStream("Si");
			c=fis.available();
			if( c < 1){
				System.out.println("Archivo vacío!");
				return;
			}
			
			fW = new FileWriter("SiUnicode.txt");
			BufferedWriter salidaArchivoCaracteres = new BufferedWriter(fW);
			// leer de a 15 caracteres por el tamaño de BufferedWriter
			while((entero = fis.read(caracteresLeidos))!= -1){
				if(entero == 15){
					vecCaracteres = convertirBytesAChar(caracteresLeidos);
					bw.write(vecCaracteres, 0, 15);
				}else{
					vecCaracteres = convertirBytesAChar(caracteresLeidos);
					bw.write(vecCaracteres, 0, entero);					
				}
			
			}
			// Fluir la corriente para que se
			// escriban todos los caracteres
			// en el CharArrayWriter
			bw.flush();
			System.out.print(caw.toCharArray());
			salidaArchivoCaracteres.write(caw.toCharArray());
			// Fluir la corriente para que se
			// escriban todos los caracteres
			// en el archivo de disco
			salidaArchivoCaracteres.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("Error: " + e.getMessage());
		}

	}

	private static char[] convertirBytesAChar(byte[] b){
		char [] c = new char[b.length];
		// Convertir cada byte a caracter
		for(int j = 0; j<b.length;j++){
			c[j] = (char) b[j];
		}
		return c;
	}
}
