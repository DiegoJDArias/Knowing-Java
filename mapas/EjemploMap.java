package mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploMap {
	
	@SuppressWarnings({"unchecked", "removal", "rawtypes"})
	public static void main(String args[]) {
		
		Map mapa = new HashMap();
		
		mapa.put("uno", "1ro");
		mapa.put("segundo", new Integer(2));
		mapa.put("tercero", "3°");
		// Sobrescribe la asignacion anterior
		mapa.put("tercero", "III");
		// Devuelve el conjunto de las claves
		Set conjunto1 = mapa.keySet();
		// Devuelve la vista Collection de los valores
		Collection coleccion = mapa.values();
		// Devuelve el conjunto de las asignaciones de claves a valores
		Set conjunto2 = mapa.entrySet();
		
		System.out.println(conjunto1 + "\n" + coleccion + "\n" + conjunto2);
		System.out.println(mapa.entrySet());
		System.out.println(mapa.values());
		System.out.println(mapa.keySet());
	}
}
