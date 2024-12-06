package griego;

public class Gama {
	public void metodoAccesor() {
		Alfa a = new Alfa();
		a.estoyProtegido = 10; // legal
		a.metodoProtegido(); // legal
	}
}
