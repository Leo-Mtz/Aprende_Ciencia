/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PuzzleMenu.Medio.SistemaSolarMedio;

import PuzzleMenu.PuzzleMenu;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author DELL
 */
public class PuzzleSistemaSolarMedio extends JFrame{
	public static Container contenedor;
	public static Board board;
	private BufferedImage img;
        static int id;
	
	public PuzzleSistemaSolarMedio(int id){
                this.id=id;
		this.setTitle("Rompecabezas");
		this.setSize(500, 550);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		contenedor = this.getContentPane();
		
		
		try {
                     img = ImageIO.read(getClass().getResource("/PuzzleMenu/Medio/SistemaSolarMedio/sistemasolar.jpg"));
                     System.out.println(getClass().getResource("/PuzzleMenu/Medio/SistemaSolarMedio/sistemasolar.jpg"));
		} catch (IOException e) {
                        System.out.println("Imagen no encontrada");
			e.printStackTrace();
		}
		board = new Board(4, img,id); //linea para cambiar de cuanto por cuanto es el rompecabezas
		contenedor.add(board);
		this.setVisible(true);
                
                    
                    
                    
                 JButton menuButton = new JButton("Regresar");
                menuButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        PuzzleMenu menu= new PuzzleMenu(id);
                        menu.setVisible(true);
                       dispose();
                        
                    }
                });
                contenedor.add(menuButton);

                this.setVisible(true);
	}
	public static void main(String[] args){
		new PuzzleSistemaSolarMedio(id);
	}
}