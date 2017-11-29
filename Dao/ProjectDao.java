package Dao;

import Logica.Project;
import java.sql.*;

public class ProjectDao {
    FachadaBD fachada;


    public ProjectDao(){
        fachada = new FachadaBD();
    }



    public int saveProject(Project project){
        String save_sql;
        int numberRows=0;

        save_sql="INSERT INTO project VALUES(NEXTVAL('project_seq'), '"+
                project.getCode()+"','"+project.getName()+"','"
                +project.getDescription()+"','"+project.getState()+"');";

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



    public Project viewProject(String code){
        Project project= new Project();
        String sql_select;
        sql_select="SELECT code,name,description,state"+
                " FROM project WHERE code='"+code+"';";

        try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentence = conn.createStatement();
            ResultSet tabla = sentence.executeQuery(sql_select);

            while(tabla.next()){
                project.setCode(tabla.getString(1));

                project.setName(tabla.getString(2));

                project.setDescription(tabla.getString(3));

                project.setState(tabla.getString(4));

                System.out.println("ok");
            }

            return project;
        }
        catch(SQLException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }



    public boolean updateProject(String code, String name, String description, String state){

        String sql_select;
        sql_select="UPDATE project SET code ='" + code +  "', name = '"+ name +"', description = '"+ description +
                "', state ='" + state +" WHERE  code='"+ code +"';";
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


    public void deleteProject(String code){

        String sql_select;
        sql_select="DELETE FROM project WHERE  code='"+ code +"';";
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
