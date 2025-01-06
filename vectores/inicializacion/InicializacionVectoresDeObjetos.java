package vectores.inicializacion;

import java.awt.Point;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class InicializacionVectoresDeObjetos {

	public Point[] crearVector() {
		Point[] p = new Point[4];
		p[0] = new Point(0, 1);
		p[1] = new Point(1, 2);
		p[2] = new Point(2, 3);
		p[3] = new Point(3, 4);
		return p;
	}

	public Point[] crearVectorBloque() {
		Point[] p = { new Point(4, 5), new Point(5, 6), new Point(6, 7), new Point(7, 8) };
		return p;
	}

	public void imprimirVector(Point[] vector) {
		for (int i = 0; i < vector.length; i++) {
			// imprimir un elemento
			System.out.println(vector[i]);
		}
	}

	public static void main(String[] args) {
		InicializacionVectoresDeObjetos v = new InicializacionVectoresDeObjetos();
		Point[] puntos = v.crearVector();

		v.imprimirVector(puntos);
		System.out.println();

		puntos = v.crearVectorBloque();

		v.imprimirVector(puntos);
		System.out.println();
	}
}
