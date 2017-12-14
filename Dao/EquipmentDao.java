package Dao;

import Logica.Equipment;
import Logica.View;
import Ventanas.InitialInterface;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EquipmentDao {


   public EquipmentDao(){
    }



    public int saveEquipment(Equipment equipment){
        
        String save_sql="INSERT INTO equipment VALUES(NEXTVAL('equipment_seq'), '"+ 
                equipment.getSerial()+"','"+equipment.getName()+"','"
                +equipment.getDescription()+"','"+equipment.getState()+"');";

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



    public Equipment viewEquipment(String serial){
        
        Equipment equipment= new Equipment();
        String sql_select="SELECT serial,name,description,state"+
                " FROM equipment WHERE serial='"+serial+"';";

        try{
            FachadaBD fachada = new FachadaBD();
            Connection conn= fachada.getConnetion();
            Statement sentence = conn.createStatement();
            ResultSet tabla = sentence.executeQuery(sql_select);

            while(tabla.next()){
                equipment.setSerial(tabla.getString(1));

                equipment.setName(tabla.getString(2));

                equipment.setDescription(tabla.getString(3));

                equipment.setState(tabla.getString(4));

            }

            return equipment;
        }
        catch(SQLException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }



    public boolean updateEquipment(String serial, String name, String description, String state){

        String sql_select ="UPDATE equipment SET serial ='" + serial +  "', name = '"+ name +"', description = '"+ description +
                "', state ='" + state +"' WHERE  serial='"+ serial +"';";
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
    
    public boolean changeStateEquipment(int id_equipment, String state){

        String sql_select="UPDATE equipment SET state='" + state +"' WHERE  id_equipment="+ id_equipment +";";
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
    
    

}
