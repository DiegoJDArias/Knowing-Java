package constructores.conthis;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class Ejemplo {
	Ejemplo(int a){ atrib1 = a;}
	Ejemplo(int a, float b){ 
			this(a);
			atrib2 = b;
	}
	private int atrib1;
	private float atrib2;
	public void metodo(){
		//[sentencias;]
	}
}
