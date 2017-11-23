/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import javax.swing.ImageIcon;
import Controllers.ProjectController;


public class VentanaActualizarProyectos extends javax.swing.JFrame {

    ProjectController objProjectCtrl;

    public VentanaActualizarProyectos() {//Esto a intej
        initComponents();
        this.setLocationRelativeTo(null);
        objProjectCtrl = new ProjectController();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoLes.png")).getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanelMenu = new javax.swing.JPanel();
        jButtonInicio = new javax.swing.JButton();
        jButtonSolicitud = new javax.swing.JButton();
        jButtonPerfil = new javax.swing.JButton();
        jButtonInfo = new javax.swing.JButton();
        jLabelBienvenido = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelSolicitud = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelNombre1 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelSolicitud = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jButtonVaciar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboCodigo = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelFondo2 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

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

        jPanelSolicitud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelSolicitud.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelSolicitud.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelSolicitud.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabelDescripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDescripcion.setText("DESCRIPCION");
        jPanelSolicitud.add(jLabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 30));

        jLabelNombre1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombre1.setText("ESTADO");
        jPanelSolicitud.add(jLabelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 30));

        jLabelNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombre.setText("NOMBRE");
        jPanelSolicitud.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 30));

        jLabelCodigo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCodigo.setText("CODIGO");
        jPanelSolicitud.add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabelSolicitud.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelSolicitud.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSolicitud.setText("ACTUALIZAR PROYECTO");
        jPanelSolicitud.add(jLabelSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jPanelSolicitud.add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        jButtonVaciar.setText("Vaciar");
        jButtonVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVaciarActionPerformed(evt);
            }
        });
        jPanelSolicitud.add(jButtonVaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanelSolicitud.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));
        jPanelSolicitud.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 170, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanelSolicitud.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 270, 60));

        jPanelSolicitud.add(jComboCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelSolicitud.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 170, 30));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo2.setText("jLabel4");
        jPanelSolicitud.add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 400));

        getContentPane().add(jPanelSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 380, 400));

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

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        createProject();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVaciarActionPerformed

        jTextFieldNombre.setText("");
        jTextArea1.setText("");
    }//GEN-LAST:event_jButtonVaciarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        VentanaCRUDProyectos objVentana = new VentanaCRUDProyectos();
        objVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed


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
            java.util.logging.Logger.getLogger(VentanaActualizarProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaActualizarProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaActualizarProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaActualizarProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VentanaActualizarProyectos().setVisible(true);
            }
        });
    }

    public void createProject(){//Esto a intej

        String code =  jComboCodigo.getSelectedItem().toString();
        String name = jTextFieldNombre.getText();
        String description = jTextArea1.getText();
        String state = jComboBox1.getSelectedItem().toString();

        objProjectCtrl.addProject(code, name, description, state);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonInfo;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonPerfil;
    private javax.swing.JButton jButtonSolicitud;
    private javax.swing.JButton jButtonVaciar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboCodigo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelSolicitud;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelSolicitud;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
