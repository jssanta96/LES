/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import Controllers.RequestController;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import Dao.FachadaBD;
import javax.swing.JComboBox;



public class VentanaSolicitud extends javax.swing.JFrame {

    RequestController objRequestCtrl;
    FachadaBD  fachada;

    public VentanaSolicitud() {//Esto a intej

        initComponents();
        fachada = new FachadaBD();
        jComboBoxEquipos= new JComboBox();
        // queryEquipment();
        objRequestCtrl = new RequestController();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoLes.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanelMenu = new javax.swing.JPanel();
        jButtonInicio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonSolicitud = new javax.swing.JButton();
        jButtonPerfil = new javax.swing.JButton();
        jButtonInfo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelSolicitud = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelFinal = new javax.swing.JLabel();
        jLabelInicio = new javax.swing.JLabel();
        jLabelSerial = new javax.swing.JLabel();
        jLabelSolicitud = new javax.swing.JLabel();
        jComboBoxEquipos = new javax.swing.JComboBox<>();
        jSpinnerAño = new javax.swing.JSpinner();
        jSpinnerMes = new javax.swing.JSpinner();
        jSpinnerDia = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSpinnerAño1 = new javax.swing.JSpinner();
        jSpinnerMes1 = new javax.swing.JSpinner();
        jSpinnerDia1 = new javax.swing.JSpinner();
        jButtonListar1 = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bienvenido.png"))); // NOI18N
        jPanelMenu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jButtonSolicitud.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSolicitud.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonSolicitud.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSolicitud.setText("SOLICITAR EQUIPO");
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

        jLabelFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelFinal.setForeground(new java.awt.Color(102, 102, 102));
        jLabelFinal.setText("FECHA FINAL");
        jPanelSolicitud.add(jLabelFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 30));

        jLabelInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelInicio.setForeground(new java.awt.Color(102, 102, 102));
        jLabelInicio.setText("FECHA INICIO");
        jPanelSolicitud.add(jLabelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 30));

        jLabelSerial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelSerial.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSerial.setText("SERIAL EQUIPO");
        jPanelSolicitud.add(jLabelSerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabelSolicitud.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelSolicitud.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSolicitud.setText("SOLICITAR EQUIPO");
        jPanelSolicitud.add(jLabelSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jComboBoxEquipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelSolicitud.add(jComboBoxEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 180, 30));

        jSpinnerAño.setModel(new javax.swing.SpinnerNumberModel(2000, 2000, 2050, 1));
        jPanelSolicitud.add(jSpinnerAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 80, -1));

        jSpinnerMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jPanelSolicitud.add(jSpinnerMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jSpinnerDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jPanelSolicitud.add(jSpinnerDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jLabel12.setText("AA");
        jPanelSolicitud.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 30, -1));

        jLabel11.setText("MM");
        jPanelSolicitud.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jLabel10.setText("DD");
        jPanelSolicitud.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        jSpinnerAño1.setModel(new javax.swing.SpinnerNumberModel(2000, 2000, 2050, 1));
        jPanelSolicitud.add(jSpinnerAño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 80, -1));

        jSpinnerMes1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jPanelSolicitud.add(jSpinnerMes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jSpinnerDia1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jPanelSolicitud.add(jSpinnerDia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jButtonListar1.setBackground(new java.awt.Color(102, 0, 0));
        jButtonListar1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonListar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListar1.setText("MODIFICAR");
        jButtonListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListar1ActionPerformed(evt);
            }
        });
        jPanelSolicitud.add(jButtonListar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 110, 37));

        jButtonListar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonListar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonListar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListar.setText("CONSULTAR");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });
        jPanelSolicitud.add(jButtonListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 110, 37));

        jLabel13.setText("DD");
        jPanelSolicitud.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        jLabel14.setText("MM");
        jPanelSolicitud.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        jLabel15.setText("AA");
        jPanelSolicitud.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 30, -1));

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanelSolicitud.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo2.setText("jLabel4");
        jPanelSolicitud.add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 400));

        getContentPane().add(jPanelSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 380, 400));

        pack();
    }// </editor-fold>

    private void jButtonInfoActionPerformed(java.awt.event.ActionEvent evt) {
        VentanaContactenos objVentana = new VentanaContactenos();
        objVentana.setVisible(true);
        this.setVisible(false);
    }

    private void jButtonPerfilActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButtonSolicitudActionPerformed(java.awt.event.ActionEvent evt) {
        //  jPanelInicio.setVisible(false);
        jPanelSolicitud.setVisible(true);
    }

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {
        VentanaInicial objVentana= new VentanaInicial();
        objVentana.setVisible(true);
        this.setVisible(false);
    }

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButtonListar1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


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
            java.util.logging.Logger.getLogger(VentanaSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSolicitud().setVisible(true);
            }
        });
    }

    public String getInitialDate(){//Esto a int

        String initialDate;

        initialDate =   jSpinnerDia.getValue().toString() + "/" + jSpinnerMes.getValue().toString() + "/" + jSpinnerAño.getValue().toString();

        return initialDate;

    }

    public String getFinalDate(){//Esto a int

        String finalDate;

        finalDate =   jSpinnerDia1.getValue().toString() + "/" + jSpinnerMes1.getValue().toString() + "/" + jSpinnerAño1.getValue().toString();

        return finalDate;

    }

    public void queryEquipment(){

        this.jComboBoxEquipos.removeAllItems();
        try{
            Connection conn= fachada.getConnetion();
            Statement sentence = conn.createStatement();
            String queryProjects = "SELECT * FROM equipment";
            ResultSet rs = sentence.executeQuery(queryProjects);

            while(rs.next()){
                System.out.println( "prueba." );
                this.jComboBoxEquipos.addItem(rs.getString("serial"));
            }

        }catch(SQLException e){
            System.out.println("error");
        }


    }

    public void createRequest(){//Esto a int

        String serial =  jComboBoxEquipos.getSelectedItem().toString();
        String initialDate = getInitialDate();
        String finalDate = getFinalDate();

        //objRequestCtrl.addRequest(, , , serial, initialDate, finalDate)


    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonInfo;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonListar1;
    private javax.swing.JButton jButtonPerfil;
    private javax.swing.JButton jButtonSolicitud;
    private javax.swing.JComboBox<String> jComboBoxEquipos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFinal;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelSerial;
    private javax.swing.JLabel jLabelSolicitud;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelSolicitud;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSpinner jSpinnerAño;
    private javax.swing.JSpinner jSpinnerAño1;
    private javax.swing.JSpinner jSpinnerDia;
    private javax.swing.JSpinner jSpinnerDia1;
    private javax.swing.JSpinner jSpinnerMes;
    private javax.swing.JSpinner jSpinnerMes1;
    // End of variables declaration
}
