package Dao;

import Logica.Project;
import Logica.View;
import Ventanas.InitialInterface;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProjectDao {


public ProjectDao(){
}

    public int saveProject(Project project){
        String save_sql="INSERT INTO project VALUES(NEXTVAL('project_seq'), '"+
                project.getCode()+"','"+project.getName()+"','"
                +project.getDescription()+"','"+project.getState()+"');";

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
    public Project viewProject(String code){
        
        Project project= new Project();
        String sql_select="SELECT code,name,description,state"+
                " FROM project WHERE code='"+code+"';";

        try{
            FachadaBD fachada = new FachadaBD();
            Connection conn= fachada.getConnetion();
            Statement sentence = conn.createStatement();
            ResultSet tabla = sentence.executeQuery(sql_select);

            while(tabla.next()){
                project.setCode(tabla.getString(1));

                project.setName(tabla.getString(2));

                project.setDescription(tabla.getString(3));

                project.setState(tabla.getString(4));
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

        String sql_select="UPDATE project SET code ='" + code +  "', name = '"+ name +"', description = '"+ description +
                "', state ='" + state +"' WHERE  code='"+ code +"';";
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
    
    public String getProjectName(int project_id) {//Obtiene el id de la secuencia dependiendo de la identificacion del usuario

        FachadaBD fachada = new FachadaBD();
        Connection conn = fachada.getConnetion();
        String name ="";
        try {
            Statement sentenceUsers = conn.createStatement();
            String queryUsers = "SELECT name FROM project WHERE id_project=" + project_id + ";";
            ResultSet rsUsers = sentenceUsers.executeQuery(queryUsers);
            while (rsUsers.next()) {
                name = rsUsers.getString("name");
            }
            return name;
        } catch (SQLException ex) {
           Logger.getLogger(InitialInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int getIdProject(String codeProject) {//Obtiene el id de la secuencia dependiendo de la identificacion del usuario

        FachadaBD fachada = new FachadaBD();
        Connection conn = fachada.getConnetion();
        int id =0;
        try {
            Statement sentenceUsers = conn.createStatement();
            String queryUsers = "SELECT id_project FROM project WHERE code='" + codeProject + "';";
            ResultSet rsUsers = sentenceUsers.executeQuery(queryUsers);
            while (rsUsers.next()) {
                id = rsUsers.getInt("id_project");
            }
            return id;
        } catch (SQLException ex) {
           Logger.getLogger(InitialInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public String getDescriptionProject(int project_id) {//Obtiene el id de la secuencia dependiendo de la identificacion del usuario

        FachadaBD fachada = new FachadaBD();
        Connection conn = fachada.getConnetion();
        String description ="";
        try {
            Statement sentenceUsers = conn.createStatement();
            String queryUsers = "SELECT description FROM project WHERE id_project=" + project_id + ";";
            ResultSet rsUsers = sentenceUsers.executeQuery(queryUsers);
            while (rsUsers.next()) {
                description = rsUsers.getString("description");
            }
            return description;
        } catch (SQLException ex) {
           Logger.getLogger(InitialInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String getStateProject(int project_id) {//Obtiene el id de la secuencia dependiendo de la identificacion del usuario

        FachadaBD fachada = new FachadaBD();
        Connection conn = fachada.getConnetion();
        String state ="";
        try {
            Statement sentenceUsers = conn.createStatement();
            String queryUsers = "SELECT state FROM project WHERE id_project=" + project_id + ";";
            ResultSet rsUsers = sentenceUsers.executeQuery(queryUsers);
            while (rsUsers.next()) {
                state = rsUsers.getString("state");
            }
            return state;
        } catch (SQLException ex) {
           Logger.getLogger(InitialInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
