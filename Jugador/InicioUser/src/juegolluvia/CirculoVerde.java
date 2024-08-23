
/**
 *CirculoVerde.java
 * 
 */

package juegolluvia;
import javax.swing.*;
import java.awt.*;
import java.util.List; // Importar List
import java.util.Random;

import java.util.List;
public class CirculoVerde extends Circulo {
    private Image imagen;
    private static final String[] imagenesVerdes = {"bVerde1.png", "bVerde2.png", "bVerde3.png"};
    private static final Random rnd = new Random();

    public CirculoVerde(JuegoLluvia juego, List<Circulo> objetos, Barra barra) {
        super(juego, objetos, barra);
        cargarImagen();
    }

    private void cargarImagen() {
        // Elige un índice aleatorio entre 0 y la longitud del array de imágenes
        int index = rnd.nextInt(imagenesVerdes.length);
        // Carga la imagen correspondiente al índice aleatorio
        ImageIcon ii = new ImageIcon(getClass().getResource(imagenesVerdes[index]));
        imagen = ii.getImage();
    }
    
    @Override
    public void mover() {
        // Implementación específica para CirculoVerde
        if (!juego.juegoEnPausa) {
            int velocidad = calcularVelocidad(juego.dificultad);
            y += velocidad;
            comprobarColision();
        }
    }
    

   @Override
    protected void comprobarColision() {
        if (barra.checkCollision(this)) {
            juego.updateScore(100);
            marcarParaEliminar();
        } else if (y + radius * 2 >= panel.getHeight()) {
            juego.updateScore(-penalizacionPorPerdida());
            marcarParaEliminar();
        }
    }





@Override
    public int penalizacionPorPerdida() {
        return 80; // Penalización para el círculo verde
    }


    @Override
    protected Color obtenerColor() {
        return null;
    }

     @Override
    public void dibujar(Graphics g) {
        // Aquí dibujamos la imagen en lugar de un círculo
        g.drawImage(imagen, getX(), getY(), getRadius() * 3, getRadius() * 3, null);
    }
}
