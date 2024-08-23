package Perfil;

import administracion.*;


public class ArrayMisPartidas {
    public int Id;
    public String Juego;
    public String Usuario;
    public int Puntuacion;
    public ArrayMisPartidas(){
        
    }
    
    
    public ArrayMisPartidas(int Id,String Usuario,String Juego,int Puntuacion){
        this.Id=Id;
        this.Juego=Juego;
        this.Usuario=Usuario;
        this.Puntuacion=Puntuacion;
    }
}
