package latin;

import griego.Alfa;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class Delta extends Alfa {
	
	void metodoAccesor(Alfa a, Delta d) {
		
//		a.estoyProtegido = 10; // ilegal
		d.estoyProtegido = 10; // legal
//		a.metodoProtegido(); // ilegal
		d.metodoProtegido(); // legal
	}
}
