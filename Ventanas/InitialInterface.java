/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Controllers.EquipmentController;
import Controllers.ProjectController;
import Controllers.UserController;
import Dao.FachadaBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.get;
import javax.swing.table.DefaultTableModel;


public class InitialInterface extends javax.swing.JFrame {

        FachadaBD fachada;
        UserController objCtrlUser;
        ProjectController objCtrlProject;
        EquipmentController objCtrlEquipment;
        
        public InitialInterface() {//Esto a intej
            
            fachada = new FachadaBD();            
            initComponents(); 
            fillEmptyFields();
            addTypeUser("Director");
            addState("Director");
            UpdateComboBoxs();
            hidePanels();           
            jPanelInicio.setVisible(true);           
            this.setLocationRelativeTo(null);
            setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoLes.png")).getImage());
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanelMenu = new javax.swing.JPanel();
        jButtonReportes = new javax.swing.JButton();
        jButtonInicio = new javax.swing.JButton();
        jButtonSolicitud = new javax.swing.JButton();
        jButtonPerfil = new javax.swing.JButton();
        jButtonInfo = new javax.swing.JButton();
        jLabelBienvenido = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonProyecto = new javax.swing.JButton();
        jButtonUsuario = new javax.swing.JButton();
        jButtonEquipo = new javax.swing.JButton();
        jLabelUsuarios1 = new javax.swing.JLabel();
        jLabelFondo1 = new javax.swing.JLabel();
        jPanelUpdateUser = new javax.swing.JPanel();
        jComboBoxUpdateUserState = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabelContraseña1 = new javax.swing.JLabel();
        jLabelProyecto1 = new javax.swing.JLabel();
        jLabelIdentificacion1 = new javax.swing.JLabel();
        jLabelSolicitud5 = new javax.swing.JLabel();
        jComboBoxUpdateIdUser = new javax.swing.JComboBox<>();
        jComboBoxUpdateUserProject = new javax.swing.JComboBox<>();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabelTipo2 = new javax.swing.JLabel();
        jLabelTipo3 = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelNombre3 = new javax.swing.JLabel();
        jTextFieldEmail1 = new javax.swing.JTextField();
        jTextFieldNombre3 = new javax.swing.JTextField();
        jComboBoxUpdateUserType = new javax.swing.JComboBox<>();
        jButtonSave5 = new javax.swing.JButton();
        jButtonOverwrite5 = new javax.swing.JButton();
        jButtonBack5 = new javax.swing.JButton();
        jLabelFondo11 = new javax.swing.JLabel();
        jPanelCreateEquipment = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelSolicitud1 = new javax.swing.JLabel();
        jTextFieldSerialCrearEquipo = new javax.swing.JTextField();
        jTextFieldNombreCrearEquipo = new javax.swing.JTextField();
        jButtonSave2 = new javax.swing.JButton();
        jButtonOverwrite2 = new javax.swing.JButton();
        jButtonBack2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaCrearEquipo = new javax.swing.JTextArea();
        jLabelFondo6 = new javax.swing.JLabel();
        jPanelCreateUser = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabelProyecto = new javax.swing.JLabel();
        jLabelIdentificacion = new javax.swing.JLabel();
        jLabelSolicitud3 = new javax.swing.JLabel();
        jTextFieldIdentificacionCrearUsuario = new javax.swing.JTextField();
        jComboBoxCreateUserProject = new javax.swing.JComboBox<>();
        jLabelTipo1 = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelNombre2 = new javax.swing.JLabel();
        jTextFieldEmailCrearUsuario = new javax.swing.JTextField();
        jTextFieldNombreCrearUsuario = new javax.swing.JTextField();
        jComboBoxCreateUserType = new javax.swing.JComboBox<>();
        jButtonBack1 = new javax.swing.JButton();
        jButtonOverwrite1 = new javax.swing.JButton();
        jButtonSave1 = new javax.swing.JButton();
        jLabelFondo8 = new javax.swing.JLabel();
        jPanelUpdateEquipment = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabelDescripcion3 = new javax.swing.JLabel();
        jLabelNombre6 = new javax.swing.JLabel();
        jLabelCodigo3 = new javax.swing.JLabel();
        jLabelSolicitud7 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jButtonOverwrite = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jTextFieldNombre5 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jComboBoxUpdateEquipmentState = new javax.swing.JComboBox<>();
        jComboBoxUpdateEquipmentSerial = new javax.swing.JComboBox<>();
        jLabelCodigo4 = new javax.swing.JLabel();
        jLabelFondo13 = new javax.swing.JLabel();
        jPanelUpdateProject = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabelDescripcion2 = new javax.swing.JLabel();
        jLabelNombre4 = new javax.swing.JLabel();
        jLabelNombre5 = new javax.swing.JLabel();
        jLabelCodigo2 = new javax.swing.JLabel();
        jLabelSolicitud6 = new javax.swing.JLabel();
        jTextFieldNombre4 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jComboBoxUpdateProjectId = new javax.swing.JComboBox<>();
        jComboBoxUpdateProjectState = new javax.swing.JComboBox<>();
        jButtonSave4 = new javax.swing.JButton();
        jButtonOverwrite4 = new javax.swing.JButton();
        jButtonBack4 = new javax.swing.JButton();
        jLabelFondo12 = new javax.swing.JLabel();
        jPanelCreateProject = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabelDescripcion1 = new javax.swing.JLabel();
        jLabelNombre1 = new javax.swing.JLabel();
        jLabelCodigo1 = new javax.swing.JLabel();
        jLabelSolicitud2 = new javax.swing.JLabel();
        jButtonSave3 = new javax.swing.JButton();
        jButtonOverwrite3 = new javax.swing.JButton();
        jButtonBack3 = new javax.swing.JButton();
        jTextFieldCodigoCrearProyecto = new javax.swing.JTextField();
        jTextFieldNombreCrearProyecto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaCrearProyecto = new javax.swing.JTextArea();
        jLabelFondo7 = new javax.swing.JLabel();
        jPanelContactUs = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabelEmailLab = new javax.swing.JLabel();
        jLabelTelefonos = new javax.swing.JLabel();
        jLabelContacto = new javax.swing.JLabel();
        jLabelEmailCordi = new javax.swing.JLabel();
        jLabelCoordinadora = new javax.swing.JLabel();
        jLabelCoordinador = new javax.swing.JLabel();
        jLabelFondo10 = new javax.swing.JLabel();
        jPanelReserve = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabelInicio = new javax.swing.JLabel();
        jLabelSerial1 = new javax.swing.JLabel();
        jLabelSolicitud4 = new javax.swing.JLabel();
        jComboBoxEquipmentSerialReserve = new javax.swing.JComboBox<>();
        jSpinnerAño = new javax.swing.JSpinner();
        jSpinnerMes = new javax.swing.JSpinner();
        jSpinnerDia = new javax.swing.JSpinner();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButtonSave6 = new javax.swing.JButton();
        jButtonList = new javax.swing.JButton();
        jButtonBack6 = new javax.swing.JButton();
        jLabelFondo9 = new javax.swing.JLabel();
        jPanelLoan = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabelSerial = new javax.swing.JLabel();
        jLabelSolicitud = new javax.swing.JLabel();
        jComboBoxEquipmentSerialLoan = new javax.swing.JComboBox<>();
        jButtonSave7 = new javax.swing.JButton();
        jButtonReserve1 = new javax.swing.JButton();
        jButtonReserve = new javax.swing.JButton();
        jButtonDeleteMult = new javax.swing.JButton();
        jButtonEntregar = new javax.swing.JButton();
        jLabelFondo5 = new javax.swing.JLabel();
        jPanelCRUDEquipment = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButtonProyecto3 = new javax.swing.JButton();
        jButtonUsuario3 = new javax.swing.JButton();
        jButtonEquipo3 = new javax.swing.JButton();
        jLabelUsuarios3 = new javax.swing.JLabel();
        jLabelFondo4 = new javax.swing.JLabel();
        jPanelCRUDUsers = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonProyecto1 = new javax.swing.JButton();
        jButtonUsuario1 = new javax.swing.JButton();
        jButtonEquipo1 = new javax.swing.JButton();
        jLabelUsuarios = new javax.swing.JLabel();
        jLabelFondo2 = new javax.swing.JLabel();
        jPanelCRUDProjects = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButtonProyecto2 = new javax.swing.JButton();
        jButtonUsuario2 = new javax.swing.JButton();
        jButtonEquipo2 = new javax.swing.JButton();
        jLabelUsuarios2 = new javax.swing.JLabel();
        jLabelFondo3 = new javax.swing.JLabel();
        jPanelUsersList = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabelUsuarios4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonBack7 = new javax.swing.JButton();
        jLabelFondo14 = new javax.swing.JLabel();
        jPanelProjectsList = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabelUsuarios5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButtonBack8 = new javax.swing.JButton();
        jLabelFondo15 = new javax.swing.JLabel();
        jPanelEquipmentList = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabelUsuarios6 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButtonBack9 = new javax.swing.JButton();
        jLabelFondo16 = new javax.swing.JLabel();
        jPanelLoanList = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabelUsuarios7 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButtonBack10 = new javax.swing.JButton();
        jLabelFondo17 = new javax.swing.JLabel();
        jPanelReportes = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jButtonReportPrestxProject = new javax.swing.JButton();
        jButtonMultasXMes = new javax.swing.JButton();
        jButtonReportPresxMes = new javax.swing.JButton();
        jButtonReportMultxMiembro = new javax.swing.JButton();
        jButtonReportPresxMiembros = new javax.swing.JButton();
        jLabelUsuarios8 = new javax.swing.JLabel();
        jLabelReportes = new javax.swing.JLabel();
        jLabelFondo18 = new javax.swing.JLabel();
        jPanelLoanXProjectList = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabelUsuarios9 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButtonBack11 = new javax.swing.JButton();
        jLabelFondo19 = new javax.swing.JLabel();
        jPanelLoanXMonthList = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabelUsuarios10 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButtonBack12 = new javax.swing.JButton();
        jLabelFondo20 = new javax.swing.JLabel();
        jPanelLoanXMembersList = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabelUsuarios11 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jButtonBack13 = new javax.swing.JButton();
        jLabelFondo21 = new javax.swing.JLabel();
        jPanelMultXMembersList = new javax.swing.JPanel();
        jLabelValorTotal = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabeMultasPorMiembro = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jButtonBack14 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabelFondo22 = new javax.swing.JLabel();
        jPanelMultXMonthList = new javax.swing.JPanel();
        jLabelValorTotal1 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabeMultasPorMiembro1 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jButtonBack15 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabelFondo23 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonReportes.setBackground(new java.awt.Color(102, 0, 0));
        jButtonReportes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReportes.setText("REPORTES");
        jButtonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportesActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, 40));

        jButtonInicio.setBackground(new java.awt.Color(102, 0, 0));
        jButtonInicio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio.setText("INICIO");
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 161, 37));

        jButtonSolicitud.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSolicitud.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSolicitud.setText("PRESTAMO");
        jButtonSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSolicitudActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, 40));

        jButtonPerfil.setBackground(new java.awt.Color(102, 0, 0));
        jButtonPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPerfil.setText("MI PERFIL");
        jButtonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPerfilActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 161, 37));

        jButtonInfo.setBackground(new java.awt.Color(102, 0, 0));
        jButtonInfo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInfo.setText("CONTACTENOS");
        jButtonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfoActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 161, 37));

        jLabelBienvenido.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelBienvenido.setForeground(new java.awt.Color(153, 0, 0));
        jLabelBienvenido.setText("BIENVENIDO");
        jPanelMenu.add(jLabelBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("NombreUsuario");
        jPanelMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoGris.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanelMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 430));

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelInicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelInicio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelInicio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jButtonProyecto.setBackground(new java.awt.Color(102, 0, 0));
        jButtonProyecto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProyecto.setText("PROYECTO");
        jButtonProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProyectoActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 120, 40));

        jButtonUsuario.setBackground(new java.awt.Color(102, 0, 0));
        jButtonUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUsuario.setText("USUARIO");
        jButtonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuarioActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 120, 40));

        jButtonEquipo.setBackground(new java.awt.Color(102, 0, 0));
        jButtonEquipo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEquipo.setText("EQUIPO");
        jButtonEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEquipoActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 120, 40));

        jLabelUsuarios1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuarios1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuarios1.setText("INICIO");
        jPanelInicio.add(jLabelUsuarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabelFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo1.setText("jLabel4");
        jPanelInicio.add(jLabelFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelUpdateUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxUpdateUserState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelUpdateUser.add(jComboBoxUpdateUserState, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, 30));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelUpdateUser.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelUpdateUser.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelUpdateUser.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelContraseña1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelContraseña1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelContraseña1.setText("CONTRASEÑA");
        jPanelUpdateUser.add(jLabelContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 30));

        jLabelProyecto1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelProyecto1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelProyecto1.setText("PROYECTO");
        jPanelUpdateUser.add(jLabelProyecto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, 30));

        jLabelIdentificacion1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelIdentificacion1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelIdentificacion1.setText("IDENTIFICACION");
        jPanelUpdateUser.add(jLabelIdentificacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabelSolicitud5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabelSolicitud5.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSolicitud5.setText("ACTUALIZAR USUARIO");
        jPanelUpdateUser.add(jLabelSolicitud5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jComboBoxUpdateIdUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelUpdateUser.add(jComboBoxUpdateIdUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 110, 30));

        jComboBoxUpdateUserProject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelUpdateUser.add(jComboBoxUpdateUserProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 130, 30));

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanelUpdateUser.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 210, 30));

        jLabelTipo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTipo2.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTipo2.setText("E-MAIL");
        jPanelUpdateUser.add(jLabelTipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 30));

        jLabelTipo3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTipo3.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTipo3.setText("CARGO");
        jPanelUpdateUser.add(jLabelTipo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, 30));

        jLabelEstado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEstado.setText("ESTADO");
        jPanelUpdateUser.add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));

        jLabelNombre3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre3.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombre3.setText("NOMBRE");
        jPanelUpdateUser.add(jLabelNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 30));
        jPanelUpdateUser.add(jTextFieldEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 340, 30));

        jTextFieldNombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombre3ActionPerformed(evt);
            }
        });
        jPanelUpdateUser.add(jTextFieldNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 340, 30));

        jComboBoxUpdateUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelUpdateUser.add(jComboBoxUpdateUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 130, 30));

        jButtonSave5.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSave5.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSave5.setText("Guardar");
        jButtonSave5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSave5ActionPerformed(evt);
            }
        });
        jPanelUpdateUser.add(jButtonSave5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 100, 30));

        jButtonOverwrite5.setBackground(new java.awt.Color(102, 0, 0));
        jButtonOverwrite5.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOverwrite5.setText("Vaciar");
        jButtonOverwrite5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOverwrite5ActionPerformed(evt);
            }
        });
        jPanelUpdateUser.add(jButtonOverwrite5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 90, 30));

        jButtonBack5.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack5.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack5.setText("Volver");
        jButtonBack5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack5ActionPerformed(evt);
            }
        });
        jPanelUpdateUser.add(jButtonBack5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 90, 30));

        jLabelFondo11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo11.setText("jLabel4");
        jPanelUpdateUser.add(jLabelFondo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelUpdateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelCreateEquipment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelCreateEquipment.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelCreateEquipment.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelCreateEquipment.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelDescripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDescripcion.setText("DESCRIPCION");
        jPanelCreateEquipment.add(jLabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, 30));

        jLabelNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombre.setText("NOMBRE");
        jPanelCreateEquipment.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, 30));

        jLabelCodigo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCodigo.setText("SERIAL");
        jPanelCreateEquipment.add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabelSolicitud1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelSolicitud1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSolicitud1.setText("CREAR EQUIPO");
        jPanelCreateEquipment.add(jLabelSolicitud1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));
        jPanelCreateEquipment.add(jTextFieldSerialCrearEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 210, 30));
        jPanelCreateEquipment.add(jTextFieldNombreCrearEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 210, 30));

        jButtonSave2.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSave2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSave2.setText("Guardar");
        jButtonSave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSave2ActionPerformed(evt);
            }
        });
        jPanelCreateEquipment.add(jButtonSave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 100, 30));

        jButtonOverwrite2.setBackground(new java.awt.Color(102, 0, 0));
        jButtonOverwrite2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOverwrite2.setText("Vaciar");
        jButtonOverwrite2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOverwrite2ActionPerformed(evt);
            }
        });
        jPanelCreateEquipment.add(jButtonOverwrite2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 90, 30));

        jButtonBack2.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack2.setText("Volver");
        jButtonBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack2ActionPerformed(evt);
            }
        });
        jPanelCreateEquipment.add(jButtonBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 80, 30));

        jTextAreaCrearEquipo.setColumns(20);
        jTextAreaCrearEquipo.setRows(5);
        jScrollPane1.setViewportView(jTextAreaCrearEquipo);

        jPanelCreateEquipment.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 310, 60));

        jLabelFondo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo6.setText("jLabel4");
        jPanelCreateEquipment.add(jLabelFondo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelCreateEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelCreateUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelCreateUser.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelCreateUser.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelCreateUser.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelProyecto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelProyecto.setForeground(new java.awt.Color(102, 102, 102));
        jLabelProyecto.setText("PROYECTO");
        jPanelCreateUser.add(jLabelProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 30));

        jLabelIdentificacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelIdentificacion.setForeground(new java.awt.Color(102, 102, 102));
        jLabelIdentificacion.setText("IDENTIFICACION");
        jPanelCreateUser.add(jLabelIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabelSolicitud3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabelSolicitud3.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSolicitud3.setText("CREAR USUARIO");
        jPanelCreateUser.add(jLabelSolicitud3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));
        jPanelCreateUser.add(jTextFieldIdentificacionCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 230, 30));

        jPanelCreateUser.add(jComboBoxCreateUserProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 230, 30));

        jLabelTipo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTipo1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTipo1.setText("E-MAIL");
        jPanelCreateUser.add(jLabelTipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, 30));

        jLabelTipo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTipo.setText("CARGO");
        jPanelCreateUser.add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, 30));

        jLabelNombre2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre2.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombre2.setText("NOMBRE");
        jPanelCreateUser.add(jLabelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, 30));
        jPanelCreateUser.add(jTextFieldEmailCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 230, 30));

        jTextFieldNombreCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreCrearUsuarioActionPerformed(evt);
            }
        });
        jPanelCreateUser.add(jTextFieldNombreCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 230, 30));

        jComboBoxCreateUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelCreateUser.add(jComboBoxCreateUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 230, 30));

        jButtonBack1.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack1.setText("Volver");
        jButtonBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack1ActionPerformed(evt);
            }
        });
        jPanelCreateUser.add(jButtonBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 90, 30));

        jButtonOverwrite1.setBackground(new java.awt.Color(102, 0, 0));
        jButtonOverwrite1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOverwrite1.setText("Vaciar");
        jButtonOverwrite1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOverwrite1ActionPerformed(evt);
            }
        });
        jPanelCreateUser.add(jButtonOverwrite1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 90, 30));

        jButtonSave1.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSave1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSave1.setText("Guardar");
        jButtonSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSave1ActionPerformed(evt);
            }
        });
        jPanelCreateUser.add(jButtonSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 100, 30));

        jLabelFondo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo8.setText("jLabel4");
        jPanelCreateUser.add(jLabelFondo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelUpdateEquipment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelUpdateEquipment.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelUpdateEquipment.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelUpdateEquipment.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelDescripcion3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDescripcion3.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDescripcion3.setText("DESCRIPCION");
        jPanelUpdateEquipment.add(jLabelDescripcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, 30));

        jLabelNombre6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre6.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombre6.setText("NOMBRE");
        jPanelUpdateEquipment.add(jLabelNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, 30));

        jLabelCodigo3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCodigo3.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCodigo3.setText("ESTADO");
        jPanelUpdateEquipment.add(jLabelCodigo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabelSolicitud7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelSolicitud7.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSolicitud7.setText("ACTUALIZAR EQUIPO");
        jPanelUpdateEquipment.add(jLabelSolicitud7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jButtonBack.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack.setText("Volver");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanelUpdateEquipment.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 90, 30));

        jButtonOverwrite.setBackground(new java.awt.Color(102, 0, 0));
        jButtonOverwrite.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOverwrite.setText("Vaciar");
        jButtonOverwrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOverwriteActionPerformed(evt);
            }
        });
        jPanelUpdateEquipment.add(jButtonOverwrite, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 90, 30));

        jButtonSave.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSave.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSave.setText("Guardar");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jPanelUpdateEquipment.add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 100, 30));
        jPanelUpdateEquipment.add(jTextFieldNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 200, 30));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jPanelUpdateEquipment.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 300, 60));

        jComboBoxUpdateEquipmentState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelUpdateEquipment.add(jComboBoxUpdateEquipmentState, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 200, 30));

        jComboBoxUpdateEquipmentSerial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelUpdateEquipment.add(jComboBoxUpdateEquipmentSerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 200, 30));

        jLabelCodigo4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCodigo4.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCodigo4.setText("SERIAL");
        jPanelUpdateEquipment.add(jLabelCodigo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabelFondo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo13.setText("jLabel4");
        jPanelUpdateEquipment.add(jLabelFondo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelUpdateEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelUpdateProject.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelUpdateProject.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelUpdateProject.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelUpdateProject.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelDescripcion2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDescripcion2.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDescripcion2.setText("DESCRIPCION");
        jPanelUpdateProject.add(jLabelDescripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, 30));

        jLabelNombre4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre4.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombre4.setText("ESTADO");
        jPanelUpdateProject.add(jLabelNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, 30));

        jLabelNombre5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre5.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombre5.setText("NOMBRE");
        jPanelUpdateProject.add(jLabelNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, 30));

        jLabelCodigo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCodigo2.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCodigo2.setText("CODIGO");
        jPanelUpdateProject.add(jLabelCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabelSolicitud6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelSolicitud6.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSolicitud6.setText("ACTUALIZAR PROYECTO");
        jPanelUpdateProject.add(jLabelSolicitud6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));
        jPanelUpdateProject.add(jTextFieldNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 190, 30));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jPanelUpdateProject.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 270, 60));

        jPanelUpdateProject.add(jComboBoxUpdateProjectId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 190, 30));

        jComboBoxUpdateProjectState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelUpdateProject.add(jComboBoxUpdateProjectState, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 170, 30));

        jButtonSave4.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSave4.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSave4.setText("Guardar");
        jButtonSave4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSave4ActionPerformed(evt);
            }
        });
        jPanelUpdateProject.add(jButtonSave4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 100, 30));

        jButtonOverwrite4.setBackground(new java.awt.Color(102, 0, 0));
        jButtonOverwrite4.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOverwrite4.setText("Vaciar");
        jButtonOverwrite4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOverwrite4ActionPerformed(evt);
            }
        });
        jPanelUpdateProject.add(jButtonOverwrite4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 90, 30));

        jButtonBack4.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack4.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack4.setText("Volver");
        jButtonBack4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack4ActionPerformed(evt);
            }
        });
        jPanelUpdateProject.add(jButtonBack4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 90, 30));

        jLabelFondo12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo12.setText("jLabel4");
        jPanelUpdateProject.add(jLabelFondo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelCreateProject.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelCreateProject.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelCreateProject.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelCreateProject.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelDescripcion1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDescripcion1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDescripcion1.setText("DESCRIPCION");
        jPanelCreateProject.add(jLabelDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, 30));

        jLabelNombre1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombre1.setText("NOMBRE");
        jPanelCreateProject.add(jLabelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, 30));

        jLabelCodigo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCodigo1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCodigo1.setText("CODIGO");
        jPanelCreateProject.add(jLabelCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabelSolicitud2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelSolicitud2.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSolicitud2.setText("CREAR PROYECTO");
        jPanelCreateProject.add(jLabelSolicitud2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jButtonSave3.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSave3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSave3.setText("Guardar");
        jButtonSave3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSave3ActionPerformed(evt);
            }
        });
        jPanelCreateProject.add(jButtonSave3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 100, 30));

        jButtonOverwrite3.setBackground(new java.awt.Color(102, 0, 0));
        jButtonOverwrite3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOverwrite3.setText("Vaciar");
        jButtonOverwrite3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOverwrite3ActionPerformed(evt);
            }
        });
        jPanelCreateProject.add(jButtonOverwrite3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 90, 30));

        jButtonBack3.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack3.setText("Volver");
        jButtonBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack3ActionPerformed(evt);
            }
        });
        jPanelCreateProject.add(jButtonBack3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 80, 30));
        jPanelCreateProject.add(jTextFieldCodigoCrearProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 210, 30));
        jPanelCreateProject.add(jTextFieldNombreCrearProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 210, 30));

        jTextAreaCrearProyecto.setColumns(20);
        jTextAreaCrearProyecto.setRows(5);
        jScrollPane2.setViewportView(jTextAreaCrearProyecto);

        jPanelCreateProject.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 310, 60));

        jLabelFondo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo7.setText("jLabel4");
        jPanelCreateProject.add(jLabelFondo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelCreateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelContactUs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelContactUs.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelContactUs.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelContactUs.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelEmailLab.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEmailLab.setText("E-mail: laboratorio.multimediayvision@correounivalle.edu.co");
        jPanelContactUs.add(jLabelEmailLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabelTelefonos.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabelTelefonos.setText("Telefonos: (57) (2) 321 21 00 ext. 2791, Fax. 339 20 86");
        jPanelContactUs.add(jLabelTelefonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabelContacto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelContacto.setForeground(new java.awt.Color(102, 102, 102));
        jLabelContacto.setText("CONTACTO");
        jPanelContactUs.add(jLabelContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabelEmailCordi.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabelEmailCordi.setText("E-mail: maria.trujillo@correounivalle.edu.co");
        jPanelContactUs.add(jLabelEmailCordi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabelCoordinadora.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabelCoordinadora.setText("P.H.D Maria Patricia Trujillo Uribe");
        jPanelContactUs.add(jLabelCoordinadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabelCoordinador.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCoordinador.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCoordinador.setText("COORDINADOR");
        jPanelContactUs.add(jLabelCoordinador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabelFondo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo10.setText("jLabel4");
        jPanelContactUs.add(jLabelFondo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelContactUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelReserve.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelReserve.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelReserve.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelReserve.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelInicio.setForeground(new java.awt.Color(102, 102, 102));
        jLabelInicio.setText("FECHA INICIO");
        jPanelReserve.add(jLabelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, 30));

        jLabelSerial1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelSerial1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSerial1.setText("SERIAL EQUIPO");
        jPanelReserve.add(jLabelSerial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jLabelSolicitud4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelSolicitud4.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSolicitud4.setText("RESERVAR EQUIPO");
        jPanelReserve.add(jLabelSolicitud4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jComboBoxEquipmentSerialReserve.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelReserve.add(jComboBoxEquipmentSerialReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 180, 30));

        jSpinnerAño.setModel(new javax.swing.SpinnerNumberModel(2000, 2000, 2050, 1));
        jPanelReserve.add(jSpinnerAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 80, -1));

        jSpinnerMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jPanelReserve.add(jSpinnerMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        jSpinnerDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jPanelReserve.add(jSpinnerDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        jLabel31.setText("AA");
        jPanelReserve.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 30, -1));

        jLabel32.setText("MM");
        jPanelReserve.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        jLabel33.setText("DD");
        jPanelReserve.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        jButtonSave6.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSave6.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSave6.setText("Guardar");
        jButtonSave6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSave6ActionPerformed(evt);
            }
        });
        jPanelReserve.add(jButtonSave6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 100, 30));

        jButtonList.setBackground(new java.awt.Color(102, 0, 0));
        jButtonList.setForeground(new java.awt.Color(255, 255, 255));
        jButtonList.setText("Listar");
        jButtonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListActionPerformed(evt);
            }
        });
        jPanelReserve.add(jButtonList, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 90, 30));

        jButtonBack6.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack6.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack6.setText("Volver");
        jButtonBack6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack6ActionPerformed(evt);
            }
        });
        jPanelReserve.add(jButtonBack6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 80, 30));

        jLabelFondo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo9.setText("jLabel4");
        jPanelReserve.add(jLabelFondo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelLoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelLoan.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelLoan.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelLoan.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelSerial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelSerial.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSerial.setText("SERIAL EQUIPO");
        jPanelLoan.add(jLabelSerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabelSolicitud.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelSolicitud.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSolicitud.setText("PRESTAMO");
        jPanelLoan.add(jLabelSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jComboBoxEquipmentSerialLoan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelLoan.add(jComboBoxEquipmentSerialLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 180, 30));

        jButtonSave7.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSave7.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSave7.setText("Guardar");
        jButtonSave7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSave7ActionPerformed(evt);
            }
        });
        jPanelLoan.add(jButtonSave7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 100, 30));

        jButtonReserve1.setBackground(new java.awt.Color(102, 0, 0));
        jButtonReserve1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReserve1.setText("Eliminar Multa");
        jButtonReserve1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReserve1ActionPerformed(evt);
            }
        });
        jPanelLoan.add(jButtonReserve1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 120, 30));

        jButtonReserve.setBackground(new java.awt.Color(102, 0, 0));
        jButtonReserve.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReserve.setText("Reservar");
        jButtonReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReserveActionPerformed(evt);
            }
        });
        jPanelLoan.add(jButtonReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 90, 30));

        jButtonDeleteMult.setBackground(new java.awt.Color(102, 0, 0));
        jButtonDeleteMult.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDeleteMult.setText("Renovar");
        jButtonDeleteMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteMultActionPerformed(evt);
            }
        });
        jPanelLoan.add(jButtonDeleteMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 90, 30));

        jButtonEntregar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonEntregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntregar.setText("Entregar");
        jButtonEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntregarActionPerformed(evt);
            }
        });
        jPanelLoan.add(jButtonEntregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 100, 30));

        jLabelFondo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo5.setText("jLabel4");
        jPanelLoan.add(jLabelFondo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelCRUDEquipment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelCRUDEquipment.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelCRUDEquipment.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelCRUDEquipment.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jButtonProyecto3.setBackground(new java.awt.Color(102, 0, 0));
        jButtonProyecto3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProyecto3.setText("CREAR");
        jButtonProyecto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProyecto3ActionPerformed(evt);
            }
        });
        jPanelCRUDEquipment.add(jButtonProyecto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 120, 40));

        jButtonUsuario3.setBackground(new java.awt.Color(102, 0, 0));
        jButtonUsuario3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUsuario3.setText("LISTAR");
        jButtonUsuario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuario3ActionPerformed(evt);
            }
        });
        jPanelCRUDEquipment.add(jButtonUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 120, 40));

        jButtonEquipo3.setBackground(new java.awt.Color(102, 0, 0));
        jButtonEquipo3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEquipo3.setText("ACTUALIZAR");
        jButtonEquipo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEquipo3ActionPerformed(evt);
            }
        });
        jPanelCRUDEquipment.add(jButtonEquipo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 120, 40));

        jLabelUsuarios3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuarios3.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuarios3.setText("EQUIPOS");
        jPanelCRUDEquipment.add(jLabelUsuarios3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jLabelFondo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo4.setText("jLabel4");
        jPanelCRUDEquipment.add(jLabelFondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelCRUDEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelCRUDUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelCRUDUsers.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelCRUDUsers.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelCRUDUsers.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jButtonProyecto1.setBackground(new java.awt.Color(102, 0, 0));
        jButtonProyecto1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProyecto1.setText("CREAR");
        jButtonProyecto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProyecto1ActionPerformed(evt);
            }
        });
        jPanelCRUDUsers.add(jButtonProyecto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 120, 40));

        jButtonUsuario1.setBackground(new java.awt.Color(102, 0, 0));
        jButtonUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUsuario1.setText("LISTAR");
        jButtonUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuario1ActionPerformed(evt);
            }
        });
        jPanelCRUDUsers.add(jButtonUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 120, 40));

        jButtonEquipo1.setBackground(new java.awt.Color(102, 0, 0));
        jButtonEquipo1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEquipo1.setText("ACTUALIZAR");
        jButtonEquipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEquipo1ActionPerformed(evt);
            }
        });
        jPanelCRUDUsers.add(jButtonEquipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 120, 40));

        jLabelUsuarios.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuarios.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuarios.setText("USUARIOS");
        jPanelCRUDUsers.add(jLabelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo2.setText("jLabel4");
        jPanelCRUDUsers.add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelCRUDUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, 430));

        jPanelCRUDProjects.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelCRUDProjects.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelCRUDProjects.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelCRUDProjects.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jButtonProyecto2.setBackground(new java.awt.Color(102, 0, 0));
        jButtonProyecto2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProyecto2.setText("CREAR");
        jButtonProyecto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProyecto2ActionPerformed(evt);
            }
        });
        jPanelCRUDProjects.add(jButtonProyecto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 120, 40));

        jButtonUsuario2.setBackground(new java.awt.Color(102, 0, 0));
        jButtonUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUsuario2.setText("LISTAR");
        jButtonUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuario2ActionPerformed(evt);
            }
        });
        jPanelCRUDProjects.add(jButtonUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 120, 40));

        jButtonEquipo2.setBackground(new java.awt.Color(102, 0, 0));
        jButtonEquipo2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEquipo2.setText("ACTUALIZAR");
        jButtonEquipo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEquipo2ActionPerformed(evt);
            }
        });
        jPanelCRUDProjects.add(jButtonEquipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 120, 40));

        jLabelUsuarios2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuarios2.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuarios2.setText("PROYECTOS");
        jPanelCRUDProjects.add(jLabelUsuarios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jLabelFondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo3.setText("jLabel4");
        jPanelCRUDProjects.add(jLabelFondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelCRUDProjects, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelUsersList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelUsersList.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelUsersList.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelUsersList.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelUsuarios4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuarios4.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuarios4.setText("LISTA USUARIOS");
        jPanelUsersList.add(jLabelUsuarios4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Proyecto", "Contraseña", "Nombre", "Cargo", "Estado", "Email"
            }
        ));
        jScrollPane5.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanelUsersList.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 540, 200));

        jButtonBack7.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack7.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack7.setText("Volver");
        jButtonBack7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack7ActionPerformed(evt);
            }
        });
        jPanelUsersList.add(jButtonBack7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 90, 30));

        jLabelFondo14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo14.setText("jLabel4");
        jPanelUsersList.add(jLabelFondo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelUsersList, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelProjectsList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelProjectsList.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelProjectsList.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelProjectsList.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelUsuarios5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuarios5.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuarios5.setText("LISTA PROYECTOS");
        jPanelProjectsList.add(jLabelUsuarios5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Estado"
            }
        ));
        jScrollPane6.setViewportView(jTable2);

        jPanelProjectsList.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 480, 200));

        jButtonBack8.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack8.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack8.setText("Volver");
        jButtonBack8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack8ActionPerformed(evt);
            }
        });
        jPanelProjectsList.add(jButtonBack8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 90, 30));

        jLabelFondo15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo15.setText("jLabel4");
        jPanelProjectsList.add(jLabelFondo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelProjectsList, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelEquipmentList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelEquipmentList.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelEquipmentList.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelEquipmentList.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelUsuarios6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuarios6.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuarios6.setText("LISTA EQUIPOS");
        jPanelEquipmentList.add(jLabelUsuarios6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Serial", "Nombre", "Descripcion", "Estado"
            }
        ));
        jScrollPane7.setViewportView(jTable3);

        jPanelEquipmentList.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 480, 200));

        jButtonBack9.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack9.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack9.setText("Volver");
        jButtonBack9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack9ActionPerformed(evt);
            }
        });
        jPanelEquipmentList.add(jButtonBack9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 90, 30));

        jLabelFondo16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo16.setText("jLabel4");
        jPanelEquipmentList.add(jLabelFondo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelEquipmentList, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelLoanList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelLoanList.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelLoanList.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelLoanList.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelUsuarios7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuarios7.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuarios7.setText("LISTA PRESTAMOS");
        jPanelLoanList.add(jLabelUsuarios7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, 30));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Usuario", "Equipo", "FechaInicio", "FechaEntrega", "Estado"
            }
        ));
        jScrollPane8.setViewportView(jTable4);

        jPanelLoanList.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 480, 200));

        jButtonBack10.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack10.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack10.setText("Volver");
        jButtonBack10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack10ActionPerformed(evt);
            }
        });
        jPanelLoanList.add(jButtonBack10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 90, 30));

        jLabelFondo17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo17.setText("jLabel4");
        jPanelLoanList.add(jLabelFondo17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelLoanList, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelReportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelReportes.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelReportes.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelReportes.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jButtonReportPrestxProject.setBackground(new java.awt.Color(102, 0, 0));
        jButtonReportPrestxProject.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReportPrestxProject.setText("PRESTAMOS POR PROYECTO");
        jButtonReportPrestxProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportPrestxProjectActionPerformed(evt);
            }
        });
        jPanelReportes.add(jButtonReportPrestxProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 210, 40));

        jButtonMultasXMes.setBackground(new java.awt.Color(102, 0, 0));
        jButtonMultasXMes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMultasXMes.setText("MULTAS POR MES");
        jButtonMultasXMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultasXMesActionPerformed(evt);
            }
        });
        jPanelReportes.add(jButtonMultasXMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 210, 40));

        jButtonReportPresxMes.setBackground(new java.awt.Color(102, 0, 0));
        jButtonReportPresxMes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReportPresxMes.setText("PRESTAMOS POR MES");
        jButtonReportPresxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportPresxMesActionPerformed(evt);
            }
        });
        jPanelReportes.add(jButtonReportPresxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 210, 40));

        jButtonReportMultxMiembro.setBackground(new java.awt.Color(102, 0, 0));
        jButtonReportMultxMiembro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReportMultxMiembro.setText("MULTAS POR MIEMBRO");
        jButtonReportMultxMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportMultxMiembroActionPerformed(evt);
            }
        });
        jPanelReportes.add(jButtonReportMultxMiembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 210, 40));

        jButtonReportPresxMiembros.setBackground(new java.awt.Color(102, 0, 0));
        jButtonReportPresxMiembros.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReportPresxMiembros.setText("PRESTAMOS POR MIEMBRO");
        jButtonReportPresxMiembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportPresxMiembrosActionPerformed(evt);
            }
        });
        jPanelReportes.add(jButtonReportPresxMiembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 210, 40));

        jLabelUsuarios8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuarios8.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuarios8.setText("REPORTES");
        jPanelReportes.add(jLabelUsuarios8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jLabelReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes.png"))); // NOI18N
        jPanelReportes.add(jLabelReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        jLabelFondo18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo18.setText("jLabel4");
        jPanelReportes.add(jLabelFondo18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelLoanXProjectList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelLoanXProjectList.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelLoanXProjectList.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelLoanXProjectList.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelUsuarios9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuarios9.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuarios9.setText("PRESTAMOS POR PROYECTO");
        jPanelLoanXProjectList.add(jLabelUsuarios9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proyecto", "Cantidad_prestamos"
            }
        ));
        jScrollPane9.setViewportView(jTable5);

        jPanelLoanXProjectList.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 540, 140));

        jButtonBack11.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack11.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack11.setText("Volver");
        jButtonBack11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack11ActionPerformed(evt);
            }
        });
        jPanelLoanXProjectList.add(jButtonBack11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 90, 30));

        jLabelFondo19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo19.setText("jLabel4");
        jPanelLoanXProjectList.add(jLabelFondo19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelLoanXProjectList, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelLoanXMonthList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelLoanXMonthList.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelLoanXMonthList.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelLoanXMonthList.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelUsuarios10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuarios10.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuarios10.setText("PRESTAMOS POR MES");
        jPanelLoanXMonthList.add(jLabelUsuarios10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mes", "Cantidad_prestamos"
            }
        ));
        jScrollPane10.setViewportView(jTable6);

        jPanelLoanXMonthList.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 540, 140));

        jButtonBack12.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack12.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack12.setText("Volver");
        jButtonBack12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack12ActionPerformed(evt);
            }
        });
        jPanelLoanXMonthList.add(jButtonBack12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 90, 30));

        jLabelFondo20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo20.setText("jLabel4");
        jPanelLoanXMonthList.add(jLabelFondo20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelLoanXMonthList, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelLoanXMembersList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelLoanXMembersList.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelLoanXMembersList.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelLoanXMembersList.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelUsuarios11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuarios11.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuarios11.setText("PRESTAMOS POR MIEMBRO");
        jPanelLoanXMembersList.add(jLabelUsuarios11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Miembro", "Cantidad_prestamos"
            }
        ));
        jScrollPane11.setViewportView(jTable7);

        jPanelLoanXMembersList.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 540, 140));

        jButtonBack13.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack13.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack13.setText("Volver");
        jButtonBack13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack13ActionPerformed(evt);
            }
        });
        jPanelLoanXMembersList.add(jButtonBack13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 90, 30));

        jLabelFondo21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo21.setText("jLabel4");
        jPanelLoanXMembersList.add(jLabelFondo21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelLoanXMembersList, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelMultXMembersList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelValorTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelValorTotal.setForeground(new java.awt.Color(102, 102, 102));
        jLabelValorTotal.setText("Valor total:");
        jPanelMultXMembersList.add(jLabelValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, 30));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelMultXMembersList.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelMultXMembersList.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelMultXMembersList.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabeMultasPorMiembro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabeMultasPorMiembro.setForeground(new java.awt.Color(102, 102, 102));
        jLabeMultasPorMiembro.setText("MULTAS POR MIEMBRO");
        jPanelMultXMembersList.add(jLabeMultasPorMiembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Miembro", "Cantidad_Multas", "SUM(ValorMulta)"
            }
        ));
        jScrollPane12.setViewportView(jTable8);

        jPanelMultXMembersList.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 540, 140));

        jButtonBack14.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack14.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack14.setText("Volver");
        jButtonBack14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack14ActionPerformed(evt);
            }
        });
        jPanelMultXMembersList.add(jButtonBack14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 90, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelMultXMembersList.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 160, 30));

        jLabelFondo22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo22.setText("jLabel4");
        jPanelMultXMembersList.add(jLabelFondo22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelMultXMembersList, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelMultXMonthList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelValorTotal1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelValorTotal1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelValorTotal1.setText("Valor total:");
        jPanelMultXMonthList.add(jLabelValorTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, 30));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelMultXMonthList.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelMultXMonthList.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelMultXMonthList.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabeMultasPorMiembro1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabeMultasPorMiembro1.setForeground(new java.awt.Color(102, 102, 102));
        jLabeMultasPorMiembro1.setText("MULTAS POR MES");
        jPanelMultXMonthList.add(jLabeMultasPorMiembro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mes", "Cantidad_Multas", "Valor"
            }
        ));
        jScrollPane13.setViewportView(jTable9);

        jPanelMultXMonthList.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 540, 140));

        jButtonBack15.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack15.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack15.setText("Volver");
        jButtonBack15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack15ActionPerformed(evt);
            }
        });
        jPanelMultXMonthList.add(jButtonBack15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 90, 30));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelMultXMonthList.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 160, 30));

        jLabelFondo23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo23.setText("jLabel4");
        jPanelMultXMonthList.add(jLabelFondo23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelMultXMonthList, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfoActionPerformed
        hidePanels();
        jPanelContactUs.setVisible(true);
    }//GEN-LAST:event_jButtonInfoActionPerformed

    private void jButtonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerfilActionPerformed
    }//GEN-LAST:event_jButtonPerfilActionPerformed

    private void jButtonSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSolicitudActionPerformed
        hidePanels();
        jPanelLoan.setVisible(true);
    }//GEN-LAST:event_jButtonSolicitudActionPerformed

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        hidePanels();
        jPanelInicio.setVisible(true);
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jButtonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuarioActionPerformed
        hidePanels();
        jPanelCRUDUsers.setVisible(true);
    }//GEN-LAST:event_jButtonUsuarioActionPerformed

    private void jButtonProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProyectoActionPerformed
        hidePanels();
        jPanelCRUDProjects.setVisible(true);
    }//GEN-LAST:event_jButtonProyectoActionPerformed

    private void jButtonProyecto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProyecto1ActionPerformed
        hidePanels();
        jPanelCreateUser.setVisible(true);
    }//GEN-LAST:event_jButtonProyecto1ActionPerformed

    private void jButtonUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuario1ActionPerformed
        
        fillTableUsers();
        hidePanels();
        jPanelUsersList.setVisible(true);
        
    }//GEN-LAST:event_jButtonUsuario1ActionPerformed

    private void jButtonProyecto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProyecto2ActionPerformed
        hidePanels();
        jPanelCreateProject.setVisible(true);
    }//GEN-LAST:event_jButtonProyecto2ActionPerformed

    private void jButtonUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuario2ActionPerformed
        hidePanels();
        jPanelProjectsList.setVisible(true);
    }//GEN-LAST:event_jButtonUsuario2ActionPerformed

    private void jButtonEquipo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEquipo2ActionPerformed
        hidePanels();
        jPanelUpdateProject.setVisible(true);
    }//GEN-LAST:event_jButtonEquipo2ActionPerformed

    private void jButtonProyecto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProyecto3ActionPerformed
        hidePanels();
        jPanelCreateEquipment.setVisible(true);
    }//GEN-LAST:event_jButtonProyecto3ActionPerformed

    private void jButtonUsuario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuario3ActionPerformed
        hidePanels();
        jPanelEquipmentList.setVisible(true);
    }//GEN-LAST:event_jButtonUsuario3ActionPerformed

    private void jButtonEquipo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEquipo3ActionPerformed
        hidePanels();
        jPanelUpdateEquipment.setVisible(true);
    }//GEN-LAST:event_jButtonEquipo3ActionPerformed

    private void jButtonEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEquipoActionPerformed
        hidePanels();
        jPanelCRUDEquipment.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEquipoActionPerformed

    private void jTextFieldNombreCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreCrearUsuarioActionPerformed

    }//GEN-LAST:event_jTextFieldNombreCrearUsuarioActionPerformed

    private void jButtonEquipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEquipo1ActionPerformed
        hidePanels();
        jPanelUpdateUser.setVisible(true);
    }//GEN-LAST:event_jButtonEquipo1ActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
   int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea guardar los cambios del Equipo?", "ACTUALIZAR INFORMACION DE EQUIPO", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonOverwriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOverwriteActionPerformed
        emptyText();
    }//GEN-LAST:event_jButtonOverwriteActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        hidePanels();
        jPanelCRUDEquipment.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack1ActionPerformed
        hidePanels();
        jPanelCRUDUsers.setVisible(true);
    }//GEN-LAST:event_jButtonBack1ActionPerformed

    private void jButtonOverwrite1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOverwrite1ActionPerformed
        emptyText();
    }//GEN-LAST:event_jButtonOverwrite1ActionPerformed

    private void jButtonSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSave1ActionPerformed
        createUser();
    }//GEN-LAST:event_jButtonSave1ActionPerformed

    private void jButtonSave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSave2ActionPerformed
        createEquipment();
    }//GEN-LAST:event_jButtonSave2ActionPerformed

    private void jButtonOverwrite2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOverwrite2ActionPerformed
        emptyText();
    }//GEN-LAST:event_jButtonOverwrite2ActionPerformed

    private void jButtonBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack2ActionPerformed
       hidePanels();
        jPanelCRUDEquipment.setVisible(true);
    }//GEN-LAST:event_jButtonBack2ActionPerformed

    private void jButtonSave3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSave3ActionPerformed
        createProject();
    }//GEN-LAST:event_jButtonSave3ActionPerformed

    private void jButtonOverwrite3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOverwrite3ActionPerformed
        emptyText();
    }//GEN-LAST:event_jButtonOverwrite3ActionPerformed

    private void jButtonBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack3ActionPerformed
       hidePanels();
        jPanelCRUDProjects.setVisible(true);
    }//GEN-LAST:event_jButtonBack3ActionPerformed

    private void jButtonSave4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSave4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSave4ActionPerformed

    private void jButtonOverwrite4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOverwrite4ActionPerformed
        emptyText();
    }//GEN-LAST:event_jButtonOverwrite4ActionPerformed

    private void jButtonBack4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack4ActionPerformed
        hidePanels(); 
        jPanelCRUDProjects.setVisible(true);
    }//GEN-LAST:event_jButtonBack4ActionPerformed

    private void jTextFieldNombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombre3ActionPerformed

    }//GEN-LAST:event_jTextFieldNombre3ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jButtonSave5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSave5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSave5ActionPerformed

    private void jButtonOverwrite5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOverwrite5ActionPerformed
        emptyText();
    }//GEN-LAST:event_jButtonOverwrite5ActionPerformed

    private void jButtonBack5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack5ActionPerformed
        hidePanels();
        jPanelCRUDUsers.setVisible(true);
    }//GEN-LAST:event_jButtonBack5ActionPerformed

    private void jButtonSave6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSave6ActionPerformed
        JOptionPane.showMessageDialog(null, "Su prestamo estara habil desde el dia: FECHA INICIO hasta DD/MM/AA, "
                + "\nsi no lo entrega antes de la fecha se le empezata a cobrar 5000(COP) por cada dia de atraso", 
                "PRESTAMO DE EQUIPO", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButtonSave6ActionPerformed

    private void jButtonListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListActionPerformed
        hidePanels();
        jPanelLoanList.setVisible(true);
    }//GEN-LAST:event_jButtonListActionPerformed

    private void jButtonBack6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack6ActionPerformed
        hidePanels();
        jPanelLoan.setVisible(true);
    }//GEN-LAST:event_jButtonBack6ActionPerformed

    private void jButtonSave7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSave7ActionPerformed
        JOptionPane.showMessageDialog(null, "Su prestamo estara habil desde el dia: DD/MM/AA hasta DD/MM/AA, "
                + "\nsi no lo entrega antes de la fecha se le empezata a cobrar 5000(COP) por cada dia de atraso", 
                "PRESTAMO DE EQUIPO", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_jButtonSave7ActionPerformed

    private void jButtonReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReserveActionPerformed
        hidePanels();
        jPanelReserve.setVisible(true);
    }//GEN-LAST:event_jButtonReserveActionPerformed

    private void jButtonBack7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack7ActionPerformed
        hidePanels();
        jPanelCRUDUsers.setVisible(true);
    }//GEN-LAST:event_jButtonBack7ActionPerformed

    private void jButtonBack8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack8ActionPerformed
        hidePanels();
        jPanelCRUDProjects.setVisible(true);
    }//GEN-LAST:event_jButtonBack8ActionPerformed

    private void jButtonBack9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack9ActionPerformed
       hidePanels();
       jPanelCRUDEquipment.setVisible(true);
    }//GEN-LAST:event_jButtonBack9ActionPerformed

    private void jButtonBack10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack10ActionPerformed
        hidePanels();
        jPanelReserve.setVisible(true);
    }//GEN-LAST:event_jButtonBack10ActionPerformed

    private void jButtonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportesActionPerformed
        hidePanels();
        jPanelReportes.setVisible(true);
    }//GEN-LAST:event_jButtonReportesActionPerformed

    private void jButtonReportPrestxProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportPrestxProjectActionPerformed
        hidePanels();
        jPanelLoanXProjectList.setVisible(true);
    }//GEN-LAST:event_jButtonReportPrestxProjectActionPerformed

    private void jButtonMultasXMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultasXMesActionPerformed
        hidePanels();
        jPanelMultXMonthList.setVisible(true);
    }//GEN-LAST:event_jButtonMultasXMesActionPerformed

    private void jButtonReportPresxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportPresxMesActionPerformed
        hidePanels();
        jPanelLoanXMonthList.setVisible(true);
    }//GEN-LAST:event_jButtonReportPresxMesActionPerformed

    private void jButtonReportPresxMiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportPresxMiembrosActionPerformed
        hidePanels();
        jPanelLoanXMembersList.setVisible(true);
    }//GEN-LAST:event_jButtonReportPresxMiembrosActionPerformed

    private void jButtonReportMultxMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportMultxMiembroActionPerformed
        hidePanels();
        jPanelMultXMembersList.setVisible(true);
    }//GEN-LAST:event_jButtonReportMultxMiembroActionPerformed

    private void jButtonBack11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack11ActionPerformed
        hidePanels();
        jPanelReportes.setVisible(true);
    }//GEN-LAST:event_jButtonBack11ActionPerformed

    private void jButtonBack12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack12ActionPerformed
        hidePanels();
        jPanelReportes.setVisible(true);
    }//GEN-LAST:event_jButtonBack12ActionPerformed

    private void jButtonBack13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack13ActionPerformed
        hidePanels();
        jPanelReportes.setVisible(true);
    }//GEN-LAST:event_jButtonBack13ActionPerformed

    private void jButtonBack14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack14ActionPerformed
        hidePanels();
        jPanelReportes.setVisible(true);
    }//GEN-LAST:event_jButtonBack14ActionPerformed

    private void jButtonBack15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack15ActionPerformed
        hidePanels();
        jPanelReportes.setVisible(true);
    }//GEN-LAST:event_jButtonBack15ActionPerformed

    private void jButtonReserve1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReserve1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonReserve1ActionPerformed

    private void jButtonEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntregarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea entregar el equipo: 'NombreEquipo?", "ENTREGA DE EQUIPO", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_jButtonEntregarActionPerformed

    private void jButtonDeleteMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteMultActionPerformed
    int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea renovar el prestamo  del equipo: 'NombreEquipo?", "RENOVAR PRESTAMO DE EQUIPO", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_jButtonDeleteMultActionPerformed

    private void emptyText(){
        jTextAreaCrearEquipo.setText("");
        jTextAreaCrearProyecto.setText("");
        jTextArea3.setText("");
        jTextArea4.setText("");
        jTextFieldSerialCrearEquipo.setText("");
        jTextFieldCodigoCrearProyecto.setText("");
        jTextFieldEmail1.setText("");
        jTextFieldIdentificacionCrearUsuario.setText("");
        jTextFieldNombreCrearEquipo.setText("");
        jTextFieldNombreCrearProyecto.setText("");
        jTextFieldNombreCrearUsuario.setText("");
        jTextFieldNombre3.setText("");
        jTextFieldNombre4.setText("");
        jTextFieldNombre5.setText("");
    }
    private void hidePanels(){
        jPanelInicio.setVisible(false);
        jPanelCRUDUsers.setVisible(false);
        jPanelCRUDEquipment.setVisible(false);
        jPanelCRUDProjects.setVisible(false);
        jPanelLoan.setVisible(false);
        jPanelCreateEquipment.setVisible(false);
        jPanelCreateProject.setVisible(false);
        jPanelCreateUser.setVisible(false);
        jPanelReserve.setVisible(false);
        jPanelContactUs.setVisible(false);
        jPanelUpdateUser.setVisible(false);
        jPanelUpdateEquipment.setVisible(false);
        jPanelUpdateProject.setVisible(false);
        jPanelUsersList.setVisible(false);
        jPanelProjectsList.setVisible(false);
        jPanelEquipmentList.setVisible(false);
        jPanelLoanList.setVisible(false);
        jPanelReportes.setVisible(false);
        jPanelLoanXProjectList.setVisible(false);
        jPanelLoanXMonthList.setVisible(false);
        jPanelLoanXMembersList.setVisible(false);
        jPanelMultXMembersList.setVisible(false);
        jPanelMultXMonthList.setVisible(false);
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
            java.util.logging.Logger.getLogger(InitialInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InitialInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InitialInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InitialInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InitialInterface().setVisible(true);
            }
        });
    }
    public void UpdateComboBoxs(){//Funcion que consulta en sql.

            jComboBoxUpdateEquipmentSerial.removeAllItems();
            jComboBoxEquipmentSerialLoan.removeAllItems();
            jComboBoxEquipmentSerialReserve.removeAllItems();
            jComboBoxUpdateIdUser.removeAllItems();
            jComboBoxCreateUserProject.removeAllItems();
            jComboBoxUpdateUserProject.removeAllItems();
            jComboBoxUpdateProjectId.removeAllItems();


         
         try{
            Connection conn= fachada.getConnetion();
            Statement sentenceProjects = conn.createStatement();
            Statement sentenceUsers = conn.createStatement();
            Statement sentenceEquipment = conn.createStatement();
            String queryProjects = "SELECT * FROM project";
            String queryUsers = "SELECT * FROM users";
            String queryEquipment= "SELECT * FROM equipment";
            ResultSet rsProjects = sentenceProjects.executeQuery(queryProjects);  
            ResultSet rsUsers = sentenceUsers.executeQuery(queryUsers);
            ResultSet rsEquipment = sentenceEquipment.executeQuery(queryEquipment);
            
            while(rsProjects.next()){
          
                this.jComboBoxCreateUserProject.addItem(rsProjects.getString("id_project"));      
                this.jComboBoxUpdateUserProject.addItem(rsProjects.getString("code")+ "-"+ rsProjects.getString("name") );  
                this.jComboBoxUpdateProjectId.addItem(rsProjects.getString("code")+ "-"+ rsProjects.getString("name") );  
            }
            while(rsUsers.next()){

                this.jComboBoxUpdateIdUser.addItem(rsUsers.getString("identification")+ "-"+ rsUsers.getString("name") );      
               
            }
            while(rsEquipment.next()){

                this.jComboBoxUpdateEquipmentSerial.addItem(rsEquipment.getString("serial")+ "-"+ rsEquipment.getString("name") );  
                this.jComboBoxEquipmentSerialLoan.addItem(rsEquipment.getString("serial")+ "-"+ rsEquipment.getString("name") );      
                this.jComboBoxEquipmentSerialReserve.addItem(rsEquipment.getString("serial")+ "-"+ rsEquipment.getString("name") );      
               
            }
            
        }catch(SQLException e){
            System.out.println("error");
        }

    }
    
      
    public void addTypeUser(String categoria){
            
        this.jComboBoxCreateUserType.removeAllItems();
        this.jComboBoxUpdateUserType.removeAllItems();
     
         switch(categoria){
             
             
                 
             case "Director":
                    
                      this.jComboBoxCreateUserType.addItem("Lider de proyecto");
                      this.jComboBoxCreateUserType.addItem("Administrador");
                      this.jComboBoxCreateUserType.addItem("Cordinador de equipos");
                      this.jComboBoxCreateUserType.addItem("Miembro");
                      
                      this.jComboBoxUpdateUserType.addItem("Lider de proyecto");
                      this.jComboBoxUpdateUserType.addItem("Administrador");
                      this.jComboBoxUpdateUserType.addItem("Cordinador de equipos");
                      this.jComboBoxUpdateUserType.addItem("Miembro");
                      
                      break;
                      
            case "Administrador":

                    
                      this.jComboBoxCreateUserType.addItem("Lider de proyecto");
                      this.jComboBoxCreateUserType.addItem("Cordinador de equipos");
                      this.jComboBoxCreateUserType.addItem("Miembro");
                      
                      this.jComboBoxUpdateUserType.addItem("Lider de proyecto");
                      this.jComboBoxUpdateUserType.addItem("Cordinador de equipos");
                      this.jComboBoxUpdateUserType.addItem("Miembro");
                      
                      break;
                      
            case "Lider de proyecto":
                      
                      this.jComboBoxCreateUserType.addItem("Miembro");
                      this.jComboBoxUpdateUserType.addItem("Miembro");
                      break;
         }
                 
    }
    
        public void addState(String categoria){
            
        this.jComboBoxUpdateProjectState.removeAllItems();
        this.jComboBoxUpdateEquipmentState.removeAllItems();
     
         switch(categoria){
             
             
                 
             case "Director":
                    
                      this.jComboBoxUpdateProjectState.addItem("Activo");
                      this.jComboBoxUpdateProjectState.addItem("Inactivo");
                      this.jComboBoxUpdateProjectState.addItem("Terminado");

                      this.jComboBoxUpdateEquipmentState.addItem("Disponible");
                      this.jComboBoxUpdateEquipmentState.addItem("Ocupado");

                      
                      break;
                      
            case "Cordinador de equipos":

                      this.jComboBoxUpdateEquipmentState.addItem("Disponible");
                      this.jComboBoxUpdateEquipmentState.addItem("Ocupado");
                      
                      break;
                      
            case "Lider de proyecto":
                      
                      this.jComboBoxUpdateProjectState.addItem("Activo");
                      this.jComboBoxUpdateProjectState.addItem("Inactivo");
                      this.jComboBoxUpdateProjectState.addItem("Terminado");

                      break;
         }
                 
    }
     public void createUser(){

        objCtrlUser = new UserController();

        String identification = jTextFieldIdentificacionCrearUsuario.getText();

        String idProyect = jComboBoxCreateUserProject.getSelectedItem().toString();
                
        String name = jTextFieldNombreCrearUsuario.getText();

        String password =  generateInitialPassword();
        
        String typeUser = jComboBoxCreateUserType.getSelectedItem().toString();
                
        String state = "Activo";
        
        String email = jTextFieldEmailCrearUsuario.getText();


       objCtrlUser.addUser(identification, idProyect, password,  name, typeUser,state , email);

    }
      public void createProject(){
            
            objCtrlProject = new ProjectController();


            String code = jTextFieldCodigoCrearProyecto.getText();
            String name = jTextFieldNombreCrearProyecto.getText();
            String description = jTextAreaCrearProyecto.getText();
            String state = "Activo";

            objCtrlProject.addProject(code, name, description, state);
            
    }
      
    public void createEquipment(){
        
        objCtrlEquipment = new EquipmentController();
        
        String serial=jTextFieldSerialCrearEquipo.getText();
        String name=jTextFieldNombreCrearEquipo.getText();
        String description=jTextAreaCrearEquipo.getText();
        String state = "Activo";

        
        objCtrlEquipment.addEquipment(serial,name,description,state);
        
    }
     
    public String generateInitialPassword(){
        
        String identification = jTextFieldIdentificacionCrearUsuario.getText();
        String name = jTextFieldNombreCrearUsuario.getText();
        String initial = name.substring(0,1);
        char last = name.charAt(name.length()-1);          
        String password =  (initial + identification + last).toUpperCase();
        
        return password;
        
    }
     
    public void fillTableUsers(){
        
    
        try{
            
            Connection conn= fachada.getConnetion();
                        System.out.println("error");

            String tableUsers = "SELECT identification , project_id , user_password , name , type , state , email FROM users";
             
            PreparedStatement sentenceUsers = conn.prepareStatement(tableUsers);
                              
            ResultSet rsUsers = sentenceUsers.executeQuery();  

            ResultSetMetaData rsData =  rsUsers.getMetaData();

            ArrayList< Object[] > data = new ArrayList <>();
            
            while(rsUsers.next()){

              Object[] rows = new Object[rsData.getColumnCount()];

              for(int i = 0;  i < rows.length; i++){
                rows[i] = rsUsers.getObject(i+1);
            }
               data.add(rows);
            }
               DefaultTableModel tableUser = (DefaultTableModel)this.jTable1.getModel();
               for(int i =0; i < data.size(); i++){

                   tableUser.addRow(data.get(i));

               }
        }
        catch(SQLException e){
            System.out.println("error2");
        }
    }
    
    public void fillTableProject(){
        try{
            
            Connection conn= fachada.getConnetion();

            String tableProjects = "SELECT  codigo , nombre , descripcion , estado FROM project";
             
            PreparedStatement sentenceProjects = conn.prepareStatement(tableProjects);
                              
            ResultSet rsProjects = sentenceProjects.executeQuery(); 

            ResultSetMetaData rsDataProjects =  rsProjects.getMetaData();

            ArrayList< Object[] > data = new ArrayList <>();
            
            while(rsProjects.next()){

              Object[] rows = new Object[rsDataProjects.getColumnCount()];
                          System.out.println("error");

              for(int i = 0;  i < rows.length; i++){
                rows[i] = rsProjects.getObject(i+1);
            }
               data.add(rows);
            }
               DefaultTableModel tableUser = (DefaultTableModel)this.jTable2.getModel();
               for(int i =0; i < data.size(); i++){
                               System.out.println("error");

                   tableUser.addRow(data.get(i));
                               System.out.println("error");

               }
        }
        catch(SQLException e){
            System.out.println("error2");
        }
    }
    
        public void fillTableEquipment(){
        
    
        try{
            
            Connection conn= fachada.getConnetion();
                        System.out.println("error");

            String tableEquipment = "SELECT serial , nombre , descripcion , estado FROM equipment";
             
            PreparedStatement sentenceEquipment = conn.prepareStatement(tableEquipment);
                              
            ResultSet rsEquipment = sentenceEquipment.executeQuery(); 

            ResultSetMetaData rsDataEquipment =  rsEquipment.getMetaData();

            ArrayList< Object[] > data = new ArrayList <>();
            
            while(rsEquipment.next()){

              Object[] rows = new Object[rsDataEquipment.getColumnCount()];
                          System.out.println("error");

              for(int i = 0;  i < rows.length; i++){
                rows[i] = rsEquipment.getObject(i+1);
            }
               data.add(rows);
            }
               DefaultTableModel tableEquipmen = (DefaultTableModel)this.jTable3.getModel();
               for(int i =0; i < data.size(); i++){
                               System.out.println("error");

                   tableEquipmen.addRow(data.get(i));
                               System.out.println("error");

               }
        }
        catch(SQLException e){
            System.out.println("error2");
        }
    }
        
        private void fillEmptyFields(){
            if (!jTextAreaCrearEquipo.getText().isEmpty()) {
                jTextAreaCrearEquipo.setText("Ingrese una breve descripcion del equipo");}
            
            if (!jTextAreaCrearProyecto.getText().isEmpty()) {
                jTextAreaCrearProyecto.setText("Ingrese una breve descripcion del proyecto");}
            
            if (!jTextFieldCodigoCrearProyecto.getText().isEmpty()) {
                jTextFieldCodigoCrearProyecto.setText("Ingrese el codigo del proyecto");}

            if (!jTextFieldEmailCrearUsuario.getText().isEmpty()) {
                jTextFieldEmailCrearUsuario.setText("Ingrese el email del  usuario");}
             
            if (!jTextFieldIdentificacionCrearUsuario.getText().isEmpty()) {
                jTextFieldIdentificacionCrearUsuario.setText("Ingrese el codigo del  usuario");}
            
            if (!jTextFieldNombreCrearEquipo.getText().isEmpty()) {
                jTextFieldNombreCrearEquipo.setText("Ingrese el nombre del  equipo");}

            if (!jTextFieldNombreCrearProyecto.getText().isEmpty()) {
                jTextFieldNombreCrearProyecto.setText("Ingrese el nombre del proyecto");}

            if (!jTextFieldNombreCrearUsuario.getText().isEmpty()) {
                jTextFieldNombreCrearUsuario.setText("Ingrese el nombre del usuario");}
            
            if (!jTextFieldSerialCrearEquipo.getText().isEmpty()) {
                jTextFieldSerialCrearEquipo.setText("Ingrese el nombre del equipo");}

        }
     
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonBack1;
    private javax.swing.JButton jButtonBack10;
    private javax.swing.JButton jButtonBack11;
    private javax.swing.JButton jButtonBack12;
    private javax.swing.JButton jButtonBack13;
    private javax.swing.JButton jButtonBack14;
    private javax.swing.JButton jButtonBack15;
    private javax.swing.JButton jButtonBack2;
    private javax.swing.JButton jButtonBack3;
    private javax.swing.JButton jButtonBack4;
    private javax.swing.JButton jButtonBack5;
    private javax.swing.JButton jButtonBack6;
    private javax.swing.JButton jButtonBack7;
    private javax.swing.JButton jButtonBack8;
    private javax.swing.JButton jButtonBack9;
    private javax.swing.JButton jButtonDeleteMult;
    private javax.swing.JButton jButtonEntregar;
    private javax.swing.JButton jButtonEquipo;
    private javax.swing.JButton jButtonEquipo1;
    private javax.swing.JButton jButtonEquipo2;
    private javax.swing.JButton jButtonEquipo3;
    private javax.swing.JButton jButtonInfo;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonList;
    private javax.swing.JButton jButtonMultasXMes;
    private javax.swing.JButton jButtonOverwrite;
    private javax.swing.JButton jButtonOverwrite1;
    private javax.swing.JButton jButtonOverwrite2;
    private javax.swing.JButton jButtonOverwrite3;
    private javax.swing.JButton jButtonOverwrite4;
    private javax.swing.JButton jButtonOverwrite5;
    private javax.swing.JButton jButtonPerfil;
    private javax.swing.JButton jButtonProyecto;
    private javax.swing.JButton jButtonProyecto1;
    private javax.swing.JButton jButtonProyecto2;
    private javax.swing.JButton jButtonProyecto3;
    private javax.swing.JButton jButtonReportMultxMiembro;
    private javax.swing.JButton jButtonReportPrestxProject;
    private javax.swing.JButton jButtonReportPresxMes;
    private javax.swing.JButton jButtonReportPresxMiembros;
    private javax.swing.JButton jButtonReportes;
    private javax.swing.JButton jButtonReserve;
    private javax.swing.JButton jButtonReserve1;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSave1;
    private javax.swing.JButton jButtonSave2;
    private javax.swing.JButton jButtonSave3;
    private javax.swing.JButton jButtonSave4;
    private javax.swing.JButton jButtonSave5;
    private javax.swing.JButton jButtonSave6;
    private javax.swing.JButton jButtonSave7;
    private javax.swing.JButton jButtonSolicitud;
    private javax.swing.JButton jButtonUsuario;
    private javax.swing.JButton jButtonUsuario1;
    private javax.swing.JButton jButtonUsuario2;
    private javax.swing.JButton jButtonUsuario3;
    private javax.swing.JComboBox<String> jComboBoxCreateUserProject;
    private javax.swing.JComboBox<String> jComboBoxCreateUserType;
    private javax.swing.JComboBox<String> jComboBoxEquipmentSerialLoan;
    private javax.swing.JComboBox<String> jComboBoxEquipmentSerialReserve;
    private javax.swing.JComboBox<String> jComboBoxUpdateEquipmentSerial;
    private javax.swing.JComboBox<String> jComboBoxUpdateEquipmentState;
    private javax.swing.JComboBox<String> jComboBoxUpdateIdUser;
    private javax.swing.JComboBox<String> jComboBoxUpdateProjectId;
    private javax.swing.JComboBox<String> jComboBoxUpdateProjectState;
    private javax.swing.JComboBox<String> jComboBoxUpdateUserProject;
    private javax.swing.JComboBox<String> jComboBoxUpdateUserState;
    private javax.swing.JComboBox<String> jComboBoxUpdateUserType;
    private javax.swing.JLabel jLabeMultasPorMiembro;
    private javax.swing.JLabel jLabeMultasPorMiembro1;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelCodigo1;
    private javax.swing.JLabel jLabelCodigo2;
    private javax.swing.JLabel jLabelCodigo3;
    private javax.swing.JLabel jLabelCodigo4;
    private javax.swing.JLabel jLabelContacto;
    private javax.swing.JLabel jLabelContraseña1;
    private javax.swing.JLabel jLabelCoordinador;
    private javax.swing.JLabel jLabelCoordinadora;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelDescripcion1;
    private javax.swing.JLabel jLabelDescripcion2;
    private javax.swing.JLabel jLabelDescripcion3;
    private javax.swing.JLabel jLabelEmailCordi;
    private javax.swing.JLabel jLabelEmailLab;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFondo1;
    private javax.swing.JLabel jLabelFondo10;
    private javax.swing.JLabel jLabelFondo11;
    private javax.swing.JLabel jLabelFondo12;
    private javax.swing.JLabel jLabelFondo13;
    private javax.swing.JLabel jLabelFondo14;
    private javax.swing.JLabel jLabelFondo15;
    private javax.swing.JLabel jLabelFondo16;
    private javax.swing.JLabel jLabelFondo17;
    private javax.swing.JLabel jLabelFondo18;
    private javax.swing.JLabel jLabelFondo19;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JLabel jLabelFondo20;
    private javax.swing.JLabel jLabelFondo21;
    private javax.swing.JLabel jLabelFondo22;
    private javax.swing.JLabel jLabelFondo23;
    private javax.swing.JLabel jLabelFondo3;
    private javax.swing.JLabel jLabelFondo4;
    private javax.swing.JLabel jLabelFondo5;
    private javax.swing.JLabel jLabelFondo6;
    private javax.swing.JLabel jLabelFondo7;
    private javax.swing.JLabel jLabelFondo8;
    private javax.swing.JLabel jLabelFondo9;
    private javax.swing.JLabel jLabelIdentificacion;
    private javax.swing.JLabel jLabelIdentificacion1;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelNombre3;
    private javax.swing.JLabel jLabelNombre4;
    private javax.swing.JLabel jLabelNombre5;
    private javax.swing.JLabel jLabelNombre6;
    private javax.swing.JLabel jLabelProyecto;
    private javax.swing.JLabel jLabelProyecto1;
    private javax.swing.JLabel jLabelReportes;
    private javax.swing.JLabel jLabelSerial;
    private javax.swing.JLabel jLabelSerial1;
    private javax.swing.JLabel jLabelSolicitud;
    private javax.swing.JLabel jLabelSolicitud1;
    private javax.swing.JLabel jLabelSolicitud2;
    private javax.swing.JLabel jLabelSolicitud3;
    private javax.swing.JLabel jLabelSolicitud4;
    private javax.swing.JLabel jLabelSolicitud5;
    private javax.swing.JLabel jLabelSolicitud6;
    private javax.swing.JLabel jLabelSolicitud7;
    private javax.swing.JLabel jLabelTelefonos;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTipo1;
    private javax.swing.JLabel jLabelTipo2;
    private javax.swing.JLabel jLabelTipo3;
    private javax.swing.JLabel jLabelUsuarios;
    private javax.swing.JLabel jLabelUsuarios1;
    private javax.swing.JLabel jLabelUsuarios10;
    private javax.swing.JLabel jLabelUsuarios11;
    private javax.swing.JLabel jLabelUsuarios2;
    private javax.swing.JLabel jLabelUsuarios3;
    private javax.swing.JLabel jLabelUsuarios4;
    private javax.swing.JLabel jLabelUsuarios5;
    private javax.swing.JLabel jLabelUsuarios6;
    private javax.swing.JLabel jLabelUsuarios7;
    private javax.swing.JLabel jLabelUsuarios8;
    private javax.swing.JLabel jLabelUsuarios9;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JLabel jLabelValorTotal1;
    private javax.swing.JPanel jPanelCRUDEquipment;
    private javax.swing.JPanel jPanelCRUDProjects;
    private javax.swing.JPanel jPanelCRUDUsers;
    private javax.swing.JPanel jPanelContactUs;
    private javax.swing.JPanel jPanelCreateEquipment;
    private javax.swing.JPanel jPanelCreateProject;
    private javax.swing.JPanel jPanelCreateUser;
    private javax.swing.JPanel jPanelEquipmentList;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelLoan;
    private javax.swing.JPanel jPanelLoanList;
    private javax.swing.JPanel jPanelLoanXMembersList;
    private javax.swing.JPanel jPanelLoanXMonthList;
    private javax.swing.JPanel jPanelLoanXProjectList;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelMultXMembersList;
    private javax.swing.JPanel jPanelMultXMonthList;
    private javax.swing.JPanel jPanelProjectsList;
    private javax.swing.JPanel jPanelReportes;
    private javax.swing.JPanel jPanelReserve;
    private javax.swing.JPanel jPanelUpdateEquipment;
    private javax.swing.JPanel jPanelUpdateProject;
    private javax.swing.JPanel jPanelUpdateUser;
    private javax.swing.JPanel jPanelUsersList;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSpinnerAño;
    private javax.swing.JSpinner jSpinnerDia;
    private javax.swing.JSpinner jSpinnerMes;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextAreaCrearEquipo;
    private javax.swing.JTextArea jTextAreaCrearProyecto;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldCodigoCrearProyecto;
    private javax.swing.JTextField jTextFieldEmail1;
    private javax.swing.JTextField jTextFieldEmailCrearUsuario;
    private javax.swing.JTextField jTextFieldIdentificacionCrearUsuario;
    private javax.swing.JTextField jTextFieldNombre3;
    private javax.swing.JTextField jTextFieldNombre4;
    private javax.swing.JTextField jTextFieldNombre5;
    private javax.swing.JTextField jTextFieldNombreCrearEquipo;
    private javax.swing.JTextField jTextFieldNombreCrearProyecto;
    private javax.swing.JTextField jTextFieldNombreCrearUsuario;
    private javax.swing.JTextField jTextFieldSerialCrearEquipo;
    // End of variables declaration//GEN-END:variables
}
