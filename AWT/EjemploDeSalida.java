/**
 * @author Diego J D Arias
 *
 */
import java.awt.*;

public class EjemploDeSalida {
	private Frame f;
	private Button b1;
	private Button b2;
	
	public EjemploDeSalida() {
		f = new Frame("Ejemplo de GUI");
		b1 = new Button("Presioname");
		b2 = new Button("No me presiones");
	}
	
	public void mostrarMarco() {
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		f.pack();
		f.setVisible(true);
	}
	
	public static void main(String args[]) {
		EjemploDeSalida guiWindow = new EjemploDeSalida();
		guiWindow.mostrarMarco();
	}
}
