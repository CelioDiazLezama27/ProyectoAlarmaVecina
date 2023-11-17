/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mydocument.views;

import aplicativo.ContactosdeEmergencia;
import java.awt.Color;

/**
 *
 * @author Jhonatan
 */
public class Asalto extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public Asalto() {
        initComponents();
        InitStyle();
    }
    
    private void InitStyle(){
        title.putClientProperty("FlatLaf.Style", "font: bold $h3.regular.font");
        title.setForeground(Color.black);
        jLabel10.putClientProperty("FlatLaf.styleClass", "large");
        jLabel10.setForeground(Color.black);
        jLabel12.putClientProperty("FlatLaf.styleClass", "large");
        jLabel12.setForeground(Color.black);
        jLabel11.putClientProperty("FlatLaf.styleClass", "large");
        jLabel11.setForeground(Color.black);
        jLabel14.putClientProperty("FlatLaf.styleClass", "large");
        jLabel14.setForeground(Color.black);
        jLabel15.putClientProperty("FlatLaf.styleClass", "large");
        jLabel15.setForeground(Color.black);
        jLabel16.putClientProperty("FlatLaf.styleClass", "large");
        jLabel16.setForeground(Color.black);
        jLabel17.putClientProperty("FlatLaf.styleClass", "large");
        jLabel17.setForeground(Color.black);
        jLabel18.putClientProperty("FlatLaf.styleClass", "large");
        jLabel18.setForeground(Color.black);
        jLabel1.putClientProperty("FlatLaf.styleClass", "large");
        jLabel1.setForeground(Color.black);
        jLabel2.putClientProperty("FlatLaf.styleClass", "large");
        jLabel2.setForeground(Color.black);
        jLabel3.putClientProperty("FlatLaf.styleClass", "large");
        jLabel3.setForeground(Color.black);
        jLabel4.putClientProperty("FlatLaf.styleClass", "large");
        jLabel4.setForeground(Color.black);
        jLabel5.putClientProperty("FlatLaf.styleClass", "large");
        jLabel5.setForeground(Color.black);
        jLabel6.putClientProperty("FlatLaf.styleClass", "large");
        jLabel6.setForeground(Color.black);
        jLabel7.putClientProperty("FlatLaf.styleClass", "large");
        jLabel7.setForeground(Color.black);
        jLabel8.putClientProperty("FlatLaf.styleClass", "large");
        jLabel8.setForeground(Color.black);
        jLabel9.putClientProperty("FlatLaf.styleClass", "large");
        jLabel9.setForeground(Color.black);
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(542, 444));
        setMinimumSize(new java.awt.Dimension(542, 444));
        setPreferredSize(new java.awt.Dimension(310, 360));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(320, 360));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("de identificarlo para describirlo a las autoridades y, en caso de");
        background.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jLabel11.setText("puede provocar mayor agresividad en el atacante.");
        background.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jLabel12.setText("perder");
        background.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jLabel14.setText("2.Evita enfrentarte a él, pues, por la misma razón, llevas las de");
        background.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel15.setText("3.No opongas resistencia. Cualquier acción impulsiva de tu parte ");
        background.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jLabel16.setText("1.Mantente en calma. Tu nerviosismo lo puedes transmitir al");
        background.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jLabel17.setText("asaltante, quien es el que porta el arma.");
        background.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jLabel18.setText("4.Baja la mirada. Es mejor que el delincuente no sienta que tratas ");
        background.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/assa (1).jpg"))); // NOI18N
        background.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        title.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        title.setText("¿Cómo estar preparado para un asalto?");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 323, -1));

        jLabel1.setText("sí reconocerlo, no lo demuestres.");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jLabel2.setText("5.Escucha con atención sus indicaciones y obedécelas al pie ");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel3.setText("de la letra.");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        jLabel4.setText("6.Mantén las manos a la vista del asaltante en todo momento ");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        jLabel5.setText("para que no sospeche que puedes sorprenderlo de alguna ");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        jLabel6.setText("manera.");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        jLabel7.setText("7.Si el delincuente está bajo la influencia de alguna sustancia, sé ");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        jLabel8.setText("más precavido aún, pues no será racional y será más propenso");
        background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        jLabel9.setText("a la agresión.");
        background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
