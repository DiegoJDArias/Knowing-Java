package vectores;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class VectoresDeTiposPrimitivos {

	public char[] crearVector() {
		char[] s;

		s = new char[26];
		for (int i = 0; i < 26; i++) {
			s[i] = (char) ('A' + i);
		}

		return s;
	}

	public void imprimirVector(char[] vector) {
		System.out.print('<');
		for (int i = 0; i < vector.length; i++) {
			// imprimir un elemento
			System.out.print(vector[i]);
			// Imprimir una coma para delimitarlos 
			// si no es el último elemento
			if ((i + 1) < vector.length) {
				System.out.print(", ");
			}
		}
		System.out.print('>');
	}

	public static void main(String[] args) {
		VectoresDeTiposPrimitivos v = new VectoresDeTiposPrimitivos();
        char[] caracteres = v.crearVector();
        
        v.imprimirVector(caracteres);
        System.out.println();
	}
}
