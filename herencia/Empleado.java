package herencia;

import constructores.conthis.Fecha;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class Empleado {
	protected String nombre;
	protected double salario = 1500.00;
	protected Fecha fechaNacimiento;

	public String getDetalles() {
		return "Nombre: " + nombre + "\nSalario: " + salario;
	}

}
