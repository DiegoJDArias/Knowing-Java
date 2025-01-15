package corrientes;

import java.io.*;

public class ManejaCaracteres {
	char buf[] = new char[4000];
	FileReader fR;
	FileWriter fW;
	CharArrayReader car;
	CharArrayWriter caw;
	StringReader strR;
	StringWriter strW;
	PipedReader pR;
	PipedWriter pW;

	public ManejaCaracteres() {
		// char c;
		// int i;
		try {
			// Se debe crear con excepción verificada
			// si el archivo no existe, FileWriter lo crea
			fW = new FileWriter("caracteres.txt");
			// Sólo abre el archivo de lectura
			fR = new FileReader("CantoDeBilbo.txt");
			// Lee el tamaño del buffer
			fR.read(buf);
			fW.write(buf);
			System.out.println("Cantidad de bytes: " + buf.length);
			this.convierteAUnicodeArchivo();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void convierteAUnicodeArchivo() {
		int cantBytes, i;
		byte[] datos;

		FileInputStream fis;
		try {
			fis = new FileInputStream("Si");
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			FileWriter fos = new FileWriter(
					"SiUnicode.txt");
			BufferedWriter bw = new BufferedWriter(fos);
			cantBytes = dis.available();
			datos = new byte[dis.available()];
			dis.readFully(datos);
			System.out.println("Cantidad de bytes: " + cantBytes);
			dis.read(datos);
			for (i = 0; i < cantBytes; i++) {
				// Convertir a caracter Unicode forzándolo
				bw.write(new Character((char)datos[i]).charValue());
				bw.flush();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new ManejaCaracteres();
	}
}
