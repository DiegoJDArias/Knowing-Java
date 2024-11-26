/**
 * @author Diego J D Arias
 *
 */
import java.awt.*;
public class EjemploMenu {
	EjemploMenu(){
	
	Frame f = new Frame("Menu");
	MenuBar mb = new MenuBar();
	Menu m1 = new Menu("Archivo");
	Menu m2 = new Menu("Editar");
	Menu m3 = new Menu("Ayuda");
	mb.add(m1);
	mb.add(m2);
	mb.setHelpMenu(m3);
	f.setMenuBar(mb);
	f.setSize(260,260);
	f.setVisible(true);
	}

	public static void main(String args[]) {
		EjemploMenu ej = new EjemploMenu();
		
	}
}
