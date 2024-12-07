package herencia.constructores.conthis;

import constructores.conthis.Fecha;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class Empleado {
	private String nombre;
	private static final double SALARIO_BASE = 1500.00;
	private double salario = 1500.00;
	private Fecha fechaNacimiento;
	
	public Empleado(String nombre, double salario, Fecha fDN) {
			this.nombre = nombre;
			this.salario = salario;
			this.fechaNacimiento = fDN;
		}
	
	public Empleado(String nombre, double salario) {
		this(nombre, salario, null);
	}
	
	public Empleado(String nombre, Fecha fDN) {
		this(nombre, SALARIO_BASE, fDN);
	}
	
	public Empleado(String nombre) {
		this(nombre, SALARIO_BASE);
	}
	
		// más código de Empleado...
}

