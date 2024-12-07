package herencia.constructores.conthis;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class Gerente extends Empleado {
	
	private String departamento;

	public Gerente(String name, double salario, String dep) {
		super(name, salario);
		departamento = dep;
		}
	
	public Gerente(String n, String d) {
		super(n);
		departamento = d;
	}
	
//	public Gerente(String dep) { // Error, no existe Empleado()
//		departamento = dep;
//	}
}
