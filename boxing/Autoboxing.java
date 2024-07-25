package boxing;
/*
 * @author Diego J D Arias
 */
public class Autoboxing {
	public static void main(String[] args) {
		int entero = 420;
		Integer envoltorio = entero; // esto se denomina autoboxing
		System.out.println(envoltorio);
		int p2 = envoltorio; // esto se denomina autounboxing
		System.out.println(p2);
	}

}
