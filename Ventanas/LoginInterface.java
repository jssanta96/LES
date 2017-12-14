/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import javax.swing.ImageIcon;
import Dao.UserDao;
import Logica.Validate;
import Logica.View;

/**
 *
 * @author Director
 */
public class LoginInterface extends javax.swing.JFrame {

    public  LoginInterface() {
       
        initComponents();
        this.setTitle("LES");
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LESlogo.png")).getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        forgotPassword = new javax.swing.JButton();
        textTitle = new javax.swing.JLabel();
        submitLogin = new javax.swing.JButton();
        textFieldPassword = new javax.swing.JPasswordField();
        iconPassword = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        iconLES = new javax.swing.JLabel();
        textFieldAccount = new javax.swing.JTextField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        forgotPassword.setBackground(new java.awt.Color(231, 231, 231));
        forgotPassword.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        forgotPassword.setForeground(new java.awt.Color(127, 0, 0));
        forgotPassword.setText("Olvido Su Contraseña?");
        forgotPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        forgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(forgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 134, 19));

        textTitle.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        textTitle.setForeground(new java.awt.Color(102, 102, 102));
        textTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTitle.setText("INICIA SESION");
        getContentPane().add(textTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 303, 28));

        submitLogin.setBackground(new java.awt.Color(127, 0, 0));
        submitLogin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        submitLogin.setForeground(new java.awt.Color(255, 255, 255));
        submitLogin.setText("Acceder");
        submitLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        submitLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitLoginActionPerformed(evt);
            }
        });
        getContentPane().add(submitLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        textFieldPassword.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldPassword.setForeground(new java.awt.Color(153, 153, 153));
        textFieldPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(textFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 170, 34));

        iconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconPass.png"))); // NOI18N
        getContentPane().add(iconPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        Id.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/accounts.png"))); // NOI18N
        getContentPane().add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        iconLES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LESlogo.png"))); // NOI18N
        getContentPane().add(iconLES, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 135));

        textFieldAccount.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldAccount.setForeground(new java.awt.Color(153, 153, 153));
        textFieldAccount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldAccount.setToolTipText("");
        textFieldAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldAccountActionPerformed(evt);
            }
        });
        textFieldAccount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldAccountKeyTyped(evt);
            }
        });
        getContentPane().add(textFieldAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 170, 32));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo.setText("jLabel4");
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void forgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPasswordActionPerformed
        RecoverPasswordInterface objVentana = new RecoverPasswordInterface();
        objVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_forgotPasswordActionPerformed

    private void submitLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitLoginActionPerformed
        queryUser();
    }//GEN-LAST:event_submitLoginActionPerformed

    private void textFieldAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldAccountActionPerformed

    private void textFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPasswordActionPerformed

    private void textFieldAccountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldAccountKeyTyped
        Validate field = new Validate();
        field.numericFieldValidation(textFieldAccount , Id);
    }//GEN-LAST:event_textFieldAccountKeyTyped


  public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginInterface().setVisible(true);
            }
        });
    }
  
  public void queryUser(){
      
         UserDao daoUser = new UserDao();        
         String identification = textFieldAccount.getText();
         String password = validateEncryptionPassword(textFieldPassword.getText());
         boolean cheek = daoUser.conection(identification, password);
         if(cheek == true){
                 this.setVisible(false);
         }else{
                View message = new View();
                message.errorLogin();
         }    
  }
  public String encryptSortPassword(String password){
       
        String passwordEncrypt = "";

        for (int i=password.length()-1;i>=0;i--){
		passwordEncrypt = passwordEncrypt + password.charAt(i);          
        }

                return passwordEncrypt;
        }
         
  public String validateEncryptionPassword(String password){
      
      UserDao daoUser = new UserDao();  
      String identification = textFieldAccount.getText();
      String encryptionPassword= daoUser.getData(identification, "SELECT user_password FROM users WHERE identification='", "user_password");
      String normalPassword=encryptSortPassword(encryptionPassword);
     if(normalPassword.equals(password)){
          System.out.println(normalPassword);
         String FinalnormalPassword=encryptSortPassword(password);
         return FinalnormalPassword;
        
     }else{
     return null;
    }
  }
  
 public void validateCordinatorEquipo(){
     
 }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Id;
    private javax.swing.JButton forgotPassword;
    private javax.swing.JLabel iconLES;
    private javax.swing.JLabel iconPassword;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JButton submitLogin;
    private javax.swing.JTextField textFieldAccount;
    private javax.swing.JPasswordField textFieldPassword;
    private javax.swing.JLabel textTitle;
    // End of variables declaration//GEN-END:variables

}
