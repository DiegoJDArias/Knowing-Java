package instancia;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class AgenteDeSeguridad extends Persona{

	private String nroLicencia;
	
	public AgenteDeSeguridad(String p, String s, String a, String d) {
		super(p, s, a, d);
	}
	
	/**
	 * @return
	 */
	public String getNroLicencia() {
		return nroLicencia;
	}

	/**
	 * @param string
	 */
	public void setNroLicencia(String string) {
		nroLicencia = string;
	}
}
