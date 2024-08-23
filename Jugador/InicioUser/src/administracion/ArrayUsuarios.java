package administracion;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class ArrayUsuarios {
    public int Id;
    public String Tipo;
    public String Nombre;
    public String Correo;
    public String Contraseña;
    public int Puntuacion;
    public ArrayUsuarios(){
        
    }
    
    
    public ArrayUsuarios(int Id,String Tipo,String Nombre,String Correo,String Contraseña,int Puntuacion){
        this.Id=Id;
        this.Tipo=Tipo;
        this.Nombre=Nombre;
        this.Correo=Correo;
        this.Contraseña=Contraseña;
        this.Puntuacion=Puntuacion;
    }
}
