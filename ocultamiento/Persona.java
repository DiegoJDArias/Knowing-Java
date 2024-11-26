package ocultamiento;

public class Persona {
	private String primerNombre;
	private String segundoNombre;
	private String apellido;
	private String documento;

	public Persona() {
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
