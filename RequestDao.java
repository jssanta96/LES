package Dao;

import Controllers.EquipmentController;
import Controllers.RequestController;
import Logica.Request;
import Logica.View;
import Ventanas.InitialInterface;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class RequestDao {


    public RequestDao(){
    }



    public int saveRequest(Request request){
        
        String save_sql="INSERT INTO request VALUES(NEXTVAL('request_seq'),'"+request.getState()+"',"+
                request.getUser_id()+","+request.getEquipment_id()+",'"
                +request.getStart_date()+"','"+request.getEnd_date()+"');";

        try{
            int numberRows;
            FachadaBD fachada = new FachadaBD();
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
    
    
    
    public boolean changeStateRequest(int id_request, String state){

        String sql_select="UPDATE request SET state='" + state +"' WHERE  id_request="+ id_request +";";
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
    
        public boolean renovateRequest(int id_request, String end_date){

        String sql_select;
        sql_select="UPDATE request SET end_date='" + end_date +"' WHERE  id_request="+ id_request +";";
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

    public Request viewRequest(String request_id){
        Request request= new Request();
        String sql_select;
        sql_select="SELECT request_id,state,user_id,serial,start_date,end_date"+
                " FROM request WHERE request_id='"+request_id+"';";

        try{
            FachadaBD fachada = new FachadaBD();
            Connection conn= fachada.getConnetion();
            Statement sentence = conn.createStatement();
            ResultSet tabla = sentence.executeQuery(sql_select);

            while(tabla.next()){

                request.setState(tabla.getString(1));

                request.setUser_id(tabla.getInt(2));

                request.setEquipment_id(tabla.getInt(3));

                request.setStart_date(tabla.getString(4));

                request.setEnd_date(tabla.getString(5));
            }

            return request;
        }
        catch(SQLException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }



    public void updateRequest(String request_id,String state, String user_id, String serial, String start_date, String end_date){

        String sql_select="UPDATE request SET state ='"+state+ "', user_id = '"+ user_id +"', serial = '"+ serial +
                "', start_date ='" + start_date +"',end_date= '"+end_date+" WHERE  request_id='"+ request_id +"';";
        try{
            FachadaBD fachada = new FachadaBD();
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);
        }
        catch(SQLException e){ 
            View message = new View();
            message.errorConnection(); 
        }
        catch(Exception e){
            View message = new View();
            message.errorConnection();  
        }

    }

    
    public int getIdUser(int id_request) {
        FachadaBD fachada = new FachadaBD();
        Connection conn = fachada.getConnetion();
        int id_user = 0;
        try {
            Statement sentenceMult = conn.createStatement();
            String queryMult = "SELECT id_user FROM request WHERE id_request=" + id_request + ";";
            System.out.print(queryMult);
            ResultSet rsMult = sentenceMult.executeQuery(queryMult);
            while (rsMult.next()) {
                id_user = rsMult.getInt("id_user");
            }
            System.out.println(id_user);
            return id_user;
        } catch (SQLException ex) {
            Logger.getLogger(InitialInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public String getEndDate(int id_request) {
        FachadaBD fachada = new FachadaBD();
        Connection conn = fachada.getConnetion();
        String end_date = "";
        try {
            Statement sentenceRequest = conn.createStatement();
            String queryRequest = "SELECT end_date FROM request WHERE id_request=" + id_request + ";";
            System.out.print(queryRequest);
            ResultSet rsRequest = sentenceRequest.executeQuery(queryRequest);
            while (rsRequest.next()) {
                end_date = rsRequest.getString("end_date");
            }
            return end_date;
        } catch (SQLException ex) {
            Logger.getLogger(InitialInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String getStartDate(int id_request) {
        FachadaBD fachada = new FachadaBD();
        Connection conn = fachada.getConnetion();
        String start_date = "";
        try {
            Statement sentenceRequest = conn.createStatement();
            String queryRequest = "SELECT start_date FROM request WHERE id_request=" + id_request + ";";
            System.out.print(queryRequest);
            ResultSet rsRequest = sentenceRequest.executeQuery(queryRequest);
            while (rsRequest.next()) {
                start_date = rsRequest.getString("start_date");
            }
            return start_date;
        } catch (SQLException ex) {
            Logger.getLogger(InitialInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public int getIdRequest(int id_user, int id_equipment, String state) {//Obtiene el id de la secuencia dependiendo de la identificacion del usuario

        FachadaBD fachada = new FachadaBD();
        Connection conn = fachada.getConnetion();
        int id = 0;
        try {
            Statement sentenceRequest = conn.createStatement();
            String queryRequest = "SELECT id_request FROM request WHERE id_user=" + id_user + " AND id_equipment=" + id_equipment + "AND state='" + state + "';";
            ResultSet rsRequest = sentenceRequest.executeQuery(queryRequest);
            while (rsRequest.next()) {
                id = rsRequest.getInt("id_request");
            }
            System.out.println(id);
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(InitialInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    
        
}
}
