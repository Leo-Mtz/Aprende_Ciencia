package MenuJuegos;
import Perfil.NuevaPartida;
import crucigrama.Seleccionar;
import PuzzleMenu.PuzzleMenu;
import Trivia.InicioTrivia;
import juego2.Main;
import juegolluvia.JuegoLluvia;
import juegorecoleccionbasura.JuegoRecoleccionBasura;
import Perfil.Perfil;
import Sesion.IniciarSesion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static juegolluvia.JuegoLluvia.Dificultad.*;


/**
 *
 * @author 177192
 */
public class Menu extends javax.swing.JFrame {
    static int id;
    /**
     * Creates new form Menu
     */
    public Menu(int id) {
        initComponents();
        this.id=id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCrossword = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnReciclar = new javax.swing.JButton();
        ROMPECABEZAS = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        RECICLAR = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnRompecabezas = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnMar = new javax.swing.JButton();
        ROMPECABEZAS1 = new javax.swing.JLabel();
        btnRelacion = new javax.swing.JButton();
        btnTrivia = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(1336, 744));
        jPanel1.setPreferredSize(new java.awt.Dimension(1336, 744));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU DE JUEGOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 0));
        jLabel2.setText("BIOLOGIA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 122, -1, -1));

        jLabel3.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("ASTRONOMÍA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 122, -1, -1));

        jLabel4.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 0));
        jLabel4.setText("ECOLOGIA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 102));
        jLabel5.setText("CRUCIGRAMA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 181, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuJuegos/images.png"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, 176));

        btnCrossword.setBackground(new java.awt.Color(204, 0, 0));
        btnCrossword.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        btnCrossword.setForeground(new java.awt.Color(255, 255, 255));
        btnCrossword.setText("JUGAR");
        btnCrossword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCrossword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrosswordActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrossword, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 416, -1, -1));

        jLabel7.setFont(new java.awt.Font("Snap ITC", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("RELACIONA AL ANIMAL");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuJuegos/juego1.png"))); // NOI18N
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 180, 157));

        jLabel8.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("TRIVIA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuJuegos/Solar-System-Floor-Puzzle-48-Pieces-000413-1-Pieces-Out.jpg"))); // NOI18N
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 180, 160));

        btnReciclar.setBackground(new java.awt.Color(204, 0, 0));
        btnReciclar.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        btnReciclar.setForeground(new java.awt.Color(255, 255, 255));
        btnReciclar.setText("JUGAR");
        btnReciclar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReciclar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReciclarActionPerformed(evt);
            }
        });
        jPanel1.add(btnReciclar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 416, -1, -1));

        ROMPECABEZAS.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        ROMPECABEZAS.setForeground(new java.awt.Color(0, 102, 153));
        ROMPECABEZAS.setText("ESPACIAL");
        jPanel1.add(ROMPECABEZAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuJuegos/Space-Trivia-e1608509102528.jpg"))); // NOI18N
        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, -1, -1));

        RECICLAR.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        RECICLAR.setForeground(new java.awt.Color(0, 153, 51));
        RECICLAR.setText("HORA DE RECICLAR");
        RECICLAR.setToolTipText("");
        jPanel1.add(RECICLAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 200, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuJuegos/reciclar-dibujos-e1421753093534-726x487.jpg"))); // NOI18N
        jLabel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 240, 180, 160));

        btnRompecabezas.setBackground(new java.awt.Color(204, 0, 0));
        btnRompecabezas.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        btnRompecabezas.setForeground(new java.awt.Color(255, 255, 255));
        btnRompecabezas.setText("JUGAR");
        btnRompecabezas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRompecabezas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRompecabezasActionPerformed(evt);
            }
        });
        jPanel1.add(btnRompecabezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, -1));

        jLabel13.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 153, 255));
        jLabel13.setText("SALVA AL MAR");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 480, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuJuegos/marinepollution.jpg"))); // NOI18N
        jLabel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, -1, -1));

        btnMar.setBackground(new java.awt.Color(204, 0, 0));
        btnMar.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        btnMar.setForeground(new java.awt.Color(255, 255, 255));
        btnMar.setText("JUGAR");
        btnMar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 690, -1, -1));

        ROMPECABEZAS1.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        ROMPECABEZAS1.setForeground(new java.awt.Color(0, 102, 153));
        ROMPECABEZAS1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ROMPECABEZAS1.setText("ROMPECABEZAS");
        jPanel1.add(ROMPECABEZAS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 454, -1));

        btnRelacion.setBackground(new java.awt.Color(204, 0, 0));
        btnRelacion.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        btnRelacion.setForeground(new java.awt.Color(255, 255, 255));
        btnRelacion.setText("JUGAR");
        btnRelacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnRelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 690, -1, -1));

        btnTrivia.setBackground(new java.awt.Color(204, 0, 0));
        btnTrivia.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        btnTrivia.setForeground(new java.awt.Color(255, 255, 255));
        btnTrivia.setText("JUGAR");
        btnTrivia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTrivia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriviaActionPerformed(evt);
            }
        });
        jPanel1.add(btnTrivia, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 690, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 153, 0));
        jButton1.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cerrar sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 250, 60));

        jButton2.setBackground(new java.awt.Color(51, 153, 0));
        jButton2.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Perfil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, 130, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRompecabezasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRompecabezasActionPerformed
        // TODO add your handling code here:
        
        PuzzleMenu menu = new PuzzleMenu(id);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRompecabezasActionPerformed

    private void btnTriviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriviaActionPerformed
        // TODO add your handling code here:
        
        InicioTrivia menutrivia = new InicioTrivia(id);
        menutrivia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTriviaActionPerformed

    private void btnCrosswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrosswordActionPerformed
        
        Seleccionar maincrucigrama= new Seleccionar(id);
        maincrucigrama.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnCrosswordActionPerformed

    private void btnMarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarActionPerformed
        // TODO add your handling code here:
        
        JuegoLluvia iniciojuego= new JuegoLluvia(FACIL);
        iniciojuego.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnMarActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        Main j = new Main(id);
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void btnReciclarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReciclarActionPerformed
        // TODO add your handling code here:
        
        juegorecoleccionbasura.JuegoRecoleccionBasura juegobasura= new JuegoRecoleccionBasura(id);
        juegobasura.mostrarJuego();
        
        
        this.dispose();
    }//GEN-LAST:event_btnReciclarActionPerformed

    private void btnRelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelacionActionPerformed
        // TODO add your handling code here:
        
        Main juego2main= new Main(id);
        juego2main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRelacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        IniciarSesion a= new IniciarSesion();
        this.dispose();
        a.setVisible(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Perfil a= new Perfil(id);
            a.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RECICLAR;
    private javax.swing.JLabel ROMPECABEZAS;
    private javax.swing.JLabel ROMPECABEZAS1;
    private javax.swing.JButton btnCrossword;
    private javax.swing.JButton btnMar;
    private javax.swing.JButton btnReciclar;
    private javax.swing.JButton btnRelacion;
    private javax.swing.JButton btnRompecabezas;
    private javax.swing.JButton btnTrivia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
