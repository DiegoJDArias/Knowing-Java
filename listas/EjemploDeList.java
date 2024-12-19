package listas;

import java.util.*;
public class EjemploDeList {
	
	@SuppressWarnings({ "unchecked", "removal", "rawtypes" })

	public static void main(String[] args) {
		
	List list = new ArrayList();
	
	list.add("uno");
	list.add("segundo");
	list.add("3ro");
	list.add(new Integer(4));
	list.add(new Float(5.0F));
	list.add("segundo"); // duplicado, se agrega
	list.add(new Integer(4)); // duplicado, se agrega
	
	Object[] nuevo = new Object[list.size()];
	list.toArray(nuevo);
	
	for (Object i : nuevo) {
		System.out.print(i + " ");
	}
	
	System.out.println("\n" + list.size());
	System.out.println(list.lastIndexOf(4));
	
	}
}
