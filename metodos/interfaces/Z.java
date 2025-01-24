package limites.metodos.interfaces;

import limites.metodos.A;

public class Z <T>{
	
	private T t;

	public void agregar(T t) {
		this.t = t;
	}

	public T obtener() {
		return t;
	}

	public <U extends A & I> void inspeccionar(U u) {
		System.out.println("T: " + t.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
		u.met();
	}
	
}
