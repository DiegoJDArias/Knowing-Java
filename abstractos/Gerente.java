package abstractos;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

class Gerente extends Empleado {
	
	private String departamento;

	public String getDetalles() {
		
		return "Nombre: " + nombre + "\nSalario: " + salario;
	}
}

