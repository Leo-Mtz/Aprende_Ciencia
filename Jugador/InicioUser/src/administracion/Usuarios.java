package administracion;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexiones.SQLConexion;
import java.awt.Desktop;
import java.io.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class Usuarios extends JFrame{
    
    SQLConexion con= new SQLConexion();
    Connection cn= con.getConectarDB();
    JTable tabla;
    public ArrayList<ArrayUsuarios> a=new ArrayList <>();

    
    
    //Selecciones para mostrar en la tabla
    
    public void Todo(){
        a.clear();
        String consultasql=("SELECT*FROM usuarios");
        
        
        try{
            Statement st;
            st = (Statement) cn.createStatement();
            ResultSet rs= st.executeQuery(consultasql);
            
            while(rs.next()){

                
                ArrayUsuarios x=new ArrayUsuarios(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
                a.add(x);
                //Object [] lista= {rs.getInt(1),new JLabel(mIcono),rs.getString(3),rs.getString(4),rs.getFloat(5), rs.getInt(6)};
                
            }
            
            
        }catch(Exception e){
            JOptionPane.showOptionDialog(null, "Erro00r: "+e.getMessage(), "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, EXIT_ON_CLOSE);
        }
    }
    
    public void Tipo(int num){
       a.clear();
        String tipo = null;
        switch(num){
            case 1:
                tipo="Usuario";
                break;
            case 2:
                tipo="Administrador";
                break;
        }
       
        
        String consultasql=("SELECT * FROM usuarios WHERE tipo='"+tipo+"'");
        
        
        try{
            Statement st;
            st = (Statement) cn.createStatement();
            ResultSet rs= st.executeQuery(consultasql);
            
            
            
            
            while(rs.next()){

                
                ArrayUsuarios x=new ArrayUsuarios(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
                a.add(x);
                //Object [] lista= {rs.getInt(1),new JLabel(mIcono),rs.getString(3),rs.getString(4),rs.getFloat(5), rs.getInt(6)};
                
            }
            
            
        }catch(Exception e){
            JOptionPane.showOptionDialog(null, "Erro00r: "+e.getMessage(), "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, EXIT_ON_CLOSE);
        }
    }
    
    
    //Metodos de ordenamiento
    
    public void MenorPuntuacion(){
            ArrayUsuarios comodin=new ArrayUsuarios();
            boolean bandera=true;
            while(bandera==true){ //ciclo burbuja pal ordernamiento
            bandera=false;//bandera para repetir 
            int xd=a.size()-1;
            for(int j=0;j<xd ;j++){ //recorre todo el array
                if(a.get(j).Puntuacion >  a.get((j+1)).Puntuacion){//condicional
                    comodin=a.get(j); //intercambio de lugares
                    a.set(j,a.get(j+1));
                    a.set(j+1,comodin);
                    bandera=true;
                }
             }
            }
   
    }
    
    public void MayorPuntuacion(){
            ArrayUsuarios comodin=new ArrayUsuarios();
            boolean bandera=true;
            while(bandera==true){ //ciclo burbuja pal ordernamiento
            bandera=false;//bandera para repetir 
            int xd=a.size()-1;
            for(int j=0;j<xd ;j++){ //recorre todo el array
                if(a.get(j).Puntuacion <  a.get((j+1)).Puntuacion){//condicional
                    comodin=a.get(j); //intercambio de lugares
                    a.set(j,a.get(j+1));
                    a.set(j+1,comodin);
                    bandera=true;
                }
             }
            }
   
    }
    

    
    public void Id(){
            ArrayUsuarios comodin=new ArrayUsuarios();
            boolean bandera=true;
            while(bandera==true){ //ciclo burbuja pal ordernamiento
            bandera=false;//bandera para repetir 
            int xd=a.size()-1;
            for(int j=0;j<xd ;j++){ //recorre todo el array
                if(a.get(j).Id >  a.get((j+1)).Id){//condicional
                    comodin=a.get(j); //intercambio de lugares
                    a.set(j,a.get(j+1));
                    a.set(j+1,comodin);
                    bandera=true;
                }
             }
            }
    
    }
    
    
    
    //Generar reporte pdf
    
    public void Reporte(){
        
        try{
            DateFormat dateFormat = new SimpleDateFormat("EEE_d_MM_yyyy_HH_mm_ss");
            Document documento=new Document() {};;
            FileOutputStream archivo;
            String date = dateFormat.format(new java.util.Date());
            String reporte=("ReporteUsuarios"+date+".pdf");
            archivo= new FileOutputStream(reporte);
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            
            
            Paragraph titulo= new Paragraph("Reporte de Usuarios de dia: "+date);
            
            titulo.setAlignment(1);
            
            documento.add(titulo);
            documento.add(Chunk.NEWLINE);
            Paragraph texto= new Paragraph("Reporte de Usuarios de forma personalizada");
            documento.add(texto);
            documento.add(Chunk.NEWLINE);
            
            PdfPTable table= new PdfPTable(6);
            
            table.setWidthPercentage(100);
            PdfPCell id= new PdfPCell(new Phrase ("ID"));
            id.setBackgroundColor(BaseColor.BLUE);;
            PdfPCell tipo= new PdfPCell(new Phrase ("Tipo"));
            tipo.setBackgroundColor(BaseColor.BLUE);
            PdfPCell nombre= new PdfPCell(new Phrase ("Nombre"));
            nombre.setBackgroundColor(BaseColor.BLUE);
            PdfPCell correo= new PdfPCell(new Phrase ("Correo"));
            correo.setBackgroundColor(BaseColor.BLUE);
            PdfPCell contraseñas= new PdfPCell(new Phrase ("Contraseñas"));
            contraseñas.setBackgroundColor(BaseColor.BLUE);
            PdfPCell puntuacion= new PdfPCell(new Phrase ("PUNTUACION"));
            puntuacion.setBackgroundColor(BaseColor.BLUE);
            
            table.addCell(id);
            table.addCell(tipo);
            table.addCell(nombre);
            table.addCell(correo);
            table.addCell(contraseñas);
            table.addCell(puntuacion);

            
            for(int i=0; i<a.size();i++){
                table.addCell(""+a.get(i).Id);
                table.addCell(""+a.get(i).Tipo);
                table.addCell(""+a.get(i).Nombre);
                table.addCell(""+a.get(i).Correo);
                table.addCell(""+a.get(i).Contraseña);
                table.addCell(""+a.get(i).Puntuacion);
            }
            documento.add(table);
            documento.close();
            
            File path=new File(reporte);
            Desktop.getDesktop().open(path);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    
    
    //Enviar JTABLE
    public DefaultTableModel Enviar(){
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Tipo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Correo");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Puntuacion");
        
        
        for(int i=0; i<a.size();i++){
            
            Object [] lista= {a.get(i).Id,a.get(i).Tipo,a.get(i).Nombre,a.get(i).Correo,a.get(i).Contraseña,a.get(i).Puntuacion};
            modelo.addRow(lista);
        }
        
        

        
        return modelo;
        
    }
    
}
