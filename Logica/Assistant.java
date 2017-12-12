
package Logica;

import Controllers.EquipmentController;
import Controllers.RequestController;
import Dao.FachadaBD;
import Dao.MultDao;
import Dao.Querys;
import Dao.RequestDao;
import Dao.UserDao;
import Ventanas.InitialInterface;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;


public class Assistant {
    
    public Assistant(){}
    
    Date fecha = new Date();
    
    public String splitComboBox(JComboBox change) {

        String positionId = null;
        String[] id = change.getSelectedItem().toString().split("\n");
        ArrayList<String> prueba = new ArrayList<>(Arrays.asList(id));

        for (int i = 0; i < prueba.size(); i++) {
            String codigo[] = prueba.get(i).split(" ");

            positionId = codigo[0];
        }
        return positionId;

    }
        
    
    public String convertDayToString(Date date) {//Convierte un dato de tipo DATE a un String
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        return formatDate.format(date);
    }
    
    
    
    public Date convertStringToDate(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dateConvert = null;
        try {
            dateConvert = format.parse(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return dateConvert;
    }
    
    
    public Date addDayDate(Date date, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date); // Configuramos la fecha que se recibe	
        calendar.add(Calendar.DAY_OF_YEAR, days);  // numero de días a añadir, o restar en caso de días<0
        return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos	
    }
    
    public String encryptSortPassword(String password){
       
        String passwordEncrypt = "";

        for (int i=password.length()-1;i>=0;i--){
		passwordEncrypt = passwordEncrypt + password.charAt(i);          
        }

                return passwordEncrypt;
    }
    
    

    public String getStarRequestDate(int id_request) {
        RequestDao objDao = new RequestDao();
        return objDao.getStartDate(id_request);
    }
    
    
    public String generateInitialPassword(JTextField jTextFieldIdentificacionCrearUsuario,JTextField jTextFieldNombreCrearUsuario) {

        String identification = jTextFieldIdentificacionCrearUsuario.getText();
        String name = jTextFieldNombreCrearUsuario.getText();
        String initial = name.substring(0, 1);
        char last = name.charAt(name.length() - 1);
        String password = (initial + identification + last).toUpperCase();

        return password;

    }
    
    public double calculateMult(int days){
        if(days<=0){
            return 0;           
        }else{
            double valueMult=days*5000;
            System.out.println(valueMult);
            return valueMult;
        }   
    }
    
    public void generateMult(int id_request,int days){
        double mult = calculateMult(days);
        System.out.println(mult+" Valor multa");
        System.out.println(id_request);
        MultDao objDao = new MultDao();
        objDao.generateMult(id_request, mult);
       
    }
    
    public String getReserveDate(JSpinner jSpinnerDia,JSpinner jSpinnerMes,JSpinner jSpinnerAño) {
        Calendar calendar = Calendar.getInstance();
        int day1 = calendar.get(Calendar.DATE);
        int month1 = calendar.get(Calendar.MONTH);
        int year1 = calendar.get(Calendar.YEAR);

        int day = (int) jSpinnerDia.getValue();

        int month = (int)jSpinnerMes.getValue();

        int year = (int)jSpinnerAño.getValue();
        if(year>=year1 && month>=month1){
            String reserveDate = year + "-" + month + "-" + day;
            return reserveDate;
        }else{

            return null;
        }
    }
   
    
    public boolean checkActualPassword(String actualPassword, JLabel jLabelUserIdentificationGeneral){
        Assistant objAssistan = new Assistant();
        Querys objQuery = new Querys();
        View objView = new View();
        String passwordBd=objQuery.typeUser("SELECT user_password FROM users WHERE  identification ='" + jLabelUserIdentificationGeneral.getText() + "'" , "user_password");
        if(encryptSortPassword(actualPassword).equals(passwordBd)){
            objView.sucessfulOperationTypeElement("La contraseña","verificado");
            return true;
        }else{
            objView.errorPassword();
            return false;
        }
    
    }    
    public void checkNewPassword(JPasswordField jPasswordNew,JPasswordField jPasswordNew1,JTextField jTextFieldPassActual,JLabel jLabelUserIdentificationGeneral){
        Assistant objAssistan = new Assistant();
        View objView = new View();
        if(!(jPasswordNew.getText().length()==0  && jPasswordNew1.getText().length()==0)){
            if(jPasswordNew.getText().equals(jPasswordNew1.getText()) && checkActualPassword(jTextFieldPassActual.getText(),jLabelUserIdentificationGeneral)==true){
                UserDao objDao = new UserDao();
                objDao.updatePassword(jLabelUserIdentificationGeneral.getText(), objAssistan.encryptSortPassword(jPasswordNew.getText()));
                objView.sucessfulOperationTypeElement("La contraseña", "actualizado");
            }else{
                objView.errorComparePassword();
            }      
        }else{
            objView.errorEmptyPassword();
        }      
    }
    
    public String getEmailProfile(JLabel jLabelUserIdentificationGeneral){
         Querys objQuery = new Querys();
         String email=objQuery.typeUser("SELECT email FROM users WHERE  identification ='" + jLabelUserIdentificationGeneral.getText() + "'" , "email");
         return email;
    }

    public void updateEmail(JTextField jTextFieldSetEmail, JLabel jLabelUserIdentificationGeneral){
        View objView = new View();
        if(getEmailProfile(jLabelUserIdentificationGeneral).equals(jTextFieldSetEmail.getText())){
            
        }else{
        FachadaBD fachada = new FachadaBD();
        Connection conn = fachada.getConnetion();
        try {
            Statement sentenceEmail = conn.createStatement();
            String queryEmail = "UPDATE users set email='" + jTextFieldSetEmail.getText() + "' WHERE identification ='"+jLabelUserIdentificationGeneral.getText()+"';";
            System.out.print(queryEmail);
            sentenceEmail.executeUpdate(queryEmail);
            objView.sucessfulOperationTypeElement("El email", "actualizado");
            
        } catch (SQLException ex) {
            Logger.getLogger(InitialInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }

    public void saveImage(String route, JLabel jLabelUserIdentificationGeneral){
        FachadaBD fachada = new FachadaBD();
        Connection conn = fachada.getConnetion();
        System.out.println("Abrio la conexion para la imagen");
        try {
            Statement senteceImage = conn.createStatement();
            String queryImage = "UPDATE users set adress_photo='" + route + "' WHERE identification ='"+jLabelUserIdentificationGeneral.getText()+"';";
            senteceImage.executeUpdate(queryImage);
            
        } catch (SQLException ex) {
            Logger.getLogger(InitialInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public int getIdRequest(int id_user, int id_equipment, String state) {//Obtiene el id de la secuencia dependiendo de la identificacion del usuario
        RequestDao objDao = new RequestDao();
        return objDao.getIdRequest(id_user, id_equipment, state);
    }
    
    public String getEndDate(int id_request) {
        RequestDao objDao = new RequestDao();
        return objDao.getEndDate(id_request);
    }
    
    public String getStartDate() {//Obtiene la fecha actual
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        return formatDate.format(fecha);
    }
    
    public void fillMyProfile(JLabel jLabelUserIdentificationGeneral,JLabel jLabelSetName ,JTextField jTextFieldSetEmail){
        
        Querys objQuery = new Querys();
        String user_name=objQuery.typeUser("SELECT name FROM users WHERE  identification ='" + jLabelUserIdentificationGeneral.getText() + "'" , "name");
        jLabelSetName.setText(user_name);
        String user_email=objQuery.typeUser("SELECT email FROM users WHERE  identification ='" + jLabelUserIdentificationGeneral.getText() + "'" , "email");
        jTextFieldSetEmail.setText(user_email);
        
    }

    public void renovateLoan(JLabel jLabelUserIdentificationGeneral, JComboBox jComboBoxEquipmentSerialLoan) {
        Assistant objAssistan = new Assistant();
        View objView = new View();
        RequestController objCtrlRequest = new RequestController();
        EquipmentController objCtrlEquipment = new EquipmentController();
        Querys objQuery = new Querys();
        String id_user= objQuery.typeUser("SELECT id_user FROM users WHERE  identification ='" + jLabelUserIdentificationGeneral.getText() + "'" , "id_user");
        int id=Integer.parseInt(id_user);
        System.out.println(id+" Id del usuario");
        String serial_equipment = objAssistan.splitComboBox(jComboBoxEquipmentSerialLoan);
        String id_equipment =objQuery.typeUser("SELECT id_equipment FROM equipment WHERE  serial ='" + serial_equipment + "'" , "id_equipment");
        int id_equipments=Integer.parseInt(id_equipment);
        System.out.println(id_equipments);
        int id_request = 0;
        try{
            System.out.println("Entro al try");
            id_request = getIdRequest(id, id_equipments, "Activo");
            if(id_request==0){
                 System.out.println(id_request);
                 Exception e = new Exception("Este es mi propio error.");
                 throw e;
            }else{
                Date end_date;
                end_date = objAssistan.convertStringToDate(getEndDate(id_request));
                System.out.println(end_date);
                Date start_date;
                start_date = objAssistan.convertStringToDate(objAssistan.getStarRequestDate(id_request));
 
                int days=(int) ( end_date.getTime() - start_date.getTime() )/86400000; 
                System.out.println(days+" Dias entre fechas");
                if(days>=21){
                    
                    objView.errorExtendRenovate();
                
                }else{
                
                String extend_date = objAssistan.convertDayToString(objAssistan.addDayDate(end_date, 7));


                objCtrlRequest.renovateRequest(id_request, extend_date);
                objCtrlEquipment.setStateEquipment(id_equipments, "Ocupado");
                }
        }
          }catch(Exception e){
                
                objView.errorRenovate();
            }
       
    }
    
    public void deliverEquipment(JLabel jLabelUserIdentificationGeneral, JComboBox jComboBoxEquipmentSerialLoan) {
        Assistant objAssistan = new Assistant();
        RequestController objCtrlRequest = new RequestController();
        EquipmentController objCtrlEquipment = new EquipmentController();
        Querys objQuery = new Querys();
        String id_user= objQuery.typeUser("SELECT id_user FROM users WHERE  identification ='" + jLabelUserIdentificationGeneral.getText() + "'" , "id_user");
        int id=Integer.parseInt(id_user);
        String serial_equipment = objAssistan.splitComboBox(jComboBoxEquipmentSerialLoan);
        String id_equipment =objQuery.typeUser("SELECT id_equipment FROM equipment WHERE  serial ='" + serial_equipment + "'" , "id_equipment");
        int id_equipments=Integer.parseInt(id_equipment);
        int id_request = 0;
        try{
            id_request = getIdRequest(id, id_equipments, "Activo");
            if(id_request==0){
                 Exception e = new Exception("Este es mi propio error.");
                throw e;
            }else{
                String finishDate=getEndDate(id_request);
                Date endDate=objAssistan.convertStringToDate(finishDate);
                Date systemDate=objAssistan.convertStringToDate(getStartDate());

                int days=(int) ( systemDate.getTime() - endDate.getTime() )/86400000;    
                objCtrlRequest.setStateRequest(id_request, "Terminado");
                objCtrlEquipment.setStateEquipment(id_equipments, "Disponible");
                objAssistan.generateMult(id_request,days);
                
            }
          }catch(Exception e){
                View objView = new View();
                objView.errorDeliver();
            }

    }
    
    
}
