import java.awt.*;
import java.awt.event.*;

public class PruebaClaseAnidada {
  private Frame f;
  private TextField tf;

  public PruebaClaseAnidada() {
    f = new Frame("Ejemplo de clase anidada");
    tf = new TextField(30);
  }

  public void mostrarMarco() {
    Label etiqueta = new Label("Click and drag the mouse");
    // Agregar los componentes al frame
    f.add(etiqueta, BorderLayout.NORTH);
    f.add(tf, BorderLayout.SOUTH);
    // Agregar los listener que utilizan una clase anidada
    f.addMouseMotionListener(this.new MiMouseMotionListener());
    f.addMouseListener(new ManejadorDelClicDelMouse());
    f.setSize(300, 200);
    f.setVisible(true);
  }

  class MiMouseMotionListener extends MouseMotionAdapter {
      public void mouseDragged(MouseEvent e) {
        String s = "Arrastre del Mouse en:  X = "+ e.getX()
                    + " Y = " + e.getY();
        tf.setText(s);
      }
    }

  public static void main(String args[]) {
    PruebaClaseAnidada obj = new PruebaClaseAnidada();
    obj.mostrarMarco();
  }
}
