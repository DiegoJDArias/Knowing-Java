import java.awt.*;

public class PruebaUnBoton {
  private Frame f;
  private Button b;

  public PruebaUnBoton() {
    f = new Frame("Prueba");
    b = new Button("Presioname!");
    b.setActionCommand("Boton Presionado");
  }

  public void mostrarMarco() {
    b.addActionListener(new ManejadorDeBoton());
    f.add(b, BorderLayout.CENTER);
    f.pack();
    f.setVisible(true);
  }

  public static void main(String args[]) {
    PruebaUnBoton ApConGUI = new PruebaUnBoton();
    ApConGUI.mostrarMarco();
  }
}
