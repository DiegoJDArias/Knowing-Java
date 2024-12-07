package herencia.constructores;

import constructores.conthis.Fecha;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class Empleado {
	private String nombre;
	private double salario = 1500.00;
	private Fecha fechaNacimiento;
	
	public Empleado(String n, Fecha fDN) {
		// Llamado impl�cito a super();
	nombre = n;
	fechaNacimiento = fDN;
	}
	
	public Empleado(String n) {
		this(n, null);
	}
} 
