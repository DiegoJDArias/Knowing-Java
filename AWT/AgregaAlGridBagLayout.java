/**
 * @author Diego J D Arias
 *
 */
import java.awt.*;

public class AgregaAlGridBagLayout {
	// Esto esta bien para no sobrescribir todo el tiempo
	// Tener cuidado que no es thread safe
	static GridBagConstraints cons = new GridBagConstraints();
	
	public static void add(Container cont, Component comp, int x, int y, 
		int ancho, int alto, int pesoEnX, int pesoEnY, int llenar, int anclaje){
			
			cons.gridx = x;
			cons.gridy = y;
			cons.gridwidth = ancho;
			cons.gridheight = alto;
			cons.weightx = pesoEnX;
			cons.weighty = pesoEnY;
			cons.anchor = anclaje;
			cont.add(comp, cons);
		}
}
