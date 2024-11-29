package abstractos;

import constructores.conthis.Fecha;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public abstract class Empleado {
	
	protected String nombre;
	protected double salario = 1500.00;
	protected Fecha fechaNacimiento;

	public abstract String getDetalles(); 
}
