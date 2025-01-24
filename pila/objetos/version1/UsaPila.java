package pila.objetos.version1;

import pila.ExcepcionPila;
import pila.objetos.Pila;

public class UsaPila {
	public static void main(String[] args) {
		Pila p = new Pila();
		
		try {
			p.agregar("Hola");
			p.agregar(new Integer(8));
			p.agregar(new Float(8.8));
			p.agregar(new Integer(9));			

			double total = (double) p.sacar() + 
					(double)  p.sacar() +
					(double)  p.sacar();
			System.out.println(total);
			
		} catch (ExcepcionPila e) {
			e.printStackTrace();
		}
	}

}
