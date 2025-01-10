package archivos;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

import java.io.*;

public class EntradaSalidaBytes {

	public static void main(String[] args) {
		int c, pos=0;
		String s1 = "Número de bytes disponibles: ";
		String s2 = "Lectura del archivo caracter a caracter: ";
		String s3 = "Lectura evitando los caracters del 6 al 32: ";
		String carac;
		byte b1[] = s1.getBytes();
		byte b2[] = s2.getBytes();
		byte b3[] = s3.getBytes();
		
		try{
			FileInputStream fis = new FileInputStream("CantoDeBilbo.txt");
			FileOutputStream fos = new FileOutputStream("SalidaCaracteresConSalto.txt");
			c=fis.available();
			// Usar ambos tipos de corrientes de salida
			System.out.println(s1 + c);
			fos.write(b1);
			// Convertir el entero a String
			carac=Integer.valueOf(c).toString();
			// Convertir el String a un vector de bytes
			fos.write(carac.getBytes());
			// Armar el salto de línea para Unicode
			fos.write(Character.LINE_SEPARATOR);
			fos.write('\n');
			fos.write(Character.LINE_SEPARATOR);
			fos.write('\n');
			System.out.println(s2);
			fos.write(b2);
			fos.write(Character.LINE_SEPARATOR);
			fos.write('\n');
			while((c= fis.read())!= -1){
				System.out.print((char)c);
				fos.write(c);
			}
			//Como la lectura es secuencial, hay que cerrar y 
			//abrir el archivo para volverlo a leer
			fis.close();
			fis = new FileInputStream("CantoDeBilbo.txt");
			System.out.print("\n\n");
			fos.write(Character.LINE_SEPARATOR);
			fos.write('\n');
			fos.write(Character.LINE_SEPARATOR);
			fos.write('\n');
			System.out.println(s3);
			fos.write(b3);
			fos.write(Character.LINE_SEPARATOR);
			fos.write('\n');
			while((c= fis.read())!= -1){
				System.out.print((char)c);
				fos.write(c);
				++pos;
				if(pos == 5){
					fis.skip(27);
				}
			}
			fis.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
