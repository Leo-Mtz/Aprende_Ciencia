/**
 *Barra.java
 * 
 */
package juegolluvia;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author TALOS
 */
public class  Barra {
    private int x; // Posición de la barra en el eje x
    private final int y; // Posición de la barra en el eje y (fija)
    private final int width; // Ancho de la barra
    private final int height; // Altura de la barra
    private final Image image;

    public Barra(int panelWidth, int panelHeight) {
        this.width = 100; // Puedes ajustar el tamaño de acuerdo a la imagen si es necesario
        this.height = 50; // Puedes ajustar el tamaño de acuerdo a la imagen si es necesario
        this.x = 150; // Centrar la barra horizontalmente
        this.y = panelHeight - height +650; // Posicionar la barra en la parte inferior
        this.image = new ImageIcon(getClass().getResource("canasta.png")).getImage();
    }

   public boolean checkCollision(Circulo circulo) {
    // Get the bounds of the circle
    int circleTop = circulo.getY();
    int circleBottom = circulo.getY() + circulo.getRadius() * 2;
    int circleLeft = circulo.getX();
    int circleRight = circulo.getX() + circulo.getRadius() * 2;

    // Check if the bottom of the circle is at the same level as the bar and within the x range of the bar
    if (circleBottom >= this.y && circleTop <= this.y + this.height) {
        if (circleRight >= this.x && circleLeft <= this.x + this.width) {
            return true; // Collision detected
        }
    }
    return false; // No collision
}


    public int getX() {
        return x;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    
    public int getY() {
    return y;
}


     public boolean moverIzquierda() {
        if (x - 5 >= 0) {
            x -= 5;
            return true;
        }
        return false;
    }

    public boolean moverDerecha(int panelWidth) {
        if (x + width + 5 <= panelWidth) {
            x += 5;
            return true;
        }
        return false;
    }

   public void dibujar(Graphics g) {
        // Dibujar la imagen de la canasta en lugar de un rectángulo
        g.drawImage(image, x, y, width, height, null);
    }
}
