package patrones;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProbarRegex2 {
	
	public static void main(String args[]) {
		
		// Una expresi�n regular y una cadena en la cual buscar
		String expresionRegular = "s[aeiou]l";
		String oracion = "Sólo soldados, sólo humanos solitarios en la tristeza que deja solamente la guerra";
		// Se marcan los lugares donde se encuentra el patr�n
		// Funciona bien si la letra es siempre del mismo tama�o
		char[] marcador = new char[oracion.length()];
		// Llenar la cadena de espacios para luego colocar el caracter que marca
		Arrays.fill(marcador, ' ');

		// Obtener el compador requerido
		Pattern patron = Pattern.compile(expresionRegular);
		Matcher comparador = patron.matcher(oracion);
		// Buscar cada coincidencia y marcarla
		
		while (comparador.find()) {
			System.out.println("Patr�nñññ encontrado. Comienza en: "
					+ comparador.start() + " y termina en " + comparador.end());
			Arrays.fill(marcador, comparador.start(), comparador.end(), '^');
		}
		// Mostrar el resultado con las marcas generadas
		System.out.println(oracion);
		System.out.println(marcador);
	}
}
