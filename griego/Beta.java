package griego;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class Beta {
	void metodoAccesor() {
	Alfa a = new Alfa();
	a.estoyProtegido = 10; // legal
	a.metodoProtegido(); // legal
	}
}