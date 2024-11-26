/**
 * @author Diego J D Arias
 *
 */
import java.awt.*;

public class EjemploGridBagLayout {
	
	public static void main(String[] args) {
		Frame f = new Frame("Ejemplo de GridBagLayout");
		f.setLayout(new GridBagLayout());
		
		AgregaAlGridBagLayout.add(
			f, new Canvas(), 3, 2, 1, 1, 1, 0,
			GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
		AgregaAlGridBagLayout.add(
			f, new Button("1 - Uno"), 0, 0, 5, 1, 0, 0,
			GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
		AgregaAlGridBagLayout.add(
			f, new Button("2 - Dos"), 0, 1, 1, 1, 0, 0,
			GridBagConstraints.BOTH, GridBagConstraints.CENTER);
		AgregaAlGridBagLayout.add(
			f, new Button("3 - Tres"), 1, 1, 1, 1, 1, 0,
			GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
		AgregaAlGridBagLayout.add(
			f, new Button("4 - Cuatro"), 2,	1, 1, 1, 0, 0,
			GridBagConstraints.BOTH, GridBagConstraints.CENTER);
		AgregaAlGridBagLayout.add(
			f, new Button("5 - Cinco"), 3, 1, 2, 1, 0, 0,
			GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
		AgregaAlGridBagLayout.add(
			f, new Button("6 - Seis"), 0, 2, 1, 4, 0, 0,
			GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
		AgregaAlGridBagLayout.add(
			f, new Button("7 - Siete"), 1, 2, 3, 4, 0, 0,
			GridBagConstraints.BOTH, GridBagConstraints.CENTER);
		AgregaAlGridBagLayout.add(
			f, new Button("8 - Ocho"), 4, 2, 1, 1, 0, 1,
			GridBagConstraints.BOTH, GridBagConstraints.CENTER);
		AgregaAlGridBagLayout.add(
			f, new Button("9 - Nueve"), 4, 3, 1, 1, 0, 1,
			GridBagConstraints.BOTH, GridBagConstraints.CENTER);
		AgregaAlGridBagLayout.add(
			f, new Button("10 - Diez"), 4, 4, 1, 1, 0, 1,
			GridBagConstraints.BOTH, GridBagConstraints.CENTER);
		AgregaAlGridBagLayout.add(
			f, new Button("11 - Once"), 4, 5, 1, 1, 0, 1,
			GridBagConstraints.BOTH, GridBagConstraints.CENTER);
		AgregaAlGridBagLayout.add(
			f, new Button("12 - Doce"), 0, 6, 5, 1, 0, 0,
			GridBagConstraints.BOTH, GridBagConstraints.CENTER);
		f.pack();
		f.setVisible(true);
	}
}
