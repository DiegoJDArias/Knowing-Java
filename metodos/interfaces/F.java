package limites.metodos.interfaces;

import limites.metodos.A;

public class F<H> extends A implements I {
	private H h;
	
	
	public F(H h) {
		this.h = h;
	}

	@Override
	public void met() {
		System.out.println("H: " + h.getClass().getName() +
				". Invocado polimorficamente");
	}

}
