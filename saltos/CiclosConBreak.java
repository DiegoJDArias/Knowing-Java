package saltos;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class CiclosConBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print("\t" + i);
			if(i==4) break;
		}

		System.out.print("\n");

		int j = 0;
		while (j < 10) {
			j++;
			System.out.print("\t" + j);
			if(j==5) break;
		}
		System.out.println("\nTerminé!!");
	}

}
