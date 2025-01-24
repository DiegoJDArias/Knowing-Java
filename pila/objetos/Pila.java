package pila.objetos;

import pila.ExcepcionPila;

public class Pila {
	private Object vec[] = new Object[10];
	private int indice = 0;

	public void agregar(Object valor) throws ExcepcionPila {
		if (indice == 9)
			throw new ExcepcionPila("Pila llena");
		vec[indice] = valor;
		indice++;
	}

	public Object sacar() throws ExcepcionPila {
		if (indice == 0)
			throw new ExcepcionPila("Pila vacía");
		indice--;
		return vec[indice];
	}
}
