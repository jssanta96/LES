package Dao;

import Logica.Equipment;
import Logica.Project;

import java.sql.*;

public class EquipmentDao {
    FachadaBD fachada;


    public EquipmentDao(){
        fachada = new FachadaBD();
    }



    public int saveEquipment(Equipment equipment){
        String save_sql;
        int numberRows=0;

        save_sql="INSERT INTO equipment VALUES(NEXTVAL('equipment_seq'), '"+ 
                equipment.getSerial()+"','"+equipment.getName()+"','"
                +equipment.getDescription()+"','"+equipment.getState()+"');";

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



    public Equipment viewEquipment(String serial){
        Equipment equipment= new Equipment();
        String sql_select;
        sql_select="SELECT serial,name,description,state"+
                " FROM equipment WHERE serial='"+serial+"';";

        try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentence = conn.createStatement();
            ResultSet tabla = sentence.executeQuery(sql_select);

            while(tabla.next()){
                equipment.setSerial(tabla.getString(1));

                equipment.setName(tabla.getString(2));

                equipment.setDescription(tabla.getString(3));

                equipment.setState(tabla.getString(4));

                System.out.println("ok");
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

        String sql_select;
        sql_select="UPDATE equipment SET serial ='" + serial +  "', name = '"+ name +"', description = '"+ description +
                "', state ='" + state +" WHERE  serial='"+ serial +"';";
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
    
    public boolean changeStateEquipment(int id_equipment, String state){

        String sql_select;
        sql_select="UPDATE equipment SET state='" + state +"' WHERE  id_equipment="+ id_equipment +";";
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
    
    


    public void deleteEquipment(String serial){

        String sql_select;
        sql_select="DELETE FROM equipment WHERE  serial='"+ serial+"';";
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
