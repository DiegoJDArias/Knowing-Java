package serializacion;

import java.io.*;
import java.util.Date;

public class DeSerializaFecha {

	DeSerializaFecha() {
		Date d = null;

		try {
			FileInputStream f = new FileInputStream("fecha.ser");
			ObjectInputStream s = new ObjectInputStream(f);
			d = (Date) s.readObject();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out
				.println("Desearializa un objeto de tipo Date desde fecha.ser");
		System.out.println("Fecha: " + d);
	}

	public static void main(String args[]) {
		new DeSerializaFecha();
	}
}
