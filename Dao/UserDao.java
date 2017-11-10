package Dao;

import Logica.User;
import java.sql.*;

public class UserDao {
    FachadaBD fachada;


    public UserDao(){
        fachada = new FachadaBD();
    }

    public int saveUser(User user){
        String save_sql;
        int numberRows=0;

        save_sql="INSERT INTO user VALUES('"+
                user.getIdentification()+"','"+user.getProjectId()+"','"+user.getPassword()+"','"+user.getNickName()+"','"
                +user.getUserName()+"','"+user.getType()+"','"+user.getState()+"','"+user.getEmail()+"');";


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
        sql_select="SELECT identification,project_id,password,nickname,name,type,state,email"+
                " FROM users WHERE identification='"+identification+"';";

        try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentence = conn.createStatement();
            ResultSet tabla = sentence.executeQuery(sql_select);

            while(tabla.next()){
                user.getIdentification(tabla.getString(1));

                user.getProjectId(tabla.getString(2));

                user.getPassword(tabla.getString(3));

                user.getNickName(tabla.getString(4));

                user.getUserName(tabla.getString(5));

                user.getType(tabla.getString(6));

                user.getState(tabla.getString(7));

                user.getEmail(tabla.getString(8));

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
}
