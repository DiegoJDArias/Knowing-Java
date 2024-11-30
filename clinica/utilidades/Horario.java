package clinica.utilidades;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class Horario{

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
	
	public Horario agregar(int masDias){
		Horario nuevaFecha = new Horario(this);
		nuevaFecha.dia += nuevaFecha.dia;
		return nuevaFecha;
	}
	
	public void imprimir(){
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
