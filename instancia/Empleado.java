package instancia;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class Empleado extends Persona{
	protected String departamento;
	protected String id;
	protected String idJefe;
	protected float sueldo;

	public Empleado(String p, String s, String a, String doc,
		 String dep, String i, String ij, float sdo) {
		super(p, s, a, doc);
		
		departamento = dep;
		id = i;
		idJefe = ij ;
		sueldo = sdo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public String getId() {
		return id;
	}

	public String getIdJefe() {
		return idJefe;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setDepartamento(String string) {
		departamento = string;
	}

	public void setId(String string) {
		id = string;
	}

	public void setIdJefe(String string) {
		idJefe = string;
	}

	public void setSueldo(float f) {
		sueldo = f;
	}
}
