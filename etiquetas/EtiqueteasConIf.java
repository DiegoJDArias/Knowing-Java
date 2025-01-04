package etiquetas;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class EtiqueteasConIf {
	public static void main(String[] args) {
		int contador = 0;

		// Verificar break en una etiqueta asociada a un bloque.
		etiqueta1: {
			System.out.println("antes de etiqueta1");
			if (contador == 0) {
				break etiqueta1;
			}
			System.out.println("después de etiqueta1");
		}

		// Verificar break con una etiqueta asociada a una sentencia if
		System.out.println("antes de  etiqueta2");
		etiqueta2: if (contador == 0) {
			break etiqueta2;
		} else {
			System.out.println("cláusula else; el break no salta a etiqueta2");
		}
		System.out.println("después de etiqueta2");
	}
}
