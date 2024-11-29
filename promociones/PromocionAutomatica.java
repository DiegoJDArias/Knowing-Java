package promociones;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class PromocionAutomatica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long valorGrande = 6; // 6 es un tipo entero, esta bien
//		int valorPeque�o = 99L; // 99L es un long, esta mal
		double z = 12.414F; // 12.414F es float, esta bien
//		float z1 = 12.414; // 12.414 es double, esta mal 

		float resultado =  4 + valorGrande + (float)z;
		
		System.out.println("Resultado: " + resultado);
	}
	
}
