package operadores;

/*
 * @author Diego J D Arias
 */
public class OperadoresUnarios {

	public static void main(String[] args) {
		int a = 4, b = 5, c = 6, d = 0;
		d = ++a - b-- - c;
		System.out.println("Valor de d: " + d);
		System.out.println("Valor de a: " + a);
		System.out.println("Valor de b: " + b);
		System.out.println("-----------");
		d = a++ - --b - c;
		System.out.println("Valor de d: " + d);
		System.out.println("Valor de a: " + a);
		System.out.println("Valor de b: " + b);
	}
}
