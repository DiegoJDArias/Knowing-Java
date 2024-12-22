/*
 * Created on Jul 22, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */


public class PruebaCliente {

	public static void main(String[] args) {
		Cliente c=new Cliente();
		try{
			c.conectar("127.0.0.1");
		}
		catch(ExcepcionAccesoAlServidor e){
			System.out.println("Reintentando conectarse el cliente");
			c.encontrarServidor();
		}
		
	}
}
