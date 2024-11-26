import java.awt.*;

public class EjemploDeSalidaCompleja {
  private Frame f;
  private Panel p;
  private Button bw, bc;
  private Button bfile, bhelp;

  public EjemploDeSalidaCompleja() {
    f = new Frame("Ejemplo De Salida Compleja ");
    bw = new Button("Oeste");
    bc = new Button("Región para el espacio de trabajo");
    bfile = new Button("Archivo");
    bhelp = new Button("Ayuda");
  }

  public void mostrarMarco() {
    f.add(bw, BorderLayout.WEST);
    f.add(bc, BorderLayout.CENTER);
    p = new Panel();
    p.add(bfile);
    p.add(bhelp);
    f.add(p, BorderLayout.NORTH);
    f.pack();
    f.setVisible(true);
  }

  public static void main(String args[]) {
    EjemploDeSalidaCompleja gui = new EjemploDeSalidaCompleja();
    gui.mostrarMarco();
  }
}
