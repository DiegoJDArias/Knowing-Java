import java.awt.*;
import java.awt.event.*;

public class DosListeners
     implements MouseMotionListener, 
                MouseListener {
  private Frame f;
  private TextField tf;

  public DosListeners() {
    f = new Frame("Ejemplo de dos listeners");
    tf = new TextField(30);
  }

  public void mostrarMarco() {
    Label etiqueta = new Label("Hacer clic y arrastrar el mouse");
    // Agregar los componentes al frame (marco)
    f.add(etiqueta, BorderLayout.NORTH);
    f.add(tf, BorderLayout.SOUTH);
    // Agregar este objeto como un listener
    f.addMouseMotionListener(this);
    f.addMouseListener(this);
    f.setSize(300, 200);
    f.setVisible(true);
  }

  // Estos son los manejadores de eventos para MouseMotionListener
  public void mouseDragged(MouseEvent e) {
    String s =  "Arrastre del Mouse en:  X = " + e.getX()
                + " Y = " + e.getY();
    tf.setText(s);
  }

  public void mouseEntered(MouseEvent e) {
    String s = "El mouse ha ingresado";
    tf.setText(s);
  }

  public void mouseExited(MouseEvent e) {
    String s = "EL mouse ha dejado el edificio";
    tf.setText(s);
  }

  // Métodos sin usar de MouseMotionListener.
  // Todos los métodos tiene que sobrescribirse
  // para que se pueda utilizar este objeto
  // como un listener, aunque no se utilicen
  public void mouseMoved(MouseEvent e) { }

  // Métodos sin usar de MouseListener.
  public void mousePressed(MouseEvent e) { }
  public void mouseClicked(MouseEvent e) { }
  public void mouseReleased(MouseEvent e) { }

  public static void main(String args[]) {
    DosListeners dosL = new DosListeners();
    dosL.mostrarMarco();
  }
}
