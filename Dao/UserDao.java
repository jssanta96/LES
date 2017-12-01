package Dao;

import Logica.User;
import Ventanas.InitialInterface;
import java.sql.*;

public class UserDao {
    FachadaBD fachada;


    public UserDao(){
        fachada = new FachadaBD();
    }



    public int saveUser(User user){
        String save_sql;
        int numberRows=0;

        save_sql="INSERT INTO users VALUES(NEXTVAL('users_seq'), '"+ 
                user.getIdentification()+"',"+user.getProjectId()+",'"+user.getPassword()+"','"
                +user.getUserName()+"','"+user.getType()+"','"+user.getState()+"','"+user.getEmail()+"');";

        System.out.println( "prueba." + save_sql);
        
    try{
            Connection conn= fachada.getConnetion();
            Statement sentence = conn.createStatement();

            numberRows= sentence.executeUpdate(save_sql);
            System.out.println("up" + numberRows);
            return numberRows;

        }catch(SQLException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return -1;
    }

    public User viewUser(String identification){
        User user= new User();
        String sql_select;
        sql_select="SELECT identification,project_id,user_password,nickname,name,type,state,email"+
                " FROM users WHERE identification='"+identification+"';";

        try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentence = conn.createStatement();
            ResultSet tabla = sentence.executeQuery(sql_select);

            while(tabla.next()){
                user.setIdentification(tabla.getString(1));

                user.setProjectId(tabla.getString(2));

                user.setPassword(tabla.getString(3));;

                user.setUserName(tabla.getString(4));

                user.setType(tabla.getString(5));

                user.setState(tabla.getString(6));

                user.setEmail(tabla.getString(7));

                System.out.println("ok");
            }

            return user;
        }
        catch(SQLException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }



    public boolean updateUser(String identification, String project_id, String password , String userName, String type, String state, String email){

        String sql_select;
        sql_select="UPDATE users SET identification ='" + identification +  "', project_id = "+ project_id +", password = '"+ password +
                "', name ='" + userName + "', type = '" + type +  "', state = '" + state + "', email = '"+ email +" WHERE  identification='"+ identification +"';";
        try{
            Connection conn= fachada.getConnetion();
            System.out.println("Update in the bd");
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);
            return true;
        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }
        return false;
    }


    public void deleteUser(String identification){

        String sql_select;
        sql_select="DELETE FROM users WHERE  identification='"+ identification +"';";
        try{
            Connection conn= fachada.getConnetion();
            System.out.println("Delete in the bd");
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);
        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }

    }
    
    public boolean conection(String identification , String password){
        
      String sql_select;
        sql_select="SELECT * FROM users WHERE  identification='"+ identification +"'AND user_password = '"+ password +"';";
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet rsUser = sentencia.executeQuery(sql_select);

                   
            if(rsUser.next()){
                
                String testingId =(rsUser.getString("identification"));
                String testingPassword =(rsUser.getString("user_password"));
                String testingState =(rsUser.getString("state"));
                
                if(testingId.equals(identification) && testingPassword.equals(password) && testingState.equals("Activo")){
                    
                        System.out.println("Logeo exitoso");
                        InitialInterface objVentana = new InitialInterface();
                        objVentana.changeLabelIdentification(identification);
                        objVentana.setVisible(true);
                        return true;
                }
                               
            }
            
        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }
        
        return false;
    }
    
}
        


