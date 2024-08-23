package Perfil;

import administracion.ArrayUsuarios;
import conexiones.SQLConexion;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


/**
 *
 * @author jesus
 */
public class NuevaPartida {
    SQLConexion con= new SQLConexion();
    Connection cn= con.getConectarDB();
    
    
    
    public NuevaPartida(int id, int juego, int puntuacion){
        int puntjug=0;
        int partidjug=0;
        
        System.out.println(""+id);
        System.out.println(""+juego);
        System.out.println(""+id);
        //encontramos la puntuacion de el jugador
         String consultasql=("SELECT puntuaciontot FROM usuarios WHERE Id="+id);
        
        
        try{
            Statement st;
            st = (Statement) cn.createStatement();
            ResultSet rs= st.executeQuery(consultasql);
            
            while(rs.next()){

                puntjug=rs.getInt(1);
                //Object [] lista= {rs.getInt(1),new JLabel(mIcono),rs.getString(3),rs.getString(4),rs.getFloat(5), rs.getInt(6)};
                
            }
            
         //la actualizamos   
        }catch(Exception e){
            JOptionPane.showOptionDialog(null, "Erro00r: "+e.getMessage(), "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, EXIT_ON_CLOSE);
        }
        
        puntjug=puntjug+puntuacion;
        
         consultasql=("SELECT partidas FROM juegos WHERE Id="+juego);
        
        
        try{
            Statement st;
            st = (Statement) cn.createStatement();
            ResultSet rs= st.executeQuery(consultasql);
            
            while(rs.next()){

                partidjug=rs.getInt(1);
                //Object [] lista= {rs.getInt(1),new JLabel(mIcono),rs.getString(3),rs.getString(4),rs.getFloat(5), rs.getInt(6)};
                
            }
            
         //la actualizamos   
        }catch(Exception e){
            JOptionPane.showOptionDialog(null, "Erro00r: "+e.getMessage(), "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, EXIT_ON_CLOSE);
        }
        
        partidjug++;
        
       String SQL= "UPDATE usuarios SET puntuaciontot='"+puntjug+"' WHERE Id="+id;
        
        
            try{

                PreparedStatement ps=cn.prepareStatement(SQL);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "ACTUALIZACION CORRECTA");
            }
            catch(HeadlessException | SQLException e){
               JOptionPane.showOptionDialog(null, "Error: "+e.getMessage(), "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, EXIT_ON_CLOSE);
            }
        
         SQL= "UPDATE juegos SET partidas='"+partidjug+"' WHERE Id="+juego;
        
        
            try{

                PreparedStatement ps=cn.prepareStatement(SQL);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "ACTUALIZACION CORRECTA");
            }
            catch(HeadlessException | SQLException e){
               JOptionPane.showOptionDialog(null, "Error: "+e.getMessage(), "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, EXIT_ON_CLOSE);
            }
           
        SQL= "insert into partidas (id,usuario,juego,puntuacion)  values(default,"+id+","+juego+","+puntuacion+")";
        
        try{
            
            PreparedStatement ps=cn.prepareStatement(SQL);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
        }
        catch(HeadlessException | SQLException e){
           JOptionPane.showOptionDialog(null, "Error: "+e.getMessage(), "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, EXIT_ON_CLOSE);
        }    
        
        
            
    }
}
