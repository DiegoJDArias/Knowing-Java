package interfaces.comparator;

/**
 * Esta clase esta diseñada para manejar horarios de ingreso y egreso del
 * personal de la clinica
 */

public class Horario implements Comparable<Horario> {

	private int dia = 0;
	private int horaComienzo = 0;
	private int minutosComienzo = 0;
	private int horaFin = 0;
	private int minutosFin = 0;
	private int turnosPorHora = 0;

	public Horario(int dia, int horaComienzo, int minutosComienzo, int horaFin,
			int minutosFin, int turnosPorHora) {
		super();
		this.dia = dia;
		this.horaComienzo = horaComienzo;
		this.minutosComienzo = minutosComienzo;
		this.horaFin = horaFin;
		this.minutosFin = minutosFin;
		this.turnosPorHora = turnosPorHora;
	}

	public Horario(Horario f) {
		this.dia = f.dia;
		this.horaComienzo = f.horaComienzo;
		this.minutosComienzo = f.minutosComienzo;
		this.horaFin = f.horaFin;
		this.minutosFin = f.minutosFin;
	}

	public Horario agregar(int masDias) {
		Horario nuevaFecha = new Horario(this);
		nuevaFecha.dia += nuevaFecha.dia;
		return nuevaFecha;
	}

	public void imprimir() {
		System.out.println("Horario: ");
		System.out.println("D�a: " + dia);
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dia;
		result = prime * result + horaComienzo;
		result = prime * result + horaFin;
		result = prime * result + minutosComienzo;
		result = prime * result + minutosFin;
		result = prime * result + turnosPorHora;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Horario other = (Horario) obj;
		if (dia != other.dia)
			return false;
		if (horaComienzo != other.horaComienzo)
			return false;
		if (horaFin != other.horaFin)
			return false;
		if (minutosComienzo != other.minutosComienzo)
			return false;
		if (minutosFin != other.minutosFin)
			return false;
		if (turnosPorHora != other.turnosPorHora)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Horario [dia=" + dia + ", horaComienzo=" + horaComienzo
				+ ", minutosComienzo=" + minutosComienzo + ", horaFin="
				+ horaFin + ", minutosFin=" + minutosFin + ", turnosPorHora="
				+ turnosPorHora + "]";
	}

	@Override
	public int compareTo(Horario o) {
		if (dia > o.dia || horaComienzo > o.horaComienzo
				|| minutosComienzo > o.minutosComienzo || horaFin > o.horaFin
				|| minutosFin > o.minutosFin)
			return 1;
		else if (dia < o.dia || horaComienzo < o.horaComienzo
				|| minutosComienzo < o.minutosComienzo || horaFin < o.horaFin
				|| minutosFin < o.minutosFin)
			return -1;
		else
			return 0;
	}
}
