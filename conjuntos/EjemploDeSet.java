package conjuntos;

import java.util.*;

public class EjemploDeSet {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("uno");
		set.add("segundo");
		set.add("3ro");
		// La siguiente l�nea da error de compilaci�n
		//		set.add(new Integer(4));
		// La siguiente l�nea da error de compilaci�n
		//		set.add(new Float(5.0F));
		set.add("segundo"); // duplicado, no se agrega
		// La siguiente l�nea da error de compilaci�n
		//		set.add(new Integer(4)); // duplicado, no se agrega
		System.out.println(set);
	}
}
