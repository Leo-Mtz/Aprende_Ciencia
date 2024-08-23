/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package PuzzleMenu.Medio.ViaLactea;

import static PuzzleMenu.Medio.ViaLactea.PuzzleViaLactea.id;
import PuzzleMenu.PuzzleMenu;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author DELL
 */
public class Figure extends JButton implements ActionListener{
	
	private final int xSolPos, ySolPos;
	private int xPos, yPos;
	private int dimension;
        private static int id;
	
	public Figure(int xSolPos, int ySolPos, ImageIcon subimage, int dimension,int id){
		this.xSolPos = xSolPos;
		this.ySolPos = ySolPos;
		this.dimension = dimension;
		
		xPos = xSolPos;
		yPos = ySolPos;
		
		this.setIcon(subimage);
		this.setPreferredSize(new Dimension(subimage.getIconWidth(), subimage.getIconHeight()));
		this.addActionListener(this);
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getxSolPos() {
		return xSolPos;
	}

	public int getySolPos() {
		return ySolPos;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Move();
	}
	private void Move(){
		Cell[][] board = Board.board;
		try{
		if(board[xPos][yPos-1].getFigure() == null){ // arriba
			Board.board[xPos][yPos-1].setFigure(this);
			Board.board[xPos][yPos].setFigure(null);
			yPos --;
			PuzzleViaLactea.board.Remover();
			ComprobarRespuesta();
			return;
			
		}
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
		try{
		if(board[xPos][yPos +1].getFigure() == null){ // abajo
			Board.board[xPos][yPos +1].setFigure(this);
			Board.board[xPos][yPos].setFigure(null);
			yPos ++;
			PuzzleViaLactea.board.Remover();
			ComprobarRespuesta();
			return;
		}
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
		try{
		if(board[xPos + 1][yPos].getFigure() == null){ // derecha
			Board.board[xPos + 1][yPos].setFigure(this);
			Board.board[xPos][yPos].setFigure(null);
			xPos ++;
			PuzzleViaLactea.board.Remover();
			ComprobarRespuesta();
			return;
		}
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
		try{
		if(board[xPos - 1][yPos].getFigure() == null){ // izquierda
			Board.board[xPos - 1][yPos].setFigure(this);
			Board.board[xPos][yPos].setFigure(null);
			xPos --;
			PuzzleViaLactea.board.Remover();
			ComprobarRespuesta();
			return;
		}
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
		
		
	}
	private void ComprobarRespuesta(){
		Figure figura = null;
		
		for(int i = 0; i< dimension; i++){
			for(int j = 0; j< dimension; j++){
				
				figura = Board.board[i][j].getFigure();
				if(figura == null){
					continue;
				}
				if(figura.getxPos() != figura.getxSolPos() || 
				   figura.getyPos() != figura.getySolPos()){
					return;
				}	
			}
		}
		
		// completado
		JOptionPane.showMessageDialog(new JPanel(), "Felicitaciones", "Rompecabezas Terminado", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(new JPanel(), "La Via Lactea es nuestra galaxia, es una galaxia espiral\ny tiene un diametro de 150 mil años luz", "Aprendizaje", JOptionPane.INFORMATION_MESSAGE);
                
               
                cerrarVentanaYAbrirMenu();
                
        }



            private void cerrarVentanaYAbrirMenu() {
                // Obtener el JFrame que contiene este panel
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);

                // Cerrar la ventana del rompecabezas
                if (frame != null) {
                    frame.dispose();
                }

                // Abrir la ventana del menú (suponiendo que tienes un método para hacerlo)
                abrirVentanaMenu();
            }

            private void abrirVentanaMenu() {
                // Suponiendo que tienes una clase que maneja el menú
                PuzzleMenu menu = new PuzzleMenu(id);
                menu.setVisible(true);
                }
            }