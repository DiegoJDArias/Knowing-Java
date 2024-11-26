/**
 * @author Diego J D Arias
 *
 */
import java.awt.*;
public class FrameConPanel {
	private Frame f;
	private Panel pan;
	public FrameConPanel(String title) {
		f = new Frame(title);
		pan = new Panel();
	}
	public void mostrarMarco() {
		f.setSize(560,260);
		f.setBackground(Color.orange);
		f.setLayout(null); // Sobrescribe el layout por defecto
		pan.setSize(100,100);
		pan.setBackground(Color.yellow);
		f.add(pan);
		f.setVisible(true);

	}
	public static void main(String args[]) {
		FrameConPanel ej = new FrameConPanel("Frame con Panel");
		ej.mostrarMarco();
	}
}

