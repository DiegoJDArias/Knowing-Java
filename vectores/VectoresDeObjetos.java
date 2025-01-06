package vectores;
import java.awt.Point;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class VectoresDeObjetos {

	public Point[] crearVector() {
		Point[] p;
		p = new Point[10];
		for (int i = 0; i < 10; i++)
			p[i] = new Point(i, i + 1);
		return p;
	}

	public void imprimirVector(Point[] vector) {
		for (int i = 0; i < vector.length; i++) {
			// imprimir un elemento
			System.out.println(vector[i]);
		}
	}

	public static void main(String[] args) {
		VectoresDeObjetos v = new VectoresDeObjetos();
		Point[] puntos = v.crearVector();

		v.imprimirVector(puntos);
		System.out.println();
	}
}
