package pila.genericos.version3;

import java.util.ArrayList;
import pila.ExcepcionPila;

public class Pila <T>{
	
	private ArrayList<T> vec = new ArrayList<T>();
	private int indice = 0;

	public void agregar(T valor){
		vec.add(valor);
		indice++;
	}

	public T sacar() throws ExcepcionPila {
		if (indice == 0)
			throw new ExcepcionPila("Pila vacia");
		T t = vec.get(indice);
		vec.remove(indice);
		indice--;
		return t;
	}
}
