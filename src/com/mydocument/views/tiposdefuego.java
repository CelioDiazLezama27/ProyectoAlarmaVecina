/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mydocument.views;

import static aplicativo.DocumentaciondeAyuda.ShowJPanel;
import java.awt.Color;

/**
 *
 * @author Jhonatan
 */
public class tiposdefuego extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public tiposdefuego() {
        initComponents();
        InitStyle();
    }
    
    private void InitStyle(){
        title.putClientProperty("FlatLaf.Style", "font: bold $h3.regular.font");
        title.setForeground(Color.black);
        jLabel14.putClientProperty("FlatLaf.styleClass", "large");
        jLabel14.setForeground(Color.black);
        jLabel15.putClientProperty("FlatLaf.styleClass", "large");
        jLabel15.setForeground(Color.black);
        jLabel16.putClientProperty("FlatLaf.styleClass", "large");
        jLabel16.setForeground(Color.black);
        jLabel18.putClientProperty("FlatLaf.styleClass", "large");
        jLabel18.setForeground(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(310, 360));
        setMinimumSize(new java.awt.Dimension(310, 360));
        setPreferredSize(new java.awt.Dimension(310, 360));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(320, 360));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/A2.jpg"))); // NOI18N
        jLabel14.setText("2.Llama a los servicios de emergencia al teléfono 911 de");
        background.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 150, 110));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/A3.jpg"))); // NOI18N
        jLabel15.setText("3.Abre una ventana que dé a la calle y hazte notar. En pisos");
        background.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 150, 100));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/A1.jpg"))); // NOI18N
        background.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 150, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/A4.jpg"))); // NOI18N
        background.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 150, 110));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/tiposdefuego (1).jpg"))); // NOI18N
        background.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, 420));

        title.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        title.setText("TIPOS DE FUEGO");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 180, -1));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton1.setText("<");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ShowJPanel(new incendio());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
