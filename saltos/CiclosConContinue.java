package saltos;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class CiclosConContinue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0)
				continue;
			System.out.print("\t" + i);
		}

		System.out.print("\n");

		int j = 0;
		while (j < 10) {
			j++;
			if (j % 2 == 0)
				continue;
			System.out.print("\t" + j);
		}
		System.out.println("\nTerminé!!");
	}
}
