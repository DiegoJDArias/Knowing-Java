package instancia;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class Persona {
	protected String primerNombre;
	protected String segundoNombre;
	protected String apellido;
	protected String documento;
	
	public Persona(String p,
	String s,
	String a,
	String d) {
		primerNombre = p;
		segundoNombre = s;
		apellido = a;
		documento = d;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDocumento() {
		return documento;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setApellido(String string) {
		apellido = string;
	}

	public void setDocumento(String string) {
		documento = string;
	}

	public void setPrimerNombre(String string) {
		primerNombre = string;
	}

	public void setSegundoNombre(String string) {
		segundoNombre = string;
	}
}
