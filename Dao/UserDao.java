package Dao;

import Logica.User;
import Logica.View;

import Ventanas.InitialInterface;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDao {


   public UserDao(){
   
    }
    public int saveUser(User user){
        
    String save_sql="INSERT INTO users VALUES(NEXTVAL('users_seq'), '"+ 
                user.getIdentification()+"',"+user.getProjectId()+",'"+user.getPassword()+"','"
                +user.getUserName()+"','"+user.getType()+"','"+user.getState()+"','"+user.getEmail()+"');";
        
    try{
        FachadaBD fachada = new FachadaBD();
        int numberRows;
        Connection conn= fachada.getConnetion();
        Statement sentence = conn.createStatement();

        numberRows= sentence.executeUpdate(save_sql);
         return numberRows;

        }catch(SQLException e){
            View message = new View();
            message.errorConnection();
        }
        catch(Exception e){
            View message = new View();
            message.errorConnection();
        }
        return -1;
    }
    public User viewUser(String identification){
        
        User user= new User();
        String sql_select="SELECT identification,project_id,user_password,nickname,name,type,state,email"+
                " FROM users WHERE identification='"+identification+"';";

        try{
            FachadaBD fachada = new FachadaBD();
            Connection conn= fachada.getConnetion();
            Statement sentence = conn.createStatement();
            ResultSet tabla = sentence.executeQuery(sql_select);

            while(tabla.next()){
                user.setIdentification(tabla.getString(1));

                user.setProjectId(tabla.getString(2));

                user.setPassword(tabla.getString(3));

                user.setUserName(tabla.getString(4));

                user.setType(tabla.getString(5));

                user.setState(tabla.getString(6));

                user.setEmail(tabla.getString(7));

            }

            return user;
        }
        catch(SQLException e){
            View message = new View();
            message.errorConnection();
        }
        catch(Exception e){
            View message = new View();
            message.errorConnection();
        }
        return null;
    }
    public boolean updateUser(String identification, String project_id, String password , String userName, String type, String state, String email){

        String sql_select="UPDATE users SET identification ='" + identification +  "', project_id = "+ project_id +", password = '"+ password +
                "', name ='" + userName + "', type = '" + type +  "', state = '" + state + "', email = '"+ email +" WHERE  identification='"+ identification +"';";
        try{
            FachadaBD fachada = new FachadaBD();
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);
            return true;
        }
        catch(SQLException e){
        View message = new View();
        message.errorConnection();
        }
        catch(Exception e){
        View message = new View();
        message.errorConnection();
        }
        return false;
    }
    public boolean conection(String identification , String password){
        
      String sql_select="SELECT * FROM users WHERE  identification='"+ identification +"'AND user_password = '"+ password +"';";
        try{
             FachadaBD fachada = new FachadaBD();    
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet rsUser = sentencia.executeQuery(sql_select);

                   
            if(rsUser.next()){
                
                String testingId =(rsUser.getString("identification"));
                String testingPassword =(rsUser.getString("user_password"));
                String testingState =(rsUser.getString("state"));
                String testingRoutePicture =(rsUser.getString("adress_photo"));
                
                if(testingId.equals(identification) && testingPassword.equals(password) && testingState.equals("Activo")){
                    
                        View message = new View();
                        message.sucessfulLogin();
                        InitialInterface objVentana = new InitialInterface();
                        objVentana.changeLabelIdentification(identification);
                        objVentana.setVisible(true);
                        objVentana.enableButtons(identification);
                        objVentana.changeLabelPicture(testingRoutePicture);
                        
                        return true;
                }
                               
            }
            
        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }
        
        return false;
    }
    
    public String getNameUser(int id_user) {
        
        FachadaBD fachada = new FachadaBD();
        Connection conn = fachada.getConnetion();
        String name = "";
        try {
            Statement sentenceMult = conn.createStatement();
            String queryMult = "SELECT name FROM users WHERE id_user=" + id_user + ";";
            System.out.print(queryMult);
            ResultSet rsMult = sentenceMult.executeQuery(queryMult);
            while (rsMult.next()) {
                name = rsMult.getString("name");
            }
            return name;
        } catch (SQLException ex) {
            Logger.getLogger(InitialInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int getIdUser(String identification) {//Obtiene el id de la secuencia dependiendo de la identificacion del usuario

        FachadaBD fachada = new FachadaBD();
        Connection conn = fachada.getConnetion();
        int id = 0;
        try {
            Statement sentenceUsers = conn.createStatement();
            String queryUsers = "SELECT id_user FROM users WHERE identification='" + identification + "';";
            ResultSet rsUsers = sentenceUsers.executeQuery(queryUsers);
            while (rsUsers.next()) {
                id = rsUsers.getInt("id_user");
            }
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(InitialInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}
        


