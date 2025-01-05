package seleccionador;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class VerificaAuto2 {

	public static void main(String[] args) {
		Auto a = new Auto();
		int modeloDeAuto = 1;
		switch (modeloDeAuto) {
		case Auto.DELUXE:
			a.agregarAireAcondicionado();
		case Auto.STANDARD:
			a.agregarRadio();
		default:
			a.agregarRuedas();
			a.agregarMotor();
		}
	}

}
