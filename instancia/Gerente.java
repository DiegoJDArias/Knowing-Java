package instancia;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class Gerente extends Empleado {

	protected int nroEmpleados=10;

	public Gerente(
		String p,
		String s,
		String a,
		String doc,
		String dep,
		String i,
		String ij,
		float sdo,
		int ne) {
		super(p, s, a, doc, dep, i, ij, sdo);
		nroEmpleados=ne;
	}

	public int getNroEmpleados() {
		return nroEmpleados;
	}

	public void setNroEmpleados(int i) {
		nroEmpleados = i;
	}
}
