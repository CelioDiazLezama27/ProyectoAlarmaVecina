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
public class incendio extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public incendio() {
        initComponents();
        InitStyle();
    }
    
    private void InitStyle(){
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
        jLabel19 = new javax.swing.JLabel();
        incendioysisalir = new javax.swing.JButton();
        tipos = new javax.swing.JButton();
        humoescalera = new javax.swing.JButton();
        incendioynosalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(310, 360));
        setMinimumSize(new java.awt.Dimension(310, 360));
        setPreferredSize(new java.awt.Dimension(310, 360));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(320, 360));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/incendio apartado.jpg"))); // NOI18N
        background.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        incendioysisalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/incendio y salir.jpg"))); // NOI18N
        incendioysisalir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        incendioysisalir.setMaximumSize(new java.awt.Dimension(542, 444));
        incendioysisalir.setMinimumSize(new java.awt.Dimension(542, 444));
        incendioysisalir.setPreferredSize(new java.awt.Dimension(542, 444));
        incendioysisalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incendioysisalirActionPerformed(evt);
            }
        });
        background.add(incendioysisalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 120, 140));

        tipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/tiposdefuego.jpg"))); // NOI18N
        tipos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        tipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiposActionPerformed(evt);
            }
        });
        background.add(tipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 120, 140));

        humoescalera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/humoescalera.jpg"))); // NOI18N
        humoescalera.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        humoescalera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humoescaleraActionPerformed(evt);
            }
        });
        background.add(humoescalera, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 140, 140));

        incendioynosalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/incendio y no salir.jpg"))); // NOI18N
        incendioynosalir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        incendioynosalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incendioynosalirActionPerformed(evt);
            }
        });
        background.add(incendioynosalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 120, 140));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Tipos de fuego");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Incendio y si puedes");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Humo en escalera");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("salir");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("Incendio y no puedes");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("salir");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void humoescaleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humoescaleraActionPerformed
          ShowJPanel(new humoenescalera());
    }//GEN-LAST:event_humoescaleraActionPerformed

    private void incendioynosalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incendioynosalirActionPerformed
        ShowJPanel(new incendioysale());
    }//GEN-LAST:event_incendioynosalirActionPerformed

    private void incendioysisalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incendioysisalirActionPerformed
        ShowJPanel(new incendioysisale());
    }//GEN-LAST:event_incendioysisalirActionPerformed

    private void tiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiposActionPerformed
        ShowJPanel(new tiposdefuego());
    }//GEN-LAST:event_tiposActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton humoescalera;
    private javax.swing.JButton incendioynosalir;
    private javax.swing.JButton incendioysisalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton tipos;
    // End of variables declaration//GEN-END:variables
}
