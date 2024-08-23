/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PuzzleMenu;

/**
 *
 * @author DELL
 */
public class Jugador {
    
    private int puntos=0;
    
    
    public void agregarPuntos(int cantidad){
        puntos+=cantidad;
    }
    
    public Jugador()
    {
        puntos=0;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
    
}
