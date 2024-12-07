package herencia.constructores;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class Gerente extends Empleado {
	
	private String departamento;
	
	public Gerente(String n, String d) {
		super(n);
		departamento = d;
	}
} 
