/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PuzzleMenu.Facil.Sol;
import PuzzleMenu.PuzzleMenu;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */

public class PuzzleSol extends JFrame {
	
    public static Container contenedor;
    public static Board board;
    private BufferedImage img;
    static int id;

    public PuzzleSol(int id) {
        this.id=id;
        this.setTitle("Rompecabezas");
        this.setSize(500, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        contenedor = this.getContentPane();

        // LayoutManager para posicionar los componentes de forma ordenada
        BoxLayout boxLayout = new BoxLayout(contenedor, BoxLayout.Y_AXIS);
        contenedor.setLayout(boxLayout);

        try {
            img = ImageIO.read(getClass().getResource("/PuzzleMenu/Facil/Sol/sun.jpg"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "Imagen no encontrada intenta de nuevo");
        }
        board = new Board(3, img,id);
        contenedor.add(board);
        
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
		new PuzzleSol(id);
	}
}