package listas;

import java.util.*;

public class EjemploDeList {
	
	public static void main(String[] args) {
		
	List<String> list = new ArrayList<String>();
	list.add("uno");
	list.add("segundo");
	list.add("3ro");
	// La siguiente linea da error de compilacion
	//	list.add(new Integer(4));
	// La siguiente linea da error de compilacion
	//	list.add(new Float(5.0F));
	list.add("segundo"); // duplicado, se agrega
	// La siguiente linea da error de compilacion
	//	list.add(new Integer(4)); // duplicado, se agrega
	System.out.println(list);
	}
}
