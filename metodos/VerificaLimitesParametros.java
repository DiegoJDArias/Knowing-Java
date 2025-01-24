package limites.metodos;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class VerificaLimitesParametros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Z<A> z1 = new Z<>();
		Z<B> z2 = new Z<>();
		Z<C> z3 = new Z<>();
		Z<D> z4 = new Z<>();
		
		z1.agregar(new A());
		z1.inspeccionar(new A());
		z1.inspeccionar(new B());
		z1.inspeccionar(new C());
		z1.inspeccionar(new D());
		
		// La siguiente l�nea da Error porque el par�metro
		// del tipo para z2 es B
		//z2.agregar(new A());
		z2.agregar(new B());
		z2.inspeccionar(new A());
		z2.inspeccionar(new B());
		z2.inspeccionar(new C());
		z2.inspeccionar(new D());

		z3.agregar(new C());
		z3.inspeccionar(new A());
		z3.inspeccionar(new B());
		z3.inspeccionar(new C());
		z3.inspeccionar(new D());
		
		z4.agregar(new D());
		z4.inspeccionar(new A());
		z4.inspeccionar(new B());
		z4.inspeccionar(new C());
		z4.inspeccionar(new D());
	}

}
