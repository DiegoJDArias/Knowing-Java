package limites.metodos;

public class Z <T extends A>{
	private T t;

	public void agregar(T t) {
		this.t = t;
	}

	public T obtener() {
		return t;
	}

	public <U extends A> void inspeccionar(U u) {
		System.out.println("T: " + t.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}
}
