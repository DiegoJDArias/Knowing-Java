package instancia;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class Director extends Gerente {
	private String cargoEnJunta;

	public Director(String p,
			String s,
			String a,
			String doc,
			String dep,
			String i,
			String ij,
			float sdo,
			int ne,String c) {
		super(p, s, a, doc, dep, i, ij, sdo, ne);
		cargoEnJunta = c;
	}

	public String getCargoEnJunta() {
		return cargoEnJunta;
	}

	public void setCargoEnJunta(String cargoEnJunta) {
		this.cargoEnJunta = cargoEnJunta;
	}
}
