package envoltorios;
/*
 * @author Diego J D Arias
 */
public class Aritmetica {

	/*
	 * @param args
	 */
	public static void main(String[] args) {
		Integer i = 6;
		Integer j = new Integer(8);
		int resultado;
		Float f = new Float(4.3);
		resultado = i + j + f.intValue();
		
		System.out.println("Resultado: " + resultado);

	}

}
