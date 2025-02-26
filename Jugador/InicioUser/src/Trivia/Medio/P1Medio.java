/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Trivia.Medio;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class P1Medio extends javax.swing.JFrame {

    /**
     * Creates new form P1
     */
    public P1Medio() {
        initComponents();
    }
    
    public P1Medio(int id) {
        this.id=id;
        initComponents();
    }
    
    private int puntaje=0;

        private int pistasUsadas=0;
    private int maxPistas = 3;
    static int id;

 
    public P1Medio(int puntajeRecibido, int pistasUsadasActual,int id) {
    this.id=id;
    this.puntaje = puntajeRecibido;
    this.pistasUsadas = pistasUsadasActual;
    initComponents();
    jTextField1.setText(String.valueOf(this.puntaje)); 
    jTextField1.setEditable(false);
    if(pistasUsadas >= maxPistas) {
        correcta.setEnabled(false); // Deshabilita el botón si ya se alcanzó el máximo al abrir la ventana
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
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        correct = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        botonceres = new javax.swing.JButton();
        correcta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("R:1 P:1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Puntaje: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 0, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("paso cerca de la tierra cada 76 años");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 280, 40));

        jLabel2.setBackground(new java.awt.Color(255, 0, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Soy uno de los cometas más famosos");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 420, 40));

        jLabel3.setBackground(new java.awt.Color(255, 0, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿ Quién soy?");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 280, 40));

        correct.setBackground(new java.awt.Color(0, 0, 0));
        correct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        correct.setForeground(new java.awt.Color(255, 255, 255));
        correct.setText("Cometa Halley");
        correct.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        correct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctActionPerformed(evt);
            }
        });
        getContentPane().add(correct, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 120, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cometa Boggia");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 120, 40));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Tempel - 1");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 120, 30));

        botonceres.setBackground(new java.awt.Color(0, 0, 0));
        botonceres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonceres.setForeground(new java.awt.Color(255, 255, 255));
        botonceres.setText("Ceres");
        botonceres.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        botonceres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonceresActionPerformed(evt);
            }
        });
        getContentPane().add(botonceres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 120, 30));

        correcta.setBackground(new java.awt.Color(153, 204, 255));
        correcta.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        correcta.setText("Pista");
        correcta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        correcta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctaActionPerformed(evt);
            }
        });
        getContentPane().add(correcta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 60, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trivia/Medio/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void correctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctActionPerformed
        // TODO add your handling code here:

        puntaje +=15;
          JOptionPane.showMessageDialog(rootPane, "Respuesta correcta ! ");

          
        P2Medio pregunta2 = new P2Medio(puntaje,pistasUsadas,id);
        pregunta2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_correctActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        puntaje+=0;
        JOptionPane.showMessageDialog(rootPane, "Respuesta incorrecta :( ");
        
        
        P2Medio pregunta2 = new P2Medio(puntaje,pistasUsadas,id);
        pregunta2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        puntaje+=0;
        JOptionPane.showMessageDialog(rootPane, "Respuesta incorrecta :( ");
        
        
        P2Medio pregunta2 = new P2Medio(puntaje,pistasUsadas,id);
        pregunta2.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonceresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonceresActionPerformed
        // TODO add your handling code here:
        
        puntaje+=0;
        JOptionPane.showMessageDialog(rootPane, "Respuesta incorrecta :( ");
        
        
        P2Medio pregunta2 = new P2Medio(puntaje,pistasUsadas,id);
        pregunta2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonceresActionPerformed

    private void correctaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctaActionPerformed
        // TODO add your handling code here:
        
        
        JOptionPane.showMessageDialog(rootPane, "Me llamo como un anstronomo");
        
        pistasUsadas++;
        
          if(pistasUsadas > maxPistas) {
        correcta.setEnabled(false);
    }

    }//GEN-LAST:event_correctaActionPerformed

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
            java.util.logging.Logger.getLogger(P1Medio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P1Medio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P1Medio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P1Medio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P1Medio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonceres;
    private javax.swing.JButton correct;
    private javax.swing.JButton correcta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
