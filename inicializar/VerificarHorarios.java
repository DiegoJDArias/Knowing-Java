package inicializar;

public class VerificarHorarios {

	/**
	 * @author Diego J D Arias 
	 */
	public static void main(String[] args) {
		Horario h = new Horario(2, 8, 45, 12, 45, 3);
		h.imprimir();
		System.out.println("--------------");
		Horario nuevoHorario = h.agregarDias(3);
		nuevoHorario.imprimir();
	}
}
