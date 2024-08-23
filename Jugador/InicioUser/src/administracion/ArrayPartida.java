package administracion;


public class ArrayPartida {
    public int Id;
    public String Juego;
    public String Usuario;
    public int Puntuacion;
    public ArrayPartida(){
        
    }
    
    
    public ArrayPartida(int Id,String Usuario,String Juego,int Puntuacion){
        this.Id=Id;
        this.Juego=Juego;
        this.Usuario=Usuario;
        this.Puntuacion=Puntuacion;
    }
}
