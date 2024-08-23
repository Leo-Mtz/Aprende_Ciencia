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

public class Juegos extends JFrame{
    
    SQLConexion con= new SQLConexion();
    Connection cn= con.getConectarDB();
    JTable tabla;
    public ArrayList<ArrayJuegos> a=new ArrayList <>();

    
    
    //Selecciones para mostrar en la tabla
    
    public void Todo(){
        a.clear();
        String consultasql=("SELECT*FROM juegos");
        
        
        try{
            Statement st;
            st = (Statement) cn.createStatement();
            ResultSet rs= st.executeQuery(consultasql);
            
            while(rs.next()){

                
                ArrayJuegos x=new ArrayJuegos(rs.getInt(1),rs.getString(2),rs.getInt(3));
                a.add(x);
                //Object [] lista= {rs.getInt(1),new JLabel(mIcono),rs.getString(3),rs.getString(4),rs.getFloat(5), rs.getInt(6)};
                
            }
            
            
        }catch(Exception e){
            JOptionPane.showOptionDialog(null, "Erro00r: "+e.getMessage(), "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, EXIT_ON_CLOSE);
        }
    }

    
    
    //Metodos de ordenamiento
    
    public void MenorPartidas(){
            ArrayJuegos comodin=new ArrayJuegos();
            boolean bandera=true;
            while(bandera==true){ //ciclo burbuja pal ordernamiento
            bandera=false;//bandera para repetir 
            int xd=a.size()-1;
            for(int j=0;j<xd ;j++){ //recorre todo el array
                if(a.get(j).Partidas >  a.get((j+1)).Partidas){//condicional
                    comodin=a.get(j); //intercambio de lugares
                    a.set(j,a.get(j+1));
                    a.set(j+1,comodin);
                    bandera=true;
                }
             }
            }
   
    }
    
        public void Id(){
            ArrayJuegos comodin=new ArrayJuegos();
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
    
    public void MasPartidas(){
            ArrayJuegos comodin=new ArrayJuegos();
            boolean bandera=true;
            while(bandera==true){ //ciclo burbuja pal ordernamiento
            bandera=false;//bandera para repetir 
            int xd=a.size()-1;
            for(int j=0;j<xd ;j++){ //recorre todo el array
                if(a.get(j).Partidas <  a.get((j+1)).Partidas){//condicional
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
            String reporte=("ReporteJuegos"+date+".pdf");
            archivo= new FileOutputStream(reporte);
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            
            
            Paragraph titulo= new Paragraph("Reporte de Juegos de dia: "+date);
            
            titulo.setAlignment(1);
            
            documento.add(titulo);
            documento.add(Chunk.NEWLINE);
            Paragraph texto= new Paragraph("Reporte de Juegos de forma personalizada");
            documento.add(texto);
            documento.add(Chunk.NEWLINE);
            
            PdfPTable table= new PdfPTable(3);
            
            table.setWidthPercentage(100);
            PdfPCell id= new PdfPCell(new Phrase ("ID"));
            id.setBackgroundColor(BaseColor.BLUE);;
            PdfPCell nombre= new PdfPCell(new Phrase ("Nombre"));
            nombre.setBackgroundColor(BaseColor.BLUE);
            PdfPCell partidas= new PdfPCell(new Phrase ("Partidas"));
            partidas.setBackgroundColor(BaseColor.BLUE);
            
            table.addCell(id);
            table.addCell(nombre);
            table.addCell(partidas);

            
            for(int i=0; i<a.size();i++){
                table.addCell(""+a.get(i).Id);
                table.addCell(""+a.get(i).Nombre);
                table.addCell(""+a.get(i).Partidas);
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
        modelo.addColumn("Partidas");
        
        
        for(int i=0; i<a.size();i++){
            
            Object [] lista= {a.get(i).Id,a.get(i).Nombre,a.get(i).Partidas};
            modelo.addRow(lista);
        }
        
        

        
        return modelo;
        
    }
    
}
