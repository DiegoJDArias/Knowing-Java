/**
 * @author Diego J D Arias
 *
 */
import java.awt.*;

public class EjemploBorderLayout {
	private Frame f;
	private Button bn, bs, bw, be, bc;
	
	public EjemploBorderLayout() {
		f = new Frame("Border Layout");
		bn = new Button("B1");
		bs = new Button("B2");
		bw = new Button("B3");
		be = new Button("B4");
		bc = new Button("B5");
	}
	
	public void mostrarMarco() {
		f.add(bn, BorderLayout.NORTH);
		f.add(bs, BorderLayout.SOUTH);
		f.add(bw, BorderLayout.WEST);
		f.add(be, BorderLayout.EAST);
		f.add(bc, BorderLayout.CENTER);
		f.setSize(200,200);
		f.setVisible(true);
		
	}
	public static void main(String args[]) {
		EjemploBorderLayout guiWindow2 = new EjemploBorderLayout();
		guiWindow2.mostrarMarco();
	}
}
