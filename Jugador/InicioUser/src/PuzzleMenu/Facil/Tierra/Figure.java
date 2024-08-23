    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package PuzzleMenu.Facil.Tierra;
import Perfil.NuevaPartida;
    import PuzzleMenu.Facil.Tierra.PuzzleTierra;
import static PuzzleMenu.Facil.Tierra.PuzzleTierra.id;
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

        private PuzzleTierra puzzleTierra;
            private final int xSolPos, ySolPos;
            private int xPos, yPos;
            private int dimension;
            private static int id;
            
            public Figure(int xSolPos, int ySolPos, ImageIcon subimage, int dimension, int id){
                    this.xSolPos = xSolPos;
                    this.ySolPos = ySolPos;
                    this.dimension = dimension;
                    this.id=id;

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
                            PuzzleTierra.board.Remover();
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
                            PuzzleTierra.board.Remover();
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
                            PuzzleTierra.board.Remover();
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
                            PuzzleTierra.board.Remover();
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
                    
                   
                NuevaPartida nuevarompecabezas= new NuevaPartida(id, 2,25);
		JOptionPane.showMessageDialog(new JPanel(), "Felicitaciones", "Rompecabezas Terminado", JOptionPane.INFORMATION_MESSAGE);
                
                JOptionPane.showMessageDialog(new JPanel(), "La Tierra tienecerca de 4.6 mil millones de años y \n esta formada por 70% agua", "Aprendizaje", JOptionPane.INFORMATION_MESSAGE);
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