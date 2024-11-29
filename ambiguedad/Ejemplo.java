package ambiguedad;
/**
 * 
 * @author Diego J D Arias
 *
 */
public class Ejemplo {
	private int atrib1;
	private char atrib2;
	Ejemplo(int a) { atrib1 = a; }
	Ejemplo(char a) { atrib2 = a; }
	Ejemplo (char atrib2, int atrib1) {
		this.atrib1 = atrib1;
		this.atrib2 = atrib2; 
	}
	public void metodo(){
		//[sentencias;]
		atrib2 = 'a';
	}
}
