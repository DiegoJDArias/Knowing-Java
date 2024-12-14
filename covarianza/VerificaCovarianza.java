package covarianza;

import java.util.List;
import java.util.ArrayList;

public class VerificaCovarianza {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<C> lc = new ArrayList<C>();
		List<D> ld = new ArrayList<D>();
		lc.add(new C());
		ld.add(new D());
		imprimeNombreClase(lc);
		imprimeNombreClase(ld);

		// pero...
		List<? extends Object> lo = lc; // Bien
//		lo.add(new C());//�Error de compilaci�n!
	}

	public static void imprimeNombreClase(List<? extends A> la) {
		for (int i = 0; i < la.size(); i++) {
			System.out.println(la.get(i).getClass());
		}
	}

}
