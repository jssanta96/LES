/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import Controllers.UserController;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class VentanaActualizarUsuario extends javax.swing.JFrame {

    UserController userController;

    public VentanaActualizarUsuario() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoLes.png")).getImage());
        userController = new UserController();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        jButtonInicio = new javax.swing.JButton();
        jButtonSolicitud = new javax.swing.JButton();
        jButtonPerfil = new javax.swing.JButton();
        jButtonInfo = new javax.swing.JButton();
        jLabelBienvenido = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelUsuario = new javax.swing.JPanel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jLabelProyecto = new javax.swing.JLabel();
        jLabelIdentificacion = new javax.swing.JLabel();
        jLabelSolicitud = new javax.swing.JLabel();
        jComboBoxId = new javax.swing.JComboBox<>();
        jComboBoxProyecto = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelTipo1 = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jComboBoxTipoUsuario = new javax.swing.JComboBox<>();
        jButtonVolver = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jLabelFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonInicio.setBackground(new java.awt.Color(102, 0, 0));
        jButtonInicio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonInicio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio.setText("INICIO");
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 161, 37));

        jButtonSolicitud.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSolicitud.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonSolicitud.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSolicitud.setText("PRESTAMO");
        jButtonSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSolicitudActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, 40));

        jButtonPerfil.setBackground(new java.awt.Color(102, 0, 0));
        jButtonPerfil.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPerfil.setText("MI PERFIL");
        jButtonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPerfilActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 161, 37));

        jButtonInfo.setBackground(new java.awt.Color(102, 0, 0));
        jButtonInfo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonInfo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInfo.setText("CONTACTENOS");
        jButtonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfoActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 161, 37));

        jLabelBienvenido.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelBienvenido.setForeground(new java.awt.Color(153, 0, 0));
        jLabelBienvenido.setText("BIENVENIDO");
        jPanelMenu.add(jLabelBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("NombreUsuario");
        jPanelMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoGris.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanelMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 400));

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelUsuario.add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelUsuario.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelUsuario.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelUsuario.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jLabelContraseña.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(102, 102, 102));
        jLabelContraseña.setText("CONTRASEÑA");
        jPanelUsuario.add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 30));

        jLabelProyecto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelProyecto.setForeground(new java.awt.Color(102, 102, 102));
        jLabelProyecto.setText("PROYECTO");
        jPanelUsuario.add(jLabelProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, 30));

        jLabelIdentificacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelIdentificacion.setForeground(new java.awt.Color(102, 102, 102));
        jLabelIdentificacion.setText("IDENTIFICACION");
        jPanelUsuario.add(jLabelIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabelSolicitud.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabelSolicitud.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSolicitud.setText("ACTUALIZAR USUARIO");
        jPanelUsuario.add(jLabelSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jComboBoxId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelUsuario.add(jComboBoxId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 110, 30));

        jComboBoxProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelUsuario.add(jComboBoxProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 130, 30));

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanelUsuario.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 210, 30));

        jLabelTipo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTipo1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTipo1.setText("E-MAIL");
        jPanelUsuario.add(jLabelTipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 30));

        jLabelTipo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTipo.setText("TIPO");
        jPanelUsuario.add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, 30));

        jLabelEstado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEstado.setText("ESTADO");
        jPanelUsuario.add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));

        jLabelNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombre.setText("NOMBRE");
        jPanelUsuario.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 30));
        jPanelUsuario.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 340, 30));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanelUsuario.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 340, 30));

        jComboBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelUsuario.add(jComboBoxTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 130, 30));

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jPanelUsuario.add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanelUsuario.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 100, -1));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo2.setText("jLabel4");
        jPanelUsuario.add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 400));

        getContentPane().add(jPanelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 530, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfoActionPerformed
        VentanaContactenos objVentana = new VentanaContactenos();
        objVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonInfoActionPerformed

    private void jButtonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerfilActionPerformed
    }//GEN-LAST:event_jButtonPerfilActionPerformed

    private void jButtonSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSolicitudActionPerformed
        VentanaPrestamo objVentana = new VentanaPrestamo();
        objVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSolicitudActionPerformed

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        VentanaInicial objVentana= new VentanaInicial();
        objVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        JOptionPane.showMessageDialog(null,"Usuario Creado con exito" );
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        VentanaCRUDUsuario objVentana = new VentanaCRUDUsuario();
        objVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaActualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaActualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaActualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaActualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaActualizarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonInfo;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonPerfil;
    private javax.swing.JButton jButtonSolicitud;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxId;
    private javax.swing.JComboBox<String> jComboBoxProyecto;
    private javax.swing.JComboBox<String> jComboBoxTipoUsuario;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JLabel jLabelIdentificacion;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelProyecto;
    private javax.swing.JLabel jLabelSolicitud;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTipo1;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelUsuario;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
