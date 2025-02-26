/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Trivia;

import MenuJuegos.Menu;
import Trivia.Facil.P1;
import Trivia.ContadorTrivia;
import Trivia.Medio.P1Medio;
import Trivia.Dificil.P1Dificil;

/**
 *
 * @author 177192
 */
public class InicioTrivia extends javax.swing.JFrame {
    static int id;
    /**
     * Creates new form InicioTrivia
     */
    public InicioTrivia(int id) {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        btnTrivia3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        btnTrivia1 = new javax.swing.JButton();
        btnTrivia2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel6.setBackground(new java.awt.Color(255, 204, 0));
        jLabel6.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trivia/background2.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1320, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 193, 58));
        jLabel1.setText("NOVATO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 204, 0));
        jLabel2.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("APRENDIZ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 204, 0));
        jLabel3.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 51));
        jLabel3.setText("CONOCEDOR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Snap ITC", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("TRIVIA ASTRAL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(153, 0, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Tendrás que responder 2 rondas de \n3 preguntas, pero descuida, solo \nabarcaremos nuestro sistema solar\ny tendrás 3 pistas.");
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 3));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 260, 300, 140));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(153, 0, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("Tendrás que responder 2 rondas de \n3 preguntas, pero descuida, solo \nabarcaremos nuestro sistema solar\ny tendrás 4 pistas.");
        jTextArea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 3));
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 290, 140));

        btnTrivia3.setBackground(new java.awt.Color(255, 204, 0));
        btnTrivia3.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        btnTrivia3.setForeground(new java.awt.Color(255, 255, 255));
        btnTrivia3.setText("JUGAR");
        btnTrivia3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTrivia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrivia3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnTrivia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 420, -1, -1));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(153, 0, 255));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setRows(5);
        jTextArea3.setText("Tendrás que responder 3 rondas de \n3 preguntas,  ahora abarcaremos\nnuestro sistema solar\n y otros cuerpos tendrás 3 pistas.");
        jTextArea3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 3));
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 270, 140));

        btnTrivia1.setBackground(new java.awt.Color(255, 204, 0));
        btnTrivia1.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        btnTrivia1.setForeground(new java.awt.Color(255, 255, 255));
        btnTrivia1.setText("JUGAR");
        btnTrivia1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTrivia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrivia1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnTrivia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        btnTrivia2.setBackground(new java.awt.Color(255, 204, 0));
        btnTrivia2.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        btnTrivia2.setForeground(new java.awt.Color(255, 255, 255));
        btnTrivia2.setText("JUGAR");
        btnTrivia2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTrivia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrivia2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnTrivia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trivia/background2.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(1400, 660));
        jLabel5.setMinimumSize(new java.awt.Dimension(1400, 660));
        jLabel5.setPreferredSize(new java.awt.Dimension(1400, 660));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrivia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrivia3ActionPerformed
        // TODO add your handling code here:
        

        P1Dificil triviadificil= new P1Dificil(id);
        triviadificil.setVisible(true);
        ContadorTrivia.incrementardificil();
        ContadorTrivia.incrementar();
        this.dispose();

    }//GEN-LAST:event_btnTrivia3ActionPerformed

    private void btnTrivia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrivia1ActionPerformed
        // TODO add your handling code he
        
        
        P1 triviafacil= new P1(id);
        triviafacil.setVisible(true);
        ContadorTrivia.incrementar();
        ContadorTrivia.incrementarfacil();
        this.dispose();
    }//GEN-LAST:event_btnTrivia1ActionPerformed

    private void btnTrivia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrivia2ActionPerformed
        // TODO add your handling code here:
        
        P1Medio triviamedio= new P1Medio(id);
        triviamedio.setVisible(true);
        ContadorTrivia.incrementar();
        ContadorTrivia.incrementarmedio();
        this.dispose();

    }//GEN-LAST:event_btnTrivia2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
         Menu menu = new Menu(id);
        menu.setVisible(true);
        this.dispose(); //funcion para cerrar ventana anterior
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InicioTrivia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioTrivia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioTrivia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioTrivia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioTrivia(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTrivia1;
    private javax.swing.JButton btnTrivia2;
    private javax.swing.JButton btnTrivia3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
