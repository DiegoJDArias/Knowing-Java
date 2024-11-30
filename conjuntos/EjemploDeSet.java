package conjuntos;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

import java.util.*;

import javax.print.attribute.Size2DSyntax;
public class EjemploDeSet {
	
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("uno");
		set.add("segundo");
		set.add("3ro");
		set.add(new Integer(4));
		set.add(new Float(5.0F));
		set.add("segundo "); // duplicado, no se agrega
		set.add(new Integer(4)); // duplicado, no se agrega
		
		System.out.println(set.size());
		System.out.println(set.contains(4));
		System.out.println(set.spliterator());
		for (Object i : set) {
			System.out.println(i);
		}
	}
}
