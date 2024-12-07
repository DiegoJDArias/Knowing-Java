package herencia;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class Director extends Gerente {
	private String cargoEnJunta;

	public Director(String c) {
		cargoEnJunta = c;
	}

	public String getCargoEnJunta() {
		return cargoEnJunta;
	}

	public void setCargoEnJunta(String cargoEnJunta) {
		this.cargoEnJunta = cargoEnJunta;
	}
	
}
