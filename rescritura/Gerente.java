package rescritura;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

class Gerente extends Empleado {
	private String departamento;

	public String getDetalles() {
		return super.getDetalles() + "\nDepartamento: " + departamento;
	}
}
