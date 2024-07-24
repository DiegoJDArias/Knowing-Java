package postcondiciones;

public class Pila {
	
	private int vec[] = new int[10];
	private int indice = 0;
	private int elementos = 0;

	
	public void agregar(int valor) throws ExcepcionPila {
		if (indice == 9)
			throw new ExcepcionPila("Pila llena");
		vec[indice] = valor;
		elementos = ++indice;
	}

	public int sacar() throws ExcepcionPila {
		int resultado = 0;
		if (indice == 0)
			throw new ExcepcionPila("Pila vacia");
		elementos = --indice;
		resultado = vec[indice];
		assert (elementos == indice);
		return resultado;
	}

	public static void main(String[] args) {
		
		Pila p = new Pila();
		try {
			p.agregar(8);
			p.agregar(4);
			p.agregar(3);
			p.agregar(9);
			p.agregar(8);
			p.agregar(4);
			p.agregar(3);
			p.agregar(9);
			p.agregar(9);
			
			p.sacar();
			p.sacar();
			p.sacar();
			p.sacar();
			p.sacar();
			p.sacar();
			p.sacar();
			p.sacar();
			p.sacar();
			p.sacar();
			p.sacar();
			p.sacar();
		} catch (ExcepcionPila e) {
			e.printStackTrace();
		}
		System.out.println("se ejecuta");
	}

}
