package Dao;

import Logica.Mult;
import java.sql.*;

public class MultDao {
    FachadaBD fachada;


    public MultDao(){
        fachada = new FachadaBD();
    }



    public int saveMult(Mult mult){
        String save_sql;
        int numberRows=0;

        save_sql="INSERT INTO mult VALUES(NEXTVAL('mult_seq'), '"+
                mult.getId_request()+","+mult.getValue()+");";

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



    public Mult viewMult(int id_request){
        Mult mult= new Mult();
        String sql_select;
        sql_select="SELECT id_mult,id_request,value"+
                " FROM project WHERE id_request="+id_request+";";

        try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentence = conn.createStatement();
            ResultSet tabla = sentence.executeQuery(sql_select);

            while(tabla.next()){

                mult.setId_request(tabla.getInt(1));

                mult.setValue(tabla.getInt(2));

                System.out.println("ok");
            }

            return mult;
        }
        catch(SQLException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }



    public void updateMult(int id_request, double value){

        String sql_select;
        sql_select="UPDATE mult SET value =" + value +" WHERE id_request="+id_request+";";
        try{
            Connection conn= fachada.getConnetion();
            System.out.println("Update in the bd");
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);

        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }

    }


    public void deleteMult(int id_request){

        String sql_select;
        sql_select="DELETE FROM mult WHERE  id_request ="+id_request+";";
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
