package Excepciones;

import java.io.*;
import java.util.Date;

public class SerializaFecha {

	SerializaFecha() {
		Date d = new Date();

		try (
				FileOutputStream f = new FileOutputStream("fecha.ser");
				ObjectOutputStream s = new ObjectOutputStream(f);
				) {
			s.writeObject(d);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		new SerializaFecha();
	}
}
