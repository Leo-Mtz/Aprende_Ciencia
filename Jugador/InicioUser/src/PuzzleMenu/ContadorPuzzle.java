/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PuzzleMenu;

/**
 *
 * @author DELL
 */
public class ContadorPuzzle {
     private static int contador = 0;
     private static int contadorfacil=0;
     private static int contadormedio=0;
     private static int contadordificil=0;

    public static void incrementar() {
        contador++;
    }

    public static int obtenerContador() {
        return contador;
    }
    
    public static void incrementarfacil(){
        contadorfacil++;
        
    }
    
    public static void incrementarmedio(){
        contadormedio++;
    }
    
    public static void incrementardificil(){
        contadordificil++;
    }
    
}
