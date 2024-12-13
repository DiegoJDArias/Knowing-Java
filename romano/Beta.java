package romano;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

import griego.*;

public class Beta {
	void metodoAccesor() {
	Alfa a = new Alfa();
	a.soyPublico = 10; // legal
	a.metodoPublico(); // legal
	}
}