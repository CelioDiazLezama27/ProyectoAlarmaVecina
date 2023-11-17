/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframeinicio;

/**
 *
 * @author WZZRDPC
 */
public class JFrameRegistro extends javax.swing.JFrame {

    /**
     * Creates new form JFrameRegistro
     */
    public JFrameRegistro() {
        initComponents();
        setLocationRelativeTo(null);
        
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
        btn_registrarse = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_contra2 = new javax.swing.JPasswordField();
        txt_contra1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_contra3 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_registrarse.setText("Registrarme");
        btn_registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarseActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        txt_nombre.setName("TxtNombre"); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 110, -1));
        jPanel1.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 110, -1));

        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 110, -1));

        jLabel2.setText("Apellido:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jPanel1.add(txt_contra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 110, -1));
        jPanel1.add(txt_contra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 110, -1));

        jLabel4.setText("Correo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel5.setText("Confirmar Contraseña:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 20));

        jLabel6.setText("Dirección:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel7.setText("Contraseña:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jPanel1.add(txt_contra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 110, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrameBotonAlerta/Imagenes/Boton R.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrameBotonAlerta/Imagenes/JFrameRegistro (3).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       FrameInicio LoginFrame=new FrameInicio();
       LoginFrame.setVisible(true);
       LoginFrame.pack();
       LoginFrame.setLocationRelativeTo(null);
         this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarseActionPerformed

        
         String nombre;
         String apellido;
         String contraseña;
         String direccion;
         int id_tipo;
        
        
       
        
    }//GEN-LAST:event_btn_registrarseActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrarse;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JPasswordField txt_contra1;
    private javax.swing.JPasswordField txt_contra2;
    private javax.swing.JPasswordField txt_contra3;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}