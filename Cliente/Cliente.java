/*
 * Created on Jul 22, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
import java.io.*;
import java.net.ConnectException;
import java.net.Socket;


/**
 * @author Administrator
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Cliente {
	Socket s1;
	String servidorPorDefecto = "127.0.0.1"; //Este es el localhost
	String servidorAlternativo = "192.168.0.1";
	int puertoServidor = 5432;
	

	public void conectar(String nomServidor) throws ExcepcionAccesoAlServidor {

		try {
				Socket s1 = new Socket(nomServidor, 5432);	//Abrir una conexión al
										 					//server en el puerto 5432. 
				System.out.println("Conectado al servidor");
				InputStream is = s1.getInputStream(); 	//Obtener una corriente de
								 						//entrada del socket
				DataInputStream dis = new DataInputStream(is); // Usar un decorador
				System.out.println(dis.readUTF());	//Leer la entrada y sacarla por
							 						//pantalla
				dis.close(); //Cerrar la corriente y la conexión
				s1.close();
				} catch (ConnectException connExc) {
					System.err.println("Error al conectar al servidor.");
					System.out.println("Lanzando nuevamente la excepción.");
					throw new ExcepcionAccesoAlServidor(
						"No se puede conectar al servidor.",
						puertoServidor);
				} catch (IOException e) {
					System.err.println("Excepción Diferente a ExcepcionAccesoAlServidor.");
					System.out.println("Lanzando nuevamente la excepción.");
					throw new ExcepcionAccesoAlServidor(
						"No se puede conectar al servidor.",
						puertoServidor);
				}
	}
	public void encontrarServidor() {
		try {
			conectar(servidorPorDefecto);
		} catch (ExcepcionAccesoAlServidor e) {
			System.out.println("Tiempo agotado para este servidor. Tratando con otro");
			try {
				conectar(servidorAlternativo);
			} catch (ExcepcionAccesoAlServidor e1) {
				System.err.println("Error: " + e1.getMessage() + 
					" Error al conectarse al puerto " + e1.getPuerto());
					e.printStackTrace();
			}
		}
	}

}
