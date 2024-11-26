package inicializar;

/**
 * @author Diego J D Arias
 *
 */
public class AsignacionReferencias {
	
	public void metodo(Horario h){
		int x = 7;
		int y = x;
		Horario h1 = new Horario(2, 8, 45, 12, 45, 3);
		Horario h2 = h;
		h2 = new Horario(2, 8, 45, 12, 45, 3);		
	}

	public static void main(String[] args) {
		AsignacionReferencias a = new AsignacionReferencias();
		int x = 7;
		int y = x;
		Horario h1 = new Horario(2, 8, 45, 12, 45, 3);
		Horario h2 = h1;
		h2 = new Horario(2, 8, 45, 12, 45, 3);
		a.metodo(h2);
	}
}
