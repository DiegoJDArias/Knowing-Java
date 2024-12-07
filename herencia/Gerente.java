package herencia;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

class Gerente extends Empleado {
	
	private String departamento;

	@Override
	public String getDetalles() {
		return "detalles";
	}
}

