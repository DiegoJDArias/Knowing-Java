package limites.metodos.interfaces;

import limites.metodos.A;
import limites.metodos.B;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class VerificaLimitesParametros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Z<F<B>> z1 = new Z<>();

		z1.agregar(new F<B>(new B()));
		z1.inspeccionar(new F<D<A>>(new D<A>()));
	}
}
