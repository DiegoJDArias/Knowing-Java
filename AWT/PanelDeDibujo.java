import java.awt.*;

public class PanelDeDibujo extends Panel {
  private static int SHAPE_WIDTH = 75;
  private static int SHAPE_HEIGHT = 75;
  private static int COLUMN_SPACE_WIDTH = 20;
  private static int ROW_SPACE_HEIGHT = 40;
  private static Font TITLE_FONT = new Font("SanSerif", Font.BOLD, 24);
  private static Font METHOD_FONT = new Font("Monospaced", Font.PLAIN, 14);

  public static int PANEL_WIDTH = (6 * SHAPE_WIDTH) + (7 * COLUMN_SPACE_WIDTH);
  public static int PANEL_HEIGHT = 550; // guess

  public PanelDeDibujo() {
    super();
  }

  /**
   * Este es el método principal para dibujar
   * sobrescribe el método Panel.paint.
   */
  public void paint(Graphics g) {
    int y;

    g.setColor(Color.blue);

    // Dibujar Figuras sin Relleno
    y = 20;
    y = dibujarFigurasSinRelleno(g, y);

    // Dibujar Figuras con Relleno
    y += ROW_SPACE_HEIGHT;
    y = DibujarFigurasConRelleno(g, y);

    // Dibujar otras Figuras 
    y += ROW_SPACE_HEIGHT;
    y = DibujarOtrasFiguras(g, y);
  }

  /**
   * Este método dibuja una fila de Figuras sin Relleno.
   *
   * @return  la coordenada y ajustada (y + la altura de la línea)
   */
  private int dibujarFigurasSinRelleno(Graphics g, int y) {
    int pentagonoXs[] = new int[5];
    int pentagonoYs[] = new int[5];
    int x = 20;

    // Dibujar el título de esta fila
    y = centerText(g, "Figuras Sin Relleno", PANEL_WIDTH/2, y, TITLE_FONT);

    // dibujar un arco
    g.drawArc(x, y, SHAPE_WIDTH, SHAPE_HEIGHT, 0, 90);
    centerText(g, "drawArc", (x + SHAPE_WIDTH/2), y + SHAPE_HEIGHT, METHOD_FONT);
    x = x + SHAPE_WIDTH + COLUMN_SPACE_WIDTH;

    // dibujar un ovalo
    g.drawOval(x, y, SHAPE_WIDTH, SHAPE_HEIGHT);
    centerText(g, "drawOval", (x + SHAPE_WIDTH/2), y + SHAPE_HEIGHT, METHOD_FONT);
    x = x + SHAPE_WIDTH + COLUMN_SPACE_WIDTH;

    // dibujar un polygono
    calculaPentagono(x + SHAPE_WIDTH/2, y + SHAPE_HEIGHT/2, SHAPE_WIDTH/2,
		 pentagonoXs, pentagonoYs);
    g.drawPolygon(pentagonoXs, pentagonoYs, 5);
    centerText(g, "drawPolygon", (x + SHAPE_WIDTH/2), y + SHAPE_HEIGHT, METHOD_FONT);
    x = x + SHAPE_WIDTH + COLUMN_SPACE_WIDTH;

    // dibujar un rectángulo
    g.drawRect(x, y, SHAPE_WIDTH, SHAPE_HEIGHT);
    centerText(g, "drawRect", (x + SHAPE_WIDTH/2), y + SHAPE_HEIGHT, METHOD_FONT);
    x = x + SHAPE_WIDTH + COLUMN_SPACE_WIDTH;

    // dibujar un rectángulo redondeado
    g.drawRoundRect(x, y, SHAPE_WIDTH, SHAPE_HEIGHT, 15, 15);
    centerText(g, "drawRoundRect", x + SHAPE_WIDTH/2, y + SHAPE_HEIGHT, METHOD_FONT);
    x = x + SHAPE_WIDTH + COLUMN_SPACE_WIDTH;

    // dibujar un rectángulo 3D 
    g.draw3DRect(x, y, SHAPE_WIDTH, SHAPE_HEIGHT, true);
    y = centerText(g, "draw3DRect", (x + SHAPE_WIDTH/2), y + SHAPE_HEIGHT, METHOD_FONT);

    return y;
  }


  private int DibujarFigurasConRelleno(Graphics g, int y) {
    int pentagonoXs[] = new int[5];
    int pentagonoYs[] = new int[5];
    int x = 20;

    // dibujar el título de esta fila
    y = centerText(g, "Figuras Con Relleno", PANEL_WIDTH/2, y, TITLE_FONT);

    // dibujar un arco relleno
    g.fillArc(x, y, SHAPE_WIDTH, SHAPE_HEIGHT, 0, 90);
    centerText(g, "fillArc", (x + SHAPE_WIDTH/2), y + SHAPE_HEIGHT, METHOD_FONT);
    x = x + SHAPE_WIDTH + COLUMN_SPACE_WIDTH;

    // dibujar un ovalo relleno
    g.fillOval(x, y, SHAPE_WIDTH, SHAPE_HEIGHT);
    centerText(g, "fillOval", (x + SHAPE_WIDTH/2), y + SHAPE_HEIGHT, METHOD_FONT);
    x = x + SHAPE_WIDTH + COLUMN_SPACE_WIDTH;

    // dibujar un polygono relleno
    calculaPentagono(x + SHAPE_WIDTH/2, y + SHAPE_HEIGHT/2, SHAPE_WIDTH/2,
		 pentagonoXs, pentagonoYs);
    g.fillPolygon(pentagonoXs, pentagonoYs, 5);
    centerText(g, "fillPolygon", (x + SHAPE_WIDTH/2), y + SHAPE_HEIGHT, METHOD_FONT);
    x = x + SHAPE_WIDTH + COLUMN_SPACE_WIDTH;

    // dibujar un rectángulo relleno
    g.fillRect(x, y, SHAPE_WIDTH, SHAPE_HEIGHT);
    centerText(g, "fillRect", (x + SHAPE_WIDTH/2), y + SHAPE_HEIGHT, METHOD_FONT);
    x = x + SHAPE_WIDTH + COLUMN_SPACE_WIDTH;

    // dibujar un rectángulo redondeado relleno
    g.fillRoundRect(x, y, SHAPE_WIDTH, SHAPE_HEIGHT, 15, 15);
    centerText(g, "fillRoundRect", x + SHAPE_WIDTH/2, y + SHAPE_HEIGHT, METHOD_FONT);
    x = x + SHAPE_WIDTH + COLUMN_SPACE_WIDTH;

    // dibujar un rectángulo 3D relleno
    g.fill3DRect(x, y, SHAPE_WIDTH, SHAPE_HEIGHT, true);
    y = centerText(g, "fill3DRect", (x + SHAPE_WIDTH/2), y + SHAPE_HEIGHT, METHOD_FONT);

    return y;
  }

  private int DibujarOtrasFiguras(Graphics g, int y) {
    int pentagonXs[] = new int[5];
    int pentagonYs[] = new int[5];
    int x = 20;

    // dibujar el título de esta fila
    y = centerText(g, "Otras Figuras", PANEL_WIDTH/2, y, TITLE_FONT);

    // dibujar una línea
    g.drawLine(x, y, x + SHAPE_WIDTH, y + SHAPE_HEIGHT);
    centerText(g, "drawLine", (x + SHAPE_WIDTH/2), y + SHAPE_HEIGHT, METHOD_FONT);
    x = x + SHAPE_WIDTH + COLUMN_SPACE_WIDTH;

    // dibujar una poligonal
    calculaPentagono(x + SHAPE_WIDTH/2, y + SHAPE_HEIGHT/2, SHAPE_WIDTH/2,
		 pentagonXs, pentagonYs);
    g.drawPolyline(pentagonXs, pentagonYs, 5);
    centerText(g, "drawPolyline", (x + SHAPE_WIDTH/2), y + SHAPE_HEIGHT, METHOD_FONT);
    x = x + SHAPE_WIDTH + COLUMN_SPACE_WIDTH;

    // dibujar un string
    Font font = new Font("Serif", Font.ITALIC, 10);
    String text = "Este es un string.";
    FontMetrics fm = g.getFontMetrics(font);
    int text_width = fm.stringWidth(text);
    g.setFont(font);
    g.drawString(text, x + SHAPE_WIDTH/2 - text_width/2, y + SHAPE_HEIGHT/2);
    centerText(g, "drawString", (x + SHAPE_WIDTH/2), y + SHAPE_HEIGHT, METHOD_FONT);

    return y;
  }

  /**
   * Este método dibuja el texto centrado en la coordenada X,
   * donde y es el extremo superior del texto y "font" es el
   * tipo de letra deseada
   *
   * @return  La coordenada y ajustada (y + altura del tipo de letra)
   */
  private int centerText(Graphics g, String texto, int x, int y, Font letraFuente) {
    FontMetrics fm = g.getFontMetrics(letraFuente);
    int anchoTexto = fm.stringWidth(texto);
    int alturaTexto = fm.getHeight();
    Color color = g.getColor();

    g.setColor(Color.black);
    g.setFont(letraFuente);
    g.drawString(texto, x - anchoTexto/2, y + alturaTexto/2 + 5);
    g.setColor(color);

    return (y + alturaTexto);
  }

  private void calculaPentagono(int centroX, int centroY, int radio,
			    int[] puntosX, int[] puntosY) {
    double incrementoEnRadianes = 2.0 * Math.PI / 5.0;
    double angulo = 0.0;

    for ( int i = 0; i < 5; i++ ) {
      float x = (float) (radio * Math.sin(angulo));
      float y = (float) (radio * Math.cos(angulo));
      puntosX[i] = Math.round(centroX + x);
      puntosY[i] = Math.round(centroY + y);
      angulo += incrementoEnRadianes;
    }
  }
}
