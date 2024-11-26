/**
 * @author Diego J D Arias
 *
 */
import java.awt.*;
public class EjemploMenuItem {

	EjemploMenuItem() {

		Frame f = new Frame("Menu");
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("Archivo");
		Menu m2 = new Menu("Editar");
		Menu m3 = new Menu("Ayuda");
		mb.add(m1);
		mb.add(m2);
		mb.setHelpMenu(m3);
		MenuItem mi1 = new MenuItem("Nuevo");
		MenuItem mi2 = new MenuItem("Guardar");
		MenuItem mi3 = new MenuItem("Cargar");
		MenuItem mi4 = new MenuItem("Salir");
		CheckboxMenuItem mi5 = new CheckboxMenuItem("Persistente");
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.addSeparator();
		m1.add(mi4);
		m1.add(mi5);
		f.setMenuBar(mb);
		f.setSize(260, 260);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		EjemploMenuItem ej = new EjemploMenuItem();

	}
}
