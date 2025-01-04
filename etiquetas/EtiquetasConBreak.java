package etiquetas;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class EtiquetasConBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int h = 0; h < 10; h++) {
			afuera: 
				for (int j = 0; j < 10;) {
					System.out.println(j);
					for (int i = 0;; i++) {
						if (i % 2 != 0) {
							System.out.print("\t" + i);
							continue;
						} else if (i > 9) {
							System.out.println();
							break afuera;
						}
					}
				}
		System.out.println("for externo!");
		}
		System.out.println();
		System.out.println("Terminé!!");

	}

}
