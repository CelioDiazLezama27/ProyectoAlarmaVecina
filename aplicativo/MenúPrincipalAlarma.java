/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplicativo;

import JFrameBotonAlerta.HisorialAlertas;
import JFrameBotonAlerta.TipoAlarma;
import JframeBotonAlerta.*;
import jframeinicio.FrameVentana;
import reportes.MenuReporte;

/**
 *
 * @author Jhonatan
 */
public class MenúPrincipalAlarma extends javax.swing.JFrame {

    /**
     * Creates new form MenúPrincipalAlarma
     */
    public MenúPrincipalAlarma() {
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
        btm_alarma = new javax.swing.JButton();
        btm_ajustes = new javax.swing.JButton();
        btm_historialaler = new javax.swing.JButton();
        btm_docuayuda = new javax.swing.JButton();
        btm_contacemer = new javax.swing.JButton();
        btm_reportes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        btm_alarma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/alarma (3) (1).png"))); // NOI18N
        btm_alarma.setBorder(null);
        btm_alarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_alarmaActionPerformed(evt);
            }
        });

        btm_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Group 29 (1) (1) (1).png"))); // NOI18N

        btm_historialaler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Group 27 (1).png"))); // NOI18N
        btm_historialaler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_historialalerActionPerformed(evt);
            }
        });

        btm_docuayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Frame 3 (1).png"))); // NOI18N
        btm_docuayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_docuayudaActionPerformed(evt);
            }
        });

        btm_contacemer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Group 29 (2).png"))); // NOI18N
        btm_contacemer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_contacemerActionPerformed(evt);
            }
        });

        btm_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Frame 1 (1).png"))); // NOI18N
        btm_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_reportesActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("SALIR");
        jButton1.setActionCommand("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btm_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_ajustes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_contacemer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btm_historialaler, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_docuayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_alarma, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btm_ajustes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_alarma, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btm_docuayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btm_contacemer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_historialaler, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btm_contacemerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_contacemerActionPerformed
        ContactosdeEmergencia a= new ContactosdeEmergencia();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btm_contacemerActionPerformed

    private void btm_docuayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_docuayudaActionPerformed
        this.setVisible(false);
        DocumentaciondeAyuda d= new DocumentaciondeAyuda();
        d.setVisible(true);
    }//GEN-LAST:event_btm_docuayudaActionPerformed

    private void btm_historialalerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_historialalerActionPerformed
        HisorialAlertas h= new HisorialAlertas();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btm_historialalerActionPerformed

    private void btm_alarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_alarmaActionPerformed
        TipoAlarma t= new TipoAlarma();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btm_alarmaActionPerformed

    private void btm_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_reportesActionPerformed
        this.setVisible(false);
        MenuReporte m= new MenuReporte();
        m.setVisible(true);
    }//GEN-LAST:event_btm_reportesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
        FrameVentana f = new FrameVentana();
        f.setVisible(true);        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(MenúPrincipalAlarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenúPrincipalAlarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenúPrincipalAlarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenúPrincipalAlarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenúPrincipalAlarma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm_ajustes;
    private javax.swing.JButton btm_alarma;
    private javax.swing.JButton btm_contacemer;
    private javax.swing.JButton btm_docuayuda;
    private javax.swing.JButton btm_historialaler;
    private javax.swing.JButton btm_reportes;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
