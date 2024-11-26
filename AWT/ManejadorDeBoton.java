import java.awt.event.*;

public class ManejadorDeBoton implements ActionListener {
	
  public void actionPerformed(ActionEvent e) {
	  
    System.out.println("Ocurrio una accion");
    
    System.out.println("El comando del boton es: "
                       + e.getActionCommand());
  }
}
