package inicializar;

/**
 * Esta clase esta diseñada para manejar horarios de ingreso y egreso de médicos
 * de una clínica.
 */

public class Horario {

	private int dia = 1;
	private int horaComienzo = 9;
	private int minutosComienzo = 30;
	private int horaFin = 18;
	private int minutosFin = 30;
	private int turnosPorHora = 4;

	public Horario(int d, int hc, int mc, int hf, int mf, int tph) {
		dia = d;
		horaComienzo = hc;
		minutosComienzo = mc;
		horaFin = hf;
		minutosFin = mf;
		turnosPorHora = tph;
	}

	public Horario(Horario f) {
		dia = f.dia;
		horaComienzo = f.horaComienzo;
		minutosComienzo = f.minutosComienzo;
		horaFin = f.horaFin;
		minutosFin = f.minutosFin;
		turnosPorHora = f.turnosPorHora;
	}

	public Horario agregarDias(int masDias) {
		Horario nuevaFecha = new Horario(this);
		nuevaFecha.dia = nuevaFecha.dia + masDias;
		return nuevaFecha;
	}

	public void imprimir() {
		System.out.println("Horario: ");
		System.out.println("Día: " + dia);
		System.out.println("Hora de comienzo: " + horaComienzo);
		System.out.println("Minutos de comienzo: " + minutosComienzo);
		System.out.println("Hora de fin: " + horaFin);
		System.out.println("Minutos de fin: " + minutosFin);
		System.out.println("Turnos por hora:" + turnosPorHora);
	}

	public int getDia() {
		return dia;
	}

	public int getHoraComienzo() {
		return horaComienzo;
	}

	public int getMinutosComienzo() {
		return minutosComienzo;
	}

	public int getHoraFin() {
		return horaFin;
	}

	public int getMinutosFin() {
		return minutosFin;
	}

	public int getTurnosPorHora() {
		return turnosPorHora;
	}
}
