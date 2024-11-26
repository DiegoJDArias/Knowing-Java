/**
 * @author Diego J D Arias
 *
 */
import java.awt.*;

public class EjemploFlowLayout {
	private Frame f;
	private Button button1;
	private Button button2;
	private Button button3;
	
	public EjemploFlowLayout() {
		f = new Frame("Flow Layout");
		button1 = new Button("Ok");
		button2 = new Button("Open");
		button3 = new Button("Close");
	}
	public void mostrarMarco() {
		f.setLayout(new FlowLayout());
		f.add(button1);
		f.add(button2);
		f.add(button3);
		f.setSize(100,100);
		f.setVisible(true);
	}
	
	public static void main(String args[]) {
		EjemploFlowLayout guiWindow = new EjemploFlowLayout();
		guiWindow.mostrarMarco();
	}
}
