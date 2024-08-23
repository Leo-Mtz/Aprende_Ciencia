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
public class P11Dificil extends javax.swing.JFrame {

    private int puntaje;
    
    
    /**
     * Creates new form P11
     */
    public P11Dificil() {
        initComponents();
    }
    
    private int pistasUsadas;
    private int maxPistas = 2;
    static int id;
    

    
    public P11Dificil(int puntajeRecibido, int pistasUsadasActual,int id) {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pista = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pista1 = new javax.swing.JButton();
        scorpio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        orion = new javax.swing.JButton();
        osa = new javax.swing.JButton();
        correct = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("R:1 P:3");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Puntaje: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("R:1 P:3");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Puntaje: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        pista1.setBackground(new java.awt.Color(153, 204, 255));
        pista1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        pista1.setText("Pista");
        pista1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        pista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pista1ActionPerformed(evt);
            }
        });
        getContentPane().add(pista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 60, 30));

        scorpio.setBackground(new java.awt.Color(0, 0, 0));
        scorpio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        scorpio.setForeground(new java.awt.Color(255, 255, 255));
        scorpio.setText("Scorpio");
        scorpio.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        scorpio.setBorderPainted(false);
        scorpio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scorpioActionPerformed(evt);
            }
        });
        getContentPane().add(scorpio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 120, 40));

        jLabel3.setBackground(new java.awt.Color(255, 0, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("brillante de nuestro cielo (Sirio)?");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 420, 50));

        orion.setBackground(new java.awt.Color(0, 0, 0));
        orion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        orion.setForeground(new java.awt.Color(255, 255, 255));
        orion.setText("Orión");
        orion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 255)));
        orion.setBorderPainted(false);
        orion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orionActionPerformed(evt);
            }
        });
        getContentPane().add(orion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 120, 40));

        osa.setBackground(new java.awt.Color(0, 0, 0));
        osa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        osa.setForeground(new java.awt.Color(255, 255, 255));
        osa.setText("Osa Mayor");
        osa.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        osa.setBorderPainted(false);
        osa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                osaActionPerformed(evt);
            }
        });
        getContentPane().add(osa, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 120, 40));

        correct.setBackground(new java.awt.Color(0, 0, 0));
        correct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        correct.setForeground(new java.awt.Color(255, 255, 255));
        correct.setText("Canis Mayor");
        correct.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        correct.setBorderPainted(false);
        correct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctActionPerformed(evt);
            }
        });
        getContentPane().add(correct, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 120, 40));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 0, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("¿En qué constelación está la estrella más");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 420, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trivia/Dificil/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pistaActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(rootPane, "Tiene el noombre de la familia de los perros");
        
           pistasUsadas++;
        
          if(pistasUsadas > maxPistas) {
        pista.setEnabled(false);
    }
    }//GEN-LAST:event_pistaActionPerformed

    private void pista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pista1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pista1ActionPerformed

    private void scorpioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scorpioActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(rootPane, "Respuesta incorrecta :( ");

        puntaje+=0;
        
        P12 pregunta12 = new P12(puntaje,pistasUsadas,id);
        pregunta12.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_scorpioActionPerformed

    private void orionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orionActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Respuesta incorrecta :( ");

       
        
        puntaje+=0;
        
        P12 pregunta12 = new P12(puntaje,pistasUsadas,id);
        pregunta12.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_orionActionPerformed

    private void osaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_osaActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(rootPane, "Respuesta incorrecta :( ");

        
        puntaje+=0;
        P12 pregunta12 = new P12(puntaje,pistasUsadas,id);
        pregunta12.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_osaActionPerformed

    private void correctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctActionPerformed
        // TODO add your handling code here:

      puntaje +=10;
        
         JOptionPane.showMessageDialog(rootPane, "Respuesta correcta ! ");

        P12 pregunta12 = new P12(puntaje,pistasUsadas,id);
        pregunta12.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_correctActionPerformed

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
            java.util.logging.Logger.getLogger(P11Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P11Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P11Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P11Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P11Dificil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton correct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton orion;
    private javax.swing.JButton osa;
    private javax.swing.JButton pista;
    private javax.swing.JButton pista1;
    private javax.swing.JButton scorpio;
    // End of variables declaration//GEN-END:variables
}
