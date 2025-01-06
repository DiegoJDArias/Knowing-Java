package vectores.inicializacion;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class InicializacionVectoresDeTiposPrimitivos {

	public char[] crearVector() {
		char[] s;
		s = new char[4];
		s[0] = 'A';
		s[1] = 'B';
		s[2] = 'C';
		s[3] = 'D';
		return s;
	}

	public char[] crearVectorBloque() {
		char[] s = { 
				'F', 
				'G', 
				'H', 
				'I' 
				};
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
		InicializacionVectoresDeTiposPrimitivos v = new InicializacionVectoresDeTiposPrimitivos();
		char[] caracteres = v.crearVector();

		v.imprimirVector(caracteres);
		System.out.println();

		caracteres = v.crearVectorBloque();

		v.imprimirVector(caracteres);
		System.out.println();
	}
}
