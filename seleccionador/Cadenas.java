package seleccionador;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class Cadenas {

	public static void main(String[] args) {
		String cadena = "prueba";

		switch (cadena) {
		case "contante1":
			System.out.println("Entré en constante1");
			break;
		case "contante2":
			System.out.println("Entré en constante2");
			break;
		case "contante3":
			System.out.println("Entré en constante3");
			break;
		case "prueba":
			System.out.println("Entré en prueba");
			break;
		default:
			System.out.println("No entré en ningún case");
		}
		
		
	}

}
