package juegorecoleccionbasura;

import MenuJuegos.Menu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import javax.imageio.ImageIO;
import java.io.IOException;

public class JuegoRecoleccionBasura {
    static int id;
    
    public JuegoRecoleccionBasura(int id){
        this.id=id;
    }

     public void mostrarJuego() {
     
    JFrame frame = new JFrame("Juego de Recolección de Basura");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1400, 600);
    frame.setLayout(null); // Establecer el layout manager a null primero

    // Crear y añadir el botón antes de hacer visible el frame
    JButton botonMenu = new JButton("Menú");
    botonMenu.setBounds(1300, 10, 80, 30); // Ajusta la posición y tamaño como sea necesario
    botonMenu.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Aquí implementarías la lógica para mostrar el menú principal
            Menu menu = new Menu(id);
            menu.setVisible(true);
            frame.dispose(); // Usar frame.dispose() para cerrar el frame actual
        }
    });
    frame.add(botonMenu);

    // Añadir el JuegoPanel después de establecer layout y antes de hacer visible el frame
    JuegoPanel juegoPanel = new JuegoPanel();
    juegoPanel.setBounds(0, 0, frame.getWidth(), frame.getHeight()); // Asegúrate de que el JuegoPanel no cubra el botón
    frame.add(juegoPanel);

    // Finalmente hacer visible el frame
    frame.setVisible(true);
    }

    public static void main(String[] args) {
       
        JuegoRecoleccionBasura juego = new JuegoRecoleccionBasura(id);
        juego.mostrarJuego();
    }
}

class JuegoPanel extends JPanel implements MouseListener, MouseMotionListener {
    
    
    private int puntaje = 0; // Variable para el puntaje
    private final Contenedor[] contenedores;
    private final Basura[] basuraTipos;
        private Image imagenFondo;

    
   
        
        
    
   public JuegoPanel() {
       
        

    Toolkit toolkit = Toolkit.getDefaultToolkit();
        imagenFondo = new ImageIcon(JuegoPanel.class.getResource("fondo.png")).getImage();
       
        initListeners();
       
    contenedores = new Contenedor[7];
        contenedores[0] = new Contenedor("Plástico", new Rectangle(0, 0, 200, 200), "plastico.png");
        contenedores[1] = new Contenedor("Orgánico", new Rectangle(150, 0, 200, 200), "organico.png");
        contenedores[2] = new Contenedor("Electrónica", new Rectangle(300, 0, 200, 200), "electronica.png");
        contenedores[3] = new Contenedor("Vidrio", new Rectangle(450, 0, 200, 200), "vidrio.png");
        contenedores[4] = new Contenedor("Papel", new Rectangle(600, 0, 200, 200), "papel.png");
        contenedores[5] = new Contenedor("Metal", new Rectangle(750, 0, 200, 200), "metal.png");
        contenedores[6] = new Contenedor("Desechos Peligrosos", new Rectangle(900, 0, 200, 200), "desechosPeligrosos.png");
        
        

        basuraTipos = new Basura[7];
        basuraTipos[0] = new Basura("Plástico", new Rectangle(900, 300, 200, 200), "bplastico.jpg");
        basuraTipos[1] = new Basura("Orgánico", new Rectangle(600, 300, 200, 200), "borganico.jpg");
        basuraTipos[2] = new Basura("Electrónica", new Rectangle(300, 300, 200, 200), "belectronico.jpg");
        basuraTipos[3] = new Basura("Vidrio", new Rectangle(750, 300, 200, 200), "bvidrio.jpg");
        basuraTipos[4] = new Basura("Papel", new Rectangle(150, 300, 200, 200), "bpapel.jpg");
        basuraTipos[5] = new Basura("Metal", new Rectangle(0, 300, 200, 200), "bmetal.jpg");
        basuraTipos[6] = new Basura("Desechos Peligrosos", new Rectangle(450, 300, 200, 200), "bpeligro.jpg");

    
    
            
       
    
    
    
}
public void initListeners() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }
   private Basura basuraSeleccionada = null;

@Override
public void mousePressed(MouseEvent e) {
    int x = e.getX();
    int y = e.getY();
    
    for (Basura basura : basuraTipos) {
        if (!basura.isColocadaCorrectamente() && basura.getArea().contains(x, y)) {
            basuraSeleccionada = basura;
            break;
        }
    }
}


    @Override
public void mouseDragged(MouseEvent e) {
    if (basuraSeleccionada != null) {
        Rectangle area = basuraSeleccionada.getArea();
        area.setLocation(e.getX() - area.width / 2, e.getY() - area.height / 2);
        repaint();
    }
}

private boolean estaTodaLaBasuraColocada() {
        for (Basura basura : basuraTipos) {
            if (!basura.isColocadaCorrectamente()) {
                return false;
            }
        }
        return true;
    }
   @Override
public void mouseReleased(MouseEvent e) {
    
    
    
    
    if (basuraSeleccionada != null && !basuraSeleccionada.isColocadaCorrectamente()) {
        boolean enContenedorCorrecto = false;
        for (Contenedor contenedor : contenedores) {
            if (contenedor.getTipo().equals(basuraSeleccionada.getTipo()) &&
                contenedor.getArea().contains(e.getX(), e.getY())) {
                puntaje += 15;
                enContenedorCorrecto = true;
                basuraSeleccionada.setColocadaCorrectamente(true);
                break;
            }
        }

        if (!enContenedorCorrecto) {
            puntaje -= 3;
            Point posicionInicial = basuraSeleccionada.getPosicionInicial();
            basuraSeleccionada.getArea().setLocation(posicionInicial);
        }

        basuraSeleccionada = null;
        repaint();
    }
    if (estaTodaLaBasuraColocada()) {
            JOptionPane.showMessageDialog(this, "¡Bien hecho! Toda la basura está en su contenedor correcto.");
        }
}

   

    @Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (imagenFondo != null) {
            g.drawImage(imagenFondo, 0, 0, this.getWidth(), this.getHeight(), this);
        }
    
    for (Contenedor contenedor : contenedores) {
        if (contenedor != null) {
            contenedor.dibujar(g, this);
        }
    }
    for (Basura basura : basuraTipos) {
        if (basura != null) {
            basura.dibujar(g, this);
        }
    }
    g.setColor(Color.BLACK);
    g.setFont(new Font("SansSerif", Font.BOLD, 18));
    g.drawString("Puntaje: " + puntaje, 10, 20); 
}
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
    

}
