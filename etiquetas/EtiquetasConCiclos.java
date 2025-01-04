package etiquetas;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com..
*/////////////////////////////////////////////////

public class EtiquetasConCiclos {

	public static void main(String[] args) {

		afuera: for (int j = 0; j < 10; j++) {
			System.out.println("\tj = " + j);
			for (int i = 10; i > 0; i--) {
				if ((i / 8) != 0) {
					System.out.print("\ti = " + i);
					continue;
				} else{
					System.out.println();
					continue afuera;
				}
			}
		}
		System.out.println();
		System.out.println("Terminé!!");
	}
}
