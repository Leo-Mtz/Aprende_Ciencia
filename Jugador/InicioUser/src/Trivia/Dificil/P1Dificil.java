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
public class P1Dificil extends javax.swing.JFrame {

     private int puntaje=0;
     
    /**
     * Creates new form P1
     */
     static int id;
    public P1Dificil(int id) {
        this.id=id;
        initComponents();
    }
    
 
    
    private int pistasUsadas;
    private int maxPistas = 2;
    

 
    public P1Dificil(int puntajeRecibido, int pistasUsadasActual, int id) {
    this.puntaje = puntajeRecibido;
    this.pistasUsadas = pistasUsadasActual;
    initComponents();
    jTextField1.setText(String.valueOf(this.puntaje)); 
    jTextField1.setEditable(false);
    if(pistasUsadas >= maxPistas) {
        correct.setEnabled(false); // Deshabilita el botón si ya se alcanzó el máximo al abrir la ventana
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
        jLabel2 = new javax.swing.JLabel();
        correct = new javax.swing.JButton();
        supernova = new javax.swing.JButton();
        pista = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bluedwarf = new javax.swing.JButton();
        galaxia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("R:1 P:1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Puntaje: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 0, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("e hidrogeno y que emite energía y luz");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 420, 50));

        correct.setBackground(new java.awt.Color(0, 0, 0));
        correct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        correct.setForeground(new java.awt.Color(255, 255, 255));
        correct.setText("Estrella");
        correct.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 255)));
        correct.setBorderPainted(false);
        correct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctActionPerformed(evt);
            }
        });
        getContentPane().add(correct, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 120, 40));

        supernova.setBackground(new java.awt.Color(0, 0, 0));
        supernova.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        supernova.setForeground(new java.awt.Color(255, 255, 255));
        supernova.setText("Supernova");
        supernova.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        supernova.setBorderPainted(false);
        supernova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supernovaActionPerformed(evt);
            }
        });
        getContentPane().add(supernova, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 120, 40));

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

        jLabel3.setBackground(new java.awt.Color(255, 0, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cuerpo celeste compuesto de helio");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 420, 50));

        bluedwarf.setBackground(new java.awt.Color(0, 0, 0));
        bluedwarf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bluedwarf.setForeground(new java.awt.Color(255, 255, 255));
        bluedwarf.setText("Enana azul");
        bluedwarf.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        bluedwarf.setBorderPainted(false);
        bluedwarf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bluedwarfActionPerformed(evt);
            }
        });
        getContentPane().add(bluedwarf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 120, 40));

        galaxia.setBackground(new java.awt.Color(0, 0, 0));
        galaxia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        galaxia.setForeground(new java.awt.Color(255, 255, 255));
        galaxia.setText("Galaxia");
        galaxia.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        galaxia.setBorderPainted(false);
        galaxia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                galaxiaActionPerformed(evt);
            }
        });
        getContentPane().add(galaxia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 120, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trivia/Dificil/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void correctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctActionPerformed
        // TODO add your handling code here:
        
        puntaje+=10;
        JOptionPane.showMessageDialog(rootPane, "Respuesta correcta ! ");

        
         P2Dificil pregunta2 = new P2Dificil(puntaje, pistasUsadas,id);
        pregunta2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_correctActionPerformed

    private void supernovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supernovaActionPerformed
        // TODO add your handling code here:


        JOptionPane.showMessageDialog(rootPane, "Respuesta incorrecta :( ");
        
        puntaje+=0;
        
         P2Dificil pregunta2 = new P2Dificil(puntaje, pistasUsadas,id);
        pregunta2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_supernovaActionPerformed

    private void pistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pistaActionPerformed
        // TODO add your handling code here:
        
        
        JOptionPane.showMessageDialog(rootPane, "El Sol es un gran ejemplo");
        
           pistasUsadas++;
        
          if(pistasUsadas > maxPistas) {
        pista.setEnabled(false);
    }
    }//GEN-LAST:event_pistaActionPerformed

    private void bluedwarfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bluedwarfActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(rootPane, "Respuesta incorrecta :( ");
        
        
        
        puntaje+=0;
        
        
         P2Dificil pregunta2 = new P2Dificil(puntaje, pistasUsadas,id);
        pregunta2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bluedwarfActionPerformed

    private void galaxiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_galaxiaActionPerformed
        // TODO add your handling code here:
        
        
        JOptionPane.showMessageDialog(rootPane, "Respuesta incorrecta :( ");
        
        
        
        puntaje+=0;
        
        
         P2Dificil pregunta2 = new P2Dificil(puntaje, pistasUsadas,id);
        pregunta2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_galaxiaActionPerformed

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
            java.util.logging.Logger.getLogger(P1Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P1Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P1Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P1Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P1Dificil(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bluedwarf;
    private javax.swing.JButton correct;
    private javax.swing.JButton galaxia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton pista;
    private javax.swing.JButton supernova;
    // End of variables declaration//GEN-END:variables
}
