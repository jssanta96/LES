/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import javax.swing.ImageIcon;

public class VentanaLogin extends javax.swing.JFrame {


    public VentanaLogin() {//Esto a intej
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoLes.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogoLab = new javax.swing.JLabel();
        jLabelLogoUnivalle = new javax.swing.JLabel();
        jLabelLogoUser = new javax.swing.JLabel();
        jLabelSiglas = new javax.swing.JLabel();
        jLabelLes = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jButtonIngresar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLab.png"))); // NOI18N
        getContentPane().add(jLabelLogoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jLabelLogoUnivalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivalle.png"))); // NOI18N
        getContentPane().add(jLabelLogoUnivalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabelLogoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUser.png"))); // NOI18N
        getContentPane().add(jLabelLogoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabelSiglas.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelSiglas.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSiglas.setText("L.E.S");
        getContentPane().add(jLabelSiglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 190, 60));

        jLabelLes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelLes.setForeground(new java.awt.Color(153, 153, 153));
        jLabelLes.setText("LOAN EQUIPMENT SYSTEM");
        getContentPane().add(jLabelLes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPassword.setText("CONTRASEÑA:");
        getContentPane().add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelUsuario.setText("USUARIO:");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        jTextFieldUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 200, 30));

        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 200, 30));

        jButtonIngresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonIngresar.setText("INGRESAR");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 100, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 90, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        VentanaInicial objVentana= new VentanaInicial();
        objVentana.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLes;
    private javax.swing.JLabel jLabelLogoLab;
    private javax.swing.JLabel jLabelLogoUnivalle;
    private javax.swing.JLabel jLabelLogoUser;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelSiglas;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
