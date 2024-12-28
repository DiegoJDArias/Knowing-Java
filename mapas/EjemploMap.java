package mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EjemploMap {
	
	public static void main(String args[]) {
		
		Map<String, String> mapa = new HashMap<String, String>();
		mapa.put("uno", "1ro");
		// La siguiente llnea da error de compilacion
		//		mapa.put("segundo", new Integer(2));
		mapa.put("tercero", "3�");
		// Sobrescribe la asignacion anterior
		mapa.put("tercero", "III");
		// Devuelve el conjunto de las claves
		Set<String> conjunto1 = mapa.keySet();
		// Devuelve la vista Collection de los valores
		Collection<String> coleccion = mapa.values();
		// Devuelve el conjunto de las asignaciones de claves a valores
		Set<Entry<String,String>> conjunto2 = mapa.entrySet();
		System.out.println(conjunto1 + "\n" + coleccion + "\n" + conjunto2);
	}
}
