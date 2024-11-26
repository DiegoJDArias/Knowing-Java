/**
 * @author Diego J D Arias
 *
 */
import java.awt.*;

public class EjemploFrame {
	private Frame f;
	
	public EjemploFrame() {
	f = new Frame("Mi Primera Ventana!!!");
	}
	
	public void mostrarMarco() {
		f.setSize(560,260);
		f.setBackground(Color.orange);
		f.setVisible(true);
	}
	
	public static void main(String args[]) {
		EjemploFrame guiWindow = new EjemploFrame();
		guiWindow.mostrarMarco();
	}
}
