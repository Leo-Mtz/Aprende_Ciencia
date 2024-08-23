package juegorecoleccionbasura;

import javax.swing.*;
import java.awt.*;

public class Contenedor {
    private String tipo;
    private Rectangle area;
    private Image imagen;

    // Constructor que acepta una ruta de imagen y un porcentaje de redimensionamiento
    public Contenedor(String tipo, Rectangle area, String rutaAbsolutaImagen) {
    this.tipo = tipo;
    this.area = area;
    Image iconoOriginal = new ImageIcon(Contenedor.class.getResource(rutaAbsolutaImagen)).getImage();

    // Directly resizing the image to 200x200 pixels
    
this.imagen = iconoOriginal.getScaledInstance(150, 150, Image.SCALE_SMOOTH);    
}


    // Método para dibujar la imagen en el panel
    public void dibujar(Graphics g, JPanel panel) {
        if (imagen != null) {
            g.drawImage(imagen, area.x, area.y, panel);
        } else {
            System.err.println("Imagen no disponible");
        }
    }
     public String getTipo() {
        return tipo;
    }

    public Rectangle getArea() {
        return area;
    }
    
}
