package pila.genericos.version2;

import pila.ExcepcionPila;

public class Pila <T>{
	private Object vec[] = new Object[10];
	private int indice = 0;

	public void agregar(T valor) throws ExcepcionPila {
		if (indice == 9)
			throw new ExcepcionPila("Pila llena");
		vec[indice] = valor;
		indice++;
	}

	public T sacar() throws ExcepcionPila {
		if (indice == 0)
			throw new ExcepcionPila("Pila vacía");
		indice--;
		return (T) vec[indice];
	}
}
