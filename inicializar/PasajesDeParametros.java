package inicializar;

public class PasajesDeParametros {

	// Métodos para cambiar los valores actuales.
	public void cambiarEntero(int valor) {
		valor = 55;
	}

	public void cambiarRefObjeto(Horario ref) {
		ref = new Horario(1, 7, 30, 11, 00, 4);
	}

	public void cambiarAtributoObjeto(Horario ref) {
		ref.agregarDias(4);
	}

	public static void main(String args[]) {
		PasajesDeParametros p = new PasajesDeParametros();
		Horario h;
		int val;

		// Asignarle un valor al entero
		val = 11;
		// Intento de cambiarlo
		p.cambiarEntero(val);
		// ¿Cuál es el valor actual?
		System.out.println("El valor del entero es: " + val);

		System.out.println("-------------------");
		
		// Asignar un objeto del tipo Horario
		h = new Horario(2, 8, 45, 12, 45, 3);
		// Intento por cambiarlo
		p.cambiarRefObjeto(h);
		// ¿Cuál es el valor actual?
		h.imprimir();

		System.out.println("-------------------");
		
		// Cambiando el atributo day
		// a través de la referencia al objeto
		p.cambiarAtributoObjeto(h);
		// ¿Cuál es el valor actual?
		h.imprimir();
	}
}
