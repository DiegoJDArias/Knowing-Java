package clinica.medicos;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public abstract class Medico {

	private String nombre;
	private String apellido;
	private String especialidad;
	protected int turnosPorHora = 0;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getTurnosPorHora() {
		return turnosPorHora;
	}

	public void setTurnosPorHora(int turnosPorHora) {
		this.turnosPorHora = turnosPorHora;
	}

}