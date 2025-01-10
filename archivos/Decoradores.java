package archivos;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

import java.io.*;

public class Decoradores {
	private byte[] datos;
	
	public static void main(String[] args) {
		Decoradores d = new Decoradores();
		d.manejaArchivo();
	}
	
	public void manejaArchivo() {
		try {
			FileInputStream fis = new FileInputStream("CantoDeBilbo.txt");
			DataInputStream dis = new DataInputStream(fis);
			FileOutputStream fos = new FileOutputStream("Decoradores.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			datos = new byte[dis.available()];
			dis.readFully(datos);
			String s1 = new String(datos);
			System.out.println(s1);
			dos.writeUTF("Escribe UTF-8 modificado");
			dos.writeUTF(s1);
			dos.writeChar('\n');
			dos.writeChars("Escribe como String cada byte");
			dos.writeChar('\n');
			dos.writeChars(s1);
			dos.writeChar('\n');
			dos.write(datos);
			
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
