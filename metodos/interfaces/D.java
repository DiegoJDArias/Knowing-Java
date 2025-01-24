package limites.metodos.interfaces;

import limites.metodos.B;

public class D<H> extends B implements I{
	private H h;

	@Override
	public void met() {
		System.out.println("H: " + h.getClass().getName() +
				". Invocado polimorficamente");
	}

}
