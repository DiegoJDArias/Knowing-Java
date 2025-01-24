package limites.metodos;

public class Metodo<T> {

	private T t;

	public void agregar(T t) {
		this.t = t;
	}

	public T obtener() {
		return t;
	}

	public <U extends Number> void inspeccionar(U u) {
		System.out.println("T: " + t.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}

	public static void main(String[] args) {
		Metodo<Integer> enteroA = new Metodo<Integer>();
		enteroA.agregar(new Integer(10));
		// Usar autoboxing
		enteroA.inspeccionar(3);
		// La proxima linea da error porque un
		// String no es del tipo Number
//		entero.inspeccionar("una cadena");
	}
}
