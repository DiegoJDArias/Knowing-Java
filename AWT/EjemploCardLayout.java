import java.awt.*;
import java.awt.event.*;

public class EjemploCardLayout implements MouseListener {
  private Panel p1, p2, p3, p4, p5;
  private Label e1, e2, e3, e4, e5;

  // Declarar un objeto del tipo CardLayout 
  // Para llamar a sus métodos.
  private CardLayout baraja;
  private Frame f;

  public EjemploCardLayout() {
    f = new Frame ("Prueba del CardLayout");
    baraja = new CardLayout();

    // Crear los paneles que se quieren usar como cartas.
    p1 = new Panel();
    p2 = new Panel();
    p3 = new Panel();
    p4 = new Panel();
    p5 = new Panel();

    // Crear las etiquetas para cada panel
    e1 = new Label("Este es el primer panel");
    e2 = new Label("Este es el segundo panel");
    e3 = new Label("Este es el tercer panel");
    e4 = new Label("Este es el cuarto panel");
    e5 = new Label("Este es el quinto panel");
  }

  public void mostrarMarco() {
    f.setLayout(baraja);

    // cambiar el color de cada panel, 
    // para distinguirlos fácilmente
    p1.setBackground(Color.yellow);
    p1.add(e1);
    p2.setBackground(Color.green);
    p2.add(e2);
    p3.setBackground(Color.magenta);
    p3.add(e3);
    p4.setBackground(Color.white);
    p4.add(e4);
    p5.setBackground(Color.cyan);
    p5.add(e5);

    // Manejo de eventos de mouse.
    p1.addMouseListener(this);
    p2.addMouseListener(this);
    p3.addMouseListener(this);
    p4.addMouseListener(this);
    p5.addMouseListener(this);

    // Agregar cada panel al CardLayout
    f.add(p1, "Primero");
    f.add(p2, "Segundo");
    f.add(p3, "Tercero");
    f.add(p4, "Cuarto");
    f.add(p5, "Quinto");

    // Mostrar el primer panel.
    baraja.show(f, "Primero");

    f.setSize(200,200);
    f.setVisible(true);
  }

  public void mousePressed(MouseEvent e) {
    baraja.next(f);
  }

  public void mouseReleased(MouseEvent e) { }
  public void mouseClicked(MouseEvent e) { }
  public void mouseEntered(MouseEvent e) { }
  public void mouseExited(MouseEvent e) { }

  public static void main (String args[]) {
    EjemploCardLayout ecl = new EjemploCardLayout();
    ecl.mostrarMarco();
  }
}

