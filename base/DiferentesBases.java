/**
 * 
 */
package base;

/**
 * @author Marcelo F. Samia
 *
 */
public class DiferentesBases {

	public static void main(String[] args) {

		int var1 = 153;
		int var2 = 0x153;
		int var3 = 0153;
		int var4 =  0b1001_1001;
		
		System.out.println("El valor de var1 asignado en decimal: " + var1);
		System.out.println("El valor de var2 asignado en hexadecimal: " + var2);
		System.out.println("El valor de var3 asignado en octal: " + var3);
		System.out.println("El valor de var4 asignado en binario: " + var4);
	}
	
	// La doble barra se usa si el comentario abarca una l�nea


	/* Comienza el comentario
	La combinaci�n barra � asterisco para comenzar y asterisco- barra para finalizar se utiliza el comentario abarca m�s de una l�nea
	Finaliza el comentario */

	/** Comienza el comentario
	La combinaci�n barra � asterisco - asterisco  es para que lo lea el javadoc.
	Finaliza el comentario */

}
