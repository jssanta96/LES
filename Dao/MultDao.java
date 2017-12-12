package Dao;

import Logica.Mult;
import Logica.View;
import Ventanas.InitialInterface;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MultDao {


public MultDao(){
    }



    public int saveMult(Mult mult){
        
        String save_sql="INSERT INTO mult VALUES(NEXTVAL('mult_seq'), '"+
                mult.getId_request()+","+mult.getValue()+");";

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



    public Mult viewMult(int id_request){
        
        Mult mult= new Mult();
        String sql_select ="SELECT id_mult,id_request,value"+
                " FROM project WHERE id_request="+id_request+";";

        try{
            FachadaBD fachada = new FachadaBD();
            Connection conn= fachada.getConnetion();
            Statement sentence = conn.createStatement();
            ResultSet tabla = sentence.executeQuery(sql_select);

            while(tabla.next()){

                mult.setId_request(tabla.getInt(1));

                mult.setValue(tabla.getInt(2));
                
            }

            return mult;
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

    public boolean updateMult(int id_request, double value){

        String sql_select ="UPDATE mult SET value =" + value +" WHERE id_request="+id_request+";";
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


    public boolean deleteMult(String id_mult){

        String sql_select="DELETE FROM mult WHERE  id_mult ="+id_mult+";";
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
    public int getIdRequestMult(String id_mult) {

        FachadaBD fachada = new FachadaBD();
        Connection conn = fachada.getConnetion();
        int id_request = 0;
        try {
            Statement sentenceMult = conn.createStatement();
            String queryMult = "SELECT id_request FROM mult WHERE id_mult=" + id_mult + ";";
            System.out.print(queryMult);
            ResultSet rsMult = sentenceMult.executeQuery(queryMult);
            while (rsMult.next()) {
                id_request = rsMult.getInt("id_request");
            }
            return id_request;
        } catch (SQLException ex) {
            Logger.getLogger(InitialInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }
    
    public void generateMult(int id_request,double value){
        FachadaBD fachada = new FachadaBD();
        Connection conn = fachada.getConnetion();
        try {
            Statement sentenceMult = conn.createStatement();
            String queryMult = "INSERT INTO mult VALUES(NEXTVAL('mult_seq'),"+id_request+","+value+");";
            sentenceMult.executeUpdate(queryMult);
        } catch (SQLException ex) {
            System.out.print(ex);
        }     
    }
}
