/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Trivia.Dificil;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class P7Dificil extends javax.swing.JFrame {

    
    private int puntaje;
    /**
     * Creates new form P7
     */
    public P7Dificil() {
        initComponents();
    }
 
    
    private int pistasUsadas;
    private int maxPistas = 2;
    static int id;
    
    public P7Dificil(int puntajeRecibido, int pistasUsadasActual,int id) {
    this.puntaje = puntajeRecibido;
    this.pistasUsadas = pistasUsadasActual;
    initComponents();
    jTextField1.setText(String.valueOf(this.puntaje)); 
    jTextField1.setEditable(false);
    if(pistasUsadas >= maxPistas) {
        pista.setEnabled(false); // Deshabilita el botón si ya se alcanzó el máximo al abrir la ventana
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        pista = new javax.swing.JButton();
        astro = new javax.swing.JButton();
        correct = new javax.swing.JButton();
        spatio = new javax.swing.JButton();
        taiko = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 0, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿ Cómo se llamaban a los astronautas sovieticos?");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 420, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("R:1 P:3");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Puntaje: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        pista.setBackground(new java.awt.Color(153, 204, 255));
        pista.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        pista.setText("Pista");
        pista.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        pista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pistaActionPerformed(evt);
            }
        });
        getContentPane().add(pista, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 60, 30));

        astro.setBackground(new java.awt.Color(0, 0, 0));
        astro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        astro.setForeground(new java.awt.Color(255, 255, 255));
        astro.setText("Astronauta");
        astro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 255)));
        astro.setBorderPainted(false);
        astro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                astroActionPerformed(evt);
            }
        });
        getContentPane().add(astro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 120, 40));

        correct.setBackground(new java.awt.Color(0, 0, 0));
        correct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        correct.setForeground(new java.awt.Color(255, 255, 255));
        correct.setText("Cosmonauta");
        correct.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        correct.setBorderPainted(false);
        correct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctActionPerformed(evt);
            }
        });
        getContentPane().add(correct, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 120, 40));

        spatio.setBackground(new java.awt.Color(0, 0, 0));
        spatio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spatio.setForeground(new java.awt.Color(255, 255, 255));
        spatio.setText("Spationauta");
        spatio.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        spatio.setBorderPainted(false);
        spatio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spatioActionPerformed(evt);
            }
        });
        getContentPane().add(spatio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 120, 40));

        taiko.setBackground(new java.awt.Color(0, 0, 0));
        taiko.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        taiko.setForeground(new java.awt.Color(255, 255, 255));
        taiko.setText("Taikonauta");
        taiko.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        taiko.setBorderPainted(false);
        taiko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taikoActionPerformed(evt);
            }
        });
        getContentPane().add(taiko, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trivia/Dificil/fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pistaActionPerformed
        // TODO add your handling code here:
        
        
        JOptionPane.showMessageDialog(rootPane, "Usa un sinonimo de universo");
        
           pistasUsadas++;
        
          if(pistasUsadas > maxPistas) {
        pista.setEnabled(false);
        }
    }//GEN-LAST:event_pistaActionPerformed

    private void astroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_astroActionPerformed
        // TODO add your handling code here:


        JOptionPane.showMessageDialog(rootPane, "Respuesta incorrecta :( ");
        
        
        puntaje+=0;
        P8Dificil pregunta8 = new P8Dificil(puntaje,pistasUsadas,id);
        pregunta8.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_astroActionPerformed

    private void correctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctActionPerformed
        // TODO add your handling code here:

        puntaje +=10;
        
        JOptionPane.showMessageDialog(rootPane, "Respuesta correcta ! ");

        
        P8Dificil pregunta8 = new P8Dificil(puntaje,pistasUsadas,id);
        pregunta8.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_correctActionPerformed

    private void spatioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatioActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(rootPane, "Respuesta incorrecta :( ");

        puntaje+=0;
        
        P8Dificil pregunta8 = new P8Dificil(puntaje,pistasUsadas,id);
        pregunta8.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_spatioActionPerformed

    private void taikoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taikoActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(rootPane, "Respuesta incorrecta :( ");

        puntaje+=0;
        
        P8Dificil pregunta8 = new P8Dificil(puntaje,pistasUsadas,id);
        pregunta8.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_taikoActionPerformed

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
            java.util.logging.Logger.getLogger(P7Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P7Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P7Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P7Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P7Dificil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton astro;
    private javax.swing.JButton correct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton pista;
    private javax.swing.JButton spatio;
    private javax.swing.JButton taiko;
    // End of variables declaration//GEN-END:variables
}
