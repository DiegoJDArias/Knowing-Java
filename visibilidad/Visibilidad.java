package visibilidad;

public class Visibilidad {
	private int i = 1;

	public void primerMetodo() {
		int i = 4, j = 5;
		this.i = i + j;
		segundoMetodo(7);
	}

	public void segundoMetodo(int i) {
		int j = 8;
		this.i = i + j;
	}

	public static void main(String[] args) {
		Visibilidad visibilidad1 = new Visibilidad();
		Visibilidad visibilidad2 = new Visibilidad();
		visibilidad1.primerMetodo();
		visibilidad2.primerMetodo();
	}
}
