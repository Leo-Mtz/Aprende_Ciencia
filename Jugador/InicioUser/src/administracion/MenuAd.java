package administracion;

import Sesion.IniciarSesion;

/**
 *
 * @author 178535
 */
public class MenuAd extends javax.swing.JFrame {

    /**
     * Creates new form MenuAd
     */
    public MenuAd() {
        initComponents();
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
        Usuariosbtn = new javax.swing.JButton();
        Datosbtn = new javax.swing.JButton();
        Graficabtn = new javax.swing.JButton();
        Documentobtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Documentobtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        Usuariosbtn.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
        Usuariosbtn.setForeground(new java.awt.Color(0, 153, 0));
        Usuariosbtn.setText("Consulta Usuarios");
        Usuariosbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosbtnActionPerformed(evt);
            }
        });

        Datosbtn.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
        Datosbtn.setForeground(new java.awt.Color(0, 153, 0));
        Datosbtn.setText("Eliminar/borrar Usuarios");
        Datosbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatosbtnActionPerformed(evt);
            }
        });

        Graficabtn.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
        Graficabtn.setForeground(new java.awt.Color(0, 153, 0));
        Graficabtn.setText("Consulta juegos");
        Graficabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficabtnActionPerformed(evt);
            }
        });

        Documentobtn.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
        Documentobtn.setForeground(new java.awt.Color(0, 153, 0));
        Documentobtn.setText("Consulta partidas");
        Documentobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocumentobtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menu Admin");

        Documentobtn1.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
        Documentobtn1.setForeground(new java.awt.Color(0, 153, 0));
        Documentobtn1.setText("Cerrar Sesion");
        Documentobtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Documentobtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Documentobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Graficabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Datosbtn)
                            .addComponent(Usuariosbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Documentobtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Usuariosbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Datosbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Graficabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Documentobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(Documentobtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuariosbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosbtnActionPerformed
        AltaVistaUsuario a= new AltaVistaUsuario();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_UsuariosbtnActionPerformed

    private void DatosbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatosbtnActionPerformed
    BajaEditUsuario a= new BajaEditUsuario();
    this.dispose();
    a.setVisible(true);
    }//GEN-LAST:event_DatosbtnActionPerformed

    private void GraficabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficabtnActionPerformed
        VistaJuego a= new VistaJuego();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_GraficabtnActionPerformed

    private void DocumentobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocumentobtnActionPerformed
        VistaPartida a= new VistaPartida();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_DocumentobtnActionPerformed

    private void Documentobtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Documentobtn1ActionPerformed
        IniciarSesion a= new IniciarSesion();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_Documentobtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Datosbtn;
    private javax.swing.JButton Documentobtn;
    private javax.swing.JButton Documentobtn1;
    private javax.swing.JButton Graficabtn;
    private javax.swing.JButton Usuariosbtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
