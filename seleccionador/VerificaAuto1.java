package seleccionador;

public class VerificaAuto1 {
	public static void main(String[] args) {
		Auto a = new Auto();
		int modeloDeAuto = 1;
		switch (modeloDeAuto) {
		case Auto.DELUXE:
			a.agregarAireAcondicionado();
			a.agregarRadio();
			a.agregarRuedas();
			a.agregarMotor();
			break;
		case Auto.STANDARD:
			a.agregarRadio();
			a.agregarRuedas();
			a.agregarMotor();
			break;
		default:
			a.agregarRuedas();
			a.agregarMotor();
		}
	}
}
