import java.awt.*;
import java.awt.event.*;

public class PruebaClaseAnonima {
  private Frame f;
  private TextField tf;

  public PruebaClaseAnonima() {
    f = new Frame("Ejemplo de clase an�nima");
    tf = new TextField(30);
  }

  public void mostrarMarco() {
    Label label = new Label("Presionar el bot�n del mouse y arrastrarlo");
    // Agregar los componentes al frame
    f.add(label, BorderLayout.NORTH);
    f.add(tf, BorderLayout.SOUTH);
    // Agregar los listener que utilizan una clase an�nima
    f.addMouseMotionListener( new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        String s = "Arrastre del Mouse en:  X = "+ e.getX()
                    + " Y = " + e.getY();
        tf.setText(s);
      }
    }); // <- prestar atenci�n que se cierra con un par�ntesis
    	// y un punto y coma la sentencia
    f.addMouseListener(new ManejadorDelClicDelMouse());
    f.setSize(300, 200);
    f.setVisible(true);
  }

  public static void main(String args[]) {
    PruebaClaseAnonima obj = new PruebaClaseAnonima();
    obj.mostrarMarco();
  }
}
