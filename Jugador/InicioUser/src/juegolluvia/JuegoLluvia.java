package juegolluvia;

import MenuJuegos.Menu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JuegoLluvia extends JFrame {
    
    static int id;
    private JFrame frame ;
    Dificultad dificultad; // Enumeración para los niveles de dificultad del juego
    private JPanel panel; 
    private Barra barra; 
    private int playerScore = 100; // Puntuación inicial 
    private Timer gameTimer; 
    private List<Circulo> objetos = Collections.synchronizedList(new ArrayList<>()); // Lista de objetos Circulo en el juego
    boolean juegoEnPausa = false; // Bandera para saber si el juego está pausado
    private ExecutorService executorService; // Servicio de ejecución para manejar múltiples hilos
    private Image backgroundImage; // Imagen de fondo para el juego
    private Timer movimientoTimer; // Timer para controlar el movimiento de los objetos

    //menú del juego
    class Menu extends JDialog {
        public Menu(JFrame owner) {
            super(owner, "Menu", true);
            setSize(200, 200);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
        }
    }
    public enum Dificultad {
        FACIL, MEDIO, DIFICIL
    }
        // Método sincronizado para actualizar la puntuación del jugador
    public synchronized void updateScore(int scoreChange) {
        playerScore += scoreChange;
        SwingUtilities.invokeLater(this::repaint);
    }
     //obtener el panel del juego
    public JPanel getPanel() {
        return panel;
    }
    
    public JuegoLluvia(int id){
        this.id=id;
    }

    public JuegoLluvia(Dificultad dificultad) {
        this.dificultad = dificultad;
        backgroundImage = new ImageIcon(JuegoLluvia.class.getResource("mar.jpg")).getImage();
        setTitle("Juego de Recoger Objetos");
        setSize(368, 770);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);// La ventana no se puede redimensionar
        executorService = Executors.newFixedThreadPool(10);// Inicializa el ExecutorService
 

        Image backgroundImage = new ImageIcon(JuegoLluvia.class.getResource("mar.jpg")).getImage();
        
        
        //Timer que controla el movimiento de los objetos
        movimientoTimer = new Timer(10, new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        List<Circulo> eliminar = new ArrayList<>();
        for (Circulo circulo : objetos) {
            circulo.mover();// Mueve cada círculo
            if (circulo.debeEliminarse()) {
                eliminar.add(circulo);
            }
        }
        objetos.removeAll(eliminar);
        panel.repaint();
        
        if (playerScore <= 0) {
            movimientoTimer.stop(); // Detiene el movimientoTimer
            juegoEnPausa = true; // Establece el juego en pausa
            mostrarPuntuacion(); // Muestra la puntuación y maneja el fin del juego
        }
    }
});
movimientoTimer.start();// Inicia el Timer de movimiento



        
        
        
        
        // panel principal
        panel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
            barra.dibujar(g);
            g.setColor(Color.BLACK);
            g.drawString("Puntaje: " + playerScore, 10, 20);

            synchronized (objetos) {
                for (Circulo objeto : objetos) {
                    objeto.dibujar(g);// Dibuja cada objeto Circulo
                }
            }
        }
        };

        panel.setLayout(null);
        JButton menuButton = new JButton("Menu");
        menuButton.setBounds(250, 10, 80, 30);
        panel.add(menuButton);

             menuButton.addActionListener(e -> {
           
            MenuJuegos.Menu menu = new MenuJuegos.Menu(id);
            menu.setVisible(true);
         
            JuegoLluvia.this.dispose(); // Dispose the current game window
        });


        panel.addKeyListener(new KeyAdapter() {
    @Override
    public void keyPressed(KeyEvent evt) {
        if (!juegoEnPausa) {
            processKeyPress(evt);
        }
    }
});
        panel.setFocusable(true);
        panel.requestFocusInWindow();
        add(panel);

        gameTimer = new Timer(30000, e -> {
            juegoEnPausa = true;// Pausa el juego
            mostrarPuntuacion();// Muestra la puntuación final
        });
        gameTimer.setRepeats(false);
        gameTimer.start();

        barra = new Barra(panel.getWidth(), panel.getHeight());// Crea el objeto Barra

        Random random = new Random();
        Timer objectTimer = new Timer(2000, e -> { 
            if (!juegoEnPausa) {
                manageObjects();
            }
        });
        objectTimer.start();

    }
    
    
    
    
    
    
    
    private void processKeyPress(KeyEvent evt) {
    boolean moved = false;
    int keyCode = evt.getKeyCode();
    if (keyCode == KeyEvent.VK_LEFT) {
        moved = barra.moverIzquierda();
    } else if (keyCode == KeyEvent.VK_RIGHT) {
        moved = barra.moverDerecha(panel.getWidth());
    }
    if (moved) {
        panel.repaint();
    }
}
    private void manageObjects() {
            if (!juegoEnPausa) {

        int objectType = new Random().nextInt(2);//Elige el tipo de objeto aleatoriamente
        
        // Crea un nuevo objeto CirculoRojo o CirculoVerde
        Circulo newCircle = (objectType == 0) ? new CirculoRojo(this, objetos, barra) : new CirculoVerde(this, objetos, barra);
        

        objetos.add(newCircle);// Añade el nuevo objeto a la lista
        executorService.execute(newCircle);// Ejecuta el objeto en un hilo separado
        panel.repaint(); 
            }
    }

    private void mostrarPuntuacion() {
    String mensajeDificultad = "";
    switch (dificultad) {
        case FACIL:
            mensajeDificultad = "Fácil";
            break;
        case MEDIO:
            mensajeDificultad = "Medio";
            break;
        case DIFICIL:
            mensajeDificultad = "Difícil";
            break;
    }

    JOptionPane.showMessageDialog(this, "Tu puntuación es: " + playerScore + 
                                  "\nDificultad: " + mensajeDificultad, 
                                  "Juego Terminado", JOptionPane.INFORMATION_MESSAGE);
}


    @Override
public void dispose() {
    super.dispose();
    if (executorService != null && !executorService.isShutdown()) {
        executorService.shutdown(); // Cierra el ExecutorService
    }
}

public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        JOptionPane.showMessageDialog(null, """
                                            Bienvenido a Juego de Recoger Objetos.
                                            Este juego te ayuda a entender la importancia
                                            de quitar los desechos del mar para proteger
                                            nuestro medio ambiente y la vida marina.""",
            "Bienvenido", JOptionPane.INFORMATION_MESSAGE);

        // Ventana de selección de dificultad
        JFrame frame = new JFrame("Seleccionar Dificultad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton btnFacil = new JButton("Fácil");
        JButton btnMedio = new JButton("Medio");
        JButton btnDificil = new JButton("Difícil");

        frame.add(btnFacil);
        frame.add(btnMedio);
        frame.add(btnDificil);

        frame.pack();
        frame.setVisible(true); 

        // Listeners de los botones
        btnFacil.addActionListener(e -> {
            frame.dispose();
            iniciarJuego(Dificultad.FACIL);
        });
        btnMedio.addActionListener(e -> {
            frame.dispose();
            iniciarJuego(Dificultad.MEDIO);
        });
        btnDificil.addActionListener(e -> {
            frame.dispose();
            iniciarJuego(Dificultad.DIFICIL);
        });
    });
}
private static void iniciarJuego(Dificultad dificultad) {
    JuegoLluvia juego = new JuegoLluvia(dificultad);
    juego.setVisible(true);
}

}
