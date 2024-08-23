/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package juego2;

import MenuJuegos.Menu;
import Perfil.NuevaPartida;
import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class Main extends javax.swing.JFrame {
    List<ImageIcon> imagenes = new ArrayList<>();
    List<ImageIcon> imagenes1 = new ArrayList<>();
    int[] arreglo1 = new int[3];
    int[] arreglo2 = new int[6];
    int[] arreglo3 = new int[9];
    int puntaje = 0;
    static int id;
    int error=0;
    boolean bandera=true;
    /**
     * Creates new form Main
     */
    public Main(int id) {
        initComponents();
        ContadorJuego2.incrementar();
        jTabbedPane1.setSelectedIndex(1);
        jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        this.id=id;
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel20 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jPanel20.setBackground(new java.awt.Color(153, 255, 153));

        jLabel2.setText("Puntaje actual");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(755, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(50, 50, 50))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 64, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 354, -1, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setToolTipText("");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setToolTipText("");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 92, 97));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setToolTipText("");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 92, 97));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setToolTipText("");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 92, 97));

        jTabbedPane1.addTab("tab2", jPanel3);

        jLabel1.setText("Bienvenido");

        jButton1.setText("Facil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Dificil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)))
                .addContainerGap(423, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Menu)
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addGap(38, 38, 38)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(Menu)
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("tab3", jPanel4);

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setToolTipText("");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setToolTipText("");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 92, 97));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setToolTipText("");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 92, 97));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setToolTipText("");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 92, 97));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setToolTipText("");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 92, 97));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setToolTipText("");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 92, 97));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setToolTipText("");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 92, 97));

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, -1, -1));

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setToolTipText("");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 92, 97));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setToolTipText("");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 92, 97));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setToolTipText("");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 92, 97));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setToolTipText("");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 92, 97));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setToolTipText("");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 92, 97));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setToolTipText("");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 92, 97));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setToolTipText("");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setToolTipText("");
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 92, 97));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setToolTipText("");
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 92, 97));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setToolTipText("");
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 92, 97));

        jButton7.setText("Regresar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 354, -1, -1));

        jTabbedPane1.addTab("tab4", jPanel6);

        jButton5.setText("Habitat");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Dieta");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setText("Regresar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(21, 21, 21))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addContainerGap(436, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("tab5", jPanel9);
        jTabbedPane1.addTab("", jTabbedPane3);

        jButton9.setText("Dieta");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Metodo de nacimiento");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(jButton9))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jButton10)))
                .addContainerGap(367, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jButton9)
                .addGap(63, 63, 63)
                .addComponent(jButton10)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab7", jPanel11);

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab8", jPanel10);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 880, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
        bandera=false;
        inicio7();
        inicio8();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
        bandera=true;
        inicio();
        inicio2();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
        imagenes.clear();
        imagenes1.clear();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
        inicio3();
        inicio4();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
        inicio5();
        inicio6();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
        imagenes.clear();
        imagenes1.clear();
    }//GEN-LAST:event_jButton7ActionPerformed

    public void perdiste(){
        
            if(error==3){
                JOptionPane.showMessageDialog(null, "PERDISTE, LO SENTIMOS :("); 
                Menu a= new Menu(id);
                NuevaPartida b= new NuevaPartida(id,4,puntaje);
                a.setVisible(true);
                this.dispose();
        }
    }
    
     public void ganaste(){
        
            if(puntaje==60){
                JOptionPane.showMessageDialog(null, "GANASTE, FELICIDADES !!!"); 
                Menu a= new Menu(id);
                NuevaPartida b= new NuevaPartida(id,4,puntaje);
                a.setVisible(true);
                this.dispose();
        }
    }
    
    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        String p = jLabel25.getText();
        String c = jLabel28.getText();
        System.out.println(p+","+c);
        if(p.equals(c)){
            
            puntaje += 10;
            ganaste();
            JOptionPane.showMessageDialog(null, "Correcto, puntaje acutal:"+puntaje);
            imagenes.clear();
            imagenes1.clear();
            inicio5();
            inicio6();
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        }else{
            System.out.println("incorrecto");
            JOptionPane.showMessageDialog(null, "incorrecto, puntaje acutal:"+puntaje);
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
            error++;
            perdiste();
        }
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        String p = jLabel25.getText();
        String c = jLabel27.getText();
        System.out.println(p+","+c);
        if(p.equals(c)){
            
            puntaje += 10;
            ganaste();
            JOptionPane.showMessageDialog(null, "Correcto, puntaje acutal:"+puntaje);
            imagenes.clear();
            imagenes1.clear();
            inicio5();
            inicio6();
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        }else{
            System.out.println("incorrecto");
            JOptionPane.showMessageDialog(null, "incorrecto, puntaje acutal:"+puntaje);
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
            error++;
            perdiste();
        }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        String p = jLabel25.getText();
        String c = jLabel26.getText();
        System.out.println(p+","+c);
        if(p.equals(c)){
            
            puntaje += 10;
            ganaste();
            JOptionPane.showMessageDialog(null, "Correcto, puntaje acutal:"+puntaje);
            imagenes.clear();
            imagenes1.clear();
            inicio5();
            inicio6();
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        }else{
            System.out.println("incorrecto");
            JOptionPane.showMessageDialog(null, "incorrecto, puntaje acutal:"+puntaje);
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
            error++;
            perdiste();
        }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        String p = jLabel25.getText();
        String c = jLabel10.getText();
        System.out.println(p+","+c);
        if(p.equals(c)){
            
            puntaje += 10;
            ganaste();
            JOptionPane.showMessageDialog(null, "Correcto, puntaje acutal:"+puntaje);
            imagenes.clear();
            imagenes1.clear();
            inicio5();
            inicio6();
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        }else{
            System.out.println("incorrecto");
            JOptionPane.showMessageDialog(null, "incorrecto, puntaje acutal:"+puntaje);
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
            error++;
            perdiste();
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        String p = jLabel25.getText();
        String c = jLabel24.getText();
        System.out.println(p+","+c);
        if(p.equals(c)){
            
            puntaje += 10;
            ganaste();
            JOptionPane.showMessageDialog(null, "Correcto, puntaje acutal:"+puntaje);
            imagenes.clear();
            imagenes1.clear();
            inicio5();
            inicio6();
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        }else{
            System.out.println("incorrecto");
            JOptionPane.showMessageDialog(null, "incorrecto, puntaje acutal:"+puntaje);
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
            error++;
            perdiste();
        }
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        String p = jLabel25.getText();
        String c = jLabel23.getText();
        System.out.println(p+","+c);
        if(p.equals(c)){
            
            puntaje += 10;
            ganaste();
            JOptionPane.showMessageDialog(null, "Correcto, puntaje acutal:"+puntaje);
            imagenes.clear();
            imagenes1.clear();
            inicio5();
            inicio6();
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        }else{
            System.out.println("incorrecto");
            JOptionPane.showMessageDialog(null, "incorrecto, puntaje acutal:"+puntaje);
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
            error++;
            perdiste();
        }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        String p = jLabel25.getText();
        String c = jLabel22.getText();
        System.out.println(p+","+c);
        if(p.equals(c)){
            
            puntaje += 10;
            ganaste();
            JOptionPane.showMessageDialog(null, "Correcto, puntaje acutal:"+puntaje);
            imagenes.clear();
            imagenes1.clear();
            inicio5();
            inicio6();
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        }else{
            System.out.println("incorrecto");
            JOptionPane.showMessageDialog(null, "incorrecto, puntaje acutal:"+puntaje);
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
            error++;
            perdiste();
        }
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        String p = jLabel25.getText();
        String c = jLabel21.getText();
        System.out.println(p+","+c);
        if(p.equals(c)){
            
            puntaje += 10;
            ganaste();
            JOptionPane.showMessageDialog(null, "Correcto, puntaje acutal:"+puntaje);
            imagenes.clear();
            imagenes1.clear();
            inicio5();
            inicio6();
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        }else{
            System.out.println("incorrecto");
            JOptionPane.showMessageDialog(null, "incorrecto, puntaje acutal:"+puntaje);
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
            error++;
            perdiste();
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        String p = jLabel25.getText();
        String c = jLabel20.getText();
        System.out.println(p+","+c);
        if(p.equals(c)){
            
            puntaje += 10;
            ganaste();
            JOptionPane.showMessageDialog(null, "Correcto, puntaje acutal:"+puntaje);
            imagenes.clear();
            imagenes1.clear();
            inicio5();
            inicio6();
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        }else{
            System.out.println("incorrecto");
            JOptionPane.showMessageDialog(null, "incorrecto, puntaje acutal:"+puntaje);
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
            error++;
            perdiste();
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        String p = jLabel14.getText();
        String c = jLabel16.getText();
        if(p.equals(c)){
            
            puntaje += 10;
            ganaste();
            JOptionPane.showMessageDialog(null, "Correcto, puntaje acutal:"+puntaje);
            imagenes.clear();
            imagenes1.clear();
            inicio3();
            inicio4();
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        }else{
            System.out.println("incorrecto");
            JOptionPane.showMessageDialog(null, "incorrecto, puntaje acutal:"+puntaje);
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
            error++;
            perdiste();
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        String p = jLabel13.getText();
        String c = jLabel16.getText();
        System.out.println(""+p+","+c);
        if(p.equals(c)){
            
            puntaje += 10;
            ganaste();
            JOptionPane.showMessageDialog(null, "Correcto, puntaje acutal:"+puntaje);
            imagenes.clear();
            imagenes1.clear();
            inicio3();
            inicio4();
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        }else{
            System.out.println("incorrecto");
            JOptionPane.showMessageDialog(null, "incorrecto, puntaje acutal:"+puntaje);
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
            error++;
            perdiste();
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        String p = jLabel12.getText();
        String c = jLabel16.getText();
        System.out.println(""+p+","+c);
        if(p.equals(c)){
            
            puntaje += 10;
            ganaste();
            JOptionPane.showMessageDialog(null, "Correcto, puntaje acutal:"+puntaje);
            imagenes.clear();
            imagenes1.clear();
            inicio3();
            inicio4();
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        }else{
            System.out.println("incorrecto");
            JOptionPane.showMessageDialog(null, "incorrecto, puntaje acutal:"+puntaje);
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
            error++;
            perdiste();
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        String p = jLabel11.getText();
        String c = jLabel16.getText();
        System.out.println(""+p+","+c);
        if(p.equals(c)){
            
            puntaje += 10;
            ganaste();
            JOptionPane.showMessageDialog(null, "Correcto, puntaje acutal:"+puntaje);
            imagenes.clear();
            imagenes1.clear();
            inicio3();
            inicio4();
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        }else{
            System.out.println("incorrecto");
            JOptionPane.showMessageDialog(null, "incorrecto, puntaje acutal:"+puntaje);
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
            error++;
            perdiste();
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        String p = jLabel15.getText();
        String c = jLabel16.getText();
        if(p.equals(c)){
            
            puntaje += 10;
            ganaste();
            JOptionPane.showMessageDialog(null, "Correcto, puntaje acutal:"+puntaje);
            imagenes.clear();
            imagenes1.clear();
            inicio3();
            inicio4();
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        }else{
            System.out.println("incorrecto");
            JOptionPane.showMessageDialog(null, "incorrecto, puntaje acutal:"+puntaje);
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
            error++;
            perdiste();
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        String p = jLabel8.getText();
        String c = jLabel16.getText();
        if(p.equals(c)){
            
            puntaje += 10;
            ganaste();
            JOptionPane.showMessageDialog(null, "Correcto, puntaje acutal:"+puntaje);
            imagenes.clear();
            imagenes1.clear();
            inicio3();
            inicio4();
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        }else{
            System.out.println("incorrecto");
            JOptionPane.showMessageDialog(null, "incorrecto, puntaje acutal:"+puntaje);
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
            error++;
            perdiste();
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
        imagenes.clear();
        imagenes1.clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(6);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        String p = jLabel18.getText();
        String c = jLabel19.getText();
        if(p.equals(c)){
            
            puntaje += 10;
            ganaste();
            JOptionPane.showMessageDialog(null, "Correcto, puntaje acutal:"+puntaje);
            imagenes.clear();
            imagenes1.clear();
            if(bandera==false){
               inicio7();
                inicio8(); 
            }else{
               inicio();
               inicio2();
            }
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        }else{
            System.out.println("incorrecto");
            JOptionPane.showMessageDialog(null, "incorrecto, puntaje acutal:"+puntaje);
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
            error++;
            perdiste();
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        String p = jLabel17.getText();
        String c = jLabel19.getText();
        if(p.equals(c)){
            
            puntaje += 10;
            ganaste();
            JOptionPane.showMessageDialog(null, "Correcto, puntaje acutal:"+puntaje);
            
            imagenes.clear();
            imagenes1.clear();
            
            if(bandera==false){
               inicio7();
                inicio8(); 
            }else{
               inicio();
               inicio2();
            }
            
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        }else{
            System.out.println("incorrecto");
            JOptionPane.showMessageDialog(null, "incorrecto, puntaje acutal:"+puntaje);
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
            error++;
            perdiste();
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        String p = jLabel9.getText();
        String c = jLabel19.getText();
        if(p.equals(c)){
            
            puntaje += 10;
            ganaste();
            JOptionPane.showMessageDialog(null, "Correcto, puntaje acutal:"+puntaje);
            imagenes.clear();
            imagenes1.clear();
            if(bandera==false){
               inicio7();
                inicio8(); 
            }else{
               inicio();
               inicio2();
            }
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
        }else{
            System.out.println("incorrecto");
            JOptionPane.showMessageDialog(null, "incorrecto, puntaje acutal:"+puntaje);
            jLabel2.setText("Puntaje actual: "+ Integer.toString(puntaje));
            error++;
            perdiste();
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
        imagenes.clear();
        imagenes1.clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
        
        Menu menu=new Menu(id);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuActionPerformed
    public void inicio(){
        Component[] componentes = jPanel5.getComponents();
        
     
                String[] imagePaths = {
               "pato.jpeg", "leon.jpeg", "tigre.jpeg",
               "coco.jpg", "ciervo.jpg", "orni.jpg"
           };

           List<ImageIcon> imagenes = new ArrayList<>();

           // Carga las imágenes como recursos
           for (String path : imagePaths) {
               java.net.URL imgURL = getClass().getResource(path);
               if (imgURL != null) {
                   imagenes.add(new ImageIcon(imgURL));
               } else {
                   System.err.println("No se pudo encontrar el archivo: " + path);
               }
           }
        
        Random rand = new Random();

        for (Component componente : componentes) {
            if (componente instanceof JLabel) {
                JLabel label = (JLabel) componente;

                if (!imagenes.isEmpty()) {
                    int indiceImagenAleatoria = rand.nextInt(imagenes.size());
                    ImageIcon imagenAleatoria = imagenes.get(indiceImagenAleatoria);
                    // Redimensiona la imagen para ajustarla al tamaño de la etiqueta
                    Image img = imagenAleatoria.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon icono = new ImageIcon(img);
                    switch (indiceImagenAleatoria) {
                        case 0:
                            label.setText("plantas"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("pato");
                            break;
                        case 1:
                            label.setText("carne"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("leon");
                            break;
                        case 2:
                            label.setText("carne"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("tigre");
                            break;
                            case 3:
                            label.setText("carne"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("coco");
                            break;
                            case 4:
                            label.setText("plantas"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("ciervo");
                            break;
                            case 5:
                            label.setText("frutas"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("orni");
                            break;
                        default:
                            break;
                    }
                    label.setIcon(icono);
                }
            }
        }
    }
    
    

    
    public void inicio2(){
       Component[] componentes = jPanel3.getComponents();

            String[] imagePaths = {
                "carne.jpeg",  // Asegúrate de que el archivo esté en el mismo paquete que esta clase
                "fruta.jpeg",  // Asegúrate de que el archivo esté en el mismo paquete que esta clase
                "plantas.jpg"  // Asegúrate de que el archivo esté en el mismo paquete que esta clase
            };

            List<ImageIcon> imagenes1 = new ArrayList<>();

            // Carga las imágenes como recursos
            for (String path : imagePaths) {
                java.net.URL imgURL = getClass().getResource(path);
                if (imgURL != null) {
                    imagenes1.add(new ImageIcon(imgURL));
                } else {
                    System.err.println("No se pudo encontrar el archivo: " + path);
                }
            }

            // Suponiendo que arreglo1 es un array del mismo tamaño que componentes
            // y está declarado en alguna parte de tu clase
            Arrays.fill(arreglo1, 0);
        Random rand = new Random();

        for (Component componente : componentes) {
            if (componente instanceof JLabel) {
                JLabel label = (JLabel) componente;

                if (!imagenes1.isEmpty()) {
                    int indiceImagenAleatoria;
                    do {
                        indiceImagenAleatoria = rand.nextInt(imagenes1.size());
                        
                    } while (arreglo1[indiceImagenAleatoria] == 1);
                    arreglo1[indiceImagenAleatoria] = 1;
                    ImageIcon imagenAleatoria = imagenes1.get(indiceImagenAleatoria);
                    // Redimensiona la imagen para ajustarla al tamaño de la etiqueta
                    Image img = imagenAleatoria.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon icono = new ImageIcon(img);
                    
                    label.setIcon(icono);
                    switch (indiceImagenAleatoria) {
                        case 0:
                            label.setText("carne"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("carne");
                            break;
                        case 1:
                            label.setText("fruta"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("fruta");
                            break;
                        case 2:
                            label.setText("plantas"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("plantas");
                            break;

                        default:
                            break;
                    }
                }
            }
        }
    }
   
    public void inicio3(){
        Component[] componentes = jPanel7.getComponents();
        
        
        String[] imagePaths = {
    "pato.jpeg", "leon.jpeg", "tigre.jpeg",
    "coco.jpg", "ciervo.jpg", "orni.jpg"
};

List<ImageIcon> imagenes = new ArrayList<>();

// Carga las imágenes como recursos
for (String path : imagePaths) {
    java.net.URL imgURL = getClass().getResource(path);
    if (imgURL != null) {
        imagenes.add(new ImageIcon(imgURL));
    } else {
        System.err.println("No se pudo encontrar el archivo: " + path);
    }
}
        
        Random rand = new Random();
        for (Component componente : componentes) {
            if (componente instanceof JLabel) {
                JLabel label = (JLabel) componente;
                label.setText("");
                if (!imagenes.isEmpty()) {
                    int indiceImagenAleatoria = rand.nextInt(imagenes.size());
                    ImageIcon imagenAleatoria = imagenes.get(indiceImagenAleatoria);
                    // Redimensiona la imagen para ajustarla al tamaño de la etiqueta
                    Image img = imagenAleatoria.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon icono = new ImageIcon(img);
                    switch (indiceImagenAleatoria) {
                        case 0:
                            label.setText("plantas"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("pato");
                            break;
                        case 1:
                            label.setText("carne"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("leon");
                            break;
                        case 2:
                            label.setText("carne"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("tigre");
                            break;
                            case 3:
                            label.setText("carne"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("coco");
                            break;
                            case 4:
                            label.setText("plantas"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("ciervo");
                            break;
                            case 5:
                            label.setText("frutas"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("orni");
                            break;
                        default:
                            break;
                    }
                    label.setIcon(icono);
                }
            }
        }
    }
    
    public void inicio4(){
        Component[] componentes = jPanel2.getComponents();
        
                String[] imagePaths = {
            "carne.jpeg", "fruta.jpeg", "plantas.jpg",
            "Hongos.jpg", "insectos.jpg", "sangre.jpg"
        };

        List<ImageIcon> imagenes1 = new ArrayList<>();

        // Carga las imágenes como recursos
        for (String path : imagePaths) {
            java.net.URL imgURL = getClass().getResource(path);
            if (imgURL != null) {
                imagenes1.add(new ImageIcon(imgURL));
            } else {
                System.err.println("No se pudo encontrar el archivo: " + path);
            }
        }

        Arrays.fill(arreglo2, 0);  // Esto inicializa el arreglo con ceros.
                Random rand = new Random();

        for (Component componente : componentes) {
            if (componente instanceof JLabel) {
                JLabel label = (JLabel) componente;

                if (!imagenes1.isEmpty()) {
                    int indiceImagenAleatoria;
                    do {
                        indiceImagenAleatoria = rand.nextInt(imagenes1.size());
                    } while (arreglo2[indiceImagenAleatoria] == 1);
                    arreglo2[indiceImagenAleatoria] = 1;
                    ImageIcon imagenAleatoria = imagenes1.get(indiceImagenAleatoria);
                    // Redimensiona la imagen para ajustarla al tamaño de la etiqueta
                    Image img = imagenAleatoria.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon icono = new ImageIcon(img);
                    
                    label.setIcon(icono);
                    switch (indiceImagenAleatoria) {
                        case 0:
                            label.setText("carne");
                            break;
                        case 1:
                            label.setText("frutas"); 
                            break;
                        case 2:
                            label.setText("plantas"); 
                            break;
                        case 3:
                            label.setText("hongos");
                            break;
                        case 4:
                            label.setText("insectos"); 
                            break;
                        case 5:
                            label.setText("sangre"); 
                            break; 
                        default:
                            break;
                    }
                }
            }
        }
    }
    public void inicio5(){
        Component[] componentes = jPanel8.getComponents();
        
                String[] imagePaths = {
            "pato.jpeg", "leon.jpeg", "tigre.jpeg",
            "coco.jpg", "ciervo.jpg", "orni.jpg"
        };

        // Asegúrese de que la lista 'imagenes' esté inicializada
        List<ImageIcon> imagenes = new ArrayList<>();

        // Carga las imágenes como recursos
        for (String path : imagePaths) {
            java.net.URL imgURL = getClass().getResource(path);
            if (imgURL != null) {
                imagenes.add(new ImageIcon(imgURL));
            } else {
                System.err.println("No se pudo encontrar el archivo: " + path);
            }
        }
        
        Random rand = new Random();
        for (Component componente : componentes) {
            if (componente instanceof JLabel) {
                JLabel label = (JLabel) componente;

                if (!imagenes.isEmpty()) {
                    int indiceImagenAleatoria = rand.nextInt(imagenes.size());
                    ImageIcon imagenAleatoria = imagenes.get(indiceImagenAleatoria);
                    // Redimensiona la imagen para ajustarla al tamaño de la etiqueta
                    Image img = imagenAleatoria.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon icono = new ImageIcon(img);
                    switch (indiceImagenAleatoria) {
                        case 0:
                            label.setText("pato"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("pato");
                            break;
                        case 1:
                            label.setText("leon"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("leon");
                            break;
                        case 2:
                            label.setText("tigre"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("tigre");
                            break;
                            case 3:
                            label.setText("coco"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("coco");
                            break;
                            case 4:
                            label.setText("ciervo"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("ciervo");
                            break;
                            case 5:
                            label.setText("orni"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("orni");
                            break;
                        default:
                            break;
                    }
                    label.setIcon(icono);
                }
            }
        }
    }
    
    public void inicio6(){
        
        Component[] componentes = jPanel6.getComponents();

        String[] imagePaths = {
            "lago.jpeg", "sabana.jpeg", "selva.jpg",
            "pantano.jpeg", "pradera.jpg", "montana.jpeg",
            "mar.jpg", "desierto.jpg", "bosque.jpg"
        };

        List<ImageIcon> imagenes1 = new ArrayList<>();

        // Carga las imágenes como recursos
        for (String path : imagePaths) {
            java.net.URL imgURL = getClass().getResource(path);
            if (imgURL != null) {
                imagenes1.add(new ImageIcon(imgURL));
            } else {
                System.err.println("No se pudo encontrar el archivo: " + path);
            }
        }

        // Asegúrate de que el arreglo 'arreglo3' esté inicializado correctamente
        Arrays.fill(arreglo3, 0);  // Si esto es necesario para reinicializar el arreglo

       Random rand = new Random();

        for (Component componente : componentes) {
            if (componente instanceof JLabel) {
                JLabel label = (JLabel) componente;

                if (!imagenes1.isEmpty()) {
                    int indiceImagenAleatoria;
                    do {
                        indiceImagenAleatoria = rand.nextInt(imagenes1.size());
                    } while (arreglo3[indiceImagenAleatoria] == 1);
                    arreglo3[indiceImagenAleatoria] = 1;
                    ImageIcon imagenAleatoria = imagenes1.get(indiceImagenAleatoria);
                    // Redimensiona la imagen para ajustarla al tamaño de la etiqueta
                    Image img = imagenAleatoria.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon icono = new ImageIcon(img);
                    
                    label.setIcon(icono);
                    switch (indiceImagenAleatoria) {
                        case 0:
                            label.setText("pato");
                            System.out.println("pato");
                            break;
                        case 1:
                            label.setText("leon"); 
                            System.out.println("leon");
                            break;
                        case 2:
                            label.setText("tigre"); 
                            System.out.println("tigre");
                            break;
                        case 3:
                            label.setText("coco");
                            System.out.println("coco");
                            break;
                        case 4:
                            label.setText("ciervo");
                            System.out.println("ciervo");
                            break;
                        case 5:
                            label.setText("orni"); 
                            System.out.println("orni");
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }  
    
                                          
    public void inicio7(){
        Component[] componentes = jPanel5.getComponents();
        
     
                String[] imagePaths = {
               "pato.jpeg", "leon.jpeg", "tigre.jpeg",
               "coco.jpg", "ciervo.jpg", "orni.jpg"
           };

           List<ImageIcon> imagenes = new ArrayList<>();

           // Carga las imágenes como recursos
           for (String path : imagePaths) {
               java.net.URL imgURL = getClass().getResource(path);
               if (imgURL != null) {
                   imagenes.add(new ImageIcon(imgURL));
               } else {
                   System.err.println("No se pudo encontrar el archivo: " + path);
               }
           }
        
        Random rand = new Random();

        for (Component componente : componentes) {
            if (componente instanceof JLabel) {
                JLabel label = (JLabel) componente;

                if (!imagenes.isEmpty()) {
                    int indiceImagenAleatoria = rand.nextInt(imagenes.size());
                    ImageIcon imagenAleatoria = imagenes.get(indiceImagenAleatoria);
                    // Redimensiona la imagen para ajustarla al tamaño de la etiqueta
                    Image img = imagenAleatoria.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon icono = new ImageIcon(img);
                    switch (indiceImagenAleatoria) {
                        case 0:
                            label.setText("Oviparo"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("pato");
                            break;
                        case 1:
                            label.setText("Viviparo"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("leon");
                            break;
                        case 2:
                            label.setText("Viviparo"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("tigre");
                            break;
                            case 3:
                            label.setText("Oviparo"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("coco");
                            break;
                            case 4:
                            label.setText("Viviparo"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("ciervo");
                            break;
                            case 5:
                            label.setText("Ovoviviparo"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("orni");
                            break;
                        default:
                            break;
                    }
                    label.setIcon(icono);
                }
            }
        }
    }
    
    

    
    public void inicio8(){
       Component[] componentes = jPanel3.getComponents();

            String[] imagePaths = {
                "Oviparo.png",  
                "Viviparo.png",  
                "Ovoviviparo.png"  
            };

            List<ImageIcon> imagenes1 = new ArrayList<>();

            // Carga las imágenes como recursos
            for (String path : imagePaths) {
                java.net.URL imgURL = getClass().getResource(path);
                if (imgURL != null) {
                    imagenes1.add(new ImageIcon(imgURL));
                } else {
                    System.err.println("No se pudo encontrar el archivo: " + path);
                }
            }

            // Suponiendo que arreglo1 es un array del mismo tamaño que componentes
            // y está declarado en alguna parte de tu clase
            Arrays.fill(arreglo1, 0);
        Random rand = new Random();

        for (Component componente : componentes) {
            if (componente instanceof JLabel) {
                JLabel label = (JLabel) componente;

                if (!imagenes1.isEmpty()) {
                    int indiceImagenAleatoria;
                    do {
                        indiceImagenAleatoria = rand.nextInt(imagenes1.size());
                        
                    } while (arreglo1[indiceImagenAleatoria] == 1);
                    arreglo1[indiceImagenAleatoria] = 1;
                    ImageIcon imagenAleatoria = imagenes1.get(indiceImagenAleatoria);
                    // Redimensiona la imagen para ajustarla al tamaño de la etiqueta
                    Image img = imagenAleatoria.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon icono = new ImageIcon(img);
                    
                    label.setIcon(icono);
                    switch (indiceImagenAleatoria) {
                        case 0:
                            label.setText("Oviparo"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("Oviparo");
                            break;
                        case 1:
                            label.setText("Viviparo"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("Viviparo");
                            break;
                        case 2:
                            label.setText("Ovoviviparo"); // Limpia cualquier texto que pudiera estar en la etiqueta
                            System.out.println("Ovoviviparo");
                            break;

                        default:
                            break;
                    }
                }
            }
        }
    }
   
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    // End of variables declaration//GEN-END:variables
}
