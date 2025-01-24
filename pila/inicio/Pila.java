package pila.inicio;

import pila.ExcepcionPila;

public class Pila {
	private int vec[] = new int[10];
	private int indice = 0;

	public void agregar(int valor) throws ExcepcionPila {
		if (indice == 9)
			throw new ExcepcionPila("Pila llena");
		vec[indice] = valor;
		indice++;
	}

	public int sacar() throws ExcepcionPila {
		if (indice == 0)
			throw new ExcepcionPila("Pila vacía");
		indice--;
		return vec[indice];
	}
}
