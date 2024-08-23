

/**
 *CirculoRojo.java
 * 
 */
package juegolluvia;
import javax.swing.*;
import java.awt.*;
import java.util.List; // Importar List
import java.util.Random;

import java.util.List;
public class CirculoRojo extends Circulo {
    private Image imagen;
    private static final String[] imagenesRojas = {"bRoja1.png", "bRoja2.png", "bRoja3.png"};
    private static final Random rnd = new Random();

    public CirculoRojo(JuegoLluvia juego, List<Circulo> objetos, Barra barra) {
        super(juego, objetos, barra);
        cargarImagen();
    }

    private void cargarImagen() {
        // Elige un índice aleatorio entre 0 y la longitud del array de imágenes
        int index = rnd.nextInt(imagenesRojas.length);
        // Carga la imagen correspondiente al índice aleatorio
        ImageIcon ii = new ImageIcon(getClass().getResource(imagenesRojas[index]));
        imagen = ii.getImage();
    }
    

    @Override
    public void mover() {
        // Implementación específica para CirculoRojo
        if (!juego.juegoEnPausa) {
            int velocidad = calcularVelocidad(juego.dificultad);
            y += velocidad;
            comprobarColision();
        }
    }

   @Override
    protected void comprobarColision() {
        if (barra.checkCollision(this)) {
            juego.updateScore(20);
            marcarParaEliminar();
        } else if (y + radius * 2 >= panel.getHeight()) {
            juego.updateScore(-penalizacionPorPerdida());
            marcarParaEliminar();
        }
    }


@Override
    public int penalizacionPorPerdida() {
        return 20; // Penalización para el círculo rojo
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




