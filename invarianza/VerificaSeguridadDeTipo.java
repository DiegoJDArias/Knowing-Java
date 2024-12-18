package invarianza;

import java.awt.List;
import java.util.ArrayList;

public class VerificaSeguridadDeTipo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<D> ld = new ArrayList<D>();

		ld.add(new D()); // Bien
		D d = ld.get(0); // Bien

//		ld.add(new C()); // ¡Error de compilación!
//
//		// por tanto esta asignación también
//		C c = ld.get(0);
	}
}
