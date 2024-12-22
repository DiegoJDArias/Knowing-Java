/*
 * Created on Jul 22, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
import java.net.*;

public class ExcepcionAccesoAlServidor extends ConnectException {
	private int puerto;
	public ExcepcionAccesoAlServidor(String mensaje, int puerto) {
		super(mensaje);
		this.puerto = puerto;
	}
	// Usar getMessage() para recuperar el string que 
	//describe la excepción
	public int getPuerto() {
		return puerto;
	}
}
