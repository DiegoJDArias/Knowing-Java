import java.awt.*;

public class EjemploSimpleAwt {
  private Frame f;
  private Panel p;
  private Button bw, bc;
  private Button bArchivo, bGuardar;

  public EjemploSimpleAwt() {
    f = new Frame("Ejemplo Simple de Awt");
    bw = new Button("West - Oeste");
    bc = new Button("Center - Región para espacio de trabajo - Centro");
    bArchivo = new Button("Archivo");
    bGuardar = new Button("Guardar");
  }

  public void mostrarMarco() {
    f.add(bw, BorderLayout.WEST);
    f.add(bc, BorderLayout.CENTER);
    p = new Panel();
    p.add(bArchivo);
    p.add(bGuardar);
    f.add(p, BorderLayout.NORTH);
    f.pack();
    f.setVisible(true);
  }

  public static void main(String args[]) {
    EjemploSimpleAwt gui = new EjemploSimpleAwt();
    gui.mostrarMarco();
  }
}
