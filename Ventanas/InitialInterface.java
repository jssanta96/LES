package Ventanas;
import Controllers.EquipmentController;
import Controllers.MultController;
import Controllers.ProjectController;
import Controllers.RequestController;
import Controllers.UserController;
import java.io.File;
import Dao.Querys;
import Dao.RequestDao;
import Logica.Assistant;
import Logica.Validate;
import Logica.View;
import java.awt.Image;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public final class InitialInterface extends javax.swing.JFrame {

    Date fecha = new Date();
    File fichero;

    public InitialInterface() {

        initComponents();
        hidePanels();
        jPanelInicio.setVisible(true);
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoLes.png")).getImage());       
        jLabelUserIdentificationGeneral.setVisible(false);
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
        jLabelUserPhoto = new javax.swing.JLabel();
        jLabelUserIdentificationGeneral = new javax.swing.JLabel();
        jLabelBienvenido = new javax.swing.JLabel();
        jLabelFondoMenu = new javax.swing.JLabel();
        jPanelInicio = new javax.swing.JPanel();
        jLabelLogoLab = new javax.swing.JLabel();
        jLabelLogoUnivalle = new javax.swing.JLabel();
        jLabelLogoLESInicio = new javax.swing.JLabel();
        signOff = new javax.swing.JButton();
        jButtonProyecto = new javax.swing.JButton();
        jButtonUsuario = new javax.swing.JButton();
        jButtonEquipo = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jLabelFondoInicio = new javax.swing.JLabel();
        jPanelUpdateUser = new javax.swing.JPanel();
        jComboBoxUpdateUserState = new javax.swing.JComboBox<>();
        jLabelUnivalle = new javax.swing.JLabel();
        jLabelLES = new javax.swing.JLabel();
        jLabelLogoMVLab = new javax.swing.JLabel();
        jLabelTitleProyecto = new javax.swing.JLabel();
        jLabelResp = new javax.swing.JLabel();
        jLabelPregunt = new javax.swing.JLabel();
        jLabelIdentificacion1 = new javax.swing.JLabel();
        jLabelTitleUpUser = new javax.swing.JLabel();
        jComboBoxUpdateIdUser = new javax.swing.JComboBox<>();
        jComboBoxUpdateUserProject = new javax.swing.JComboBox<>();
        jLabelEmail = new javax.swing.JLabel();
        jLabelCargo = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldRespuesta = new javax.swing.JTextField();
        jTextFieldPregunta = new javax.swing.JTextField();
        jLabelNombreTitle = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldNombreUpUser = new javax.swing.JTextField();
        jComboBoxUpdateUserType = new javax.swing.JComboBox<>();
        jButtonSaveUpUser = new javax.swing.JButton();
        jButtonEmpty = new javax.swing.JButton();
        jButtonBackUpUser = new javax.swing.JButton();
        jLabelFondoUpUser = new javax.swing.JLabel();
        jPanelCreateEquipment = new javax.swing.JPanel();
        jLabelLogoUnivalleCreateEquipment = new javax.swing.JLabel();
        jLabelLogoLESCreateEquipment = new javax.swing.JLabel();
        jLabeLogolLabCreateEquipment = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelTitleCreateEquipment = new javax.swing.JLabel();
        jTextFieldSerialCrearEquipo = new javax.swing.JTextField();
        jTextFieldNombreCrearEquipo = new javax.swing.JTextField();
        jButtonSaveCreateEquipment = new javax.swing.JButton();
        jButtonEmptyCreateEquipment = new javax.swing.JButton();
        jButtonBackCreateEquipment = new javax.swing.JButton();
        jScrollPaneCreateEquipment = new javax.swing.JScrollPane();
        jTextAreaCrearEquipo = new javax.swing.JTextArea();
        jButtonEquipmentCSV = new javax.swing.JButton();
        jLabelFondoCreateEquipment = new javax.swing.JLabel();
        jPanelCreateUser = new javax.swing.JPanel();
        jLabelLogoUnivalleCreateUser = new javax.swing.JLabel();
        jLabelLogoLESCreateUser = new javax.swing.JLabel();
        jTextFieldQuestion = new javax.swing.JTextField();
        jLabelLogoLabCreateUser = new javax.swing.JLabel();
        jLabelProyecto = new javax.swing.JLabel();
        jLabelIdentificacion = new javax.swing.JLabel();
        jLabelTitleCreateUser = new javax.swing.JLabel();
        jTextFieldIdentificacionCrearUsuario = new javax.swing.JTextField();
        jComboBoxCreateUserProject = new javax.swing.JComboBox<>();
        jLabelAnswer = new javax.swing.JLabel();
        jTextFieldAnswer = new javax.swing.JTextField();
        jLabelQuestion = new javax.swing.JLabel();
        jLabelEmailCreateUser = new javax.swing.JLabel();
        jLabelPositionCreateUser = new javax.swing.JLabel();
        jLabelNombreCreateUser = new javax.swing.JLabel();
        jTextFieldEmailCrearUsuario = new javax.swing.JTextField();
        jTextFieldNombreCrearUsuario = new javax.swing.JTextField();
        jComboBoxCreateUserPosition = new javax.swing.JComboBox<>();
        jButtonUserCSV = new javax.swing.JButton();
        jButtonBackCreateUser = new javax.swing.JButton();
        jButtonEmptyCreateUser = new javax.swing.JButton();
        jButtonSaveCreateUser = new javax.swing.JButton();
        jLabelFondoCreateUser = new javax.swing.JLabel();
        jPanelUpdateEquipment = new javax.swing.JPanel();
        jLabelLogoUnivalleUpEquipment = new javax.swing.JLabel();
        jLabelLogoLESUpEquipment = new javax.swing.JLabel();
        jLabelLogoLabUpEquipment = new javax.swing.JLabel();
        jLabelDescripcionUpEquipment = new javax.swing.JLabel();
        jLabelNombreUpEquipment = new javax.swing.JLabel();
        jLabelStateUpEquipment = new javax.swing.JLabel();
        jLabelTitleUpEquipment = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jButtonOverwrite = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jTextFieldNombreUpEquipment = new javax.swing.JTextField();
        jScrollPaneUpEquipment = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jComboBoxUpdateEquipmentState = new javax.swing.JComboBox<>();
        jComboBoxUpdateEquipmentSerial = new javax.swing.JComboBox<>();
        jLabelSerialUpEquipment = new javax.swing.JLabel();
        jLabelFondoUpEquipment = new javax.swing.JLabel();
        jPanelUpdateProject = new javax.swing.JPanel();
        jLabelLogoUnivalleUpdateProject = new javax.swing.JLabel();
        jLabelLogoLESUpdateProject = new javax.swing.JLabel();
        jLabelLogoLabUpdateProject = new javax.swing.JLabel();
        jLabelDescripcionUpdateProject = new javax.swing.JLabel();
        jLabelStateUpdateProject = new javax.swing.JLabel();
        jLabelNombreUpdateProject = new javax.swing.JLabel();
        jLabelCodigoUpdateProject = new javax.swing.JLabel();
        jLabelTitleUpdateProject = new javax.swing.JLabel();
        jTextFieldNombreUpdateProject = new javax.swing.JTextField();
        jScrollPaneUpdateProject = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jComboBoxUpdateProjectId = new javax.swing.JComboBox<>();
        jComboBoxUpdateProjectState = new javax.swing.JComboBox<>();
        jButtonSaveUpdateProject = new javax.swing.JButton();
        jButtonEmptyUpdateProject = new javax.swing.JButton();
        jButtonBackUpdateProject = new javax.swing.JButton();
        jLabelFondoUpdateProject = new javax.swing.JLabel();
        jPanelCreateProject = new javax.swing.JPanel();
        jLabelLogoUnivalleCreateProject = new javax.swing.JLabel();
        jLabelLESCreateProject = new javax.swing.JLabel();
        jLabelLogoLabCreateProject = new javax.swing.JLabel();
        jLabelTitleDescripcion = new javax.swing.JLabel();
        jLabelTitleNombreCreateProject = new javax.swing.JLabel();
        jLabelTitleCodigoCreateProject = new javax.swing.JLabel();
        jLabelTitleCreateProject = new javax.swing.JLabel();
        jButtonSaveCreateProject = new javax.swing.JButton();
        jButtonEmptyCreateProject = new javax.swing.JButton();
        jButtonBackCreateProject = new javax.swing.JButton();
        jTextFieldCodigoCrearProyecto = new javax.swing.JTextField();
        jTextFieldNombreCrearProyecto = new javax.swing.JTextField();
        jScrollPaneDescriptionCreateProject = new javax.swing.JScrollPane();
        jTextAreaCrearProyecto = new javax.swing.JTextArea();
        jButtonProjectCSV = new javax.swing.JButton();
        jLabelFondoCreateProject = new javax.swing.JLabel();
        jPanelContactUs = new javax.swing.JPanel();
        jLabelLogoLabContactUs = new javax.swing.JLabel();
        jLabelLogoUnivalleContactUs = new javax.swing.JLabel();
        jLabelLogoLESContactUs = new javax.swing.JLabel();
        jButtonEditContact = new javax.swing.JButton();
        jButtonSaveEditContact = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelFondoContactUs = new javax.swing.JLabel();
        jPanelReserve = new javax.swing.JPanel();
        jLabelLogoUnivalleReserve = new javax.swing.JLabel();
        jLabelLogoLESReserve = new javax.swing.JLabel();
        jLabelLogoLabReserve = new javax.swing.JLabel();
        jLabelInicio = new javax.swing.JLabel();
        jLabelSerialReserve = new javax.swing.JLabel();
        jLabelTitleReserve = new javax.swing.JLabel();
        jComboBoxEquipmentSerialReserve = new javax.swing.JComboBox<>();
        jSpinnerAño = new javax.swing.JSpinner();
        jSpinnerMes = new javax.swing.JSpinner();
        jSpinnerDia = new javax.swing.JSpinner();
        jLabelYear = new javax.swing.JLabel();
        jLabelMonth = new javax.swing.JLabel();
        jLabelDay = new javax.swing.JLabel();
        jButtonSaveReserve = new javax.swing.JButton();
        jButtonList = new javax.swing.JButton();
        jButtonBackReserve = new javax.swing.JButton();
        jLabelFondoReserve = new javax.swing.JLabel();
        jPanelLoan = new javax.swing.JPanel();
        jLabelLogoUnivalleLoan = new javax.swing.JLabel();
        jLabelLogoLESLoan = new javax.swing.JLabel();
        jLabelLogoLabLoan = new javax.swing.JLabel();
        jLabelSerial = new javax.swing.JLabel();
        jLabeTitleLoan = new javax.swing.JLabel();
        jComboBoxEquipmentSerialLoan = new javax.swing.JComboBox<>();
        jButtonSaveLoan = new javax.swing.JButton();
        jButtonListarPrestamos = new javax.swing.JButton();
        jButtonMultDelete = new javax.swing.JButton();
        jButtonReserve = new javax.swing.JButton();
        jButtonRenovate = new javax.swing.JButton();
        jButtonEntregar = new javax.swing.JButton();
        jLabelFondoLoan = new javax.swing.JLabel();
        jPanelCRUDEquipment = new javax.swing.JPanel();
        jLabelLogoUnivalleEquipment = new javax.swing.JLabel();
        jLabelLogoLESEquipment = new javax.swing.JLabel();
        jLabelLogoLabEquipment = new javax.swing.JLabel();
        jButtonCreateEquipment = new javax.swing.JButton();
        jButtonListEquipment = new javax.swing.JButton();
        jButtonConsultEquipment = new javax.swing.JButton();
        jButtonUpdateEquipment = new javax.swing.JButton();
        jLabelTitleEquipment = new javax.swing.JLabel();
        jLabelEquipment = new javax.swing.JLabel();
        jPanelCRUDUsers = new javax.swing.JPanel();
        jLabelLogoUnivalleUser = new javax.swing.JLabel();
        jLabelLogoLESUser = new javax.swing.JLabel();
        jLabelLogoLabUser = new javax.swing.JLabel();
        jButtonConsultUser = new javax.swing.JButton();
        jButtonCreateUser = new javax.swing.JButton();
        jButtonListUser = new javax.swing.JButton();
        jButtonUpdateUser = new javax.swing.JButton();
        jLabelUsuarios = new javax.swing.JLabel();
        jLabelFondoUser = new javax.swing.JLabel();
        jPanelCRUDProjects = new javax.swing.JPanel();
        jLabelLogoUnivalleProject = new javax.swing.JLabel();
        jLabelLogoLESProject = new javax.swing.JLabel();
        jLabelLogoLabProject = new javax.swing.JLabel();
        jButtonCreateProject = new javax.swing.JButton();
        jButtonListProject = new javax.swing.JButton();
        jButtonConsultProject = new javax.swing.JButton();
        jButtonUpdateProject = new javax.swing.JButton();
        jLabelTitleProject = new javax.swing.JLabel();
        jLabelFondoProject = new javax.swing.JLabel();
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
        jPanelReserveList = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabelUsuarios12 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jButtonBack16 = new javax.swing.JButton();
        jLabelFondo25 = new javax.swing.JLabel();
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
        jLabelFondo18 = new javax.swing.JLabel();
        jPanelLoanXProjectList = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabelUsuarios9 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButtonBack11 = new javax.swing.JButton();
        jButtonExportMultMonth1 = new javax.swing.JButton();
        jButtonBack21 = new javax.swing.JButton();
        jLabelFondo19 = new javax.swing.JLabel();
        jPanelLoanXMonthList = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabelUsuarios10 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButtonBack12 = new javax.swing.JButton();
        jButtonExportMultMonth2 = new javax.swing.JButton();
        jButtonBack22 = new javax.swing.JButton();
        jLabelFondo20 = new javax.swing.JLabel();
        jPanelLoanXMembersList = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabelUsuarios11 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jButtonBack13 = new javax.swing.JButton();
        jButtonExportMultMonth3 = new javax.swing.JButton();
        jButtonBack23 = new javax.swing.JButton();
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
        TotalMultasXMiembro = new javax.swing.JTextField();
        jButtonExportMultMonth4 = new javax.swing.JButton();
        jButtonBack24 = new javax.swing.JButton();
        jLabelFondo22 = new javax.swing.JLabel();
        jPanelMultXMonthList = new javax.swing.JPanel();
        jLabelValorTotal1 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabeMultasPorMiembro1 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jButtonExportMultMonth = new javax.swing.JButton();
        jButtonBack15 = new javax.swing.JButton();
        TotalMultasXmes = new javax.swing.JTextField();
        jButtonBack25 = new javax.swing.JButton();
        jLabelFondo23 = new javax.swing.JLabel();
        jPanelMyProfile = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabelSetName = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelPerfil = new javax.swing.JLabel();
        jLabelPassActual1 = new javax.swing.JLabel();
        jLabelPassActual = new javax.swing.JLabel();
        jLabelPassNew = new javax.swing.JLabel();
        jLabelPassNew2 = new javax.swing.JLabel();
        jLabelEmailLb = new javax.swing.JLabel();
        jLabelPassNew1 = new javax.swing.JLabel();
        jLabelPassNew3 = new javax.swing.JLabel();
        jButtonCheckPass = new javax.swing.JButton();
        jTextFieldPassActual = new javax.swing.JPasswordField();
        jTextFieldSetEmail = new javax.swing.JTextField();
        jLabelPhoto = new javax.swing.JLabel();
        jButtonSaveProfile = new javax.swing.JButton();
        jButtonLoadPhoto = new javax.swing.JButton();
        jPasswordNew1 = new javax.swing.JPasswordField();
        jPasswordNew = new javax.swing.JPasswordField();
        jLabelFondo24 = new javax.swing.JLabel();
        jPanelViewEquipment = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabelDescriptionEquip = new javax.swing.JLabel();
        jLabelEquipState = new javax.swing.JLabel();
        jLabelEquipName = new javax.swing.JLabel();
        jLabelDescripcion4 = new javax.swing.JLabel();
        jLabelNombre7 = new javax.swing.JLabel();
        jLabelCodigo5 = new javax.swing.JLabel();
        jLabelSolicitud8 = new javax.swing.JLabel();
        jButtonBack17 = new javax.swing.JButton();
        jButtonCheckEquip = new javax.swing.JButton();
        jComboBoxUpdateEquipmentSerial1 = new javax.swing.JComboBox<>();
        jLabelCodigo6 = new javax.swing.JLabel();
        jLabelFondo26 = new javax.swing.JLabel();
        jPanelViewUser = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabelViewUserEmail = new javax.swing.JLabel();
        jLabelViewUserName = new javax.swing.JLabel();
        jLabelViewUserRange = new javax.swing.JLabel();
        jLabelViewUserState = new javax.swing.JLabel();
        jLabelViewUserProject = new javax.swing.JLabel();
        jLabelProyecto2 = new javax.swing.JLabel();
        jLabelIdentificacion2 = new javax.swing.JLabel();
        jLabelSolicitud9 = new javax.swing.JLabel();
        jComboBoxUpdateIdUser1 = new javax.swing.JComboBox<>();
        jLabelTipo4 = new javax.swing.JLabel();
        jLabelTipo5 = new javax.swing.JLabel();
        jLabelEstado1 = new javax.swing.JLabel();
        jLabelNombre8 = new javax.swing.JLabel();
        jButtonUserCheck = new javax.swing.JButton();
        jButtonBack18 = new javax.swing.JButton();
        jLabelFondo27 = new javax.swing.JLabel();
        jPanelViewProject = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabelViewProjectName1 = new javax.swing.JLabel();
        jLabelViewProjectDescription = new javax.swing.JLabel();
        jLabelViewProjectName = new javax.swing.JLabel();
        jLabelDescripcion5 = new javax.swing.JLabel();
        jLabelNombre9 = new javax.swing.JLabel();
        jLabelNombre10 = new javax.swing.JLabel();
        jLabelCodigo7 = new javax.swing.JLabel();
        jLabelSolicitud10 = new javax.swing.JLabel();
        jComboBoxUpdateProjectId1 = new javax.swing.JComboBox<>();
        jButtonCheckProject = new javax.swing.JButton();
        jButtonBack19 = new javax.swing.JButton();
        jLabelFondo28 = new javax.swing.JLabel();
        jPanelDeleteMult = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabelMultValue = new javax.swing.JLabel();
        jLabelValueMultUser = new javax.swing.JLabel();
        jLabelUserNameMult = new javax.swing.JLabel();
        jLabelInicio1 = new javax.swing.JLabel();
        jLabelSerial2 = new javax.swing.JLabel();
        jLabelSolicitud11 = new javax.swing.JLabel();
        jComboBoxMult = new javax.swing.JComboBox<>();
        jButtonSave8 = new javax.swing.JButton();
        jButtonCheckMult = new javax.swing.JButton();
        jButtonBack20 = new javax.swing.JButton();
        jLabelFondo29 = new javax.swing.JLabel();

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

        jLabelUserPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sinFoto.jpg"))); // NOI18N
        jPanelMenu.add(jLabelUserPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, 90));

        jLabelUserIdentificationGeneral.setText("1234");
        jPanelMenu.add(jLabelUserIdentificationGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, -1));

        jLabelBienvenido.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelBienvenido.setForeground(new java.awt.Color(153, 0, 0));
        jLabelBienvenido.setText("BIENVENIDO");
        jPanelMenu.add(jLabelBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabelFondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoGris.jpg"))); // NOI18N
        jLabelFondoMenu.setText("jLabel4");
        jPanelMenu.add(jLabelFondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 430));

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelInicio.add(jLabelLogoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelLogoUnivalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelInicio.add(jLabelLogoUnivalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabelLogoLESInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelInicio.add(jLabelLogoLESInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        signOff.setBackground(new java.awt.Color(231, 231, 231));
        signOff.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        signOff.setForeground(new java.awt.Color(127, 0, 0));
        signOff.setText("Cerrar Sesión");
        signOff.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        signOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOffActionPerformed(evt);
            }
        });
        jPanelInicio.add(signOff, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 134, 19));

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

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitle.setText("INICIO");
        jPanelInicio.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabelFondoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondoInicio.setText("jLabel4");
        jPanelInicio.add(jLabelFondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelUpdateUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxUpdateUserState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelUpdateUser.add(jComboBoxUpdateUserState, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 110, 30));

        jLabelUnivalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelUpdateUser.add(jLabelUnivalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabelLES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelUpdateUser.add(jLabelLES, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelLogoMVLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelUpdateUser.add(jLabelLogoMVLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelTitleProyecto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitleProyecto.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitleProyecto.setText("PROYECTO");
        jPanelUpdateUser.add(jLabelTitleProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, 30));

        jLabelResp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelResp.setForeground(new java.awt.Color(102, 102, 102));
        jLabelResp.setText("RESPUESTA");
        jPanelUpdateUser.add(jLabelResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 30));

        jLabelPregunt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPregunt.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPregunt.setText("PREGUNTA");
        jPanelUpdateUser.add(jLabelPregunt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        jLabelIdentificacion1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelIdentificacion1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelIdentificacion1.setText("IDENTIFICACION");
        jPanelUpdateUser.add(jLabelIdentificacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabelTitleUpUser.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabelTitleUpUser.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitleUpUser.setText("ACTUALIZAR USUARIO");
        jPanelUpdateUser.add(jLabelTitleUpUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jComboBoxUpdateIdUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelUpdateUser.add(jComboBoxUpdateIdUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 110, 30));

        jComboBoxUpdateUserProject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelUpdateUser.add(jComboBoxUpdateUserProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 130, 30));

        jLabelEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEmail.setText("E-MAIL");
        jPanelUpdateUser.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 30));

        jLabelCargo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCargo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCargo.setText("CARGO");
        jPanelUpdateUser.add(jLabelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, 30));

        jLabelEstado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEstado.setText("ESTADO");
        jPanelUpdateUser.add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        jTextFieldRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespuestaActionPerformed(evt);
            }
        });
        jPanelUpdateUser.add(jTextFieldRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 340, 30));

        jTextFieldPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPreguntaActionPerformed(evt);
            }
        });
        jPanelUpdateUser.add(jTextFieldPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 340, 30));

        jLabelNombreTitle.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombreTitle.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombreTitle.setText("NOMBRE");
        jPanelUpdateUser.add(jLabelNombreTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 30));

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEmailKeyTyped(evt);
            }
        });
        jPanelUpdateUser.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 340, 30));

        jTextFieldNombreUpUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreUpUserActionPerformed(evt);
            }
        });
        jTextFieldNombreUpUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreUpUserKeyTyped(evt);
            }
        });
        jPanelUpdateUser.add(jTextFieldNombreUpUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 340, 30));

        jComboBoxUpdateUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelUpdateUser.add(jComboBoxUpdateUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 130, 30));

        jButtonSaveUpUser.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSaveUpUser.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSaveUpUser.setText("Guardar");
        jButtonSaveUpUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveUpUserActionPerformed(evt);
            }
        });
        jPanelUpdateUser.add(jButtonSaveUpUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 100, 30));

        jButtonEmpty.setBackground(new java.awt.Color(102, 0, 0));
        jButtonEmpty.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEmpty.setText("Vaciar");
        jButtonEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmptyActionPerformed(evt);
            }
        });
        jPanelUpdateUser.add(jButtonEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 90, 30));

        jButtonBackUpUser.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBackUpUser.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBackUpUser.setText("Volver");
        jButtonBackUpUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackUpUserActionPerformed(evt);
            }
        });
        jPanelUpdateUser.add(jButtonBackUpUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 90, 30));

        jLabelFondoUpUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondoUpUser.setText("jLabel4");
        jPanelUpdateUser.add(jLabelFondoUpUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelUpdateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelCreateEquipment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoUnivalleCreateEquipment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelCreateEquipment.add(jLabelLogoUnivalleCreateEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabelLogoLESCreateEquipment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelCreateEquipment.add(jLabelLogoLESCreateEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabeLogolLabCreateEquipment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelCreateEquipment.add(jLabeLogolLabCreateEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

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

        jLabelTitleCreateEquipment.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitleCreateEquipment.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitleCreateEquipment.setText("CREAR EQUIPO");
        jPanelCreateEquipment.add(jLabelTitleCreateEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jTextFieldSerialCrearEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSerialCrearEquipoActionPerformed(evt);
            }
        });
        jTextFieldSerialCrearEquipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSerialCrearEquipoKeyTyped(evt);
            }
        });
        jPanelCreateEquipment.add(jTextFieldSerialCrearEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 210, 30));

        jTextFieldNombreCrearEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreCrearEquipoActionPerformed(evt);
            }
        });
        jTextFieldNombreCrearEquipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreCrearEquipoKeyTyped(evt);
            }
        });
        jPanelCreateEquipment.add(jTextFieldNombreCrearEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 210, 30));

        jButtonSaveCreateEquipment.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSaveCreateEquipment.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSaveCreateEquipment.setText("Guardar");
        jButtonSaveCreateEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveCreateEquipmentActionPerformed(evt);
            }
        });
        jPanelCreateEquipment.add(jButtonSaveCreateEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 100, 30));

        jButtonEmptyCreateEquipment.setBackground(new java.awt.Color(102, 0, 0));
        jButtonEmptyCreateEquipment.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEmptyCreateEquipment.setText("Vaciar");
        jButtonEmptyCreateEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmptyCreateEquipmentActionPerformed(evt);
            }
        });
        jPanelCreateEquipment.add(jButtonEmptyCreateEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 110, 30));

        jButtonBackCreateEquipment.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBackCreateEquipment.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBackCreateEquipment.setText("Volver");
        jButtonBackCreateEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackCreateEquipmentActionPerformed(evt);
            }
        });
        jPanelCreateEquipment.add(jButtonBackCreateEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 100, 30));

        jTextAreaCrearEquipo.setColumns(20);
        jTextAreaCrearEquipo.setRows(5);
        jScrollPaneCreateEquipment.setViewportView(jTextAreaCrearEquipo);

        jPanelCreateEquipment.add(jScrollPaneCreateEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 310, 60));

        jButtonEquipmentCSV.setBackground(new java.awt.Color(102, 0, 0));
        jButtonEquipmentCSV.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jButtonEquipmentCSV.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEquipmentCSV.setText("Cargar CSV");
        jButtonEquipmentCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEquipmentCSVActionPerformed(evt);
            }
        });
        jPanelCreateEquipment.add(jButtonEquipmentCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 110, 30));

        jLabelFondoCreateEquipment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondoCreateEquipment.setText("jLabel4");
        jPanelCreateEquipment.add(jLabelFondoCreateEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelCreateEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelCreateUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoUnivalleCreateUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelCreateUser.add(jLabelLogoUnivalleCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabelLogoLESCreateUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelCreateUser.add(jLabelLogoLESCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jTextFieldQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuestionActionPerformed(evt);
            }
        });
        jPanelCreateUser.add(jTextFieldQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 410, 30));

        jLabelLogoLabCreateUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelCreateUser.add(jLabelLogoLabCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelProyecto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelProyecto.setForeground(new java.awt.Color(102, 102, 102));
        jLabelProyecto.setText("PROYECTO");
        jPanelCreateUser.add(jLabelProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, 30));

        jLabelIdentificacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelIdentificacion.setForeground(new java.awt.Color(102, 102, 102));
        jLabelIdentificacion.setText("IDENTIFICACION");
        jPanelCreateUser.add(jLabelIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabelTitleCreateUser.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabelTitleCreateUser.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitleCreateUser.setText("CREAR USUARIO");
        jPanelCreateUser.add(jLabelTitleCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jTextFieldIdentificacionCrearUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIdentificacionCrearUsuarioKeyTyped(evt);
            }
        });
        jPanelCreateUser.add(jTextFieldIdentificacionCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 200, 30));

        jPanelCreateUser.add(jComboBoxCreateUserProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 120, 30));

        jLabelAnswer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelAnswer.setForeground(new java.awt.Color(102, 102, 102));
        jLabelAnswer.setText("RESPUESTA");
        jPanelCreateUser.add(jLabelAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 30));

        jTextFieldAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnswerActionPerformed(evt);
            }
        });
        jPanelCreateUser.add(jTextFieldAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 410, 30));

        jLabelQuestion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelQuestion.setForeground(new java.awt.Color(102, 102, 102));
        jLabelQuestion.setText("PREGUNTA");
        jPanelCreateUser.add(jLabelQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 30));

        jLabelEmailCreateUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEmailCreateUser.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEmailCreateUser.setText("E-MAIL");
        jPanelCreateUser.add(jLabelEmailCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 30));

        jLabelPositionCreateUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPositionCreateUser.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPositionCreateUser.setText("CARGO");
        jPanelCreateUser.add(jLabelPositionCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, 30));

        jLabelNombreCreateUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombreCreateUser.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombreCreateUser.setText("NOMBRE");
        jPanelCreateUser.add(jLabelNombreCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 30));
        jPanelCreateUser.add(jTextFieldEmailCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 410, 30));

        jTextFieldNombreCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreCrearUsuarioActionPerformed(evt);
            }
        });
        jTextFieldNombreCrearUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreCrearUsuarioKeyTyped(evt);
            }
        });
        jPanelCreateUser.add(jTextFieldNombreCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 200, 30));

        jPanelCreateUser.add(jComboBoxCreateUserPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 120, 30));

        jButtonUserCSV.setBackground(new java.awt.Color(102, 0, 0));
        jButtonUserCSV.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jButtonUserCSV.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUserCSV.setText("Cargar CSV");
        jButtonUserCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUserCSVActionPerformed(evt);
            }
        });
        jPanelCreateUser.add(jButtonUserCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 110, 30));

        jButtonBackCreateUser.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBackCreateUser.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBackCreateUser.setText("Volver");
        jButtonBackCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackCreateUserActionPerformed(evt);
            }
        });
        jPanelCreateUser.add(jButtonBackCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 90, 30));

        jButtonEmptyCreateUser.setBackground(new java.awt.Color(102, 0, 0));
        jButtonEmptyCreateUser.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEmptyCreateUser.setText("Vaciar");
        jButtonEmptyCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmptyCreateUserActionPerformed(evt);
            }
        });
        jPanelCreateUser.add(jButtonEmptyCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 90, 30));

        jButtonSaveCreateUser.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSaveCreateUser.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSaveCreateUser.setText("Guardar");
        jButtonSaveCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveCreateUserActionPerformed(evt);
            }
        });
        jPanelCreateUser.add(jButtonSaveCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 100, 30));

        jLabelFondoCreateUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondoCreateUser.setText("jLabel4");
        jPanelCreateUser.add(jLabelFondoCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelUpdateEquipment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoUnivalleUpEquipment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelUpdateEquipment.add(jLabelLogoUnivalleUpEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabelLogoLESUpEquipment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelUpdateEquipment.add(jLabelLogoLESUpEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelLogoLabUpEquipment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelUpdateEquipment.add(jLabelLogoLabUpEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelDescripcionUpEquipment.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDescripcionUpEquipment.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDescripcionUpEquipment.setText("DESCRIPCION");
        jPanelUpdateEquipment.add(jLabelDescripcionUpEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, 30));

        jLabelNombreUpEquipment.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombreUpEquipment.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombreUpEquipment.setText("NOMBRE");
        jPanelUpdateEquipment.add(jLabelNombreUpEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, 30));

        jLabelStateUpEquipment.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelStateUpEquipment.setForeground(new java.awt.Color(102, 102, 102));
        jLabelStateUpEquipment.setText("ESTADO");
        jPanelUpdateEquipment.add(jLabelStateUpEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabelTitleUpEquipment.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitleUpEquipment.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitleUpEquipment.setText("ACTUALIZAR EQUIPO");
        jPanelUpdateEquipment.add(jLabelTitleUpEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

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

        jTextFieldNombreUpEquipment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreUpEquipmentKeyTyped(evt);
            }
        });
        jPanelUpdateEquipment.add(jTextFieldNombreUpEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 200, 30));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPaneUpEquipment.setViewportView(jTextArea4);

        jPanelUpdateEquipment.add(jScrollPaneUpEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 300, 60));

        jComboBoxUpdateEquipmentState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelUpdateEquipment.add(jComboBoxUpdateEquipmentState, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 200, 30));

        jComboBoxUpdateEquipmentSerial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelUpdateEquipment.add(jComboBoxUpdateEquipmentSerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 200, 30));

        jLabelSerialUpEquipment.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelSerialUpEquipment.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSerialUpEquipment.setText("SERIAL");
        jPanelUpdateEquipment.add(jLabelSerialUpEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabelFondoUpEquipment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondoUpEquipment.setText("jLabel4");
        jPanelUpdateEquipment.add(jLabelFondoUpEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelUpdateEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelUpdateProject.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoUnivalleUpdateProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelUpdateProject.add(jLabelLogoUnivalleUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabelLogoLESUpdateProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelUpdateProject.add(jLabelLogoLESUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelLogoLabUpdateProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelUpdateProject.add(jLabelLogoLabUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelDescripcionUpdateProject.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDescripcionUpdateProject.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDescripcionUpdateProject.setText("DESCRIPCION");
        jPanelUpdateProject.add(jLabelDescripcionUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, 30));

        jLabelStateUpdateProject.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelStateUpdateProject.setForeground(new java.awt.Color(102, 102, 102));
        jLabelStateUpdateProject.setText("ESTADO");
        jPanelUpdateProject.add(jLabelStateUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, 30));

        jLabelNombreUpdateProject.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombreUpdateProject.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombreUpdateProject.setText("NOMBRE");
        jPanelUpdateProject.add(jLabelNombreUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, 30));

        jLabelCodigoUpdateProject.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCodigoUpdateProject.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCodigoUpdateProject.setText("CODIGO");
        jPanelUpdateProject.add(jLabelCodigoUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabelTitleUpdateProject.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitleUpdateProject.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitleUpdateProject.setText("ACTUALIZAR PROYECTO");
        jPanelUpdateProject.add(jLabelTitleUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jTextFieldNombreUpdateProject.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreUpdateProjectKeyTyped(evt);
            }
        });
        jPanelUpdateProject.add(jTextFieldNombreUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 190, 30));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPaneUpdateProject.setViewportView(jTextArea3);

        jPanelUpdateProject.add(jScrollPaneUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 270, 60));

        jPanelUpdateProject.add(jComboBoxUpdateProjectId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 190, 30));

        jComboBoxUpdateProjectState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelUpdateProject.add(jComboBoxUpdateProjectState, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 170, 30));

        jButtonSaveUpdateProject.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSaveUpdateProject.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSaveUpdateProject.setText("Guardar");
        jButtonSaveUpdateProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveUpdateProjectActionPerformed(evt);
            }
        });
        jPanelUpdateProject.add(jButtonSaveUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 100, 30));

        jButtonEmptyUpdateProject.setBackground(new java.awt.Color(102, 0, 0));
        jButtonEmptyUpdateProject.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEmptyUpdateProject.setText("Vaciar");
        jButtonEmptyUpdateProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmptyUpdateProjectActionPerformed(evt);
            }
        });
        jPanelUpdateProject.add(jButtonEmptyUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 90, 30));

        jButtonBackUpdateProject.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBackUpdateProject.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBackUpdateProject.setText("Volver");
        jButtonBackUpdateProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackUpdateProjectActionPerformed(evt);
            }
        });
        jPanelUpdateProject.add(jButtonBackUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 90, 30));

        jLabelFondoUpdateProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondoUpdateProject.setText("jLabel4");
        jPanelUpdateProject.add(jLabelFondoUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelCreateProject.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoUnivalleCreateProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelCreateProject.add(jLabelLogoUnivalleCreateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabelLESCreateProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelCreateProject.add(jLabelLESCreateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelLogoLabCreateProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelCreateProject.add(jLabelLogoLabCreateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelTitleDescripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitleDescripcion.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitleDescripcion.setText("DESCRIPCION");
        jPanelCreateProject.add(jLabelTitleDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, 30));

        jLabelTitleNombreCreateProject.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitleNombreCreateProject.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitleNombreCreateProject.setText("NOMBRE");
        jPanelCreateProject.add(jLabelTitleNombreCreateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, 30));

        jLabelTitleCodigoCreateProject.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitleCodigoCreateProject.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitleCodigoCreateProject.setText("CODIGO");
        jPanelCreateProject.add(jLabelTitleCodigoCreateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabelTitleCreateProject.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitleCreateProject.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitleCreateProject.setText("CREAR PROYECTO");
        jPanelCreateProject.add(jLabelTitleCreateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jButtonSaveCreateProject.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSaveCreateProject.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSaveCreateProject.setText("Guardar");
        jButtonSaveCreateProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveCreateProjectActionPerformed(evt);
            }
        });
        jPanelCreateProject.add(jButtonSaveCreateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 100, 30));

        jButtonEmptyCreateProject.setBackground(new java.awt.Color(102, 0, 0));
        jButtonEmptyCreateProject.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEmptyCreateProject.setText("Vaciar");
        jButtonEmptyCreateProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmptyCreateProjectActionPerformed(evt);
            }
        });
        jPanelCreateProject.add(jButtonEmptyCreateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 110, 30));

        jButtonBackCreateProject.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBackCreateProject.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBackCreateProject.setText("Volver");
        jButtonBackCreateProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackCreateProjectActionPerformed(evt);
            }
        });
        jPanelCreateProject.add(jButtonBackCreateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 90, 30));

        jTextFieldCodigoCrearProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoCrearProyectoActionPerformed(evt);
            }
        });
        jTextFieldCodigoCrearProyecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoCrearProyectoKeyTyped(evt);
            }
        });
        jPanelCreateProject.add(jTextFieldCodigoCrearProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 210, 30));

        jTextFieldNombreCrearProyecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreCrearProyectoKeyTyped(evt);
            }
        });
        jPanelCreateProject.add(jTextFieldNombreCrearProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 210, 30));

        jTextAreaCrearProyecto.setColumns(20);
        jTextAreaCrearProyecto.setRows(5);
        jScrollPaneDescriptionCreateProject.setViewportView(jTextAreaCrearProyecto);

        jPanelCreateProject.add(jScrollPaneDescriptionCreateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 310, 60));

        jButtonProjectCSV.setBackground(new java.awt.Color(102, 0, 0));
        jButtonProjectCSV.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jButtonProjectCSV.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProjectCSV.setText("Cargar CSV");
        jButtonProjectCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProjectCSVActionPerformed(evt);
            }
        });
        jPanelCreateProject.add(jButtonProjectCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 110, 30));

        jLabelFondoCreateProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondoCreateProject.setText("jLabel4");
        jPanelCreateProject.add(jLabelFondoCreateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelCreateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelContactUs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoLabContactUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelContactUs.add(jLabelLogoLabContactUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelLogoUnivalleContactUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelContactUs.add(jLabelLogoUnivalleContactUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabelLogoLESContactUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelContactUs.add(jLabelLogoLESContactUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jButtonEditContact.setBackground(new java.awt.Color(102, 0, 0));
        jButtonEditContact.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditContact.setText("Editar");
        jButtonEditContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditContactActionPerformed(evt);
            }
        });
        jPanelContactUs.add(jButtonEditContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 100, 30));

        jButtonSaveEditContact.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSaveEditContact.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSaveEditContact.setText("Guardar");
        jButtonSaveEditContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveEditContactActionPerformed(evt);
            }
        });
        jPanelContactUs.add(jButtonSaveEditContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 100, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("COORDINADOR\nP.H.D Maria Patricia Trujillo Uribe\nE-mail: maria.trujillo@correounivalle.edu.co\n\nCONTACTO\nTelefonos: (57) (2) 321 21 00 ext. 2791, Fax. 339 20 86\nE-mail: laboratorio.multimediayvision@correounivalle.edu.co");
        jScrollPane1.setViewportView(jTextArea1);

        jPanelContactUs.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 490, 220));

        jLabelFondoContactUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondoContactUs.setText("jLabel4");
        jPanelContactUs.add(jLabelFondoContactUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelContactUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelReserve.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoUnivalleReserve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelReserve.add(jLabelLogoUnivalleReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabelLogoLESReserve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelReserve.add(jLabelLogoLESReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelLogoLabReserve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelReserve.add(jLabelLogoLabReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelInicio.setForeground(new java.awt.Color(102, 102, 102));
        jLabelInicio.setText("FECHA INICIO");
        jPanelReserve.add(jLabelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, 30));

        jLabelSerialReserve.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelSerialReserve.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSerialReserve.setText("SERIAL EQUIPO");
        jPanelReserve.add(jLabelSerialReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jLabelTitleReserve.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitleReserve.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitleReserve.setText("RESERVAR EQUIPO");
        jPanelReserve.add(jLabelTitleReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jComboBoxEquipmentSerialReserve.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelReserve.add(jComboBoxEquipmentSerialReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 180, 30));

        jSpinnerAño.setModel(new javax.swing.SpinnerNumberModel(2017, 2017, 2018, 1));
        jPanelReserve.add(jSpinnerAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 80, -1));

        jSpinnerMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jPanelReserve.add(jSpinnerMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        jSpinnerDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jPanelReserve.add(jSpinnerDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        jLabelYear.setText("AA");
        jPanelReserve.add(jLabelYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 30, -1));

        jLabelMonth.setText("MM");
        jPanelReserve.add(jLabelMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        jLabelDay.setText("DD");
        jPanelReserve.add(jLabelDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        jButtonSaveReserve.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSaveReserve.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSaveReserve.setText("Guardar");
        jButtonSaveReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveReserveActionPerformed(evt);
            }
        });
        jPanelReserve.add(jButtonSaveReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 100, 30));

        jButtonList.setBackground(new java.awt.Color(102, 0, 0));
        jButtonList.setForeground(new java.awt.Color(255, 255, 255));
        jButtonList.setText("Listar Reservas");
        jButtonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListActionPerformed(evt);
            }
        });
        jPanelReserve.add(jButtonList, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 150, 30));

        jButtonBackReserve.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBackReserve.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBackReserve.setText("Volver");
        jButtonBackReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackReserveActionPerformed(evt);
            }
        });
        jPanelReserve.add(jButtonBackReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 100, 30));

        jLabelFondoReserve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondoReserve.setText("jLabel4");
        jPanelReserve.add(jLabelFondoReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelLoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoUnivalleLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelLoan.add(jLabelLogoUnivalleLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabelLogoLESLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelLoan.add(jLabelLogoLESLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelLogoLabLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelLoan.add(jLabelLogoLabLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelSerial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelSerial.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSerial.setText("SERIAL EQUIPO");
        jPanelLoan.add(jLabelSerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabeTitleLoan.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabeTitleLoan.setForeground(new java.awt.Color(102, 102, 102));
        jLabeTitleLoan.setText("PRESTAMO");
        jPanelLoan.add(jLabeTitleLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jComboBoxEquipmentSerialLoan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelLoan.add(jComboBoxEquipmentSerialLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 180, 30));

        jButtonSaveLoan.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSaveLoan.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSaveLoan.setText("Guardar");
        jButtonSaveLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveLoanActionPerformed(evt);
            }
        });
        jPanelLoan.add(jButtonSaveLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 120, 30));

        jButtonListarPrestamos.setBackground(new java.awt.Color(102, 0, 0));
        jButtonListarPrestamos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListarPrestamos.setText("Listar Prestamos");
        jButtonListarPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarPrestamosActionPerformed(evt);
            }
        });
        jPanelLoan.add(jButtonListarPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 160, 30));

        jButtonMultDelete.setBackground(new java.awt.Color(102, 0, 0));
        jButtonMultDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMultDelete.setText("Eliminar Multa");
        jButtonMultDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultDeleteActionPerformed(evt);
            }
        });
        jPanelLoan.add(jButtonMultDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 160, 30));

        jButtonReserve.setBackground(new java.awt.Color(102, 0, 0));
        jButtonReserve.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReserve.setText("Reservar");
        jButtonReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReserveActionPerformed(evt);
            }
        });
        jPanelLoan.add(jButtonReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 120, 30));

        jButtonRenovate.setBackground(new java.awt.Color(102, 0, 0));
        jButtonRenovate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRenovate.setText("Renovar");
        jButtonRenovate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRenovateActionPerformed(evt);
            }
        });
        jPanelLoan.add(jButtonRenovate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 120, 30));

        jButtonEntregar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonEntregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntregar.setText("Entregar");
        jButtonEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntregarActionPerformed(evt);
            }
        });
        jPanelLoan.add(jButtonEntregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 120, 30));

        jLabelFondoLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondoLoan.setText("jLabel4");
        jPanelLoan.add(jLabelFondoLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelCRUDEquipment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoUnivalleEquipment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelCRUDEquipment.add(jLabelLogoUnivalleEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabelLogoLESEquipment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelCRUDEquipment.add(jLabelLogoLESEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelLogoLabEquipment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelCRUDEquipment.add(jLabelLogoLabEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jButtonCreateEquipment.setBackground(new java.awt.Color(102, 0, 0));
        jButtonCreateEquipment.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCreateEquipment.setText("CREAR");
        jButtonCreateEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateEquipmentActionPerformed(evt);
            }
        });
        jPanelCRUDEquipment.add(jButtonCreateEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 120, 40));

        jButtonListEquipment.setBackground(new java.awt.Color(102, 0, 0));
        jButtonListEquipment.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListEquipment.setText("LISTAR");
        jButtonListEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListEquipmentActionPerformed(evt);
            }
        });
        jPanelCRUDEquipment.add(jButtonListEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 120, 40));

        jButtonConsultEquipment.setBackground(new java.awt.Color(102, 0, 0));
        jButtonConsultEquipment.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultEquipment.setText("CONSULTAR");
        jButtonConsultEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultEquipmentActionPerformed(evt);
            }
        });
        jPanelCRUDEquipment.add(jButtonConsultEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 120, 40));

        jButtonUpdateEquipment.setBackground(new java.awt.Color(102, 0, 0));
        jButtonUpdateEquipment.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdateEquipment.setText("ACTUALIZAR");
        jButtonUpdateEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateEquipmentActionPerformed(evt);
            }
        });
        jPanelCRUDEquipment.add(jButtonUpdateEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 120, 40));

        jLabelTitleEquipment.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitleEquipment.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitleEquipment.setText("EQUIPOS");
        jPanelCRUDEquipment.add(jLabelTitleEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jLabelEquipment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelEquipment.setText("jLabel4");
        jPanelCRUDEquipment.add(jLabelEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelCRUDEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelCRUDUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoUnivalleUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelCRUDUsers.add(jLabelLogoUnivalleUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabelLogoLESUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelCRUDUsers.add(jLabelLogoLESUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelLogoLabUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelCRUDUsers.add(jLabelLogoLabUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jButtonConsultUser.setBackground(new java.awt.Color(102, 0, 0));
        jButtonConsultUser.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultUser.setText("CONSULTAR");
        jButtonConsultUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultUserActionPerformed(evt);
            }
        });
        jPanelCRUDUsers.add(jButtonConsultUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 120, 40));

        jButtonCreateUser.setBackground(new java.awt.Color(102, 0, 0));
        jButtonCreateUser.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCreateUser.setText("CREAR");
        jButtonCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateUserActionPerformed(evt);
            }
        });
        jPanelCRUDUsers.add(jButtonCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 120, 40));

        jButtonListUser.setBackground(new java.awt.Color(102, 0, 0));
        jButtonListUser.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListUser.setText("LISTAR");
        jButtonListUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListUserActionPerformed(evt);
            }
        });
        jPanelCRUDUsers.add(jButtonListUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 120, 40));

        jButtonUpdateUser.setBackground(new java.awt.Color(102, 0, 0));
        jButtonUpdateUser.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdateUser.setText("ACTUALIZAR");
        jButtonUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateUserActionPerformed(evt);
            }
        });
        jPanelCRUDUsers.add(jButtonUpdateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 120, 40));

        jLabelUsuarios.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuarios.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuarios.setText("USUARIOS");
        jPanelCRUDUsers.add(jLabelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jLabelFondoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondoUser.setText("jLabel4");
        jPanelCRUDUsers.add(jLabelFondoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelCRUDUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, 430));

        jPanelCRUDProjects.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoUnivalleProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelCRUDProjects.add(jLabelLogoUnivalleProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabelLogoLESProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelCRUDProjects.add(jLabelLogoLESProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelLogoLabProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelCRUDProjects.add(jLabelLogoLabProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jButtonCreateProject.setBackground(new java.awt.Color(102, 0, 0));
        jButtonCreateProject.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCreateProject.setText("CREAR");
        jButtonCreateProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateProjectActionPerformed(evt);
            }
        });
        jPanelCRUDProjects.add(jButtonCreateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 120, 40));

        jButtonListProject.setBackground(new java.awt.Color(102, 0, 0));
        jButtonListProject.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListProject.setText("LISTAR");
        jButtonListProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListProjectActionPerformed(evt);
            }
        });
        jPanelCRUDProjects.add(jButtonListProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 120, 40));

        jButtonConsultProject.setBackground(new java.awt.Color(102, 0, 0));
        jButtonConsultProject.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultProject.setText("CONSULTAR");
        jButtonConsultProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultProjectActionPerformed(evt);
            }
        });
        jPanelCRUDProjects.add(jButtonConsultProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 120, 40));

        jButtonUpdateProject.setBackground(new java.awt.Color(102, 0, 0));
        jButtonUpdateProject.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdateProject.setText("ACTUALIZAR");
        jButtonUpdateProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateProjectActionPerformed(evt);
            }
        });
        jPanelCRUDProjects.add(jButtonUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 120, 40));

        jLabelTitleProject.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitleProject.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitleProject.setText("PROYECTOS");
        jPanelCRUDProjects.add(jLabelTitleProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jLabelFondoProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondoProject.setText("jLabel4");
        jPanelCRUDProjects.add(jLabelFondoProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

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

        jPanelReserveList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelReserveList.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelReserveList.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelReserveList.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelUsuarios12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuarios12.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuarios12.setText("LISTA RESERVAS");
        jPanelReserveList.add(jLabelUsuarios12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, 30));

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Equipo", "FechaInicio", "FechaEntrega", "Estado"
            }
        ));
        jScrollPane14.setViewportView(jTable10);

        jPanelReserveList.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 480, 200));

        jButtonBack16.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack16.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack16.setText("Volver");
        jButtonBack16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack16ActionPerformed(evt);
            }
        });
        jPanelReserveList.add(jButtonBack16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 90, 30));

        jLabelFondo25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo25.setText("jLabel4");
        jPanelReserveList.add(jLabelFondo25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelReserveList, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelReportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelReportes.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelReportes.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelReportes.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jButtonReportPrestxProject.setBackground(new java.awt.Color(102, 0, 0));
        jButtonReportPrestxProject.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
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
        jPanelReportes.add(jButtonMultasXMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 220, 40));

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
        jPanelReportes.add(jButtonReportMultxMiembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 220, 40));

        jButtonReportPresxMiembros.setBackground(new java.awt.Color(102, 0, 0));
        jButtonReportPresxMiembros.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButtonReportPresxMiembros.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReportPresxMiembros.setText("PRESTAMOS POR MIEMBRO");
        jButtonReportPresxMiembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportPresxMiembrosActionPerformed(evt);
            }
        });
        jPanelReportes.add(jButtonReportPresxMiembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 210, 40));

        jLabelUsuarios8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuarios8.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuarios8.setText("REPORTES");
        jPanelReportes.add(jLabelUsuarios8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setEnabled(false);
        jTable5.setFocusable(false);
        jTable5.setRequestFocusEnabled(false);
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

        jButtonExportMultMonth1.setBackground(new java.awt.Color(102, 0, 0));
        jButtonExportMultMonth1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExportMultMonth1.setText("Exportar PDF");
        jButtonExportMultMonth1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportMultMonth1ActionPerformed(evt);
            }
        });
        jPanelLoanXProjectList.add(jButtonExportMultMonth1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 130, 30));

        jButtonBack21.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack21.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack21.setText("Graficar");
        jButtonBack21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack21ActionPerformed(evt);
            }
        });
        jPanelLoanXProjectList.add(jButtonBack21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 90, 30));

        jLabelFondo19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo19.setText("jLabel4");
        jPanelLoanXProjectList.add(jLabelFondo19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 560, 430));

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setEnabled(false);
        jTable6.setFocusable(false);
        jTable6.setRequestFocusEnabled(false);
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
        jPanelLoanXMonthList.add(jButtonBack12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 90, 30));

        jButtonExportMultMonth2.setBackground(new java.awt.Color(102, 0, 0));
        jButtonExportMultMonth2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExportMultMonth2.setText("Exportar PDF");
        jButtonExportMultMonth2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportMultMonth2ActionPerformed(evt);
            }
        });
        jPanelLoanXMonthList.add(jButtonExportMultMonth2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 130, 30));

        jButtonBack22.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack22.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack22.setText("Graficar");
        jButtonBack22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack22ActionPerformed(evt);
            }
        });
        jPanelLoanXMonthList.add(jButtonBack22, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 90, 30));

        jLabelFondo20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo20.setText("jLabel4");
        jPanelLoanXMonthList.add(jLabelFondo20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

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
        jPanelLoanXMembersList.add(jLabelUsuarios11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Miembro", "Cantidad_prestamos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.setEnabled(false);
        jTable7.setFocusable(false);
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
        jPanelLoanXMembersList.add(jButtonBack13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 90, 30));

        jButtonExportMultMonth3.setBackground(new java.awt.Color(102, 0, 0));
        jButtonExportMultMonth3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExportMultMonth3.setText("Exportar PDF");
        jButtonExportMultMonth3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportMultMonth3ActionPerformed(evt);
            }
        });
        jPanelLoanXMembersList.add(jButtonExportMultMonth3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 130, 30));

        jButtonBack23.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack23.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack23.setText("Graficar");
        jButtonBack23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack23ActionPerformed(evt);
            }
        });
        jPanelLoanXMembersList.add(jButtonBack23, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 90, 30));

        jLabelFondo21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo21.setText("jLabel4");
        jPanelLoanXMembersList.add(jLabelFondo21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 560, 430));

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable8.setEnabled(false);
        jTable8.setFocusable(false);
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
        jPanelMultXMembersList.add(jButtonBack14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 90, 30));

        TotalMultasXMiembro.setEditable(false);
        TotalMultasXMiembro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TotalMultasXMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalMultasXMiembroActionPerformed(evt);
            }
        });
        jPanelMultXMembersList.add(TotalMultasXMiembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 160, 30));

        jButtonExportMultMonth4.setBackground(new java.awt.Color(102, 0, 0));
        jButtonExportMultMonth4.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExportMultMonth4.setText("Exportar PDF");
        jButtonExportMultMonth4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportMultMonth4ActionPerformed(evt);
            }
        });
        jPanelMultXMembersList.add(jButtonExportMultMonth4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 130, 30));

        jButtonBack24.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack24.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack24.setText("Graficar");
        jButtonBack24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack24ActionPerformed(evt);
            }
        });
        jPanelMultXMembersList.add(jButtonBack24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 90, 30));

        jLabelFondo22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo22.setText("jLabel4");
        jPanelMultXMembersList.add(jLabelFondo22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -20, 590, 430));

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

        jButtonExportMultMonth.setBackground(new java.awt.Color(102, 0, 0));
        jButtonExportMultMonth.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExportMultMonth.setText("Exportar PDF");
        jButtonExportMultMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportMultMonthActionPerformed(evt);
            }
        });
        jPanelMultXMonthList.add(jButtonExportMultMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 130, 30));

        jButtonBack15.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack15.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack15.setText("Volver");
        jButtonBack15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack15ActionPerformed(evt);
            }
        });
        jPanelMultXMonthList.add(jButtonBack15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 90, 30));

        TotalMultasXmes.setEditable(false);
        TotalMultasXmes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelMultXMonthList.add(TotalMultasXmes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 160, 30));

        jButtonBack25.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack25.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack25.setText("Graficar");
        jButtonBack25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack25ActionPerformed(evt);
            }
        });
        jPanelMultXMonthList.add(jButtonBack25, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 90, 30));

        jLabelFondo23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo23.setText("jLabel4");
        jPanelMultXMonthList.add(jLabelFondo23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 560, 430));

        getContentPane().add(jPanelMultXMonthList, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelMyProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelMyProfile.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelMyProfile.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelMyProfile.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabelSetName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelSetName.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSetName.setText("NOMBRE");
        jPanelMyProfile.add(jLabelSetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabelName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(102, 102, 102));
        jLabelName.setText("NOMBRE");
        jPanelMyProfile.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabelPerfil.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelPerfil.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPerfil.setText("PERFIL");
        jPanelMyProfile.add(jLabelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabelPassActual1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPassActual1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPassActual1.setText("ACTUAL");
        jPanelMyProfile.add(jLabelPassActual1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabelPassActual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPassActual.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPassActual.setText("CONTRASEÑA");
        jPanelMyProfile.add(jLabelPassActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabelPassNew.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPassNew.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPassNew.setText("NUEVA");
        jPanelMyProfile.add(jLabelPassNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabelPassNew2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPassNew2.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPassNew2.setText("CONTRASEÑA");
        jPanelMyProfile.add(jLabelPassNew2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabelEmailLb.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEmailLb.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEmailLb.setText("EMAIL");
        jPanelMyProfile.add(jLabelEmailLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabelPassNew1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPassNew1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPassNew1.setText("CONTRASEÑA");
        jPanelMyProfile.add(jLabelPassNew1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabelPassNew3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPassNew3.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPassNew3.setText("CONFIRMAR");
        jPanelMyProfile.add(jLabelPassNew3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jButtonCheckPass.setBackground(new java.awt.Color(102, 0, 0));
        jButtonCheckPass.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCheckPass.setText("...");
        jButtonCheckPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckPassActionPerformed(evt);
            }
        });
        jPanelMyProfile.add(jButtonCheckPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 30, 30));
        jPanelMyProfile.add(jTextFieldPassActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 180, 30));
        jPanelMyProfile.add(jTextFieldSetEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 210, 30));

        jLabelPhoto.setText("Foto");
        jPanelMyProfile.add(jLabelPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 140, 140));

        jButtonSaveProfile.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSaveProfile.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSaveProfile.setText("Guardar");
        jButtonSaveProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveProfileActionPerformed(evt);
            }
        });
        jPanelMyProfile.add(jButtonSaveProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 100, 30));

        jButtonLoadPhoto.setBackground(new java.awt.Color(102, 0, 0));
        jButtonLoadPhoto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLoadPhoto.setText("Cargar Foto");
        jButtonLoadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadPhotoActionPerformed(evt);
            }
        });
        jPanelMyProfile.add(jButtonLoadPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 130, 30));
        jPanelMyProfile.add(jPasswordNew1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 210, 30));
        jPanelMyProfile.add(jPasswordNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 210, 30));

        jLabelFondo24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo24.setText("jLabel4");
        jPanelMyProfile.add(jLabelFondo24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelMyProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelViewEquipment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelViewEquipment.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelViewEquipment.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelViewEquipment.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelDescriptionEquip.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDescriptionEquip.setText("NULL");
        jPanelViewEquipment.add(jLabelDescriptionEquip, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 310, 60));

        jLabelEquipState.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEquipState.setText("NULL");
        jPanelViewEquipment.add(jLabelEquipState, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 190, 30));

        jLabelEquipName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEquipName.setText("NULL");
        jPanelViewEquipment.add(jLabelEquipName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 190, 30));

        jLabelDescripcion4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDescripcion4.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDescripcion4.setText("DESCRIPCION");
        jPanelViewEquipment.add(jLabelDescripcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, 30));

        jLabelNombre7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre7.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombre7.setText("NOMBRE");
        jPanelViewEquipment.add(jLabelNombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, 30));

        jLabelCodigo5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCodigo5.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCodigo5.setText("ESTADO");
        jPanelViewEquipment.add(jLabelCodigo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabelSolicitud8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelSolicitud8.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSolicitud8.setText("CONSULTAR EQUIPO");
        jPanelViewEquipment.add(jLabelSolicitud8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, 30));

        jButtonBack17.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack17.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack17.setText("Volver");
        jButtonBack17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack17ActionPerformed(evt);
            }
        });
        jPanelViewEquipment.add(jButtonBack17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 90, 30));

        jButtonCheckEquip.setBackground(new java.awt.Color(102, 0, 0));
        jButtonCheckEquip.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCheckEquip.setText("...");
        jButtonCheckEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckEquipActionPerformed(evt);
            }
        });
        jPanelViewEquipment.add(jButtonCheckEquip, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 30, 30));

        jComboBoxUpdateEquipmentSerial1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelViewEquipment.add(jComboBoxUpdateEquipmentSerial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 170, 30));

        jLabelCodigo6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCodigo6.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCodigo6.setText("SERIAL");
        jPanelViewEquipment.add(jLabelCodigo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabelFondo26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo26.setText("jLabel4");
        jPanelViewEquipment.add(jLabelFondo26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelViewEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelViewUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelViewUser.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelViewUser.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelViewUser.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelViewUserEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelViewUserEmail.setText("NULL");
        jPanelViewUser.add(jLabelViewUserEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 260, 30));

        jLabelViewUserName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelViewUserName.setText("NULL");
        jPanelViewUser.add(jLabelViewUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 260, 30));

        jLabelViewUserRange.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelViewUserRange.setText("NULL");
        jPanelViewUser.add(jLabelViewUserRange, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 70, 30));

        jLabelViewUserState.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelViewUserState.setText("NULL");
        jPanelViewUser.add(jLabelViewUserState, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 90, 30));

        jLabelViewUserProject.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelViewUserProject.setText("NULL");
        jPanelViewUser.add(jLabelViewUserProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 270, 30));

        jLabelProyecto2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelProyecto2.setForeground(new java.awt.Color(102, 102, 102));
        jLabelProyecto2.setText("PROYECTO");
        jPanelViewUser.add(jLabelProyecto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 30));

        jLabelIdentificacion2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelIdentificacion2.setForeground(new java.awt.Color(102, 102, 102));
        jLabelIdentificacion2.setText("IDENTIFICACION");
        jPanelViewUser.add(jLabelIdentificacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabelSolicitud9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabelSolicitud9.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSolicitud9.setText("CONSULTAR USUARIO");
        jPanelViewUser.add(jLabelSolicitud9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jComboBoxUpdateIdUser1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelViewUser.add(jComboBoxUpdateIdUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 240, 30));

        jLabelTipo4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTipo4.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTipo4.setText("E-MAIL");
        jPanelViewUser.add(jLabelTipo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 30));

        jLabelTipo5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTipo5.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTipo5.setText("CARGO");
        jPanelViewUser.add(jLabelTipo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, 30));

        jLabelEstado1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEstado1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEstado1.setText("ESTADO");
        jPanelViewUser.add(jLabelEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 30));

        jLabelNombre8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre8.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombre8.setText("NOMBRE");
        jPanelViewUser.add(jLabelNombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 30));

        jButtonUserCheck.setBackground(new java.awt.Color(102, 0, 0));
        jButtonUserCheck.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUserCheck.setText("...");
        jButtonUserCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUserCheckActionPerformed(evt);
            }
        });
        jPanelViewUser.add(jButtonUserCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 30, 30));

        jButtonBack18.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack18.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack18.setText("Volver");
        jButtonBack18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack18ActionPerformed(evt);
            }
        });
        jPanelViewUser.add(jButtonBack18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 90, 30));

        jLabelFondo27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo27.setText("jLabel4");
        jPanelViewUser.add(jLabelFondo27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelViewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelViewProject.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelViewProject.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelViewProject.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelViewProject.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelViewProjectName1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelViewProjectName1.setText("NULL");
        jPanelViewProject.add(jLabelViewProjectName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 190, 30));

        jLabelViewProjectDescription.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelViewProjectDescription.setText("NULL");
        jPanelViewProject.add(jLabelViewProjectDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 290, 70));

        jLabelViewProjectName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelViewProjectName.setText("NULL");
        jPanelViewProject.add(jLabelViewProjectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 190, 30));

        jLabelDescripcion5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDescripcion5.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDescripcion5.setText("DESCRIPCION");
        jPanelViewProject.add(jLabelDescripcion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, 30));

        jLabelNombre9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre9.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombre9.setText("ESTADO");
        jPanelViewProject.add(jLabelNombre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, 30));

        jLabelNombre10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre10.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombre10.setText("NOMBRE");
        jPanelViewProject.add(jLabelNombre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, 30));

        jLabelCodigo7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCodigo7.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCodigo7.setText("CODIGO");
        jPanelViewProject.add(jLabelCodigo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabelSolicitud10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelSolicitud10.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSolicitud10.setText("CONSULTAR PROYECTO");
        jPanelViewProject.add(jLabelSolicitud10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jPanelViewProject.add(jComboBoxUpdateProjectId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 160, 30));

        jButtonCheckProject.setBackground(new java.awt.Color(102, 0, 0));
        jButtonCheckProject.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCheckProject.setText("...");
        jButtonCheckProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckProjectActionPerformed(evt);
            }
        });
        jPanelViewProject.add(jButtonCheckProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 30, 30));

        jButtonBack19.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack19.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack19.setText("Volver");
        jButtonBack19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack19ActionPerformed(evt);
            }
        });
        jPanelViewProject.add(jButtonBack19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 90, 30));

        jLabelFondo28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo28.setText("jLabel4");
        jPanelViewProject.add(jLabelFondo28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelViewProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        jPanelDeleteMult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelDeleteMult.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelDeleteMult.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelDeleteMult.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabelMultValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelMultValue.setForeground(new java.awt.Color(102, 102, 102));
        jLabelMultValue.setText("VALOR");
        jPanelDeleteMult.add(jLabelMultValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, 30));

        jLabelValueMultUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelValueMultUser.setText("NULL");
        jPanelDeleteMult.add(jLabelValueMultUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, 30));

        jLabelUserNameMult.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelUserNameMult.setText("NULL");
        jPanelDeleteMult.add(jLabelUserNameMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, 30));

        jLabelInicio1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelInicio1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelInicio1.setText("USUARIO");
        jPanelDeleteMult.add(jLabelInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, 30));

        jLabelSerial2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelSerial2.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSerial2.setText("REGISTRO MULTA");
        jPanelDeleteMult.add(jLabelSerial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabelSolicitud11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelSolicitud11.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSolicitud11.setText("ELIMINAR MULTA");
        jPanelDeleteMult.add(jLabelSolicitud11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jComboBoxMult.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelDeleteMult.add(jComboBoxMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 160, 30));

        jButtonSave8.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSave8.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSave8.setText("Eliminar");
        jButtonSave8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSave8ActionPerformed(evt);
            }
        });
        jPanelDeleteMult.add(jButtonSave8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 100, 30));

        jButtonCheckMult.setBackground(new java.awt.Color(102, 0, 0));
        jButtonCheckMult.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCheckMult.setText("...");
        jButtonCheckMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckMultActionPerformed(evt);
            }
        });
        jPanelDeleteMult.add(jButtonCheckMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 20, 30));

        jButtonBack20.setBackground(new java.awt.Color(102, 0, 0));
        jButtonBack20.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack20.setText("Volver");
        jButtonBack20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack20ActionPerformed(evt);
            }
        });
        jPanelDeleteMult.add(jButtonBack20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 100, 30));

        jLabelFondo29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo29.setText("jLabel4");
        jPanelDeleteMult.add(jLabelFondo29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        getContentPane().add(jPanelDeleteMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 560, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfoActionPerformed
        
        hidePanels();
        jPanelContactUs.setVisible(true);
        jTextArea1.setEnabled(false);
       
        
        
    }//GEN-LAST:event_jButtonInfoActionPerformed

    private void jButtonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerfilActionPerformed
        fillMyProfile();
        hidePanels();
        jPanelMyProfile.setVisible(true);

    }//GEN-LAST:event_jButtonPerfilActionPerformed

    private void jButtonSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSolicitudActionPerformed
        Querys objQuery = new Querys();
        objQuery.updateComboBoxs(this.jComboBoxEquipmentSerialLoan, "SELECT * FROM equipment", "serial", "name");
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

    private void jButtonCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateUserActionPerformed

        Querys objQuery = new Querys();
        objQuery.updateComboBoxs(this.jComboBoxCreateUserProject, "SELECT * FROM project", "id_project", "name");
        objQuery.addTypeUser(jComboBoxCreateUserPosition, "SELECT type FROM users WHERE identification ='" + jLabelUserIdentificationGeneral.getText() + "'", "type");
        hidePanels();
        jPanelCreateUser.setVisible(true);

    }//GEN-LAST:event_jButtonCreateUserActionPerformed

    private void jButtonListUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListUserActionPerformed
        String[] titulos = {"Identificacion", "Proyecto", "Contraseña", "Nombre", "Cargo", "Estado", "Email"};
        jTable1.setModel(new DefaultTableModel(null, titulos));
        Querys objQuery = new Querys();
        objQuery.fillTables(this.jTable1, "SELECT identification , project_id , user_password , name , type , state , email FROM users");
        hidePanels();
        jPanelUsersList.setVisible(true);

    }//GEN-LAST:event_jButtonListUserActionPerformed

    private void jButtonCreateProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateProjectActionPerformed

        hidePanels();
        jPanelCreateProject.setVisible(true);
    }//GEN-LAST:event_jButtonCreateProjectActionPerformed

    private void jButtonListProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListProjectActionPerformed
        String[] titulos = {"Codigo", "Nombre", "Descripcion", "Estado"};
        jTable2.setModel(new DefaultTableModel(null, titulos));
        Querys objQuery = new Querys();
        objQuery.fillTables(this.jTable2, "SELECT  code , name , description , state FROM project");
        hidePanels();
        jPanelProjectsList.setVisible(true);
    }//GEN-LAST:event_jButtonListProjectActionPerformed

    private void jButtonUpdateProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateProjectActionPerformed

        Querys objQuery = new Querys();
        objQuery.updateComboBoxs(this.jComboBoxUpdateProjectId, "SELECT * FROM project", "code", "name");
        objQuery.addStateProjectr(jComboBoxUpdateProjectState, "SELECT type FROM users WHERE identification ='" + jLabelUserIdentificationGeneral.getText() + "'", "type");
        hidePanels();
        jPanelUpdateProject.setVisible(true);
    }//GEN-LAST:event_jButtonUpdateProjectActionPerformed

    private void jButtonCreateEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateEquipmentActionPerformed
        hidePanels();
        jPanelCreateEquipment.setVisible(true);
    }//GEN-LAST:event_jButtonCreateEquipmentActionPerformed

    private void jButtonListEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListEquipmentActionPerformed
        String[] titulos = {"Serial", "Nombre", "Descripcion", "Estado"};
        jTable3.setModel(new DefaultTableModel(null, titulos));
        Querys objQuery = new Querys();
        objQuery.fillTables(this.jTable3, "SELECT serial , name , description , state FROM equipment");
        hidePanels();
        jPanelEquipmentList.setVisible(true);
    }//GEN-LAST:event_jButtonListEquipmentActionPerformed

    private void jButtonUpdateEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateEquipmentActionPerformed

        Querys objQuery = new Querys();
        objQuery.updateComboBoxs(this.jComboBoxUpdateEquipmentSerial, "SELECT * FROM equipment", "serial", "name");
        objQuery.addStateEquipment(jComboBoxUpdateEquipmentState, "SELECT type FROM users WHERE identification ='" + jLabelUserIdentificationGeneral.getText() + "'", "type");
        hidePanels();
        jPanelUpdateEquipment.setVisible(true);
    }//GEN-LAST:event_jButtonUpdateEquipmentActionPerformed

    private void jButtonEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEquipoActionPerformed
        hidePanels();
        jPanelCRUDEquipment.setVisible(true);
    }//GEN-LAST:event_jButtonEquipoActionPerformed

    private void jTextFieldNombreCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreCrearUsuarioActionPerformed
        
    }//GEN-LAST:event_jTextFieldNombreCrearUsuarioActionPerformed

    private void jButtonUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateUserActionPerformed
        Querys objQuery = new Querys();
        objQuery.updateComboBoxs(this.jComboBoxUpdateUserProject, "SELECT * FROM project", "id_project", "name");
        objQuery.updateComboBoxs(this.jComboBoxUpdateIdUser, "SELECT * FROM users", "identification", "name");
        objQuery.addTypeUser(jComboBoxUpdateUserType, "SELECT type FROM users WHERE identification ='" + jLabelUserIdentificationGeneral.getText() + "'", "type");
        objQuery.addStateUser(jComboBoxUpdateUserState, "SELECT type FROM users WHERE identification ='" + jLabelUserIdentificationGeneral.getText() + "'", "type");
        hidePanels();
        jPanelUpdateUser.setVisible(true);
    }//GEN-LAST:event_jButtonUpdateUserActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
       
        Validate field = new Validate();
        boolean name =field.stringFieldValidation(jTextFieldNombreUpEquipment, jLabelNombreUpEquipment); 
        if(name == true){
          updateEquipment();  
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonOverwriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOverwriteActionPerformed
        emptyText();
    }//GEN-LAST:event_jButtonOverwriteActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        hidePanels();
        jPanelCRUDEquipment.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonBackCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackCreateUserActionPerformed
        hidePanels();
        jPanelCRUDUsers.setVisible(true);
    }//GEN-LAST:event_jButtonBackCreateUserActionPerformed

    private void jButtonEmptyCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmptyCreateUserActionPerformed
        emptyText();
    }//GEN-LAST:event_jButtonEmptyCreateUserActionPerformed

    private void jButtonSaveCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveCreateUserActionPerformed
        Validate field = new Validate();
        boolean id = field.numericFieldValidation(jTextFieldIdentificacionCrearUsuario, jLabelIdentificacion);
        boolean  name = field.stringFieldValidation(jTextFieldNombreCrearUsuario, jLabelNombreCreateUser);
        if((id == true) &&(name == true)){
               createUser();
        }
     
    }//GEN-LAST:event_jButtonSaveCreateUserActionPerformed

    private void jButtonSaveCreateEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveCreateEquipmentActionPerformed
        Validate field = new Validate();
        boolean serial = field.numericAndCharFieldValidation(jTextFieldSerialCrearEquipo ,jLabelCodigo); 
        boolean  nameEquipment =field.stringFieldValidation(jTextFieldNombreCrearEquipo, jLabelNombre);
         if((serial == true) &&(nameEquipment == true)){
              createEquipment();
        }
    }//GEN-LAST:event_jButtonSaveCreateEquipmentActionPerformed

    private void jButtonEmptyCreateEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmptyCreateEquipmentActionPerformed
        emptyText();
    }//GEN-LAST:event_jButtonEmptyCreateEquipmentActionPerformed

    private void jButtonBackCreateEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackCreateEquipmentActionPerformed
        hidePanels();
        jPanelCRUDEquipment.setVisible(true);
    }//GEN-LAST:event_jButtonBackCreateEquipmentActionPerformed

    private void jButtonSaveCreateProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveCreateProjectActionPerformed
       
        Validate field = new Validate();
        boolean codeProject = field.numericAndCharFieldValidation(jTextFieldCodigoCrearProyecto, jLabelTitleCodigoCreateProject);
        boolean nameProject =  field.stringFieldValidation(jTextFieldNombreCrearProyecto, jLabelTitleNombreCreateProject);
         if((codeProject == true) &&(nameProject == true)){
              createProject();
        }
    }//GEN-LAST:event_jButtonSaveCreateProjectActionPerformed

    private void jButtonEmptyCreateProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmptyCreateProjectActionPerformed
        emptyText();
    }//GEN-LAST:event_jButtonEmptyCreateProjectActionPerformed

    private void jButtonBackCreateProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackCreateProjectActionPerformed
        hidePanels();
        jPanelCRUDProjects.setVisible(true);
    }//GEN-LAST:event_jButtonBackCreateProjectActionPerformed

    private void jButtonEmptyUpdateProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmptyUpdateProjectActionPerformed
        emptyText();
    }//GEN-LAST:event_jButtonEmptyUpdateProjectActionPerformed

    private void jButtonBackUpdateProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackUpdateProjectActionPerformed
        hidePanels();
        jPanelCRUDProjects.setVisible(true);
    }//GEN-LAST:event_jButtonBackUpdateProjectActionPerformed

    private void jTextFieldNombreUpUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreUpUserActionPerformed

    }//GEN-LAST:event_jTextFieldNombreUpUserActionPerformed

    private void jButtonSaveUpUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveUpUserActionPerformed
        Validate field = new Validate();
        boolean nameUser = field.stringFieldValidation(jTextFieldNombreUpUser, jLabelNombreTitle);
        if(nameUser == true){
        updateUser();
        }
    }//GEN-LAST:event_jButtonSaveUpUserActionPerformed

    private void jButtonEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmptyActionPerformed
        emptyText();
    }//GEN-LAST:event_jButtonEmptyActionPerformed

    private void jButtonBackUpUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackUpUserActionPerformed
        hidePanels();
        jPanelCRUDUsers.setVisible(true);
    }//GEN-LAST:event_jButtonBackUpUserActionPerformed

    private void jButtonSaveReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveReserveActionPerformed
        Assistant objAssistan = new Assistant();        
        createReserve();
        JOptionPane.showMessageDialog(null, "Su prestamo estara habil desde el dia: " + getReserveDate() + " hasta: " +objAssistan. convertDayToString(objAssistan.addDayDate(objAssistan.convertStringToDate(getReserveDate()), 7))
                + "\n si no lo entrega antes de la fecha se le empezata a cobrar 5000(COP) por cada dia de atraso",
                "PRESTAMO DE EQUIPO", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_jButtonSaveReserveActionPerformed

    private void jButtonListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListActionPerformed
        String[] titulos = {"Usuario", "Equipo","FechaInicio","FechaEntrega","Estado"};
        jTable10.setModel(new DefaultTableModel(null, titulos)); 
        Querys objQuery = new Querys();
        objQuery.fillTables(this.jTable10, "SELECT id_user , id_equipment , start_date , end_date , state FROM request WHERE state='Reserva'");
        hidePanels();
        jPanelReserveList.setVisible(true);
    }//GEN-LAST:event_jButtonListActionPerformed

    private void jButtonBackReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackReserveActionPerformed
        hidePanels();
        jPanelLoan.setVisible(true);
    }//GEN-LAST:event_jButtonBackReserveActionPerformed

    private void jButtonSaveLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveLoanActionPerformed
        Assistant objAssistan = new Assistant();   
        JOptionPane.showMessageDialog(null, "Su prestamo estara habil desde el dia:" + objAssistan.getStartDate() + "hasta: " + objAssistan.convertDayToString(objAssistan.addDayDate(fecha, 7))
                + "\nsi no lo entrega antes de la fecha se le empezata a cobrar 5000(COP) por cada dia de atraso",
                "PRESTAMO DE EQUIPO", JOptionPane.WARNING_MESSAGE);
        createRequest();

    }//GEN-LAST:event_jButtonSaveLoanActionPerformed

    private void jButtonReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReserveActionPerformed
        Querys objQuery = new Querys();
        objQuery.updateComboBoxs(this.jComboBoxEquipmentSerialReserve, "SELECT * FROM equipment", "serial", "name");
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
        jPanelLoan.setVisible(true);
    }//GEN-LAST:event_jButtonBack10ActionPerformed

    private void jButtonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportesActionPerformed
        hidePanels();
        jPanelReportes.setVisible(true);
    }//GEN-LAST:event_jButtonReportesActionPerformed

    private void jButtonReportPrestxProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportPrestxProjectActionPerformed
        
        String[] titulos = {"Proyecto", "Cantidad_Prestamos"};
        jTable5.setModel(new DefaultTableModel(null, titulos));
        Querys objQuery = new Querys();
        objQuery.fillTables(this.jTable5, "SELECT project.name, count(request.id_request) FROM users\n"
                + "INNER JOIN project  ON users.project_id = project.id_project\n"
                + "INNER JOIN request ON users.id_user = request.id_user\n"
                + "GROUP BY project.name;");
        hidePanels();
        jPanelLoanXProjectList.setVisible(true);
        
    }//GEN-LAST:event_jButtonReportPrestxProjectActionPerformed

    private void jButtonMultasXMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultasXMesActionPerformed

        String[] titulos = {"Mes", "CantidadMultas", "Valor"};
        jTable9.setModel(new DefaultTableModel(null, titulos));
        Querys objQuery = new Querys();
        objQuery.fillTables(this.jTable9, "SELECT TO_CHAR(start_date,'TMMonth') mes, COUNT (mult.id_mult),COUNT (mult.id_mult)*5000 FROM request\n"
                + "INNER JOIN mult ON request.id_request= mult.id_request WHERE TO_CHAR(start_date,'TMMonth') =TO_CHAR(start_date,'TMMonth') AND mult.value>0 GROUP BY mes;");
        objQuery.setTotal(this.TotalMultasXmes,"SELECT SUM(value) FROM mult WHERE value>0;");
        hidePanels();
        jPanelMultXMonthList.setVisible(true);
    }//GEN-LAST:event_jButtonMultasXMesActionPerformed

    private void jButtonReportPresxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportPresxMesActionPerformed
        String[] titulos = {"Mes", "Cantidad_Prestamos"};
        jTable6.setModel(new DefaultTableModel(null, titulos));
        Querys objQuery = new Querys();
        objQuery.fillTables(this.jTable6, "SELECT TO_CHAR(start_date,'TMMonth') mes, COUNT (id_request) FROM request WHERE TO_CHAR(start_date,'TMMonth') =TO_CHAR(start_date,'TMMonth') GROUP BY mes;");
        hidePanels();
        jPanelLoanXMonthList.setVisible(true);
    }//GEN-LAST:event_jButtonReportPresxMesActionPerformed

    private void jButtonReportPresxMiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportPresxMiembrosActionPerformed
        String[] titulos = {"Miembro", "Cantidad_Prestamos"};
        jTable7.setModel(new DefaultTableModel(null, titulos));
        Querys objQuery = new Querys();
        objQuery.fillTables(this.jTable7, "SELECT name , COUNT (id_request) FROM users, request WHERE users.id_user= request.id_user GROUP BY name;");
        hidePanels();
        jPanelLoanXMembersList.setVisible(true);
    }//GEN-LAST:event_jButtonReportPresxMiembrosActionPerformed

    private void jButtonReportMultxMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportMultxMiembroActionPerformed
        String[] titulos = {"Miembro", "Cantidad_Multas", "SUM(ValorMulta)"};
        jTable8.setModel(new DefaultTableModel(null, titulos));
        Querys objQuery = new Querys();
        objQuery.fillTables(this.jTable8, "Select users.name ,COUNT(mult.id_request),(COUNT(mult.value) * 5000) FROM users\n"
                + "               INNER JOIN request ON users.id_user=request.id_user\n"
                + "                INNER JOIN mult ON request.id_request=mult.id_request\n"
                + "                WHERE mult.value>0 GROUP BY users.name;");
                objQuery.setTotal(this.TotalMultasXMiembro,"SELECT SUM(value) FROM mult WHERE value>0;");

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

    private void jButtonMultDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultDeleteActionPerformed
        jLabelUserNameMult.setText("NULL");
        jLabelValueMultUser.setText("NULL");
        hidePanels();
        jPanelDeleteMult.setVisible(true);
        Querys objQuery = new Querys();
        objQuery.updateComboBoxs(this.jComboBoxMult, "SELECT * FROM mult", "id_mult", "id_request");
    }//GEN-LAST:event_jButtonMultDeleteActionPerformed

    private void jButtonEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntregarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea entregar el equipo:" + jComboBoxEquipmentSerialLoan.getSelectedItem().toString(), "ENTREGA DE EQUIPO", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == resp) {
            deliverEquipment();
        }

    }//GEN-LAST:event_jButtonEntregarActionPerformed

    private void jButtonRenovateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRenovateActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea renovar el prestamo  del equipo: " + jComboBoxEquipmentSerialLoan.getSelectedItem().toString(), "RENOVAR PRESTAMO DE EQUIPO", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == resp) {
           RequestDao objDaoRequest = new RequestDao();
           renovateLoan();
        }
    }//GEN-LAST:event_jButtonRenovateActionPerformed

    private void jButtonLoadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadPhotoActionPerformed
        int result;
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        LoadPicture ventana = new LoadPicture();
        ventana.jFileChooserLoad.setFileFilter(filtro);

        result = ventana.jFileChooserLoad.showOpenDialog(null);

        if (JFileChooser.APPROVE_OPTION == result) {
            fichero = ventana.jFileChooserLoad.getSelectedFile();

        }
        try {
            ImageIcon icon = new ImageIcon(fichero.toString());

            Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabelPhoto.getWidth(), jLabelPhoto.getHeight(), Image.SCALE_DEFAULT));

            jLabelPhoto.setText(null);

            jLabelPhoto.setIcon(icono);
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir la imagen " + ex);

        }
        
        saveImage(fichero.toString());


    }//GEN-LAST:event_jButtonLoadPhotoActionPerformed

    private void jButtonSaveProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveProfileActionPerformed
        checkNewPassword();
        updateEmail();
    }//GEN-LAST:event_jButtonSaveProfileActionPerformed

    private void jButtonListarPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarPrestamosActionPerformed
        String[] titulos = {"Usuario", "Equipo","FechaInicio","FechaEntrega","Estado"};
        jTable4.setModel(new DefaultTableModel(null, titulos));
        Querys objQuery = new Querys();
        objQuery.fillTables(this.jTable4, "SELECT id_user , id_equipment , start_date , end_date , state FROM request WHERE state='Activo'");
        hidePanels();
        jPanelLoanList.setVisible(true);
    }//GEN-LAST:event_jButtonListarPrestamosActionPerformed

    private void jButtonBack16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack16ActionPerformed
        hidePanels();
        jPanelReserve.setVisible(true);
    }//GEN-LAST:event_jButtonBack16ActionPerformed

    private void jButtonConsultEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultEquipmentActionPerformed
        Querys objQuery = new Querys();
        hidePanels();
        jPanelViewEquipment.setVisible(true);
        objQuery.updateComboBoxs(this.jComboBoxUpdateEquipmentSerial1, "SELECT * FROM equipment", "serial", "name");
    }//GEN-LAST:event_jButtonConsultEquipmentActionPerformed

    private void jButtonConsultUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultUserActionPerformed
        Querys objQuery = new Querys();
        objQuery.updateComboBoxs(this.jComboBoxUpdateIdUser1, "SELECT * FROM users", "identification", "name");
        hidePanels();
        jPanelViewUser.setVisible(true);
    }//GEN-LAST:event_jButtonConsultUserActionPerformed

    private void jButtonConsultProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultProjectActionPerformed
        Querys objQuery = new Querys();
        objQuery.updateComboBoxs(this.jComboBoxUpdateProjectId1, "SELECT * FROM project", "code", "name");
        hidePanels();
        jPanelViewProject.setVisible(true);
    }//GEN-LAST:event_jButtonConsultProjectActionPerformed

    private void jButtonBack17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack17ActionPerformed
        hidePanels();
        jPanelCRUDEquipment.setVisible(true);
    }//GEN-LAST:event_jButtonBack17ActionPerformed

    private void jButtonCheckEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckEquipActionPerformed
        Assistant objAssistan = new Assistant();       
        Querys objQuery = new Querys();
        String serial = objAssistan.splitComboBox(jComboBoxUpdateEquipmentSerial1);
        String equipment_name = objQuery.query("SELECT name FROM equipment WHERE serial ='" + serial + "'" , "name");
        String state =objQuery.query("SELECT state FROM equipment WHERE serial ='" + serial + "'" , "state");
        String description = objQuery.query("SELECT description FROM equipment WHERE serial ='" + serial + "'" , "description");
        jLabelEquipName.setText(equipment_name);  
        jLabelEquipState.setText(state);
        jLabelDescriptionEquip.setText(description);
    }//GEN-LAST:event_jButtonCheckEquipActionPerformed

    private void jButtonUserCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserCheckActionPerformed
        Assistant objAssistan = new Assistant();
        Querys objQuery = new Querys();
        String state =objQuery.query("SELECT state FROM users WHERE  identification ='" + objAssistan.splitComboBox(jComboBoxUpdateIdUser1) + "'" , "state");
        String type = objQuery.query("SELECT type FROM users WHERE  identification ='" + objAssistan.splitComboBox(jComboBoxUpdateIdUser1)  + "'" , "type");
        String user_name= objQuery.query("SELECT name FROM users WHERE  identification ='" + objAssistan.splitComboBox(jComboBoxUpdateIdUser1)  + "'" , "name");
        String user_email = objQuery.query("SELECT email FROM users WHERE  identification ='" +  objAssistan.splitComboBox(jComboBoxUpdateIdUser1) + "'" , "email");
        String project_name = objQuery.query("SELECT name FROM project WHERE id_project =(SELECT project_id FROM users WHERE identification='"+objAssistan.splitComboBox(jComboBoxUpdateIdUser1)+"');","name");
        jLabelViewUserProject.setText(project_name);
        jLabelViewUserState.setText(state);
        jLabelViewUserRange.setText(type);
        jLabelViewUserName.setText(user_name);
        jLabelViewUserEmail.setText(user_email);
    }//GEN-LAST:event_jButtonUserCheckActionPerformed

    private void jButtonBack18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack18ActionPerformed
        hidePanels();
        jPanelCRUDUsers.setVisible(true);
    }//GEN-LAST:event_jButtonBack18ActionPerformed

    private void jButtonSaveUpdateProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveUpdateProjectActionPerformed
        Validate field = new Validate();
        boolean nameProject = field.stringFieldValidation(jTextFieldNombreUpdateProject, jLabelNombreUpdateProject);
        if(nameProject == true){
              updateProject(); 
        }
     
    }//GEN-LAST:event_jButtonSaveUpdateProjectActionPerformed

    private void jButtonCheckProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckProjectActionPerformed
        Assistant objAssistan = new Assistant();
        Querys objQuery = new Querys();
        String code = objAssistan.splitComboBox(jComboBoxUpdateProjectId1);
        String projectName = objQuery.query("SELECT name FROM project WHERE  code ='" +  code + "'" , "name");
        String description=objQuery.query("SELECT description FROM project WHERE  code ='" +  code + "'" , "description");
        String state=objQuery.query("SELECT state FROM project WHERE  code ='" +  code + "'" , "state");
        jLabelViewProjectName.setText(projectName);
        jLabelViewProjectDescription.setText(description);
        jLabelViewProjectName1.setText(state);
    }//GEN-LAST:event_jButtonCheckProjectActionPerformed

    private void jButtonBack19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack19ActionPerformed
        hidePanels();
        jPanelCRUDProjects.setVisible(true);
    }//GEN-LAST:event_jButtonBack19ActionPerformed

    private void jButtonSave8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSave8ActionPerformed
        deleteMult();
    }//GEN-LAST:event_jButtonSave8ActionPerformed

    private void jButtonBack20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack20ActionPerformed
        hidePanels();
        jPanelLoan.setVisible(true);
    }//GEN-LAST:event_jButtonBack20ActionPerformed

    private void jButtonCheckMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckMultActionPerformed
      try{
            Querys objQuery = new Querys();
            Assistant objAssistan = new Assistant();
            String id_mult = objAssistan.splitComboBox(jComboBoxMult);    
            String id_request= objQuery.query("SELECT id_request FROM mult WHERE  id_mult =' "+ id_mult + "'" , "id_request");
            int id_requests=Integer.parseInt(id_request);
            String id_user= objQuery.query("SELECT id_user FROM request WHERE id_request=' "+ id_requests + "'" , "id_user");
            String user_name= objQuery.query( "SELECT name FROM users WHERE id_user= ' "+ id_user + "'" , "name");
            String value = objQuery.query("SELECT value FROM mult WHERE id_mult='"+id_mult+"'","value");
            jLabelUserNameMult.setText(user_name);
            jLabelValueMultUser.setText(value);
      }catch(Exception e){
          View objView = new View();
          objView.errorShowMult();
      }


    }//GEN-LAST:event_jButtonCheckMultActionPerformed

    private void TotalMultasXMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalMultasXMiembroActionPerformed

    }//GEN-LAST:event_TotalMultasXMiembroActionPerformed

    private void jTextFieldQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuestionActionPerformed

    }//GEN-LAST:event_jTextFieldQuestionActionPerformed

    private void jTextFieldAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnswerActionPerformed

    }//GEN-LAST:event_jTextFieldAnswerActionPerformed

    private void signOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOffActionPerformed
        LoginInterface objVentana = new LoginInterface();
        objVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signOffActionPerformed

    private void jButtonCheckPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckPassActionPerformed
       checkActualPassword(jTextFieldPassActual.getText());
    }//GEN-LAST:event_jButtonCheckPassActionPerformed

    private void jTextFieldPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPreguntaActionPerformed

    private void jTextFieldRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespuestaActionPerformed

    private void jButtonUserCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserCSVActionPerformed
        try{
            int result;
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("CSV y csv", "csv");
            LoadPicture ventana = new LoadPicture();
            ventana.jFileChooserLoad.setFileFilter(filtro);

            result = ventana.jFileChooserLoad.showOpenDialog(null);  
            if (JFileChooser.APPROVE_OPTION == result) {
                fichero = ventana.jFileChooserLoad.getSelectedFile();
                Querys objQuery = new Querys();
                objQuery.readArchiveUsers(fichero.toString());
            }
        }catch(Exception ex){
            View objView = new View();
            objView.errorCargarCSV();
        }

    }//GEN-LAST:event_jButtonUserCSVActionPerformed

    private void jButtonEquipmentCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEquipmentCSVActionPerformed
       try{
            int result;
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("CSV y csv", "csv");
            LoadPicture ventana = new LoadPicture();
            ventana.jFileChooserLoad.setFileFilter(filtro);

            result = ventana.jFileChooserLoad.showOpenDialog(null);  
            if (JFileChooser.APPROVE_OPTION == result) {
                fichero = ventana.jFileChooserLoad.getSelectedFile();
                Querys objQuery = new Querys();
                objQuery.readArchiveEquipment(fichero.toString());
            }
        }catch(Exception ex){
            View objView = new View();
            objView.errorCargarCSV();
        }


    }//GEN-LAST:event_jButtonEquipmentCSVActionPerformed

    private void jButtonProjectCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProjectCSVActionPerformed
     try{
            int result;
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("CSV y csv", "csv");
            LoadPicture ventana = new LoadPicture();
            ventana.jFileChooserLoad.setFileFilter(filtro);

            result = ventana.jFileChooserLoad.showOpenDialog(null);  
            if (JFileChooser.APPROVE_OPTION == result) {
                fichero = ventana.jFileChooserLoad.getSelectedFile();
                Querys objQuery = new Querys();
                objQuery.readArchiveProjects(fichero.toString());
            }        
        }catch(Exception ex){
                View objView = new View();
                objView.errorCargarCSV();
            }

    }//GEN-LAST:event_jButtonProjectCSVActionPerformed

    private void jTextFieldNombreUpUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreUpUserKeyTyped
 
    }//GEN-LAST:event_jTextFieldNombreUpUserKeyTyped

    private void jTextFieldEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyTyped

    }//GEN-LAST:event_jTextFieldEmailKeyTyped

    private void jTextFieldCodigoCrearProyectoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoCrearProyectoKeyTyped
 
    }//GEN-LAST:event_jTextFieldCodigoCrearProyectoKeyTyped

    private void jTextFieldNombreCrearProyectoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreCrearProyectoKeyTyped

    }//GEN-LAST:event_jTextFieldNombreCrearProyectoKeyTyped

    private void jTextFieldCodigoCrearProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoCrearProyectoActionPerformed

    }//GEN-LAST:event_jTextFieldCodigoCrearProyectoActionPerformed

    private void jTextFieldNombreCrearEquipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreCrearEquipoKeyTyped

    }//GEN-LAST:event_jTextFieldNombreCrearEquipoKeyTyped

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed

    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldSerialCrearEquipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerialCrearEquipoKeyTyped
  
    }//GEN-LAST:event_jTextFieldSerialCrearEquipoKeyTyped

    private void jTextFieldNombreCrearEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreCrearEquipoActionPerformed

    }//GEN-LAST:event_jTextFieldNombreCrearEquipoActionPerformed

    private void jTextFieldSerialCrearEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSerialCrearEquipoActionPerformed

    }//GEN-LAST:event_jTextFieldSerialCrearEquipoActionPerformed

    private void jTextFieldIdentificacionCrearUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdentificacionCrearUsuarioKeyTyped
  
    }//GEN-LAST:event_jTextFieldIdentificacionCrearUsuarioKeyTyped

    private void jTextFieldNombreCrearUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreCrearUsuarioKeyTyped

    }//GEN-LAST:event_jTextFieldNombreCrearUsuarioKeyTyped

    private void jTextFieldNombreUpEquipmentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreUpEquipmentKeyTyped
    
    }//GEN-LAST:event_jTextFieldNombreUpEquipmentKeyTyped

    private void jTextFieldNombreUpdateProjectKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreUpdateProjectKeyTyped

    }//GEN-LAST:event_jTextFieldNombreUpdateProjectKeyTyped

    private void jButtonExportMultMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportMultMonthActionPerformed
        JFileChooser explorador = new JFileChooser("/home/");
        explorador.setDialogTitle("Abrir documento...");
        int result = explorador.showDialog(null, "Crear");
        if(result==JFileChooser.APPROVE_OPTION){
            fichero = explorador.getSelectedFile();

        }

        utilJTableToPdf(jTable9,fichero,"Reporte Multas por Mes");
    }//GEN-LAST:event_jButtonExportMultMonthActionPerformed

    private void jButtonExportMultMonth1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportMultMonth1ActionPerformed
        JFileChooser explorador = new JFileChooser("/home/");
        explorador.setDialogTitle("Abrir documento...");
        int result = explorador.showDialog(null, "Crear");
        if(result==JFileChooser.APPROVE_OPTION){
            fichero = explorador.getSelectedFile();
        }

        utilJTableToPdf(jTable5,fichero,"Reporte Multas por Proyectos");
    }//GEN-LAST:event_jButtonExportMultMonth1ActionPerformed

    private void jButtonExportMultMonth2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportMultMonth2ActionPerformed
        JFileChooser explorador = new JFileChooser("/home/");
        explorador.setDialogTitle("Abrir documento...");
        int result = explorador.showDialog(null, "Crear");
        if(result==JFileChooser.APPROVE_OPTION){
            fichero = explorador.getSelectedFile();
        }

        utilJTableToPdf(jTable6,fichero,"Reporte Prestamos por Mes");
    }//GEN-LAST:event_jButtonExportMultMonth2ActionPerformed

    private void jButtonExportMultMonth3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportMultMonth3ActionPerformed
        JFileChooser explorador = new JFileChooser("/home/");
        explorador.setDialogTitle("Abrir documento...");
        int result = explorador.showDialog(null, "Crear");
        if(result==JFileChooser.APPROVE_OPTION){
            fichero = explorador.getSelectedFile();
        }

        utilJTableToPdf(jTable7,fichero,"Reporte Prestamos por Miembro");
    }//GEN-LAST:event_jButtonExportMultMonth3ActionPerformed

    private void jButtonExportMultMonth4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportMultMonth4ActionPerformed
        JFileChooser explorador = new JFileChooser("/home/");
        explorador.setDialogTitle("Abrir documento...");
        int result = explorador.showDialog(null, "Crear");
        if(result==JFileChooser.APPROVE_OPTION){
            fichero = explorador.getSelectedFile();
        }

        utilJTableToPdf(jTable8,fichero,"Reporte Multas por Miembro");
    }//GEN-LAST:event_jButtonExportMultMonth4ActionPerformed

    private void jButtonEditContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditContactActionPerformed
        jTextArea1.setEnabled(true);
        
    }//GEN-LAST:event_jButtonEditContactActionPerformed

    private void jButtonSaveEditContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveEditContactActionPerformed
       jTextArea1.setEnabled(false);
       Assistant objAssistan = new Assistant();
    }//GEN-LAST:event_jButtonSaveEditContactActionPerformed

    private void jButtonBack21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack21ActionPerformed
        // TODO add your handling code here:
        String direccion ="/Ventanas/ReportGraphicsXLoanProject.jasper";
        Querys objQuery = new Querys();
        objQuery.reportGraphic(direccion);
                
    }//GEN-LAST:event_jButtonBack21ActionPerformed

    private void jButtonBack22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack22ActionPerformed
        // TODO add your handling code here:
        String direccion ="/Ventanas/ReportGraphicsXLoanMonth.jasper";
        Querys objQuery = new Querys();
        objQuery.reportGraphic(direccion);
    }//GEN-LAST:event_jButtonBack22ActionPerformed

    private void jButtonBack23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack23ActionPerformed
        // TODO add your handling code here:
        String direccion ="/Ventanas/ReportGraphicsXLoanMember.jasper";
        Querys objQuery = new Querys();
        objQuery.reportGraphic(direccion);
    }//GEN-LAST:event_jButtonBack23ActionPerformed

    private void jButtonBack24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack24ActionPerformed
        // TODO add your handling code here:
         String direccion ="/Ventanas/ReportGraphicsXMultMember.jasper";
        Querys objQuery = new Querys();
        objQuery.reportGraphic(direccion);
    }//GEN-LAST:event_jButtonBack24ActionPerformed
//
    private void jButtonBack25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack25ActionPerformed
        // TODO add your handling code here:
         String direccion ="/Ventanas/ReportGraphicsXMultMonth.jasper";
        Querys objQuery = new Querys();
        objQuery.reportGraphic(direccion);
    }//GEN-LAST:event_jButtonBack25ActionPerformed

    private void emptyText() {
        jTextAreaCrearEquipo.setText("");
        jTextAreaCrearProyecto.setText("");
        jTextArea3.setText("");
        jTextArea4.setText("");
        jTextFieldSerialCrearEquipo.setText("");
        jTextFieldCodigoCrearProyecto.setText("");
        jTextFieldEmail.setText("");
        jTextFieldIdentificacionCrearUsuario.setText("");
        jTextFieldNombreCrearEquipo.setText("");
        jTextFieldNombreCrearProyecto.setText("");
        jTextFieldNombreCrearUsuario.setText("");
        jTextFieldNombreUpUser.setText("");
        jTextFieldNombreUpdateProject.setText("");
        jTextFieldNombreUpEquipment.setText("");
        jTextFieldPregunta.setText("");
        jTextFieldNombreUpUser.setText("");
        jTextFieldEmail.setText("");
        jTextFieldQuestion.setText("");
        jTextFieldAnswer.setText("");
        jTextFieldEmailCrearUsuario.setText("");

             
    }

    private void hidePanels() {
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
        jPanelReserveList.setVisible(false);
        jPanelReportes.setVisible(false);
        jPanelLoanXProjectList.setVisible(false);
        jPanelLoanXMonthList.setVisible(false);
        jPanelLoanXMembersList.setVisible(false);
        jPanelMultXMembersList.setVisible(false);
        jPanelMultXMonthList.setVisible(false);
        jPanelMyProfile.setVisible(false);
        jPanelViewEquipment.setVisible(false);
        jPanelViewUser.setVisible(false);
        jPanelViewProject.setVisible(false);
        jPanelDeleteMult.setVisible(false);
    }

    public static void main(String args[]) {

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

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InitialInterface().setVisible(true);
            }
        });
    }
    

    
    public boolean checkActualPassword(String actualPassword){       
        Assistant objAssistan = new Assistant();
        return objAssistan.checkActualPassword(actualPassword,jLabelUserIdentificationGeneral);
    
    }

    
    public void fillMyProfile(){
        Assistant objAssistan = new Assistant();
        objAssistan.fillMyProfile(jLabelUserIdentificationGeneral,jLabelSetName,jTextFieldSetEmail);
        
    }
    
    public void saveImage(String route){
        Assistant objAssistan = new Assistant();
        objAssistan.saveImage(route, jLabelUserIdentificationGeneral);
    }
    
        public String getEmailProfile(){
         Assistant objAssistan = new Assistant();
         return objAssistan.getEmailProfile(jLabelUserIdentificationGeneral);
    }
    
    
      
    public void updateEmail(){
        Assistant objAssistan = new Assistant();
        objAssistan.updateEmail(jTextFieldSetEmail,jLabelUserIdentificationGeneral);
    }  
    
    public void checkNewPassword(){
        Assistant objAssistan = new Assistant();
        objAssistan.checkNewPassword(jPasswordNew, jPasswordNew1, jTextFieldPassActual, jLabelUserIdentificationGeneral);
    }
    
    public void changeLabelPicture(String route){
        File fileImg = new File(route);
        if(fileImg.exists()){
            
            ImageIcon icon = new ImageIcon(route);
            Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabelUserPhoto.getWidth(), jLabelUserPhoto.getHeight(), Image.SCALE_DEFAULT));
            jLabelUserPhoto.setText(null);
            jLabelUserPhoto.setIcon(icono);
        }else{
            ImageIcon icon = new ImageIcon("/Imagenes/sinFoto.jpg");
            Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabelUserPhoto.getWidth(), jLabelUserPhoto.getHeight(), Image.SCALE_DEFAULT));
            jLabelUserPhoto.setText(null);
            jLabelUserPhoto.setIcon(icono);
        }    
    }
  
   
    public void createUser() {
        Assistant objAssistan = new Assistant();
        if(( jTextFieldIdentificacionCrearUsuario.getText().isEmpty() == false) &&  ( jTextFieldNombreCrearUsuario.getText().isEmpty()==false) && 
           (jTextFieldEmailCrearUsuario.getText().isEmpty() == false)&&  ( jTextFieldQuestion.getText().isEmpty()==false)&&  (jTextFieldAnswer.getText().isEmpty()==false)){
       
        UserController objCtrlUser = new UserController();   
        String identification = jTextFieldIdentificacionCrearUsuario.getText();
        String idProyect = objAssistan.splitComboBox(jComboBoxCreateUserProject);
        String name = jTextFieldNombreCrearUsuario.getText();
        String password = objAssistan.encryptSortPassword(generateInitialPassword());
        String typeUser = jComboBoxCreateUserPosition.getSelectedItem().toString();
        String state = "Activo";
        String email = jTextFieldEmailCrearUsuario.getText();
        String question = jTextFieldQuestion.getText();
        String answer = jTextFieldAnswer.getText();
        String photo = "1";  
        objCtrlUser.addUser(identification, idProyect, password, name, typeUser, state, email,answer,question , photo);

        }
        else{
           View objView = new View();
           objView.voidFields("Campos vacios");
        }

    }

  
   
    public void createProject() {
    if((jTextFieldCodigoCrearProyecto.getText().isEmpty() == false) &&  ( jTextFieldNombreCrearProyecto.getText().isEmpty()==false) && 
      (jTextAreaCrearProyecto.getText().isEmpty() == false)){
     ProjectController objCtrlProject = new ProjectController();
        String code = jTextFieldCodigoCrearProyecto.getText();
        String name = jTextFieldNombreCrearProyecto.getText();
        String description = jTextAreaCrearProyecto.getText();
        String state = "Activo";

        objCtrlProject.addProject(code, name, description, state);
     } else{
           View objView = new View();
           objView.voidFields("Campos vacios");
        }   
       

    }

    public void createEquipment() {
    if((jTextFieldSerialCrearEquipo.getText().isEmpty() == false) &&  (jTextFieldNombreCrearEquipo.getText().isEmpty()==false) && 
         ( jTextAreaCrearEquipo.getText().isEmpty() == false)){
        EquipmentController objCtrlEquipment = new EquipmentController();
        String serial = jTextFieldSerialCrearEquipo.getText();
        String name = jTextFieldNombreCrearEquipo.getText();
        String description = jTextAreaCrearEquipo.getText();
        String state = "Disponible";

        objCtrlEquipment.addEquipment(serial, name, description, state);
         }else{
           View objView = new View();
           objView.voidFields("Campos vacios");
        }  

    }

    public void deleteMult() {
        MultController objCtrlMult = new MultController();
        Assistant objAssistan = new Assistant();
        String id_mult = "";
        id_mult = objAssistan.splitComboBox(jComboBoxMult);
        objCtrlMult.deleteMult(id_mult);
    }

    public void createRequest() {
        RequestController objCtrlRequest = new RequestController();
        EquipmentController objCtrlEquipment = new EquipmentController();
        Assistant objAssistan = new Assistant();
        Querys objQuery = new Querys();
        String id_user= objQuery.query("SELECT id_user FROM users WHERE  identification ='" + jLabelUserIdentificationGeneral.getText() + "'" , "id_user");
        int id=Integer.parseInt(id_user);
        String serial_equipment = objAssistan.splitComboBox(jComboBoxEquipmentSerialLoan);
        String id_equipment =objQuery.query("SELECT id_equipment FROM equipment WHERE  serial ='" + serial_equipment + "'" , "id_equipment");
        String state_equipment =objQuery.query("SELECT state FROM equipment WHERE  serial ='" + serial_equipment + "'" , "state");
        int id_equipments=Integer.parseInt(id_equipment);
        String start_date = objAssistan.getStartDate();
        String state = "Activo";
        String end_date = objAssistan.convertDayToString(objAssistan.addDayDate(fecha, 7));
        if(state_equipment.equals("Ocupado") ||  state_equipment.equals("Reservado")){
            View objView = new View();
            objView.errorRequest();
        }else{
            objCtrlRequest.addRequest(state, id, id_equipments, start_date, end_date);
            objCtrlEquipment.setStateEquipment(id_equipments, "Ocupado");}

    }
    
    public void renovateLoan() {
        Assistant objAssistan = new Assistant();
        objAssistan.renovateLoan(jLabelUserIdentificationGeneral, jComboBoxEquipmentSerialLoan);
       
    }
    
    public String getReserveDate() {
        Assistant objAssistan = new Assistant();
        return objAssistan.getReserveDate(jSpinnerDia, jSpinnerMes, jSpinnerAño);
    }
    

    public void createReserve() {
        RequestController objCtrlRequest = new RequestController();
        EquipmentController objCtrlEquipment = new EquipmentController();
        Assistant objAssistan = new Assistant();
        Querys objQuery = new Querys();
        String id_user= objQuery.query("SELECT id_user FROM users WHERE  identification ='" + jLabelUserIdentificationGeneral.getText() + "'" , "id_user");
        int id=Integer.parseInt(id_user);
        String serial_equipment = objAssistan.splitComboBox(jComboBoxEquipmentSerialLoan);
        String id_equipment =objQuery.query("SELECT id_equipment FROM equipment WHERE  serial ='" + serial_equipment + "'" , "id_equipment");
        int id_equipments=Integer.parseInt(id_equipment);
        String start_date = getReserveDate();
        String state = "Reserva";
        if(start_date==null ){
            View objView = new View();
            objView.errorReserve();
        }else{
            String end_date = objAssistan.convertDayToString(objAssistan.addDayDate(objAssistan.convertStringToDate(getReserveDate()), 7));
            objCtrlRequest.addRequest(state, id, id_equipments, start_date, end_date);
            objCtrlEquipment.setStateEquipment(id_equipments, "Reservado");
        }
    }

    public void changeLabelIdentification(String identification) {
        jLabelUserIdentificationGeneral.setText(identification);
    }

  
    public void deliverEquipment() {
        Assistant objAssistan = new Assistant();
        objAssistan.deliverEquipment(jLabelUserIdentificationGeneral, jComboBoxEquipmentSerialLoan);

    }
        
    public String generateInitialPassword() {

        Assistant objAssistan = new Assistant();
        return objAssistan.generateInitialPassword(jTextFieldIdentificacionCrearUsuario,jTextFieldNombreCrearUsuario);

    }
    
    public void updateUser() {
        Assistant objAssistan = new Assistant();
        if(( jTextFieldNombreUpUser.getText().isEmpty() == false) &&  (jTextFieldEmail.getText().isEmpty()==false) && 
           (jTextFieldRespuesta.getText().isEmpty() == false)&&  ( jTextFieldPregunta.getText().isEmpty()==false)){
        UserController objCtrlUser = new UserController();
        String updateIdUser = objAssistan.splitComboBox(jComboBoxUpdateIdUser);
        String updateIdProject = objAssistan.splitComboBox(jComboBoxUpdateUserProject);
        String updateState = jComboBoxUpdateUserState.getSelectedItem().toString();
        String updateType = jComboBoxUpdateUserType.getSelectedItem().toString();
        String updateName = jTextFieldNombreUpUser.getText();
        String updateEmail = jTextFieldEmail.getText();
        String updateAnswer =jTextFieldRespuesta.getText();
        String updateQuestion = jTextFieldPregunta.getText();
        objCtrlUser.updateUser(updateIdUser, updateIdProject, updateName, updateType, updateState, updateEmail, updateAnswer , updateQuestion);
        }else{
           View objView = new View();
           objView.voidFields("Campos vacios");
        }
       

    }

    public void updateProject() {
        Assistant objAssistan = new Assistant();
    if( (jTextArea3.getText().isEmpty() == false) &&  (jTextFieldNombreUpdateProject.getText().isEmpty()==false)){
        ProjectController objCtrlProject = new ProjectController();
        String updateProject = objAssistan.splitComboBox(jComboBoxUpdateProjectId);
        String updateNameProject = jTextFieldNombreUpdateProject.getText();
        String updateDescription = jTextArea3.getText();
        String updateState = objAssistan.splitComboBox(jComboBoxUpdateProjectState);

        objCtrlProject.updateProject(updateProject, updateNameProject, updateDescription, updateState);
         }else{
           View objView = new View();
           objView.voidFields("Campos vacios");
        }
    }

    public void updateEquipment() {
        Assistant objAssistan = new Assistant();
        if( (jTextFieldNombreUpEquipment.getText().isEmpty() == false) &&  (jTextArea4.getText().isEmpty()==false)){
        EquipmentController objCtrlEquipment = new EquipmentController();
        String updateSerialEquipment = objAssistan.splitComboBox(jComboBoxUpdateEquipmentSerial);
        String updateNameEquipment = jTextFieldNombreUpEquipment.getText();
        String updateStateEquipment = objAssistan.splitComboBox(jComboBoxUpdateEquipmentState);
        String updateDescriptionEquipment = jTextArea4.getText();

        objCtrlEquipment.updateEquipment(updateSerialEquipment, updateNameEquipment, updateDescriptionEquipment, updateStateEquipment);
  
        }else{
           View objView = new View();
           objView.voidFields("Campos vacios");
        }
           
       
    }

    public void utilJTableToPdf(JTable jTable, File pdfNewFile, String title){    
        LoadPicture objLoad = new LoadPicture();
        objLoad.generateReport(jTable, pdfNewFile, title);
    }  
    public void enableButtons(String identification) {

        Querys objQuery = new Querys();
        String query = objQuery.query("SELECT type FROM users WHERE identification ='" + identification + "'", "type");
        switch (query) {

            case "Lider de proyecto":

                jButtonEquipo.setEnabled(false);
                jButtonMultDelete.setEnabled(false);
                break;

            case "Miembro":

                jButtonEquipo.setEnabled(false);
                jButtonProyecto.setEnabled(false);
                jButtonUsuario.setEnabled(false);
                jButtonMultDelete.setEnabled(false);
                break;

            case "Cordinador":
                Assistant objAssistan = new Assistant();
                objAssistan.cheekCordinator();
                jButtonProyecto.setEnabled(false);
                jButtonUsuario.setEnabled(false);
                break;

        }

    }
    

    public JTextArea getContact(){
        return jTextArea1;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TotalMultasXMiembro;
    private javax.swing.JTextField TotalMultasXmes;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonBack10;
    private javax.swing.JButton jButtonBack11;
    private javax.swing.JButton jButtonBack12;
    private javax.swing.JButton jButtonBack13;
    private javax.swing.JButton jButtonBack14;
    private javax.swing.JButton jButtonBack15;
    private javax.swing.JButton jButtonBack16;
    private javax.swing.JButton jButtonBack17;
    private javax.swing.JButton jButtonBack18;
    private javax.swing.JButton jButtonBack19;
    private javax.swing.JButton jButtonBack20;
    private javax.swing.JButton jButtonBack21;
    private javax.swing.JButton jButtonBack22;
    private javax.swing.JButton jButtonBack23;
    private javax.swing.JButton jButtonBack24;
    private javax.swing.JButton jButtonBack25;
    private javax.swing.JButton jButtonBack7;
    private javax.swing.JButton jButtonBack8;
    private javax.swing.JButton jButtonBack9;
    private javax.swing.JButton jButtonBackCreateEquipment;
    private javax.swing.JButton jButtonBackCreateProject;
    private javax.swing.JButton jButtonBackCreateUser;
    private javax.swing.JButton jButtonBackReserve;
    private javax.swing.JButton jButtonBackUpUser;
    private javax.swing.JButton jButtonBackUpdateProject;
    private javax.swing.JButton jButtonCheckEquip;
    private javax.swing.JButton jButtonCheckMult;
    private javax.swing.JButton jButtonCheckPass;
    private javax.swing.JButton jButtonCheckProject;
    private javax.swing.JButton jButtonConsultEquipment;
    private javax.swing.JButton jButtonConsultProject;
    private javax.swing.JButton jButtonConsultUser;
    private javax.swing.JButton jButtonCreateEquipment;
    private javax.swing.JButton jButtonCreateProject;
    private javax.swing.JButton jButtonCreateUser;
    private javax.swing.JButton jButtonEditContact;
    private javax.swing.JButton jButtonEmpty;
    private javax.swing.JButton jButtonEmptyCreateEquipment;
    private javax.swing.JButton jButtonEmptyCreateProject;
    private javax.swing.JButton jButtonEmptyCreateUser;
    private javax.swing.JButton jButtonEmptyUpdateProject;
    private javax.swing.JButton jButtonEntregar;
    private javax.swing.JButton jButtonEquipmentCSV;
    private javax.swing.JButton jButtonEquipo;
    private javax.swing.JButton jButtonExportMultMonth;
    private javax.swing.JButton jButtonExportMultMonth1;
    private javax.swing.JButton jButtonExportMultMonth2;
    private javax.swing.JButton jButtonExportMultMonth3;
    private javax.swing.JButton jButtonExportMultMonth4;
    private javax.swing.JButton jButtonInfo;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonList;
    private javax.swing.JButton jButtonListEquipment;
    private javax.swing.JButton jButtonListProject;
    private javax.swing.JButton jButtonListUser;
    private javax.swing.JButton jButtonListarPrestamos;
    private javax.swing.JButton jButtonLoadPhoto;
    private javax.swing.JButton jButtonMultDelete;
    private javax.swing.JButton jButtonMultasXMes;
    private javax.swing.JButton jButtonOverwrite;
    private javax.swing.JButton jButtonPerfil;
    private javax.swing.JButton jButtonProjectCSV;
    private javax.swing.JButton jButtonProyecto;
    private javax.swing.JButton jButtonRenovate;
    private javax.swing.JButton jButtonReportMultxMiembro;
    private javax.swing.JButton jButtonReportPrestxProject;
    private javax.swing.JButton jButtonReportPresxMes;
    private javax.swing.JButton jButtonReportPresxMiembros;
    private javax.swing.JButton jButtonReportes;
    private javax.swing.JButton jButtonReserve;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSave8;
    private javax.swing.JButton jButtonSaveCreateEquipment;
    private javax.swing.JButton jButtonSaveCreateProject;
    private javax.swing.JButton jButtonSaveCreateUser;
    private javax.swing.JButton jButtonSaveEditContact;
    private javax.swing.JButton jButtonSaveLoan;
    private javax.swing.JButton jButtonSaveProfile;
    private javax.swing.JButton jButtonSaveReserve;
    private javax.swing.JButton jButtonSaveUpUser;
    private javax.swing.JButton jButtonSaveUpdateProject;
    private javax.swing.JButton jButtonSolicitud;
    private javax.swing.JButton jButtonUpdateEquipment;
    private javax.swing.JButton jButtonUpdateProject;
    private javax.swing.JButton jButtonUpdateUser;
    private javax.swing.JButton jButtonUserCSV;
    private javax.swing.JButton jButtonUserCheck;
    private javax.swing.JButton jButtonUsuario;
    private javax.swing.JComboBox<String> jComboBoxCreateUserPosition;
    private javax.swing.JComboBox<String> jComboBoxCreateUserProject;
    private javax.swing.JComboBox<String> jComboBoxEquipmentSerialLoan;
    private javax.swing.JComboBox<String> jComboBoxEquipmentSerialReserve;
    private javax.swing.JComboBox<String> jComboBoxMult;
    private javax.swing.JComboBox<String> jComboBoxUpdateEquipmentSerial;
    private javax.swing.JComboBox<String> jComboBoxUpdateEquipmentSerial1;
    private javax.swing.JComboBox<String> jComboBoxUpdateEquipmentState;
    private javax.swing.JComboBox<String> jComboBoxUpdateIdUser;
    private javax.swing.JComboBox<String> jComboBoxUpdateIdUser1;
    private javax.swing.JComboBox<String> jComboBoxUpdateProjectId;
    private javax.swing.JComboBox<String> jComboBoxUpdateProjectId1;
    private javax.swing.JComboBox<String> jComboBoxUpdateProjectState;
    private javax.swing.JComboBox<String> jComboBoxUpdateUserProject;
    private javax.swing.JComboBox<String> jComboBoxUpdateUserState;
    private javax.swing.JComboBox<String> jComboBoxUpdateUserType;
    private javax.swing.JLabel jLabeLogolLabCreateEquipment;
    private javax.swing.JLabel jLabeMultasPorMiembro;
    private javax.swing.JLabel jLabeMultasPorMiembro1;
    private javax.swing.JLabel jLabeTitleLoan;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
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
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabelAnswer;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelCodigo5;
    private javax.swing.JLabel jLabelCodigo6;
    private javax.swing.JLabel jLabelCodigo7;
    private javax.swing.JLabel jLabelCodigoUpdateProject;
    private javax.swing.JLabel jLabelDay;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelDescripcion4;
    private javax.swing.JLabel jLabelDescripcion5;
    private javax.swing.JLabel jLabelDescripcionUpEquipment;
    private javax.swing.JLabel jLabelDescripcionUpdateProject;
    private javax.swing.JLabel jLabelDescriptionEquip;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEmailCreateUser;
    private javax.swing.JLabel jLabelEmailLb;
    private javax.swing.JLabel jLabelEquipName;
    private javax.swing.JLabel jLabelEquipState;
    private javax.swing.JLabel jLabelEquipment;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelEstado1;
    private javax.swing.JLabel jLabelFondo14;
    private javax.swing.JLabel jLabelFondo15;
    private javax.swing.JLabel jLabelFondo16;
    private javax.swing.JLabel jLabelFondo17;
    private javax.swing.JLabel jLabelFondo18;
    private javax.swing.JLabel jLabelFondo19;
    private javax.swing.JLabel jLabelFondo20;
    private javax.swing.JLabel jLabelFondo21;
    private javax.swing.JLabel jLabelFondo22;
    private javax.swing.JLabel jLabelFondo23;
    private javax.swing.JLabel jLabelFondo24;
    private javax.swing.JLabel jLabelFondo25;
    private javax.swing.JLabel jLabelFondo26;
    private javax.swing.JLabel jLabelFondo27;
    private javax.swing.JLabel jLabelFondo28;
    private javax.swing.JLabel jLabelFondo29;
    private javax.swing.JLabel jLabelFondoContactUs;
    private javax.swing.JLabel jLabelFondoCreateEquipment;
    private javax.swing.JLabel jLabelFondoCreateProject;
    private javax.swing.JLabel jLabelFondoCreateUser;
    private javax.swing.JLabel jLabelFondoInicio;
    private javax.swing.JLabel jLabelFondoLoan;
    private javax.swing.JLabel jLabelFondoMenu;
    private javax.swing.JLabel jLabelFondoProject;
    private javax.swing.JLabel jLabelFondoReserve;
    private javax.swing.JLabel jLabelFondoUpEquipment;
    private javax.swing.JLabel jLabelFondoUpUser;
    private javax.swing.JLabel jLabelFondoUpdateProject;
    private javax.swing.JLabel jLabelFondoUser;
    private javax.swing.JLabel jLabelIdentificacion;
    private javax.swing.JLabel jLabelIdentificacion1;
    private javax.swing.JLabel jLabelIdentificacion2;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelInicio1;
    private javax.swing.JLabel jLabelLES;
    private javax.swing.JLabel jLabelLESCreateProject;
    private javax.swing.JLabel jLabelLogoLESContactUs;
    private javax.swing.JLabel jLabelLogoLESCreateEquipment;
    private javax.swing.JLabel jLabelLogoLESCreateUser;
    private javax.swing.JLabel jLabelLogoLESEquipment;
    private javax.swing.JLabel jLabelLogoLESInicio;
    private javax.swing.JLabel jLabelLogoLESLoan;
    private javax.swing.JLabel jLabelLogoLESProject;
    private javax.swing.JLabel jLabelLogoLESReserve;
    private javax.swing.JLabel jLabelLogoLESUpEquipment;
    private javax.swing.JLabel jLabelLogoLESUpdateProject;
    private javax.swing.JLabel jLabelLogoLESUser;
    private javax.swing.JLabel jLabelLogoLab;
    private javax.swing.JLabel jLabelLogoLabContactUs;
    private javax.swing.JLabel jLabelLogoLabCreateProject;
    private javax.swing.JLabel jLabelLogoLabCreateUser;
    private javax.swing.JLabel jLabelLogoLabEquipment;
    private javax.swing.JLabel jLabelLogoLabLoan;
    private javax.swing.JLabel jLabelLogoLabProject;
    private javax.swing.JLabel jLabelLogoLabReserve;
    private javax.swing.JLabel jLabelLogoLabUpEquipment;
    private javax.swing.JLabel jLabelLogoLabUpdateProject;
    private javax.swing.JLabel jLabelLogoLabUser;
    private javax.swing.JLabel jLabelLogoMVLab;
    private javax.swing.JLabel jLabelLogoUnivalle;
    private javax.swing.JLabel jLabelLogoUnivalleContactUs;
    private javax.swing.JLabel jLabelLogoUnivalleCreateEquipment;
    private javax.swing.JLabel jLabelLogoUnivalleCreateProject;
    private javax.swing.JLabel jLabelLogoUnivalleCreateUser;
    private javax.swing.JLabel jLabelLogoUnivalleEquipment;
    private javax.swing.JLabel jLabelLogoUnivalleLoan;
    private javax.swing.JLabel jLabelLogoUnivalleProject;
    private javax.swing.JLabel jLabelLogoUnivalleReserve;
    private javax.swing.JLabel jLabelLogoUnivalleUpEquipment;
    private javax.swing.JLabel jLabelLogoUnivalleUpdateProject;
    private javax.swing.JLabel jLabelLogoUnivalleUser;
    private javax.swing.JLabel jLabelMonth;
    private javax.swing.JLabel jLabelMultValue;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre10;
    private javax.swing.JLabel jLabelNombre7;
    private javax.swing.JLabel jLabelNombre8;
    private javax.swing.JLabel jLabelNombre9;
    private javax.swing.JLabel jLabelNombreCreateUser;
    private javax.swing.JLabel jLabelNombreTitle;
    private javax.swing.JLabel jLabelNombreUpEquipment;
    private javax.swing.JLabel jLabelNombreUpdateProject;
    private javax.swing.JLabel jLabelPassActual;
    private javax.swing.JLabel jLabelPassActual1;
    private javax.swing.JLabel jLabelPassNew;
    private javax.swing.JLabel jLabelPassNew1;
    private javax.swing.JLabel jLabelPassNew2;
    private javax.swing.JLabel jLabelPassNew3;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JLabel jLabelPositionCreateUser;
    private javax.swing.JLabel jLabelPregunt;
    private javax.swing.JLabel jLabelProyecto;
    private javax.swing.JLabel jLabelProyecto2;
    private javax.swing.JLabel jLabelQuestion;
    private javax.swing.JLabel jLabelResp;
    private javax.swing.JLabel jLabelSerial;
    private javax.swing.JLabel jLabelSerial2;
    private javax.swing.JLabel jLabelSerialReserve;
    private javax.swing.JLabel jLabelSerialUpEquipment;
    private javax.swing.JLabel jLabelSetName;
    private javax.swing.JLabel jLabelSolicitud10;
    private javax.swing.JLabel jLabelSolicitud11;
    private javax.swing.JLabel jLabelSolicitud8;
    private javax.swing.JLabel jLabelSolicitud9;
    private javax.swing.JLabel jLabelStateUpEquipment;
    private javax.swing.JLabel jLabelStateUpdateProject;
    private javax.swing.JLabel jLabelTipo4;
    private javax.swing.JLabel jLabelTipo5;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitleCodigoCreateProject;
    private javax.swing.JLabel jLabelTitleCreateEquipment;
    private javax.swing.JLabel jLabelTitleCreateProject;
    private javax.swing.JLabel jLabelTitleCreateUser;
    private javax.swing.JLabel jLabelTitleDescripcion;
    private javax.swing.JLabel jLabelTitleEquipment;
    private javax.swing.JLabel jLabelTitleNombreCreateProject;
    private javax.swing.JLabel jLabelTitleProject;
    private javax.swing.JLabel jLabelTitleProyecto;
    private javax.swing.JLabel jLabelTitleReserve;
    private javax.swing.JLabel jLabelTitleUpEquipment;
    private javax.swing.JLabel jLabelTitleUpUser;
    private javax.swing.JLabel jLabelTitleUpdateProject;
    private javax.swing.JLabel jLabelUnivalle;
    private javax.swing.JLabel jLabelUserIdentificationGeneral;
    private javax.swing.JLabel jLabelUserNameMult;
    private javax.swing.JLabel jLabelUserPhoto;
    private javax.swing.JLabel jLabelUsuarios;
    private javax.swing.JLabel jLabelUsuarios10;
    private javax.swing.JLabel jLabelUsuarios11;
    private javax.swing.JLabel jLabelUsuarios12;
    private javax.swing.JLabel jLabelUsuarios4;
    private javax.swing.JLabel jLabelUsuarios5;
    private javax.swing.JLabel jLabelUsuarios6;
    private javax.swing.JLabel jLabelUsuarios7;
    private javax.swing.JLabel jLabelUsuarios8;
    private javax.swing.JLabel jLabelUsuarios9;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JLabel jLabelValorTotal1;
    private javax.swing.JLabel jLabelValueMultUser;
    private javax.swing.JLabel jLabelViewProjectDescription;
    private javax.swing.JLabel jLabelViewProjectName;
    private javax.swing.JLabel jLabelViewProjectName1;
    private javax.swing.JLabel jLabelViewUserEmail;
    private javax.swing.JLabel jLabelViewUserName;
    private javax.swing.JLabel jLabelViewUserProject;
    private javax.swing.JLabel jLabelViewUserRange;
    private javax.swing.JLabel jLabelViewUserState;
    private javax.swing.JLabel jLabelYear;
    private javax.swing.JPanel jPanelCRUDEquipment;
    private javax.swing.JPanel jPanelCRUDProjects;
    private javax.swing.JPanel jPanelCRUDUsers;
    private javax.swing.JPanel jPanelContactUs;
    private javax.swing.JPanel jPanelCreateEquipment;
    private javax.swing.JPanel jPanelCreateProject;
    private javax.swing.JPanel jPanelCreateUser;
    private javax.swing.JPanel jPanelDeleteMult;
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
    private javax.swing.JPanel jPanelMyProfile;
    private javax.swing.JPanel jPanelProjectsList;
    private javax.swing.JPanel jPanelReportes;
    private javax.swing.JPanel jPanelReserve;
    private javax.swing.JPanel jPanelReserveList;
    private javax.swing.JPanel jPanelUpdateEquipment;
    private javax.swing.JPanel jPanelUpdateProject;
    private javax.swing.JPanel jPanelUpdateUser;
    private javax.swing.JPanel jPanelUsersList;
    private javax.swing.JPanel jPanelViewEquipment;
    private javax.swing.JPanel jPanelViewProject;
    private javax.swing.JPanel jPanelViewUser;
    private javax.swing.JPasswordField jPasswordNew;
    private javax.swing.JPasswordField jPasswordNew1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane jScrollPaneCreateEquipment;
    private javax.swing.JScrollPane jScrollPaneDescriptionCreateProject;
    private javax.swing.JScrollPane jScrollPaneUpEquipment;
    private javax.swing.JScrollPane jScrollPaneUpdateProject;
    private javax.swing.JSpinner jSpinnerAño;
    private javax.swing.JSpinner jSpinnerDia;
    private javax.swing.JSpinner jSpinnerMes;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextAreaCrearEquipo;
    private javax.swing.JTextArea jTextAreaCrearProyecto;
    private javax.swing.JTextField jTextFieldAnswer;
    private javax.swing.JTextField jTextFieldCodigoCrearProyecto;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmailCrearUsuario;
    private javax.swing.JTextField jTextFieldIdentificacionCrearUsuario;
    private javax.swing.JTextField jTextFieldNombreCrearEquipo;
    private javax.swing.JTextField jTextFieldNombreCrearProyecto;
    private javax.swing.JTextField jTextFieldNombreCrearUsuario;
    private javax.swing.JTextField jTextFieldNombreUpEquipment;
    private javax.swing.JTextField jTextFieldNombreUpUser;
    private javax.swing.JTextField jTextFieldNombreUpdateProject;
    private javax.swing.JPasswordField jTextFieldPassActual;
    private javax.swing.JTextField jTextFieldPregunta;
    private javax.swing.JTextField jTextFieldQuestion;
    private javax.swing.JTextField jTextFieldRespuesta;
    private javax.swing.JTextField jTextFieldSerialCrearEquipo;
    private javax.swing.JTextField jTextFieldSetEmail;
    private javax.swing.JButton signOff;
    // End of variables declaration//GEN-END:variables
}
