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
public class P8Dificil extends javax.swing.JFrame {

    
    private int puntaje;
    /**
     * Creates new form P8
     */
    public P8Dificil() {
        initComponents();
    }
    
    private int pistasUsadas;
    private int maxPistas = 2;
    static int id;
    
    public P8Dificil(int puntajeRecibido, int pistasUsadasActual,int id) {
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
        correct = new javax.swing.JButton();
        sputnik = new javax.swing.JButton();
        hubble = new javax.swing.JButton();
        webb = new javax.swing.JButton();
        pista = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 0, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("por el ser humano ?");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 420, 50));

        correct.setBackground(new java.awt.Color(0, 0, 0));
        correct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        correct.setForeground(new java.awt.Color(255, 255, 255));
        correct.setText("Gagarin");
        correct.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 255)));
        correct.setBorderPainted(false);
        correct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctActionPerformed(evt);
            }
        });
        getContentPane().add(correct, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 120, 40));

        sputnik.setBackground(new java.awt.Color(0, 0, 0));
        sputnik.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sputnik.setForeground(new java.awt.Color(255, 255, 255));
        sputnik.setText("Sputnik");
        sputnik.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        sputnik.setBorderPainted(false);
        sputnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sputnikActionPerformed(evt);
            }
        });
        getContentPane().add(sputnik, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 120, 40));

        hubble.setBackground(new java.awt.Color(0, 0, 0));
        hubble.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hubble.setForeground(new java.awt.Color(255, 255, 255));
        hubble.setText("Hubble");
        hubble.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        hubble.setBorderPainted(false);
        hubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hubbleActionPerformed(evt);
            }
        });
        getContentPane().add(hubble, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 120, 40));

        webb.setBackground(new java.awt.Color(0, 0, 0));
        webb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        webb.setForeground(new java.awt.Color(255, 255, 255));
        webb.setText("Webb II");
        webb.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        webb.setBorderPainted(false);
        webb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                webbActionPerformed(evt);
            }
        });
        getContentPane().add(webb, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 120, 40));

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

        jLabel6.setBackground(new java.awt.Color(255, 0, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("¿Cómo se llamaba el primer satelite hecho");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 420, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trivia/Dificil/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void correctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctActionPerformed
        // TODO add your handling code here:

        puntaje+=10;
        JOptionPane.showMessageDialog(rootPane, "Respuesta correcta ! ");

        
         P9Dificil pregunta9 = new P9Dificil(puntaje, pistasUsadas,id);
        pregunta9.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_correctActionPerformed

    private void sputnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sputnikActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(rootPane, "Respuesta incorrecta :( ");

        puntaje+=0;
        
         P9Dificil pregunta9 = new P9Dificil(puntaje, pistasUsadas,id);
        pregunta9.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sputnikActionPerformed

    private void hubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hubbleActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(rootPane, "Respuesta incorrecta :( ");

        
        puntaje+=0;
        
         P9Dificil pregunta9 = new P9Dificil(puntaje, pistasUsadas,id);
        pregunta9.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_hubbleActionPerformed

    private void webbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_webbActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(rootPane, "Respuesta incorrecta :( ");

        puntaje+=0;
         P9Dificil pregunta9 = new P9Dificil(puntaje, pistasUsadas,id);
        pregunta9.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_webbActionPerformed

    private void pistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pistaActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(rootPane, "Tenía un nombre sovietico");
        
           pistasUsadas++;
        
          if(pistasUsadas > maxPistas) {
        pista.setEnabled(false);
    }
    }//GEN-LAST:event_pistaActionPerformed

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
            java.util.logging.Logger.getLogger(P8Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P8Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P8Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P8Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P8Dificil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton correct;
    private javax.swing.JButton hubble;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton pista;
    private javax.swing.JButton sputnik;
    private javax.swing.JButton webb;
    // End of variables declaration//GEN-END:variables
}