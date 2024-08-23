package conexiones;
import java.sql.Connection;
import java.sql.DriverManager;

public class SQLConexion {
    
    Connection SQLConectar;
    
    public SQLConexion(){
        
        //Ruta URL de base de datos
        String host= "localhost";
        String puerto= "3306";
        String nameDB = "cienciajuegos";
        
        //Acceder URL
        String usuario = "root";
        String pass= "";
        
        //Driver
        String driver= "com.mysql.cj.jdbc.Driver";
        
        //Contruir URL
        String databaseURL= "jdbc:mysql://"+host+":"+puerto+"/"+nameDB+"?useSSL=false";
        
        
        try{
            Class.forName(driver);
            SQLConectar= DriverManager.getConnection(databaseURL,usuario,pass);
            System.out.println("Conexion exitosa");
        }catch(Exception ex){
            System.out.println("Lo sentimos, ha habido un error al conectarse con la base de datos");
        
         }
        
    }
    
    public Connection getConectarDB(){
        return SQLConectar;
    }
    
    
}
