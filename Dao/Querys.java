package Dao;
import Controllers.EquipmentController;
import Controllers.ProjectController;
import Controllers.UserController;
import Logica.View;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Querys {
    
public Querys(){
    
}

public void fillTables(JTable table , String query){
        
    FachadaBD fachada = new FachadaBD();
    
        try{
            
            Connection conn= fachada.getConnetion();
             
            PreparedStatement sentenceUsers = conn.prepareStatement(query);
                              
            ResultSet rsUsers = sentenceUsers.executeQuery();  

            ResultSetMetaData rsData =  rsUsers.getMetaData();

            ArrayList< Object[] > data = new ArrayList <>();
            
            while(rsUsers.next()){

              Object[] rows = new Object[rsData.getColumnCount()];

              for(int i = 0;  i < rows.length; i++){
                rows[i] = rsUsers.getObject(i+1);
            }
               data.add(rows);
            }
               DefaultTableModel tableUser = (DefaultTableModel)table.getModel();
               for(int i =0; i < data.size(); i++){

                   tableUser.addRow(data.get(i));

               }
        }
        catch(SQLException e){
           View message = new View();
           message.errorConnection();
        }
    }
public void updateComboBoxs(JComboBox comboBox , String query , String dateOne , String dateTwo){//Funcion que consulta en sql.

      FachadaBD fachada = new FachadaBD();
      comboBox.removeAllItems();
         
         try{
            Connection conn= fachada.getConnetion();
            Statement sentenceProjects = conn.createStatement();
            ResultSet rs = sentenceProjects.executeQuery(query);    
            
            while(rs.next()){
          
                comboBox.addItem(rs.getString(dateOne)+ " " + rs.getString(dateTwo)); 
                 
            }
            
        }catch(SQLException e){
        View message = new View();
        message.errorConnection();    
        }

    } 
public void addStateProjectr(JComboBox comboBox , String query , String type ){
      
      FachadaBD fachada = new FachadaBD();
      
      comboBox.removeAllItems();
         
         try{
            Connection conn= fachada.getConnetion();
            Statement sentenceProjects = conn.createStatement();
            ResultSet rs = sentenceProjects.executeQuery(query);    
            
            while(rs.next()){
                
                String typeUser = rs.getString(type);
                switch(typeUser){
                    
                case "Director":
                    
                      comboBox.addItem("Activo");
                      comboBox.addItem("Inactivo");
                      comboBox.addItem("Terminado");
                      
                      break;
                      
                case "Administrador" : 
                 
                      comboBox.addItem("Activo");
                      comboBox.addItem("Inactivo");
                      comboBox.addItem("Terminado");
                      
                      break;
                     
            case "Lider de proyecto":
                
                      comboBox.addItem("Activo");
                      comboBox.addItem("Inactivo");
                      comboBox.addItem("Terminado");

                      break;
                }
                
           
            }
            
        }catch(SQLException e){
           View message = new View();
           message.errorConnection();        
        }
                 
    }
public void addStateEquipment(JComboBox comboBox , String query , String state ){
      
      FachadaBD fachada = new FachadaBD();
      comboBox.removeAllItems();
         
         try{
            Connection conn= fachada.getConnetion();
            Statement sentenceProjects = conn.createStatement();
            ResultSet rs = sentenceProjects.executeQuery(query);    
            
            while(rs.next()){
                
                String stateUser = rs.getString(state);
                switch(stateUser){
                    
                case "Director":
                 
                    comboBox.addItem("Disponible");
                    comboBox.addItem("Ocupado");
             
                      break;
                      
                case "Cordinador" : 
                 
                    comboBox.addItem("Disponible");
                    comboBox.addItem("Ocupado");
             
                     break;
                     
                case "Administrador" : 
                 
                    comboBox.addItem("Disponible");
                    comboBox.addItem("Ocupado");
             
                     break;
                     
                }
               
            }
            
        }catch(SQLException e){
           View message = new View();
           message.errorConnection();
        }
                 
    }
public void addStateUser(JComboBox comboBox , String query , String state ){
      
      FachadaBD fachada = new FachadaBD();    
      comboBox.removeAllItems();
         
         try{
            Connection conn= fachada.getConnetion();

            Statement sentenceProjects = conn.createStatement();
                      

            ResultSet rs = sentenceProjects.executeQuery(query);    

            while(rs.next()){

                String stateUser = rs.getString(state);
                
                switch(stateUser){
                    
                case "Director":
                 
                    comboBox.addItem("Activo");
                    comboBox.addItem("Inactivo");
             
                      break;
                      
                case "Administrador" : 
                    
                      comboBox.addItem("Activo");
                      comboBox.addItem("Inactivo"); 
             
                     break;
                     
                case "Lider de proyecto" : 
                    
                      comboBox.addItem("Activo");
                      comboBox.addItem("Inactivo"); 
             
                     break;
                     
                     
                }
               
            }
            
        }catch(SQLException e){
           View message = new View();
           message.errorConnection();
        }
                 
    }
public String query(String query , String type){
     
         FachadaBD fachada = new FachadaBD();       
         try{
            Connection conn= fachada.getConnetion();

            Statement sentenceProjects = conn.createStatement();
           
            ResultSet rs = sentenceProjects.executeQuery(query);    
            while(rs.next()){
                String typeUser = rs.getString(type);
                   System.out.println(type);
                     return typeUser;
            }
         }catch(SQLException e){
                if(e == null){
                       return null;

           }else{
         
           View message = new View();
           message.errorConnection(); 
           }
           
         }
        return null;

    }
public ArrayList<String> listtypeUser(String query , String type){
     
         FachadaBD fachada = new FachadaBD();       
         try{
            Connection conn= fachada.getConnetion();

            Statement sentenceProjects = conn.createStatement();
           
            ResultSet rs = sentenceProjects.executeQuery(query);    
            while(rs.next()){
                ArrayList <String> typeUser = null;
                    typeUser.add(rs.getString(type));
                     return typeUser;
            }
         }catch(SQLException e){
                if(e == null){
                       return null;

           }else{
         
           View message = new View();
           message.errorConnection(); 
           }
           
         }
        return null;

    }
public void setTotal(JTextField jtexfield, String query){
    
        FachadaBD fachada = new FachadaBD();   
        try{
            Connection conn= fachada.getConnetion();

            Statement sentenceProjects = conn.createStatement();

            ResultSet rs = sentenceProjects.executeQuery(query);
         
             while(rs.next()){
                 jtexfield.setText(rs.getString(1));
             }
            
             }catch(SQLException e){
           View message = new View();
           message.errorConnection();
             }
    
}
public void addTypeUser(JComboBox comboBox , String query , String type ){
            
    FachadaBD fachada = new FachadaBD();  
    comboBox.removeAllItems();

         try{
            Connection conn= fachada.getConnetion();

            Statement sentenceProjects = conn.createStatement();

            ResultSet rs = sentenceProjects.executeQuery(query);

            
            while(rs.next()){
                
            String typeUser = rs.getString(type);
             switch(typeUser){
      
                         
                case "Director":
                    
                      comboBox.addItem("Lider de proyecto");
                      comboBox.addItem("Administrador");
                      comboBox.addItem("Cordinador");
                      comboBox.addItem("Miembro");
                      break;
                      
                case "Administrador":           
                    
                      comboBox.addItem("Lider de proyecto");
                      comboBox.addItem("Cordinador");
                      comboBox.addItem("Miembro");
                              
                      break;
                      
                case "Lider de proyecto":
                      
                      comboBox.addItem("Miembro");
                      break;
                       }
                 
                }   
            }catch(SQLException e){
           View message = new View();
           message.errorConnection();
            }
    }
public void readArchiveUsers(String absoulteRute){
 
     try{
         FileReader file = new FileReader(absoulteRute);        
 
         
        BufferedReader  fileBuffer = new BufferedReader(file);
 
        boolean flag = true;
         int acumulator=0;
         
         while(flag != false){
 
             String csv = fileBuffer.readLine();
 
             if(csv != null){
                         
 
                 if(acumulator >= 0){
                     String value[];

                    value = csv.split(",");
                    String identification = value[0];
                    String idProyect = value[1];
                     String password = value[2];
                     String name = value[3];
                     String typeUser = value[4];
                     String state = value[5];
                     String email = value[6];
                    String answer = value[7];
                     String question = value[8];
                     String photo = value[9];
 
                     UserController objCtrlUser = new UserController();
 
                     objCtrlUser.addUser(identification, idProyect, password, name, typeUser, state, email,answer,question , photo);
                 }
                 else acumulator++;
            }
             flag = false;
         }
        
     }catch(IOException e){
         System.out.println("Error");
     }
     
 
     
 }
  
 public void readArchiveProjects(String absoulteRute){
 
     try{
         FileReader file = new FileReader(absoulteRute);        
 
         
         BufferedReader  fileBuffer = new BufferedReader(file);
 
         boolean flag = true;
         int acumulator=0;
         
         while(flag != false){
 
             String csv = fileBuffer.readLine();
 
             if(csv != null){
                         
 
                 if(acumulator >= 0){
                     String value[];
 
                     value = csv.split(",");
                     String code = value[0];
                     String name = value[1];
                     String description = value[2];
                     String state = value[3];
 
 
                     ProjectController objCtrlProject = new ProjectController();
 
                     objCtrlProject.addProject(code, name, description, state);
                }
                else acumulator++;
             }
            flag = false;
        }
         
     }catch(IOException e){
        System.out.println("Error");
     }
 }
 public void readArchiveEquipment(String absoulteRute){
 
     try{
         FileReader file = new FileReader(absoulteRute);        
 
         
         BufferedReader  fileBuffer = new BufferedReader(file);
 
         boolean flag = true;
         int acumulator=0;
         
        while(flag != false){
 
             String csv = fileBuffer.readLine();
 
             if(csv != null){
                         

                 if(acumulator >= 0){
                     String value[];
 
                     value = csv.split(",");
                     String serial = value[0];
                     String name = value[1];
                     String description = value[2];
                    String state = value[3];

 
                     EquipmentController objCtrlEquipment = new EquipmentController();
 
                     objCtrlEquipment.addEquipment(serial, name, description, state);
                 }
                else acumulator++;
             }
             flag = false;
         }
         
     }catch(IOException e){
         System.out.println("Error");
     }
 }
 

}