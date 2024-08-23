package juegolluvia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionListener;  

public abstract class Circulo implements Runnable {
    protected int x; // Posición X del círculo
    protected int y; // Posición Y del círculo
    protected int radius; // Radio del círculo
    protected JPanel panel; 
    protected List<Circulo> objetos; // Lista de todos los círculos en el juego
    protected JuegoLluvia juego; // Referencia al juego principal
    protected Barra barra; 
    private Timer timer; // Temporizador 
    public abstract int penalizacionPorPerdida(); // Método circulo rojo, circulo verde

    public Circulo(JuegoLluvia juego, List<Circulo> objetos, Barra barra) {
        this.juego = juego;
        this.panel = juego.getPanel();
        this.objetos = objetos;
        this.barra = barra;
        Random random = new Random();
        radius = 20;
        x = random.nextInt(panel.getWidth() - 2 * radius);// Genera una posición aleatoria en el eje X
        y = 0;
    }
    private boolean eliminar = false;

    

    public boolean debeEliminarse() {
        return eliminar;
    }

    protected void marcarParaEliminar() {
        eliminar = true;
    }

    public void mover() {
        if (!juego.juegoEnPausa) {
            int velocidad = calcularVelocidad(juego.dificultad);
            y += velocidad;

            if (y + 2 * radius >= panel.getHeight()) {
                juego.updateScore(-penalizacionPorPerdida()); // Resta la penalización
                objetos.remove(this);
            } else {
                comprobarColision();
            }
        }
    }

    
    protected int calcularVelocidad(JuegoLluvia.Dificultad dificultad) {
        switch (dificultad) {
            case FACIL: return 2;
            case MEDIO: return 4;
            case DIFICIL: return 7;
            default: return 1;
        }
    }

    protected void comprobarColision() {
        if (barra.checkCollision(this)) {
            juego.updateScore(1);
            objetos.remove(this);
        }
    }

    @Override
    public void run() {
        
    }

    public void dibujar(Graphics g) {
        g.setColor(obtenerColor());
        g.fillOval(x, y, radius * 2, radius * 2);
    }

    protected abstract Color obtenerColor();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    
}
