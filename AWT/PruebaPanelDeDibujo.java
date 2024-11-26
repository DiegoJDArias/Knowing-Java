import java.awt.*;

public class PruebaPanelDeDibujo {
  private Frame f;
  private PanelDeDibujo panelDeDibujo;

  public PruebaPanelDeDibujo() {
    f = new Frame("Figuras Para Dibujar");
    panelDeDibujo = new PanelDeDibujo();
  }

  public void mostrarMarco() {
    f.add(panelDeDibujo);
    f.pack();
    f.setSize(new Dimension(PanelDeDibujo.PANEL_WIDTH,
			    PanelDeDibujo.PANEL_HEIGHT));
    f.setVisible(true);
  }

  public static void main(String args[]) {
    PruebaPanelDeDibujo gui = new PruebaPanelDeDibujo();
    gui.mostrarMarco();
  }
}
