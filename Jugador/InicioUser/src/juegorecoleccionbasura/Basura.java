package juegorecoleccionbasura;

import javax.swing.*;
import java.awt.*;

public class Basura {
    private String tipo;
    private Rectangle area;
    private Image imagen;
    private Point posicionInicial;
        private boolean colocadaCorrectamente = false;
        
    // Constructor que acepta una ruta de imagen y un porcentaje de redimensionamiento
    public Basura(String tipo, Rectangle area, String rutaAbsolutaImagen) {
    this.tipo = tipo;
    this.area = area;
    Image iconoOriginal = new ImageIcon(Contenedor.class.getResource(rutaAbsolutaImagen)).getImage();

    // Directly resizing the image to 200x200 pixels
    
    this.imagen = iconoOriginal.getScaledInstance(100, 100, Image.SCALE_SMOOTH);  
    this.posicionInicial = new Point(area.x, area.y); // Guardar la posición inicial

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
    public Point getPosicionInicial() {
        return posicionInicial;
    }
    public Rectangle getArea() {
        return area;
    }
    public boolean isColocadaCorrectamente() {
        return colocadaCorrectamente;
    }

    public void setColocadaCorrectamente(boolean colocadaCorrectamente) {
        this.colocadaCorrectamente = colocadaCorrectamente;
    }
    
}
