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

public class Partida extends JFrame{
    
    SQLConexion con= new SQLConexion();
    Connection cn= con.getConectarDB();
    JTable tabla;
    public ArrayList<ArrayPartida> a=new ArrayList <>();

    
    
    //Selecciones para mostrar en la tabla
    
    public void Todo(){
        a.clear();
        String consultasql=("SELECT*FROM partidas");
        
        
        try{
            Statement st;
            st = (Statement) cn.createStatement();
            ResultSet rs= st.executeQuery(consultasql);
            
            while(rs.next()){
                String b = null,c = null;
                String consultasql2=("SELECT nombre FROM usuarios WHERE id='"+rs.getInt(2)+"'");
        
                Statement st2;
                st2 = (Statement) cn.createStatement();
                ResultSet rs2= st2.executeQuery(consultasql2);
                try{
                    while(rs2.next()){
                        b=rs2.getString(1);
                    }

                }catch(Exception e){
                    JOptionPane.showOptionDialog(null, "Erro00r: "+e.getMessage(), "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, EXIT_ON_CLOSE);
                }
                
                String consultasql3=("SELECT nombre FROM juegos WHERE id='"+rs.getInt(3)+"'");
        
                Statement st3;
                st3 = (Statement) cn.createStatement();
                ResultSet rs3= st3.executeQuery(consultasql3);
                try{
                    while(rs3.next()){
                        c=rs3.getString(1);
                    }

                }catch(Exception e){
                    JOptionPane.showOptionDialog(null, "Erro00r: "+e.getMessage(), "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, EXIT_ON_CLOSE);
                }
                
                
                
                
                
                ArrayPartida x=new ArrayPartida(rs.getInt(1),b,c,rs.getInt(4));
                a.add(x);
                //Object [] lista= {rs.getInt(1),new JLabel(mIcono),rs.getString(3),rs.getString(4),rs.getFloat(5), rs.getInt(6)};
                
            }
            
            
        }catch(Exception e){
            JOptionPane.showOptionDialog(null, "Erro00r: "+e.getMessage(), "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, EXIT_ON_CLOSE);
        }
    }

    
    
    //Metodos de ordenamiento
    
    public void MenosPuntuacion(){
            ArrayPartida comodin=new ArrayPartida();
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
    
    public void Id(){
            ArrayPartida comodin=new ArrayPartida();
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
    
    public void MasPuntuacion(){
            ArrayPartida comodin=new ArrayPartida();
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
    
    
    
    //Generar reporte pdf
    
    public void Reporte(){
        
        try{
            DateFormat dateFormat = new SimpleDateFormat("EEE_d_MM_yyyy_HH_mm_ss");
            Document documento=new Document() {};;
            FileOutputStream archivo;
            String date = dateFormat.format(new java.util.Date());
            String reporte=("ReportePartidas"+date+".pdf");
            archivo= new FileOutputStream(reporte);
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            
            
            Paragraph titulo= new Paragraph("Reporte de Partidas de dia: "+date);
            
            titulo.setAlignment(1);
            
            documento.add(titulo);
            documento.add(Chunk.NEWLINE);
            Paragraph texto= new Paragraph("Reporte de Partidas de forma personalizada");
            documento.add(texto);
            documento.add(Chunk.NEWLINE);
            
            PdfPTable table= new PdfPTable(4);
            
            table.setWidthPercentage(100);
            PdfPCell id= new PdfPCell(new Phrase ("ID"));
            id.setBackgroundColor(BaseColor.BLUE);;
            PdfPCell nombre= new PdfPCell(new Phrase ("Nombre"));
            nombre.setBackgroundColor(BaseColor.BLUE);
            PdfPCell juego= new PdfPCell(new Phrase ("Juego"));
            juego.setBackgroundColor(BaseColor.BLUE);
            PdfPCell puntuacion= new PdfPCell(new Phrase ("Partidas"));
            puntuacion.setBackgroundColor(BaseColor.BLUE);
            
            table.addCell(id);
            table.addCell(nombre);
            table.addCell(juego);
            table.addCell(puntuacion);

            
            for(int i=0; i<a.size();i++){
                table.addCell(""+a.get(i).Id);
                table.addCell(""+a.get(i).Usuario);
                table.addCell(""+a.get(i).Juego);
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
        modelo.addColumn("Nombre");
        modelo.addColumn("Juego");
        modelo.addColumn("Puntuacion");
        
        
        for(int i=0; i<a.size();i++){
            
            Object [] lista= {a.get(i).Id,a.get(i).Usuario,a.get(i).Juego,a.get(i).Puntuacion};
            modelo.addRow(lista);
        }
        
        

        
        return modelo;
        
    }
    
}
