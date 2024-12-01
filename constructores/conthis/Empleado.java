package constructores.conthis;

public class Empleado {
	private String nombre;
	private Fecha fechaNacimiento;
	private double salario;
	private static final double SALARIO_BASE = 15000.00;

	// Constructor
	public Empleado(String nombre, Fecha fDN, double salario) {
		this.nombre = nombre;
		this.fechaNacimiento = fDN;
		this.salario = salario;
	}

	public Empleado(String nombre, double salario) {
		this(nombre, null, salario);
	}

	public Empleado(String nombre, Fecha fDN) {
		this(nombre, fDN, SALARIO_BASE);
	}

	public Empleado(String nombre) {
		this(nombre, SALARIO_BASE);
	}
}
