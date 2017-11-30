package Dao;

import Logica.Request;

import java.sql.*;

public class RequestDao {
    FachadaBD fachada;


    public RequestDao(){
        fachada = new FachadaBD();
    }



    public int saveRequest(Request request){
        String save_sql;
        int numberRows=0;

        save_sql="INSERT INTO request VALUES(NEXTVAL('request_seq'),'"+request.getState()+"',"+
                request.getUser_id()+","+request.getEquipment_id()+",'"
                +request.getStart_date()+"','"+request.getEnd_date()+"');";

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
    
    
    
    public boolean changeStateRequest(int id_request, String state){

        String sql_select;
        sql_select="UPDATE request SET state='" + state +"' WHERE  id_request="+ id_request +";";
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
    



    public Request viewRequest(String request_id){
        Request request= new Request();
        String sql_select;
        sql_select="SELECT request_id,state,user_id,serial,start_date,end_date"+
                " FROM request WHERE request_id='"+request_id+"';";

        try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentence = conn.createStatement();
            ResultSet tabla = sentence.executeQuery(sql_select);

            while(tabla.next()){

                request.setState(tabla.getString(1));

                request.setUser_id(tabla.getInt(2));

                request.setEquipment_id(tabla.getInt(3));

                request.setStart_date(tabla.getString(4));

                request.setEnd_date(tabla.getString(5));

                System.out.println("ok");
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

        String sql_select;
        sql_select="UPDATE request SET state ='"+state+ "', user_id = '"+ user_id +"', serial = '"+ serial +
                "', start_date ='" + start_date +"',end_date= '"+end_date+" WHERE  request_id='"+ request_id +"';";
        try{
            Connection conn= fachada.getConnetion();
            System.out.println("Update in the bd");
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);

        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }

    }


    public void deleteRequest(String request_id){

        String sql_select;
        sql_select="DELETE FROM request WHERE  request_id='"+ request_id+"';";
        try{
            Connection conn= fachada.getConnetion();
            System.out.println("Delete in the bd");
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);
        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }

    }
}
